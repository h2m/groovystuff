package h2m;


import org.apache.commons.logging.*;
import org.apache.commons.logging.impl.*;


public class MyJavaClass{


	private static Log LOG = LogFactory.getLog(MyJavaClass.class);

	static{
		LOG.debug("class initialised");
	}
	
	public void doIt(){
		LOG.info("did it");
	}

}