package org.agoncal.training.javaee.service;

import org.apache.logging.log4j.Logger;

import javax.annotation.PostConstruct;
import javax.interceptor.Interceptors;
import java.util.Random;

/**
 * @author Antonio Goncalves
 *         Training - Beginning with The Java EE 7 Platform
 *         http://www.antoniogoncalves.org
 *         --
 */
@ThirteenDigits
public class IsbnGenerator implements NumberGenerator {

    // ======================================
    // =             Attributes             =
    // ======================================

    private int number;

    private Logger logger = Logger.getLogger("org.agoncal.training.javaee6");

    // ======================================
    // =          Lifecycle methods         =
    // ======================================

    @PostConstruct
    private void init() {
        number = Math.abs(new Random().nextInt());
        logger.fine("IsbnGenerator.init():" + number);
    }

    // ======================================
    // =          Business methods          =
    // ======================================

    @Interceptors(LoggingInterceptor.class)
    public String generateNumber() {
        String isbn = "13-84356-" + number++;
        logger.fine("IsbnGenerator.generateNumber():" + isbn);
        return isbn;
    }

}