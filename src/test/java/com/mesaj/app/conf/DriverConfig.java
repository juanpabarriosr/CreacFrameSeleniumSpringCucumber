package com.mesaj.app.conf;

import com.mesaj.app.enums.Browser;
import com.mesaj.app.util.driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.time.Duration;

//Para ejecutar en maven:
// mvn clean test -Denviroment=dev
//mvn clean test -Denviroment=prod
@Configuration
@ComponentScan(basePackages = "com.mesaj.app")
@PropertySource("classpath:/application-${enviroment:dev}.properties")  //:dev - Indica entorno por defecto
public class DriverConfig {

    @Value("${driver.type}")
    private Browser driverType;

    @Value("${element.wait.timeout.seconds}")
    private int webDriverWaitTimeOut;

    @Bean
    public WebDriver webDriver(){
        return DriverFactory.get(driverType);
    }

    @Bean
    public WebDriverWait waitFor(){
        return new WebDriverWait(webDriver(), Duration.ofSeconds(webDriverWaitTimeOut));
    }
}
