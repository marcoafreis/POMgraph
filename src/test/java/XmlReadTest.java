import com.marcoafreis.java.utils.pomgraph.PomgraphTokens;
import com.marcoafreis.java.utils.pomgraph.exceptions.PomgraphXmlReaderException;
import com.marcoafreis.java.utils.pomgraph.utils.FilterDirectoryFiles;
import com.marcoafreis.java.utils.pomgraph.xml.ds.Model;
import com.marcoafreis.java.utils.pomgraph.xml.rd.PomReader;
import org.junit.Test;

import java.io.IOException;
import java.util.Set;


/**
 * Created by marco on 10/24/2015.
 */
public class XmlReadTest {

//    @Test
    public void pomToJavaClass() throws PomgraphXmlReaderException {
        PomReader reader = new PomReader();
        Model model = reader.read("pom.xml");

        int size = model.getDependencies().getDependency().size();
        System.out.print(size);
    }

    @Test
    public void filterPomFiles() throws IOException {
        Set<String> pomFilesPath = FilterDirectoryFiles.filterByString("", PomgraphTokens.POM_FILE);

        if(pomFilesPath!=null)
            for (String pomPath : pomFilesPath)
                System.out.println(pomPath);
    }

}
