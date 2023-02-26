package com.juaracoding.posttestempatbelas;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PostTest14 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\juaracoding\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://formy-project.herokuapp.com/form");
        driver.manage().window().maximize();

        //locator
        driver.findElement(By.id("first-name")).sendKeys("Farhan");
        driver.findElement(By.id("last-name")).sendKeys("Ramadhany");
        driver.findElement(By.id("job-title")).sendKeys("Honorer");

        //radio button
        WebElement radio1 = driver.findElement(By.id("radio-button-1"));
        radio1.click();
        System.out.println(radio1.isSelected());

        WebElement radio2 = driver.findElement(By.id("radio-button-2"));
        radio1.click();
        System.out.println(radio2.isSelected());

        WebElement radio3 = driver.findElement(By.id("radio-button-3"));
        radio1.click();
        System.out.println(radio3.isSelected());


        //sex
        driver.findElement(By.id("checkbox-1")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("checkbox-2")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("checkbox-3")).click();
        Thread.sleep(2000);

        //Drop Down
        WebElement ddown = driver.findElement(By.id("select-menu"));
        Select select = new Select(ddown);

        select.selectByValue("2");
        select.selectByVisibleText("2-4");

        System.out.println("select : 2-4" );
        //select.selectByIndex(5);

        //Kalender
//        String MonthYearVal = driver.findElement(By.id("datepicker")).getText();
//        System.out.println(MonthYearVal);
//        String month = MonthYearVal.split(" ")[0].trim();
//        String date = MonthYearVal.split(" ")[1].trim();
//        String year = MonthYearVal.split(" ")[2].trim();
//
//        while (!(month.equals("Januari") && date.equals("20") && year.equals("1998"))){
//            //driver.findElement((By.xpath("")).click();
//            MonthYearVal = driver.findElement(By.id("datepicker")).getText();
//        }
//        driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));

        //Submit
        driver.findElement(By.id("select-menu")).submit();
        //driver.switchTo().alert().accept();
        System.out.println("Submited");


//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        //keluar dari frame
        driver.switchTo().defaultContent();

        driver.quit();
        System.out.println("Quit Browser");


    }
}