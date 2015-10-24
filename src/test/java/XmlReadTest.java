import com.marcoafreis.java.utils.pomgraph.PomgraphTokens;
import com.marcoafreis.java.utils.pomgraph.exceptions.PomgraphXmlReaderException;
import com.marcoafreis.java.utils.pomgraph.utils.FilterDirectoryFiles;
import com.marcoafreis.java.utils.pomgraph.xml.rd.PomReader;
import org.apache.maven.model.Dependency;
import org.apache.maven.model.Model;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Set;


/**
 * Created by marco on 10/24/2015.
 */
public class XmlReadTest {

    @Test
    public void pomToJavaClass() throws PomgraphXmlReaderException {
        PomReader reader = new PomReader();
        Model model = reader.read("pom.xml");

        List<Dependency> dependencies = model.getDependencies();
        for(Dependency d : dependencies){
            System.out.println(d.getArtifactId());
        }
    }

    //@Test
    public void filterPomFiles() throws IOException {
        Set<String> pomFilesPath = FilterDirectoryFiles.filterByString("", PomgraphTokens.POM_FILE);

        if(pomFilesPath!=null)
            for (String pomPath : pomFilesPath)
                System.out.println(pomPath);
    }

}
