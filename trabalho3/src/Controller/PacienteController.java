package Controller;
import Model.Paciente;
import View.PacienteView;

import java.text.ParseException;

public class PacienteController {
    private PacienteView pacienteView;

    public PacienteController(PacienteView pacienteView) {
        this.pacienteView = pacienteView;
    }

    public Paciente cadastrarPaciente(int tipo) throws ParseException {
        Paciente paciente = pacienteView.cadastrarPaciente(tipo);
        pacienteView.exibirPaciente(paciente);
        return paciente;
    }
    public void MetodoPagamento(Paciente paciente) {
    	paciente.MetodoPagamento();
    }
}

