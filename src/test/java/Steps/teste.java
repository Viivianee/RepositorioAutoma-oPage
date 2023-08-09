package Steps;

import Elementos.ElementosDaTelaDeCadrastro;
import Metodos.MetodosPage;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;

public class teste {
	
	ElementosDaTelaDeCadrastro e = new ElementosDaTelaDeCadrastro ();
	MetodosPage m = new MetodosPage ();
	
	@Dado("^que estou na página de cadastro \"([^\"]*)\"$")
	public void que_estou_na_página_de_cadastro(String url) throws Throwable {
		m.abrirNavegador(url);
	 
	}

	@Quando("^preencho o formulário com um nome válido, um e-mail válido, uma senha válida e a confirmação da senha$")
	public void preencho_o_formulário_com_um_nome_válido_um_e_mail_válido_uma_senha_válida_e_a_confirmação_da_senha() throws Throwable {
	   m.preencher(e.getFullName(), "Viviane");
	   System.out.println("FullName Ok");
	   Thread.sleep(500);
	   m.preencher(e.getFuulName(), "Souza");
	   System.out.println("FullName Ok");
	   Thread.sleep(500);
	   m.preencher(e.getAddress(), "rua s\n Serra Dourada, Bahia");
	   System.out.println("Address OK");
	   Thread.sleep(500);
	   m.preencher(e.getEmailaddress(), "viviane@gmail.com");
	   System.out.println("EmailAddress OK");
	   Thread.sleep(500);
	   m.preencher(e.getPhone(), "(77) 99999999");
	   System.out.println("Phone OK");
	   Thread.sleep(500);
	   m.clicar(e.getGender());
       System.out.println("Gender OK");	   
	   Thread.sleep(500);
	   m.clicar(e.getHobbies());
	   System.out.println("Hobbies OK");
	   Thread.sleep(500);
	   m.clicar(e.getLanguages());
	  System.out.println("Language OK");
	   Thread.sleep(500);
	   m.clicar(e.getBtnMudarLanguages());
	   System.out.println("BtnLanguages OK");
	   Thread.sleep(500);
       m.clicar(e.getTela());
	   Thread.sleep(500);
	   m.clicar(e.getBtnSkills());
	   Thread.sleep(500);
	   m.clicar(e.getSkills());
	   System.out.println("Skills OK");
	   Thread.sleep(500);
	   m.clicar(e.getSelectCountry());
	   System.out.println("SelectCountry OK");
	   Thread.sleep(500);
	   m.clicar(e.getPais());
	   System.out.println("pais OK");
	   Thread.sleep(500);
       m.clicar(e.getDateOfBirth());
       System.out.println("DateOfBirth OK");
	   Thread.sleep(500);
	   m.clicar(e.getAno());
	   Thread.sleep(500);
       m.clicar(e.getMonth());
       System.out.println("Month OK");
	   Thread.sleep(500);
	   m.clicar(e.getMes());
	   Thread.sleep(500);
       m.clicar(e.getDay());
       System.out.println("Day OK");
	   Thread.sleep(500);
	   m.clicar(e.getDia());
	   Thread.sleep(500);
	   m.preencher(e.getPassword(),"77777777");
	   System.out.println("PassWord OK");
	   Thread.sleep(500);
       m.preencher(e.getConfirmPassword(), "77777777");
       System.out.println("ConfirmPassWord OK");
	   Thread.sleep(1500);
	  
	   

	   

	   
	   



	}

	@Quando("^clico no botão \"([^\"]*)\"$")
	public void clico_no_botão(String arg1) throws Throwable {
	    m.clicar(e.getBtnSubmit());
		   Thread.sleep(1000);

	}

	@Então("^vejo uma mensagem de sucesso indicando que meu cadastro foi realizado$")
	public void vejo_uma_mensagem_de_sucesso_indicando_que_meu_cadastro_foi_realizado() throws Throwable {
	   System.out.println("Cadastro realizado com Sucesso");
	}


}
