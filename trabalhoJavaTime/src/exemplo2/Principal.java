package exemplo2;

import java.time.Clock;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class Principal {

	public static void main(String[] args) {
		
		ZoneId fusoHorario = ZoneId.of("Pacific/Samoa");
		
		 ZoneId fusoHorarioPadrao = ZoneId.systemDefault();
		 //System.out.println("Fuso horario do pc: "+ fusoHorarioPadrao);
		 
		 Clock clock = Clock.system(ZoneId.of("Pacific/Samoa"));
		 ZonedDateTime horarioImportado = ZonedDateTime.now(clock);
			//System.out.println("Horario atual baseado no fuso que eu escolher: " + horarioImportado);
	}

}
