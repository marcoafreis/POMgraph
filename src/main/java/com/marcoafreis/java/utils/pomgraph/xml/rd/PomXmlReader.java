package com.marcoafreis.java.utils.pomgraph.xml.rd;

import com.marcoafreis.java.utils.pomgraph.exceptions.PomgraphXmlReaderException;
import org.apache.maven.model.Model;

import java.util.Collection;

/**
 * Created by marco on 10/24/2015.
 */
public interface PomXmlReader {

    Collection<Model> read() throws PomgraphXmlReaderException;

    org.apache.maven.model.Model read(String pomXmlFilePath) throws PomgraphXmlReaderException;
}
