
package com.TestingCourse;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.IOException;
import java.util.List;




public class PHPSiteTask5 {
        private WebDriver driver;

        @Before
        public void setUp() {
                System.setProperty("webdriver.gecko.driver",
                        "src/test/resources/geckodriver");
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                driver.get(" https://www.phptravels.net/");

        }



    @Test
        public void openingPage() throws IOException {
               WebDriverWait wait = new WebDriverWait(driver,20);
                WebElement flightClick = driver.findElement(By.xpath("/html/body/div[5]/section/div[2]/div/div/div[2]/ul/li[2]/a"));
                flightClick.click();

                WebElement fromFlight = driver.findElement(By.id("s2id_origin"));
                fromFlight.click();
                WebElement fromFlightEnter = driver.findElement(By.xpath("/html/body/div[18]/div/input"));
                fromFlightEnter.sendKeys("waw");
                WebElement WAW = wait.until((ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[18]/ul/li[1]/div/span"))));
                WAW.click();

                WebElement toFlight = driver.findElement(By.id("s2id_destination"));
                toFlight.click();
                WebElement destinationInput= driver.findElement((By.xpath("/html/body/div[19]/div/input")));
                destinationInput.sendKeys(("jfk"));
                WebElement JFK = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[19]/ul/li/div/span")));
                JFK.click();

                WebElement roundTrip= driver.findElement(By.xpath("/html/body/div[5]/section/div[2]/div/div/div[2]/div[1]/div[3]/form/div[9]/div[2]/div/div"));
                roundTrip.click();

                WebElement depDate = driver.findElement((By.id("departure")));
                depDate.click();
                depDate.clear();
                depDate.sendKeys("2019-09-07");

                WebElement returnDate = driver.findElement((By.id("arrival")));
                returnDate.click();
                returnDate.clear();
                returnDate.sendKeys("2019-09-22");

                WebElement passengerNo = driver.findElement(By.xpath("/html/body/div[5]/section/div[2]/div/div/div[2]/div[1]/div[3]/form/div[5]/div/input"));
                passengerNo.click();

                WebElement doneButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sumManualPassenger")));
                doneButton.click();

                WebElement searchFlight = driver.findElement(By.xpath("/html/body/div[5]/section/div[2]/div/div/div[2]/div[1]/div[3]/form/div[6]/button"));
                searchFlight.click();

                WebElement bookNow =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[4]/div[2]/div[3]/div[1]/div[3]/form/div/button")));
                bookNow.click();

                WebElement guestBooking= driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[2]/div[2]/a"));
                guestBooking.click();

            WebElement cookies = wait.until((ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#cookyGotItBtn"))));
            cookies.click();


                WebElement firstName= driver.findElement(By.id("name"));
                firstName.click();
                firstName.sendKeys("John");

                WebElement lastName = driver.findElement(By.id("surname"));
                lastName.click();
                lastName.sendKeys("Smith");

            List<WebElement> EmailElement = driver.findElements(By.id("email"));
            EmailElement.get(1).sendKeys("Smith.J@yahoo.com");

           WebElement phoneNo = driver.findElement(By.id("phone"));
            phoneNo.click();
            phoneNo.sendKeys("+12679909998");

            WebElement birthDate = driver.findElement(By.id("birthday"));
            birthDate.click();
            birthDate.sendKeys("1988-03-04");

            WebElement cardNo = driver.findElement(By.id("cardno"));
            cardNo.click();
            cardNo.sendKeys("1234567898754");

            WebElement expDate = driver.findElement(By.id("expiration"));
            expDate.click();
            expDate.sendKeys("2020-01-01");

            WebElement nationality = driver.findElement(By.xpath("/html/body/div[5]/form/div/div[1]/div[2]/section/div/div[9]/div/div/a"));
            nationality.sendKeys((Keys.ENTER));

            Select cardType = new Select(driver.findElement(By.id("cardtype")));
            cardType.selectByVisibleText("Visa");

            WebElement cardNumber = driver.findElement(By.id("card-number"));
            cardNumber.click();
            cardNumber.sendKeys("1234567898754");

            Select expiryMonth= new Select(driver.findElement(By.id("expiry-month")));
            expiryMonth.selectByIndex(3);

            Select expiryYear = new Select(driver.findElement(By.id("expiry-year")));
            expiryYear.selectByIndex(5);

            WebElement cvv = driver.findElement(By.id("cvv"));
            cvv.click();
            cvv.sendKeys("123");

        driver.manage().window().maximize();
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("./scrshot.png"));



        }

}


