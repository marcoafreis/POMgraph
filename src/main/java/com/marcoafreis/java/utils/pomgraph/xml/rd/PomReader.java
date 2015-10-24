package com.marcoafreis.java.utils.pomgraph.xml.rd;

import com.marcoafreis.java.utils.pomgraph.PomgraphTokens;
import com.marcoafreis.java.utils.pomgraph.exceptions.PomgraphXmlReaderException;
import com.marcoafreis.java.utils.pomgraph.xml.ds.Model;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
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

    public Collection<Model> read() throws PomgraphXmlReaderException {
        if(filesPath==null || filesPath.size()==0)
            throw  new PomgraphXmlReaderException(PomgraphTokens.NO_FILES_ERROR);

        Set<Model> poms = new HashSet<Model>();
        for (String filePath : filesPath)
            poms.add(read(filePath));

        return poms;
    }

    public Model read(String pomXmlFilePath) throws PomgraphXmlReaderException {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Model.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            JAXBElement model = (JAXBElement) jaxbUnmarshaller.unmarshal(new File(pomXmlFilePath));

            return (Model) model.getValue();
        } catch (JAXBException e) {
            throw new PomgraphXmlReaderException(e);
        }
    }
}
