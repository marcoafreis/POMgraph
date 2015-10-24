package com.marcoafreis.java.utils.pomgraph.xml.rd;

import com.marcoafreis.java.utils.pomgraph.exceptions.PomgraphXmlReaderException;
import com.marcoafreis.java.utils.pomgraph.xml.ds.Model;

import java.util.Collection;

/**
 * Created by marco on 10/24/2015.
 */
public interface PomXmlReader {

    Collection<Model> read() throws PomgraphXmlReaderException;

    Model read(String pomXmlFilePath) throws PomgraphXmlReaderException;
}
