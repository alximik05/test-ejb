import javax.ejb.Remote;
import javax.ejb.Stateless;
import java.time.LocalTime;

/**
 * Created by stas on 21/09/17.
 */
@Stateless
@Remote(IHello.class)
public class HelloImpl implements IHello {
    @Override
    public String getTime() {
        return LocalTime.now().toString();
    }
}
