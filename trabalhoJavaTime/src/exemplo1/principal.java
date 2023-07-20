package exemplo1;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class principal {
	public static void main(String[] args) {
		
		Clock clock = Clock.systemDefaultZone();
		Instant instant = clock.instant();
		//System.out.println("Horario atual baseado no fuso horario UTC: " + instant);//UTC (tempo universal coordenado)
		
		LocalDate hoje = LocalDate.now();
		//System.out.println(hoje);
		
		LocalDate pedroNiver = LocalDate.of(2023, 12, 16); 	
		//System.out.println("Aniversario de Pedro: "+pedroNiver);
		
		LocalTime horaAtual = LocalTime.now();
		//System.out.println("Hora atual: "+horaAtual);
		
		LocalDateTime horaHoje = LocalDateTime.now();
		//System.out.println("Data e hora de hoje: "+ horaHoje);
		
		LocalDateTime barbie = LocalDateTime.of(2023, 7, 20, 14, 40);
		//System.out.println("Data e hora da seção da Barbie: "+ barbie);
	}
	 
	 
	

}
