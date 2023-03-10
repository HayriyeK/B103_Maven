package ahmetHoca.day18;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class C02_Loj4J {
    //3. Logger object olustur:
//    private static Logger logger = LogManager.getLogger(Demo1.class.getName());
//4. Logger fonksiyonuyla istenilen fonksiyonu kullan
//                 logger.debug("Debug logger");
//        logger.info("Info logger");
//        logger.error("Error logger");
//        logger.fatal("Fatal logger");
private static Logger logger= LogManager.getLogger(C02_Loj4J.class.getName());

    @Test

    public void loj4JTest() {
        //Logger objesi ile yazdirma islemi yap
        logger.fatal("Fatal log!");
        logger.error("Error log!");
        logger.warn("Warn Log!");
        logger.debug("Debug Log!");
        logger.info("Info Log!");


    }
}
