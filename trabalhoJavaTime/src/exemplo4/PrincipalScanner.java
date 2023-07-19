package exemplo4;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class PrincipalScanner {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite a primeira data (yyyy-MM-dd): ");
	        String data1 = scanner.nextLine();

	        System.out.println("Digite a segunda data (yyyy-MM-dd): ");
	        String data2 = scanner.nextLine();

	        // Converte as datas digitadas em LocalDate
	        LocalDate dataInicial = LocalDate.parse(data1);
	        LocalDate dataFinal = LocalDate.parse(data2);

	        // Calcula o período entre as datas
	        Period periodo = Period.between(dataInicial, dataFinal);

	        // Imprime o período
	        int anos = periodo.getYears();
	        int meses = periodo.getMonths();
	        int dias = periodo.getDays();

	        System.out.println("Período: " + anos + " anos, " + meses + " meses, " + dias + " dias");

	        scanner.close();

	}

}
