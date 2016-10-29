package controllers;

import java.util.ArrayList;
import java.util.List;

import interfaces.Observer;
import interfaces.Subject;
import observers.ObservadorGenerico;

public class TelefoneSubject implements Subject {

	private List<Observer> observadores;

	public TelefoneSubject() {
		this.observadores = new ArrayList<Observer>();
	}


	@Override
	public void registrarObservador(Observer observer) {
		observadores.add(observer);
		if (observer instanceof ObservadorGenerico) {
			ObservadorGenerico observadorGenerico = (ObservadorGenerico) observer;
			System.out.printf("Novo observador registrado - %s\n", observadorGenerico.getNome());
		} else {
			System.out.printf("Novo observador registrado - %s\n", observer.getClass().getSimpleName());
		}
	}


	@Override
	public void removerObservador(Observer observer) {
		boolean removido = observadores.remove(observer);
		if (removido) {
			if (observer instanceof ObservadorGenerico) {
				ObservadorGenerico observadorGenerico = (ObservadorGenerico) observer;
				System.out.printf("Observador %s removido.\n", observadorGenerico.getNome());
			} else {
				System.out.printf("Observador %s removido.\n", observer.getClass().getSimpleName());
			}
		} else {
			System.out.println("Observador não encontrado.");
		}
	}


	@Override
	public void notificarObservadores() {
		for (Observer observer : observadores) {
			observer.atualizar();
		}
	}


	public void exibirObervadores() {
		for (Observer observador : observadores) {
			if (observador instanceof ObservadorGenerico) {
				ObservadorGenerico observadorGenerico = (ObservadorGenerico) observador;
				System.out.println(observadorGenerico.getNome());
			} else {
				System.out.println(observador.getClass().getSimpleName());
			}
		}
	}


	public void tocando() {
		notificarObservadores();
	}
}