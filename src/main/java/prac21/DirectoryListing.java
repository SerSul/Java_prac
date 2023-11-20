package prac21;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirectoryListing {
    public static List<String> getFirstFiveFiles(String directoryPath) {
        File directory = new File(directoryPath);
        List<String> fileList = new ArrayList<>();

        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (int i = 0; i < Math.min(5, files.length); i++) {
                    fileList.add(files[i].getName());
                }
            }
        }

        return fileList;
    }

    public static void main(String[] args) {
        String directoryPath = "./src/main/java";
        List<String> firstFiveFiles = getFirstFiveFiles(directoryPath);
        System.out.println("First five files in the directory: " + Arrays.toString(firstFiveFiles.toArray()));
    }
}

