package observers;

import interfaces.Observer;

public class Fax implements Observer {

	@Override
	public void atualizar() {
		System.out.println("Fax foi notificado");
	}
}