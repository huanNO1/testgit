package test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TestLog4j {
	public static Log log=LogFactory.getLog(TestLog4j.class);
	public static void main(String[] args) {
		log.info("22222222222222222");
	}

}
