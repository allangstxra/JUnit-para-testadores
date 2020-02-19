package exercicio13;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class ValidacoesFluentes {
	
	@Test
	public void validacaoEqualsTo() {
		String produto = "TV 40 polegadas";
		assertThat(produto, equalTo("TV 40 polegadas"));
	}
	
	@Test
	public void validacaoIs() {
		int codigo = 50;
		assertThat(codigo, is(50));
	}
	
	@Test
	public void validacaoAnyOf() {
		String resultadoObtido = "A cor selecionada é vermelha.";
		assertThat(resultadoObtido, anyOf(containsString("vermelho"), containsString("vermelha")));
	}
	
	@Test
	public void validacaoHasItems() {
		List<String> listaProdutos = new ArrayList<String>();
		listaProdutos.add("iPhone 8 Plus 64GB");
		listaProdutos.add("Adaptador USB-C VGA");
		listaProdutos.add("Apple TV 4 geracao");
		
		assertThat(listaProdutos, hasItem("Adaptador USB-C VGA"));
	}

}
