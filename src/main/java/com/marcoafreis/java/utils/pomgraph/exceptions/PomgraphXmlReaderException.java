package com.marcoafreis.java.utils.pomgraph.exceptions;

/**
 * Created by marco on 10/24/2015.
 */
public class PomgraphXmlReaderException extends Exception {
    public PomgraphXmlReaderException(){super();}

    public PomgraphXmlReaderException(String msg){
        super(msg);
    }

    public PomgraphXmlReaderException(Throwable e){
        super(e);
    }
}
