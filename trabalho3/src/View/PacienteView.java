package View;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Model.Endereco;
import Model.Paciente;
import Model.Telefone;
import entities.Pacienteplano;
import entities.Pacientesem;

public class PacienteView {
    private Scanner scanner;

    public PacienteView() {
        scanner = new Scanner(System.in);
    }

    public Paciente cadastrarPaciente(int tipo) throws ParseException {
        System.out.print("Digite o nome do paciente: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite a data de nascimento do paciente (formato: DD/MM/YYYY): ");
        String dataaux = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = sdf.parse(dataaux);

        System.out.print("Digite o sexo do paciente: ");
        String sexo = scanner.nextLine();

        System.out.print("Digite a rua do endereço do paciente: ");
        String rua = scanner.nextLine();

        System.out.print("Digite a cidade do endereço do paciente: ");
        String cidade = scanner.nextLine();

        System.out.print("Digite o estado do endereço do paciente: ");
        String estado = scanner.nextLine();

        System.out.print("Digite a profissão do paciente: ");
        String profissao = scanner.nextLine();

        System.out.print("Digite o número de telefone do paciente: ");
        String numeroTelefone = scanner.nextLine();

        System.out.print("Digite o tipo de telefone do paciente: ");
        String tipoTelefone = scanner.nextLine();

        System.out.print("Digite o nível de dor do paciente: ");
        int nivelDor = Integer.parseInt(scanner.nextLine());

        Endereco endereco = new Endereco(rua, cidade, estado);
        Telefone telefone = new Telefone(numeroTelefone, tipoTelefone);

        if(tipo==1) {
        	Pacienteplano aux = new Pacienteplano( nome,  dataNascimento,  sexo,  endereco,  profissao,
		 telefone,  nivelDor);
        	return aux;
        	
        }
        else {
        	Pacientesem aux = new Pacientesem( nome,  dataNascimento,  sexo,  endereco,  profissao,
        			 telefone,  nivelDor);
        	        	return aux;
        }
    }

    public void exibirPaciente(Paciente paciente) {
        System.out.println("Nome: " + paciente.getNome());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Data de Nascimento: " + sdf.format(paciente.getDataNascimento()));
        System.out.println("Sexo: " + paciente.getSexo());
        System.out.println("Endereço: " +
                paciente.getEndereco().getCidade() + ", " + paciente.getEndereco().getEstado());
        System.out.println("Profissão: " + paciente.getProfissao());
        System.out.println("Telefone: " + paciente.getTelefone().getNumero() +
                " (" + paciente.getTelefone().getTipo() + ")");
        System.out.println("Nível de Dor: " + paciente.getNivelDor());
    }
}
