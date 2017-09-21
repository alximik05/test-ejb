import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Hashtable;
import java.util.Properties;

/**
 * Created by stas on 21/09/17.
 */
public class Main {
    public static void main(String[] args) throws NamingException {
        final Properties jndiProperties = new Properties();
        jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
        final Context context = new InitialContext(jndiProperties);
        final String appName = "test_ejb_ear_exploded";
        final String moduleName = "";
        final String distinctName = "";
        final String beanName = HelloImpl.class.getSimpleName();
        // the remote view fully qualified class name
        final String viewClassName = IHello.class.getName();
        // let's do the lookup
        HelloImpl lookup = (HelloImpl) context.lookup("ejb:" + appName + "/" + moduleName + "/" + distinctName + "/" + beanName + "!" + viewClassName);
        String time = lookup.getTime();

        System.out.println(time);
    }
}
