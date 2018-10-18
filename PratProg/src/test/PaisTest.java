package test;


import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import Model.Pais;
import Service.PaisService;


public class PaisTest {
	Pais pais, copia;
	PaisService paisService;
	static int id = 0;

	/*
	 * Antes de rodar este teste, certifique-se que nao ha no banco nenhuma
	 * linha com o id igual ao do escolhido para o to instanciado abaixo. Se
	 * houver, delete. 
	 * Certifique-se também que sobrecarregou o equals na classe
	 * pais. 
	 * Certifique-se que a fixture pais1 foi criada no banco.
	 * Além disso, a ordem de execução dos testes é importante; por
	 * isso a anotação FixMethodOrder logo acima do nome desta classe
	 */

	public void setUp() throws Exception {
		System.out.println("setup");
		pais = new Pais();
		pais.setId(id);
		pais.setNome("Carlos Silva");
		pais.setPopulacao(11111111);
		pais.setArea(222222);
		copia = new Pais();
		copia.setId(id);
		copia.setNome("Carlos Cepelos");
		copia.setPopulacao(11111111);
		copia.setArea(2222222);
		paisService = new PaisService();
		System.out.println(pais);
		System.out.println(copia);
		System.out.println(id);
	}
	

	public void test00Carregar() {
		System.out.println("carregar");
		//para funcionar o pais 1 deve ter sido carregado no banco por fora
		Pais fixture = new Pais();
		fixture.setId(1);
		fixture.setNome("Carlos Drummond de Andrade");
		fixture.setPopulacao(111111);
		fixture.setArea(222222);
		PaisService novoService = new PaisService();
		Pais novo = novoService.carregar(1);
		assertEquals("testa inclusao", novo, fixture);
	}

	private void assertEquals(String string, Pais novo, Pais fixture) {
		// TODO Auto-generated method stub
		
	}



	public void test01Criar() {
		System.out.println("criar");
		id = paisService.criar(pais);
		System.out.println(id);
		copia.setId(id);
		assertEquals("testa criacao", pais, copia);
	}

	
	public void test02Atualizar() {
		System.out.println("atualizar");
		pais.setPopulacao(999999);
		copia.setPopulacao(999999);		
		paisService.atualizar(pais);
		pais = paisService.carregar(pais.getId());
		assertEquals("testa atualizacao", pais, copia);
	}

	
	public void test03Excluir() {
		System.out.println("excluir");
		copia.setId(-1);
		copia.setNome(null);
		copia.setPopulacao(111111);
		copia.setArea(222222);
		paisService.excluir(id);
		pais = paisService.carregar(id);
		assertEquals("testa exclusao", pais, copia);
	}
}