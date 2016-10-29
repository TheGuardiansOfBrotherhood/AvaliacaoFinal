package observers;

import interfaces.Observer;

public class ObservadorGenerico implements Observer {

	private String nome;

	public ObservadorGenerico(String nome) {
		this.nome = nome;
	}

	@Override
	public void atualizar() {
		System.out.printf("%s foi notificado\n", getNome());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}