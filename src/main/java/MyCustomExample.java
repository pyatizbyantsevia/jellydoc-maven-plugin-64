import org.apache.commons.jelly.JellyTagException;
import org.apache.commons.jelly.TagSupport;
import org.apache.commons.jelly.XMLOutput;

/**
 * A custom Jelly tag that prints a greeting.
 *
 * @author Your Name
 */
public class MyCustomExample extends TagSupport {

    private String name;
    private String customVar;

    public void setName(String name) {
        this.name = name;
    }

    public void setCustomVar(String customVar) {
        this.customVar = customVar;
    }

    public void doTag(XMLOutput output) throws JellyTagException {
        if (name == null) {
            name = "World";
        }
        if (customVar == null) {
            name = "customVar";
        }
        output.write("Hello, " + name + "!" + customVar);
    }
}
