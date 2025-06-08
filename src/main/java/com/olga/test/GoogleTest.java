package com.olga.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
    public static void main(String[] args) {
         // Укажи путь к ChromeDriver, скачанному и распакованному на твоём компьютере
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Открываем сайт Google
        driver.get("https://www.google.com");

        // Проверяем заголовок страницы
        String title = driver.getTitle();
        System.out.println("Title: " + title);

        if(title.equals("Google")) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }

        // Закрываем браузер
        driver.quit();
    }
}
