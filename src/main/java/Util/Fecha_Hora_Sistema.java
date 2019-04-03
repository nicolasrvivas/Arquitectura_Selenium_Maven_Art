package Util;


import java.util.Calendar;
import Base.TestBase;

public class Fecha_Hora_Sistema extends TestBase {
	

	public String fecha_Sistema() {


            Calendar Cal= Calendar.getInstance();     //  Estas dos instrucciones para tomar la fecha y hora del sistema
            String v_fecha= Cal.get(Calendar.DATE)+"/"+(Cal.get(Calendar.MONTH)+1)+"/"+Cal.get(Calendar.YEAR); 
            
            return v_fecha;
	}
	
	
	public String hora_Sistema() {


        Calendar Cal= Calendar.getInstance();     //  Estas dos instrucciones para tomar la fecha y hora del sistema
        String v_hora= Cal.get(Calendar.HOUR_OF_DAY)+":"+Cal.get(Calendar.MINUTE)+":"+Cal.get(Calendar.SECOND); 
        
        return v_hora;
	}
}
