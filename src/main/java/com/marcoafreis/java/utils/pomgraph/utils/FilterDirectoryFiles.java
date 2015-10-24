package com.marcoafreis.java.utils.pomgraph.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by marco on 10/24/2015.
 */
public class FilterDirectoryFiles {

    static public Set<String> filterByString(String mainFolderPath, String searchString) throws IOException {
        Set<String> filesPath = new HashSet<>();
        Path startPath = Paths.get(mainFolderPath).normalize().toAbsolutePath();

        Files.walk(startPath).parallel().filter(p -> p.toString().contains(searchString)).forEach(f -> filesPath.add(f.toString()));

        return filesPath.size()==0 ? null : filesPath;
    }
}
