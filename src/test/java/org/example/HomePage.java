package org.example;

import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.URL;

import static org.assertj.core.api.Assertions.assertThat;

public class HomePage {
    @Step("Open the Trendyol homepage")
    public void gotoWebPage() throws InterruptedException {
        String url = System.getenv("APP_URL");
        Driver.webDriver.get(url);
    }
    @Step("<key> saniye bekle")
    public void waitElement(int key) throws InterruptedException{
        Thread.sleep(1000);

    }



}
