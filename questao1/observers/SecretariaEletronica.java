package observers;

import interfaces.Observer;

public class SecretariaEletronica implements Observer {

	@Override
	public void atualizar() {
		System.out.println("Secretária eletrônica foi notificada");
	}
}