package Elementos;

import org.openqa.selenium.By;

public class ElementosDaTelaDeCadrastro {

 private By FullName = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input");
 private By FuulName = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input");
 private By Address = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea");
 private By Emailaddress = By.xpath("//*[@id=\"eid\"]/input");
 private By Phone = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input");
 private By	Gender = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input");
 private By Hobbies = By.xpath("//*[@id=\"checkbox2\"]");
 private By Languages = By.xpath("//*[@id=\"msdd\"]");
 private By BtnMudarLanguages = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[29]");
 private By tela = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/label");
 private By BtnSkills = By.xpath("//*[@id=\"Skills\"]");
 private By Skills = By.xpath("//*[@id=\"Skills\"]/option[4]");
 private By Country = By.xpath("//*[@id=\"countries\"]");
 private By SelectCountry = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span");
 private By Pais = By.xpath("//*[@id=\"select2-country-results\"]/li[2]");
 private By DateOfBirth = By.xpath("//*[@id=\"yearbox\"]");
 private By ano = By.xpath("//*[@id=\"yearbox\"]/option[91]");
 private By Month = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select");
 private By mes = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select/option[10]");
 private By Day = By.xpath("//*[@id=\"daybox\"]");
 private By dia = By.xpath("//*[@id=\"daybox\"]/option[24]");
 private By Password = By.xpath("//*[@id=\"firstpassword\"]");
 private By ConfirmPassword = By.xpath("//*[@id=\"secondpassword\"]");
 private By btnSubmit = By.xpath("//*[@id=\"submitbtn\"]");
 
 
public By getFullName() {
	return FullName;
}
public By getFuulName() {
	return FuulName;
}
public By getAddress() {
	return Address;
}
public By getEmailaddress() {
	return Emailaddress;
}
public By getPhone() {
	return Phone;
}
public By getGender() {
	return Gender;
}
public By getHobbies() {
	return Hobbies;
}
public By getLanguages() {
	return Languages;
}
public By getBtnMudarLanguages() {
	return BtnMudarLanguages;
	}


public By getSkills() {
	return Skills;
}
public By getCountry() {
	return Country;
}
public By getSelectCountry() {
	return SelectCountry;
}
public By getDateOfBirth() {
	return DateOfBirth;
}
public By getMonth() {
	return Month;
}
public By getDay() {
	return Day;
}
public By getPassword() {
	return Password;
}
public By getConfirmPassword() {
	return ConfirmPassword;
}
public By getBtnSubmit() {
	return btnSubmit;
}
public By getBtnSkills() {
	return BtnSkills;
}
public By getTela() {
	return tela;
}
public By getPais() {
	return Pais;
}
public By getMes() {
	return mes;
}
public By getAno() {
	return ano;
}
public By getDia() {
	return dia;
}




}
