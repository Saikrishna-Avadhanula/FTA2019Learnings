package TestBase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerBase {

    private static final Logger LOGGER = LogManager.getLogger(LoggerBase.class.getName());

    protected static void info(Object str) {
        LOGGER.info(str);
    }

    protected static void debug(Object obj) {
        LOGGER.debug(obj);
    }
}
