import com.marcoafreis.java.utils.pomgraph.exceptions.PomgraphXmlReaderException;
import com.marcoafreis.java.utils.pomgraph.xml.ds.Model;
import com.marcoafreis.java.utils.pomgraph.xml.rd.PomReader;
import org.junit.Test;

/**
 * Created by marco on 10/24/2015.
 */
public class XmlReadTest {

    @Test
    public void test() throws PomgraphXmlReaderException {
        PomReader reader = new PomReader();
        Model model = reader.read("pom.xml");

        int size = model.getDependencies().getDependency().size();
        System.out.print(size);
    }
}
