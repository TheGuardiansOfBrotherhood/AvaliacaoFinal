package controllers;

import interfaces.Observer;
import observers.DispositivoEscuta;
import observers.Fax;
import observers.ObservadorGenerico;
import observers.SecretariaEletronica;


public class Program {

	public static void main(String[] args) {

		TelefoneSubject telefone = new TelefoneSubject();

		Observer secretariaEletronica = new SecretariaEletronica();
		Observer fax = new Fax();
		Observer dispositivoEscuta = new DispositivoEscuta();
		Observer computador = new ObservadorGenerico("Computador");
		Observer uras = new ObservadorGenerico("URAS");

		telefone.registrarObservador(secretariaEletronica);
		telefone.registrarObservador(fax);
		telefone.registrarObservador(dispositivoEscuta);
		telefone.registrarObservador(computador);
		telefone.registrarObservador(uras);

		telefone.exibirObervadores();

		telefone.removerObservador(fax);

		telefone.exibirObervadores();

		telefone.tocando();

		telefone.removerObservador(computador);

		telefone.tocando();
	}
}