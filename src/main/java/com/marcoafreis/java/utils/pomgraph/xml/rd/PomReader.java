package com.marcoafreis.java.utils.pomgraph.xml.rd;

import com.marcoafreis.java.utils.pomgraph.xml.ds.Model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by marco on 10/24/2015.
 */
public class PomReader implements PomXmlReader {

    private Set<String> filesPath;

    public PomReader (){}

    public PomReader (Set<String> filesPath){
        this();
        this.filesPath = filesPath;
    }

    public PomReader (String filePath){
        this();
        this.filesPath = new HashSet<String>();
        this.filesPath.add(filePath);
    }

    public Collection<Model> read() {
        return null;
    }

    public Model read(String pomXmlFilePath) {
        return null;
    }
}
