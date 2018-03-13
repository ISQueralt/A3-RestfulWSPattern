package restfulWSPattern;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Queralt
 */

@WebService(serviceName = "Time")
public class Time {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     * @return Actual Time
     */
    @WebMethod(operationName = "getActualTime")
    public String getActualTime() {
        Calendar calendario = new GregorianCalendar();
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        int minutos = calendario.get(Calendar.MINUTE);
        int segundos = calendario.get(Calendar.SECOND);
        return hora + ":" + minutos + ":" + segundos;
    }
}