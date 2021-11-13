package PageModel;

import org.openqa.selenium.By;

import static driver.Driver.webDriver;

public class HomeModel {

    BaseModel baseModel = new BaseModel();
    public static By doLogin = By.xpath("//p[text()=\"Giriş Yap\"]");
    public static By closePopup = By.xpath("//*[@id=\"gender-popup-modal\"]/div/div/div[1]");
    public static By inputEmail =By.id("login-email");
    public static By inputPassword = By.id("login-password-input");
    public static By btnSubmit = By.xpath("//*[@id=\"login-register\"]/div[3]/div[1]/form/button/span");

    //go to web page
    public void useVisitSite(String key){
        webDriver.get(key);
    }

    public void setClosePopup(){
        baseModel.clickElement(closePopup);
    }

    public void doLogin(String email, String password) throws InterruptedException {
        setClosePopup();
        baseModel.clickElement(doLogin);
        baseModel.sendKeys(inputEmail, email);
        baseModel.sendKeys(inputPassword, password);
        baseModel.clickElement(btnSubmit);
    }



}
