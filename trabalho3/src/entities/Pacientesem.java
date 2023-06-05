package entities;

import java.util.Date;
import java.util.Scanner;

import Model.Endereco;
import Model.Paciente;
import Model.Telefone;

public class Pacientesem extends Paciente{
private int idcartao;

public Pacientesem(String nome,  Date dataNascimento, String sexo, Endereco endereco, String profissao,
		Telefone telefone, int nivelDor) {
	super(nome, dataNascimento, sexo, endereco, profissao, telefone, nivelDor, 2);
}
	
public void MetodoPagamento() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o id:");
	idcartao= sc.nextInt();

}
}
