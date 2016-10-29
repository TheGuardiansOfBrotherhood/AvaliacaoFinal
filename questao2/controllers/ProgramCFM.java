package controllers;

import adapters.MedicoAdapter;

public class ProgramCFM {

	public static void main(String[] args) {

		Doutor doutor = new Doutor();
		Medico medico = new Medico();

		MedicoAdapter medicoAdapter = new MedicoAdapter(doutor);

		imprimirMedico(medicoAdapter);
		imprimirMedico(medico);
	}

	private static void imprimirMedico(Medico medico) {
		medico.realizarCirurgia();
		medico.realizarProcedimento();
	}
}