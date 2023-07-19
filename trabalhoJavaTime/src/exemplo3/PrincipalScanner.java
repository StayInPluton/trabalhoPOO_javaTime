package exemplo3;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class PrincipalScanner {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o primeiro hor�rio (HH:mm:ss): ");
	        String horario1 = scanner.nextLine();

	        System.out.println("Digite o segundo hor�rio (HH:mm:ss): ");
	        String horario2 = scanner.nextLine();

	        // Converte os hor�rios digitados em LocalTime
	        LocalTime tempoInicial = LocalTime.parse(horario1);
	        LocalTime tempoFinal = LocalTime.parse(horario2);

	        // Calcula a dura��o entre os hor�rios
	        Duration duracao = Duration.between(tempoInicial, tempoFinal);

	        // Imprime a dura��o formatada
	        long horas = duracao.toHours();
	        long minutos = duracao.toMinutes() % 60;
	        long segundos = duracao.getSeconds() % 60;

	        System.out.println("Dura��o: " +horas+":"+ minutos+":"+ segundos);

	        scanner.close();
	}

}
