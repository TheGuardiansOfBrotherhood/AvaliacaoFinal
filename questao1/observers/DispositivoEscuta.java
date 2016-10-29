package observers;

import interfaces.Observer;

public class DispositivoEscuta implements Observer {

	@Override
	public void atualizar() {
		System.out.println("Dispositivo de escuta foi notificado");
	}
}