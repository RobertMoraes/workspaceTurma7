package implementacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import beans.AgendaRevisao;

public class ExecutarAgenda {

	public static void main(String[] args) throws ParseException {
		
		// configurar o padrão de datas
		SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Executar Agendamento...!!!");
		
		AgendaRevisao agenda1 = new AgendaRevisao();
		
		agenda1.cliente = "Ana Maria Braga";
		agenda1.modelo = "Gol";
		agenda1.kmVeiculo = 15000;
		agenda1.data = formataData.parse("07/04/2022");
		//agenda1.hora = "13:00";
		
		agenda1.agendar();
		
		Scanner leitor = new Scanner(System.in);
		agenda1.data = formataData.parse(leitor.nextLine());
		
		System.out.println(" ");
		System.out.println("Dados do Agendamento");
		System.out.println("Cliente: " + agenda1.cliente);
		System.out.println("Veiculo: " + agenda1.modelo);
		System.out.println("Data Agenda: " + formataData.format(agenda1.data));
		System.out.println("Data Agenda no objeto: " + agenda1.data);
		
		
		
		
		
		System.out.println("Finalizado..!!");
		
	
	}

}
