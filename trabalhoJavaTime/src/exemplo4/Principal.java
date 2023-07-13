package exemplo4;

import java.time.LocalDate;
import java.time.Period;

public class Principal {

	public static void main(String[] args) {
		LocalDate dataInicial = LocalDate.of(1912, 4, 15);
        LocalDate dataFinal = LocalDate.of(2023, 6, 18); 
        
        Period periodo = Period.between(dataInicial, dataFinal);
        int anos = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();
 
        System.out.println("Período: " + anos + " anos, " + meses + " meses, " + dias + " dias");

	}

}
