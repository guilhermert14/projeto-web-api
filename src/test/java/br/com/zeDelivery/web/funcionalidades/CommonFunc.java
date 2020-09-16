package br.com.zeDelivery.web.funcionalidades;

import br.com.commons.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class CommonFunc extends BaseTest {

    /**
     * Clicar por {@code texto}
     * @param texto
     */
    public void clicarTexto(String texto){
        driver.findElement(By.xpath("//*[text()='"+texto+"']")).click();
    }

    /**
     * Verificar se o elemento esta na tela {@code xpath}
     * @param xpath
     */
    public boolean verificaElementoVisivel(String xpath){
        return driver.findElements(By.xpath(xpath)).size() != 0;
    }

    /**
     * Realizar o scroll na tela {@code element}
     * @param element
     */
    public void scrollElement(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    /**
     * Clicar via Java Script {@code element}
     * @param element
     */
    public void clicarJs(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

}
