package wraith.crushing_hammers;

import net.fabricmc.loader.api.FabricLoader;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class Utils {

    public static final Random random = new Random(Calendar.getInstance().getTimeInMillis());

    public static void getFilesInJar(String dir, boolean overwrite) {
        JarFile jar = null;
        try {
             jar = new JarFile(Utils.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }

        if (jar != null) {
            Enumeration<JarEntry> entries = jar.entries();
            while(entries.hasMoreElements()) {
                JarEntry entry = entries.nextElement();
                if (!entry.getName().startsWith("config") || !entry.getName().endsWith(".json")) {
                    continue;
                }
                String[] segments = entry.getName().split("/");
                String filename = segments[segments.length - 1];
                InputStream is = Utils.class.getResourceAsStream("/" + entry.getName());
                inputStreamToFile(is, new File("config/crushing_hammers/recipes/" + filename), overwrite);
            }
        } else {
            System.out.println("Launched from IDE.");
            File[] files = FabricLoader.getInstance().getModContainer(CrushingHammers.MOD_ID).get().getPath(dir).toFile().listFiles();
            for(File file : files) {
                String[] segments = file.getName().split("/");
                String filename = segments[segments.length - 1];
                try {
                    Config.createFile("config/crushing_hammers/recipes/" + filename, FileUtils.readFileToString(file, StandardCharsets.UTF_8), overwrite);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void inputStreamToFile(InputStream inputStream, File file, boolean overwrite) {
        if (!file.exists() || overwrite) {
            try {
                FileUtils.copyInputStreamToFile(inputStream, file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static int getRandomIntInRange(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    public static double getRandomDoubleInRange(int min, int max) {
        return min + random.nextDouble() * max;
    }

    public static int fortunify(int amount, int level) {
        // 2/(2+N) -> x1
        // 1/(2+N) -> xN
        int fortune = 0;

        double x1percent = (2.0 / (2 + level)) * 100;
        double xNpercent = (1.0 / (2 + level)) * 100;

        double rng = getRandomDoubleInRange(0, 100);
        if (rng > x1percent) {
            fortune = (int) Math.floor((rng - x1percent) / xNpercent);
        }

        return amount + fortune;
    }

    public static int getRandomInt(int max) {
        return random.nextInt(max);
    }
}
