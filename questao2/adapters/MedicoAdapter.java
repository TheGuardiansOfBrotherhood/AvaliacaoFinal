package adapters;

import controllers.Doutor;
import controllers.Medico;

public class MedicoAdapter extends Medico {

	private Doutor doutor;

	public MedicoAdapter(Doutor doutor) {
		this.doutor = doutor;
	}

	@Override
	public void realizarCirurgia() {
		getDoutor().operar();
	}

	@Override
	public void realizarProcedimento() {
		getDoutor().fazerProced();
	}

	public Doutor getDoutor() {
		return doutor;
	}

	public void setDoutor(Doutor doutor) {
		this.doutor = doutor;
	}
}