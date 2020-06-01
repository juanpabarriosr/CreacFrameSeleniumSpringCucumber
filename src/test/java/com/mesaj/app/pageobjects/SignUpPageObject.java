package com.mesaj.app.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpPageObject {

    private WebDriver driver;

    public SignUpPageObject(WebDriver driver){
        this.driver = driver;
    }

    private By firstNameTexbox = By.xpath("//input[@placeholder='First Name']");

    private By lastName = By.xpath("//input[@placeholder='Last Name']");

    private By emailAddress = By.xpath("//input[@type='email']");

    private By phone = By.xpath("//input[@type='tel']");

    private By genderMale = By.xpath("//input[@value='Male']");

    private By genderFemale = By.xpath("//input[@value='FeMale']");

    private By country = By.id("countries");

    private By dateOfBirthYear = By.xpath("//select[@id='yearbox']");

    private By dateOfBirthMonth = By.xpath("//select[@placeholder='Month']");

    private By dateOfBirthDay = By.xpath("//select[@id='daybox']");

    private By password = By.xpath("//input[@id='firstpassword']");

    private By confirmPassword = By.xpath("//input[@id='secondpassword']");

    private By submit = By.xpath("//button[@id='submitbtn']");

}
