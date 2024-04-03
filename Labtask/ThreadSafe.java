package Task1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafe {
    private static ThreadSafe instance;
    private ConcurrentHashMap<String, String> config = new ConcurrentHashMap<>();

    private ThreadSafe() {
        try {
            File file = new File("LAB/Task1/config.properties");
            FileInputStream fileInput = new FileInputStream(file);
            Properties properties = new Properties();
            properties.load(fileInput);
            fileInput.close();

            Enumeration<Object> enuKeys = properties.keys();

            while (enuKeys.hasMoreElements()) {
                String key = (String) enuKeys.nextElement();
                String value = properties.getProperty(key);
                config.put(key, value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getValue(String key) {
        return config.get(key);
    }

    public static ThreadSafe getInstance() {
        if (instance == null) {
            synchronized (ThreadSafe.class) {
                if (instance == null) {
                    instance = new ThreadSafe();
                }
            }
        }
        return instance;
    }
}
