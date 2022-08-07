package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\selenium jar and drivers\\chromedriver\\chromedriver.exe\\");

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://hh.ru/");

        WebElement input = driver.findElement(By.xpath("//input[@aria-label='Найти']"));

        input.click();





    }
}