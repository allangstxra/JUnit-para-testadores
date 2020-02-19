package exercicio6;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import exercicio1.MeuPrimeiroTeste;
import exercicio2.ValidacaoVedadeiroFalso;
import exercicio3.ValidacaoIgualdade;
import exercicio4.PreEPosCondicoesDeTeste;
import exercicio5.PreEPosCondicoesDaClasse;
import exercicio7.ValidarIdadePorVotacao;

@RunWith(Suite.class)
@SuiteClasses({
	MeuPrimeiroTeste.class,
	ValidacaoVedadeiroFalso.class,
	ValidacaoIgualdade.class,
	PreEPosCondicoesDeTeste.class,
	PreEPosCondicoesDaClasse.class,
	ValidarIdadePorVotacao.class,
})
public class SuiteDeTeste {

}
