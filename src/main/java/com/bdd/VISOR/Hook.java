package com.bdd.VISOR;

import com.bdd.VISOR.utility.FileHelper;
import com.bdd.VISOR.utility.GenerateWord;
import com.bdd.VISOR.utility.Listener;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import static com.bdd.VISOR.BaseClass.stepFailNoShoot;

public class Hook extends Listener {
    private static final String GECKO_KEY 		= "webdriver.gecko.driver";
    private static final String GECKO_DRIVER 	= "/src/test/resources/driver/firefox/0.26/geckodriver.exe";
    private static final String CHROME_KEY 		= "webdriver.chrome.driver";
    private static final String CHROME_DRIVER 	= "/src/test/resources/driver/chrome/91.0/chromedriver.exe";
    private static final String IE_KEY 			= "webdriver.ie.driver";
    private static final String IE_DRIVER 		= "/src/test/resources/driver/ie/3.5/IEDriverServer.exe";
    private static final long DELAY = 10;
    private static WebDriver driver;

    static GenerateWord generateWord = new GenerateWord();

    @Before
    public void Scenario(Scenario scenario){
        onTestStart(scenario.getName());
    }

    @Before
    public void setUpWeb(Scenario scenario) throws Throwable {
        generateWord.startUpWord(scenario.getName());

        try {
            System.out.println("[LOG] NAVEGADOR: "+"resources");

            //switch (System.getProperty("framework.browser")){
            switch ("Chrome"){
                case "IE":

                    System.setProperty(IE_KEY, FileHelper.getProjectFolder() + IE_DRIVER);

                    InternetExplorerOptions options = new InternetExplorerOptions();

                    options.introduceFlakinessByIgnoringSecurityDomains();

                    options.setCapability("requireWindowFocus", true);

                    options.setCapability("enablePersistentHover", false);

                    options.setCapability(InternetExplorerDriver.ENABLE_ELEMENT_CACHE_CLEANUP, true);

                    options.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);

                    options.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);

                    driver = new InternetExplorerDriver(options);

                    break;

                case "Chrome":

                    System.setProperty(CHROME_KEY, FileHelper.getProjectFolder() + CHROME_DRIVER);

                    System.setProperty("webdriver.chrome.silentOutput", "true");

                    ChromeOptions chromeOptions = new ChromeOptions();

                    //	chromeOptions.setHeadless(true);
                    chromeOptions.addArguments(
                            "--verbose",
                            "--disable-web-security",
                            "--ignore-certificate-errors",
                            "--allow-running-insecure-content",
                            "--allow-insecure-localhost",
                            "--no-sandbox",
                            "--disable-gpu",
                            "enable-automation",
                            "--disable-infobars",
                            "--disable-dev-shm-usage",
                            "--disable-browser-side-navigation"
                    );

                    /************ default download ************/
                    String basePath;
                    basePath = System.getProperty("user.dir");
                    HashMap<String, Object> chromePrefs = new HashMap();
                    chromePrefs.put("download.default_directory", basePath + "\\download\\");
                    chromeOptions.setExperimentalOption("prefs", chromePrefs);
                    /************ default download ************/

                    driver = new ChromeDriver(chromeOptions);

                    getDriver().manage().window().maximize();

                    getDriver().manage().timeouts().implicitlyWait(DELAY, TimeUnit.SECONDS);

                    break;

                case "Firefox":

                    System.setProperty(GECKO_KEY, FileHelper.getProjectFolder() + GECKO_DRIVER);

                    FirefoxOptions firefoxOptions = new FirefoxOptions();

//					firefoxOptions.addArguments(
//							"--headless"
//					);

                    driver = new FirefoxDriver(firefoxOptions);

                    getDriver().manage().window().maximize();

                    getDriver().manage().timeouts().implicitlyWait(DELAY, TimeUnit.SECONDS);

                    break;
            }

        }catch (Throwable t){
            generateWord.sendText("Error : Navegador se cerro inesperandamente." + t.getMessage());
            stepFailNoShoot("Error : Navegador se cerro inesperandamente." + t.getMessage());
            throw t;
        }
    }

    @After
    public void tearDown(Scenario scenario) throws IOException {

        onFinish();

        generateWord.endToWord(scenario.getStatus());

        getDriver().close();
    }

    public static WebDriver getDriver() { return driver; }
}
