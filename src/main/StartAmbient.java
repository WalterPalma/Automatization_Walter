/*
 * @Author: Walter Fagundes Palma
 */
package main;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StartAmbient {

	public static void main(String[] args) throws InterruptedException {

		// Inicia o Chrome e Acessa o ambiente
		StartDriver start = new StartDriver();
		WebDriver driver = start.firefoxAccess(); //Acessar com o Firefox
		//WebDriver driver = start.chromeAccess(); //Acessar com o Chrome

		// -----------------Seleção de Produto ------------------------
		WebElement element;

		try {

			// Aguardar até que a pagina seja carregada
			WebDriverWait wait = new WebDriverWait(driver, 10);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.className("sf-with-ul")));

			// Selecionar a Opção
			element = driver.findElement(By.className("sf-with-ul"));
			element.click();

			// Aguardar carregamento
			wait = new WebDriverWait(driver, 10);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.className("selector")));

			// Selecionar Produto
			element = driver.findElement(By.className("icon-th-list"));
			element.click();

			element = driver.findElement(
					By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div/div[3]/div/div[2]/a[1]/span"));
			element.click();

			wait = new WebDriverWait(driver, 10);
			element = wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a")));

			element = driver
					.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a"));
			element.click();

			// Aguardar carregamento
			wait = new WebDriverWait(driver, 10);
			element = wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]")));

			// Avançar com o pagamento
			element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]"));
			element.click();

			// Aguardar carregamento
			wait = new WebDriverWait(driver, 10);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.id("email_create")));

			// Criar a Conta
			element = driver.findElement(By.id("email_create"));
			int iEmail = (int) (Math.random() * 10001);
			element.sendKeys("teste" + iEmail + "@teste.com");

			element = driver
					.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[3]/button"));
			element.click();

			// Aguardar carregamento
			wait = new WebDriverWait(driver, 10);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_gender1")));

			// Inserir Dados
			element = driver.findElement(By.id("id_gender1"));
			element.click();// Mr.

			element = driver.findElement(By.id("customer_firstname"));
			element.sendKeys("Benjamin");// First Name

			element = driver.findElement(By.id("customer_lastname"));
			element.sendKeys("Quadros");// Last Name

			element = driver.findElement(By.id("passwd"));
			element.sendKeys("12345678");// Password

			// Data de Nascimento
			Select birthDay = new Select(driver.findElement(By.name("days")));
			birthDay.selectByValue("13");// Dia

			Select birthMonth = new Select(driver.findElement(By.name("months")));
			birthMonth.selectByValue("12");// Mes

			Select birthYear = new Select(driver.findElement(By.name("years")));
			birthYear.selectByValue("1996");// Ano

			// Address Information
			element = driver.findElement(By.id("firstname"));
			element.clear();
			element.sendKeys("Benjamin");// First Name

			element = driver.findElement(By.id("lastname"));
			element.clear();
			element.sendKeys("Quadros");// Last Name

			element = driver.findElement(By.id("company"));
			element.sendKeys("BRQ Digital Solutions");// Company

			element = driver.findElement(By.id("address1"));
			element.sendKeys("Rua California, 22");// Endereço - Linha 1

			element = driver.findElement(By.id("address2"));
			element.sendKeys("Office");// Endereço - Linha 2

			element = driver.findElement(By.id("city"));
			element.sendKeys("Miami");// Cidade

			Select state = new Select(driver.findElement(By.name("id_state")));
			state.selectByVisibleText("Florida");// Estado

			element = driver.findElement(By.id("postcode"));
			element.sendKeys("99999");// Codigo Postal

			Select country = new Select(driver.findElement(By.id("id_country")));
			country.selectByVisibleText("United States");// Pais

			// Aditional Information
			element = driver.findElement(By.id("other"));
			element.sendKeys("This is a test");// Codigo Postal

			element = driver.findElement(By.id("phone_mobile"));
			element.sendKeys("9999999992");// Mobile Phone

			// Assign an address alias for future reference.
			element = driver.findElement(By.id("alias"));
			element.sendKeys("Rua Florida, 1234");// Alternativo

			// Register
			element = driver
					.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[4]/button/span/i"));
			element.click();

			// Aguardar carregamento
			wait = new WebDriverWait(driver, 10);
			element = wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span/i")));

			// Continuar com o Checkout
			element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span/i"));
			element.click();

			// Aguardar carregamento
			wait = new WebDriverWait(driver, 10);
			element = wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div/p[2]/label")));

			// Concordar com os termos de uso
			element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div/p[2]/label"));
			element.click();

			// Continuar com o Checkout
			element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span/i"));
			element.click();

			// Aguardar carregamento
			wait = new WebDriverWait(driver, 10);
			element = wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[1]/div/p/a")));

			// Selecionar Forma de Pagamento
			element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[1]/div/p/a"));
			element.click();

			// Aguardar carregamento
			wait = new WebDriverWait(driver, 10);
			element = wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span/i")));

			// Confirmar Pedido
			element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span/i"));
			element.click();

			// Aguardar carregamento
			wait = new WebDriverWait(driver, 10);
			element = wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/p/strong")));

			element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/p/strong"));

			boolean isCompleted = false;
			if (element.getText().equals("Your order on My Store is complete."))
				isCompleted = true;

			if (isCompleted == true) {
				JOptionPane.showMessageDialog(null, "Compra realizada com sucesso ! :)");
				System.exit(0);
			} else {
				JOptionPane.showMessageDialog(null, "Não foi possível realizar a compra! :(");
				System.exit(0);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Ops, parece que ocorreu um erro ao tentar realizar o teste, verifique os arquivos instalados");
		}

	}

}
