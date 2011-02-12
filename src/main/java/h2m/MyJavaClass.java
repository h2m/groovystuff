package h2m;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class MyJavaClass {


    private static Log LOG = LogFactory.getLog(MyJavaClass.class);

    static {
        LOG.debug("class initialised");
    }

    public static void doIt(int i) {
        MyScalaClass msc = new MyScalaClass(i);
        // String msc = "or without Scala " + i;
        LOG.info("did it with: " + msc);
    }

}