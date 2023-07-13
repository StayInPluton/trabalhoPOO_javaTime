package exemplo3;

import java.time.Duration;
import java.time.LocalTime;

public class Principal {

	public static void main(String[] args) {
		        
		        Duration duration = Duration.ofHours(3).plusMinutes(30);
		        long segundos = duration.getSeconds();
		        System.out.println("Duração em segundos: " + segundos);
		        
		        LocalTime horaInicial = LocalTime.of(9, 30, 0); // Hora inicial: 09:30:00
		        LocalTime horaFinal = LocalTime.of(13, 45, 30); // Hora final: 13:45:30 
		        Duration tempoPassou = Duration.between(horaInicial, horaFinal);
		        long horas = tempoPassou.toHours();
		        long minutos = tempoPassou.toMinutes() % 60;
		        segundos = tempoPassou.getSeconds() % 60;
		        System.out.println("Duração: " +horas+":"+ minutos+":"+ segundos);
		        
		    }
		

	}

