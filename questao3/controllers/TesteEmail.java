package controllers;

import java.util.Arrays;
import java.util.List;

import controllers.Email.Anexo;

public class TesteEmail {

	public static void main(String[] args) {

		Email email = new Email();

		email.setNome("Marum Simão");
		email.setDestino("marumsimao@gmail.com");
		email.setAssunto("Avaliação final - POO");
		email.setMensagem("Segue em anexo a avaliação final");

		// setando CC
		Email.CC cc1 = new Email.CC("Roger Silva", "rogersilva84@gmail.com");
		Email.CC cc2 = new Email.CC("Jackson Castro", "jack.vasc.castro@gmail.com");
		Email.CC cc3 = new Email.CC("Everton Castro", "evertomcdg007@edu.unifor.br");

		List<Email.CC> ccs = Arrays.asList(new Email.CC[] {cc1, cc2, cc3});

		email.setCCs(ccs);

		// setando CCO
		Email.CCO cco1 = new Email.CCO("Robério Gomes", "roberiogomes@gmail.com");

		List<Email.CCO> ccos = Arrays.asList(cco1);

		email.setCCOs(ccos);

		// setando anexos
		Email.Anexo anexo1 = new Email.Anexo("Inner Class", "/home/AvaliacaoFinal/questao3/questao_3_innner_class.png");

		List<Anexo> anexos = Arrays.asList(anexo1);

		email.setAnexos(anexos);

		email.enviar();
	}
}
