package Log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerConsole {
    private static final Logger logger = LogManager.getLogger(LoggerDemo.class.getName());

    public static void main(String[] args) {
        logger.info("info message logged");
        logger.error("error message logged");
    }
}
