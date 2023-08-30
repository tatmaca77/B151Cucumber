package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//-->Scenario çalıştırıcı notasyonu.Cucumber ile junit entegrasonunu sağlar
@CucumberOptions(plugin = {"pretty",
        "html:target/default-cucumber-reports.html",
        "json:target/json-reports/cucumber.json",
        "junit:target/xml-report/cucumber.xml",
        "rerun:TestOutput/failed_scenario.txt"},
        //rerun ile belirttiğimiz dosyada fail olan senaryolar tutulur.
        features = "@TestOutput/failed_scenario.txt",
        glue = {"techproed/stepDefinition"},
        dryRun = false,//-->true seçersek scenarioları kontrol eder browser'ı çalıştırmaz
        monochrome = true//-->true kullanırsak konsoldaki çıktılar tek renk(siyah) olur
)
public class FailedRunner {
}
/**
    FailedRunner class'ını oluşturma amacımız rerun ile belirttiğimiz yolda fail olan scenarioları
tekrar bu class'dan tüm scenario'ları tekrar çalıştırmak yerine sadece fail olanları çalıştırmak
için kullanırız. @CucumberOptions() parametresi içine belirttiğimiz features tag'ına bu class'da
fail olan scenarioları tutan txt dosyasının yolunu belirtiriz. Dosya yolu belirttiğimiz için
önüne @ işareti koymamız gerekir
 */

/**
   Burda ben ilk önce day35 altindaki US001 senaryolarini calistirdim. Öncelikle 1.ve3. senaryolarda bilerek hata aldim.
   2.Senaryo Passed oldu. Sonucunda bir tane TestOutput dosyasi altinda .txt dosyasi olustu ve icinde failed olan
   senaryolarin satirlari gözüktü. 2. senaryo basarili olarak gectigi icin onunla ilgili hic birsey yazmaz.
   Sonraki asamalarda FailedRunner Class'indan tags parametresini sildik. ve features yolunu TestOutput dosyasinin
   yolunu basinda @ isareti ile yazdik. US001 üzerinde önce senaryo 1'i düzelttik ve calistirdik. Bu sefer sadece
   failed olan 1 ve 3 calisti. 1.senaryodan Pass aldik.
   Sonrasinda .txt dosyasi icinde kontrol edince 1.senaryonunda silindigini gördük. Sonra 3. senaryoyu da düzelttik ve
   calistirdik ve PASS aldik. En son olarak .txt dosyasi icerisini kontrol ettigimizde icerisinin bombos oldugunu gördük
   cünkü hic bir sekilde failed olan bir senaryo yoktu. !!!!!
 */
