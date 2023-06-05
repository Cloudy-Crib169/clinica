package App;

import java.text.ParseException;
import java.util.Scanner;
import Controller.PacienteController;
import View.PacienteView;
import entities.Pacienteplano;
import entities.Pacientesem;

public class Main {
    public static void main(String[] args) throws ParseException {
        PacienteView pacienteView = new PacienteView();
        PacienteController pacienteController = new PacienteController(pacienteView);
        Pacienteplano pacietenceplano;
        Pacientesem pacientesem;
        
        System.out.println("O paciente tem plano, se sim digite 1 se nao digite 2 :");
        Scanner sc = new Scanner(System.in);
        int escolha = sc.nextInt();
        
        if(escolha == 1) {
        	pacietenceplano = (Pacienteplano) pacienteController.cadastrarPaciente(1);
        	pacietenceplano.MetodoPagamento();
        }
        else {
        	pacientesem = (Pacientesem) pacienteController.cadastrarPaciente(2);
        	pacientesem.MetodoPagamento();
        }
    }
}

