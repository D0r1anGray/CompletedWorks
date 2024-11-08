package org.geekbrains;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {
    private static final String LOG_FILE = "Log.txt";

    @Override
    public void log(String message) {
        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
            writer.write(message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

