package controllers;

import java.util.List;

public class Email {

	private String nome;

	private String destino;

	private List<CC> ccs;

	private List<CCO> ccos;

	private String assunto;

	private String mensagem;

	private List<Anexo> anexos;

	static class CC {

		private String nome;

		private String destino;

		public CC(String nome, String destino) {
			this.nome = nome;
			this.destino = destino;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDestino() {
			return destino;
		}

		public void setDestino(String destino) {
			this.destino = destino;
		}

		public boolean getVisibilidade() {
			return true;
		}
	}


	static class CCO extends CC {

		public CCO(String nome, String destino) {
			super(nome, destino);
		}

		@Override
		public boolean getVisibilidade() {
			return false;
		}
	}


	static class Anexo {

		private String nome;

		private String arquivo;

		public Anexo(String nome, String arquivo) {
			this.nome = nome;
			this.arquivo = arquivo;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getArquivo() {
			return arquivo;
		}

		public void setArquivo(String arquivo) {
			this.arquivo = arquivo;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public List<CC> getCCs() {
		return ccs;
	}

	public void setCCs(List<CC> ccs) {
		this.ccs = ccs;
	}

	public List<CCO> getCCOs() {
		return ccos;
	}

	public void setCCOs(List<CCO> ccos) {
		this.ccos = ccos;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public List<Anexo> getAnexos() {
		return anexos;
	}

	public void setAnexos(List<Anexo> anexos) {
		this.anexos = anexos;
	}

	public void enviar() {
		System.out.printf("Enviando email para: %s (%s)\n", getNome(), getDestino());

		for (CC cc : getCCs()) {
			System.out.printf("Enviando cópia para: %s (%s)\n", cc.getNome(), cc.getDestino());
		}

		for (CCO cco : getCCOs()) {
			System.out.printf("Enviando cópia oculta para: %s (%s)\n", cco.getNome(), cco.getDestino());
		}

		System.out.printf("Assunto: %s\n", getAssunto());
		System.out.printf("Messagem: %s\n", getMensagem());

		System.out.println("Anexos:");
		for (Anexo anexo : getAnexos()) {
			System.out.printf("Nome: %s - caminho: %s", anexo.getNome(), anexo.getArquivo());
		}
	}
}