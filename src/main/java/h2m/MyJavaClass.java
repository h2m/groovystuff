package h2m;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class MyJavaClass {


    private static Log LOG = LogFactory.getLog(MyJavaClass.class);

    static {
        LOG.debug("class initialised");
    }

    public int twice (int i){
        return 2 * i;
    }

}