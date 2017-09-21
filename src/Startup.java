import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

/**
 * Created by stas on 21/09/17.
 */
@javax.ejb.Startup
@Singleton
public class Startup {

    @PostConstruct
    void init() {
        System.out.println("WORK!!!!!");
    }
}
