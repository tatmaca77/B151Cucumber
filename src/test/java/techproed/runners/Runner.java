package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
  Runner class'i TestNG'deki .Xml File kullanimindaki gibi istedigimiz scenario'lari kullanacagimiz tag parametresi
  sayesinde calistirabiliriz. Ve plugin parametresi ile raporlar alabiliriz.
 */
@RunWith(Cucumber.class) // --> Test calistirici Annotation
@CucumberOptions()









public class Runner {
}
/**
   @CucumberOptions() notasyonuna parametre olarak
           features--> packega'in yolunu
           glue--> stepdefinition package
           tag--> calistirmak istedigimiz scenario'lari burda belirtiriz.
 */