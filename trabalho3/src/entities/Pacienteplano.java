package entities;
// para defenir o tipo do paceinte 
import java.util.Date;
import java.util.Scanner;

import Model.Endereco;
import Model.Paciente;
import Model.Telefone;

public class Pacienteplano extends Paciente{
private int idplano;

public Pacienteplano(String nome, Date dataNascimento, String sexo, Endereco endereco, String profissao,
		Telefone telefone, int nivelDor) {
	super(nome, dataNascimento, sexo, endereco, profissao, telefone, nivelDor, 1);
	
}

public void MetodoPagamento() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o id :");
	idplano= sc.nextInt();
}

}
