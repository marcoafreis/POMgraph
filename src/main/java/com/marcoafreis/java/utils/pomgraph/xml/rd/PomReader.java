package com.marcoafreis.java.utils.pomgraph.xml.rd;

import com.marcoafreis.java.utils.pomgraph.PomgraphTokens;
import com.marcoafreis.java.utils.pomgraph.exceptions.PomgraphXmlReaderException;
import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
        this.filesPath = new HashSet<>();
        this.filesPath.add(filePath);
    }

    public Collection<Model> read() throws PomgraphXmlReaderException {
        if(filesPath==null || filesPath.size()==0)
            throw  new PomgraphXmlReaderException(PomgraphTokens.NO_FILES_ERROR);

        Set<Model> poms = new HashSet<>();
        for (String filePath : filesPath)
            poms.add(read(filePath));

        return poms;
    }

    public Model read(String pomXmlFilePath) throws PomgraphXmlReaderException {
        try {
            MavenXpp3Reader reader = new MavenXpp3Reader();
            return reader.read(new BufferedReader(new FileReader(pomXmlFilePath)));
        } catch (IOException | XmlPullParserException e) {
            throw new PomgraphXmlReaderException(e);
        }
    }
}
