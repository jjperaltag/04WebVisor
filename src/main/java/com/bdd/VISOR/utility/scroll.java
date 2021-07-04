package com.bdd.VISOR.utility;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class scroll {
    public static void scroll_complete(WebElement el, WebDriver driver, String direction) {

        WebElement panel = el;
        Dimension size = panel.getSize();
        int Alto = size.getHeight();
        int Ancho = size.getWidth();
        Double ScreenStart;
        Double ScreenEnd;
        int scrollStart;
        int scrollEnd;

        switch (direction) {
            case "LEFT":
                ScreenStart = size.getWidth() * 0.8;
                scrollStart = ScreenStart.intValue();
                ScreenEnd = size.getWidth() * 0.2;
                scrollEnd = ScreenEnd.intValue();

                new TouchAction((PerformsTouchActions)driver)
                        .press(PointOption.point( scrollStart, Alto))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(scrollEnd, Alto))
                        .release().perform();
                break;

            case "RIGHT":
                ScreenStart = size.getWidth() * 0.2;
                scrollStart = ScreenStart.intValue();
                ScreenEnd = size.getWidth() * 0.8;
                scrollEnd = ScreenEnd.intValue();
                new TouchAction((PerformsTouchActions)driver)
                        .press(PointOption.point( scrollStart, Alto))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(scrollEnd, Alto))
                        .release().perform();
                break;

            case "UP":
                ScreenStart = size.getHeight() * 0.8;
                scrollStart = ScreenStart.intValue();
                ScreenEnd = size.getHeight() * 0.2;
                scrollEnd = ScreenEnd.intValue();

                new TouchAction((PerformsTouchActions)driver)
                        .press(PointOption.point( Ancho, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(Ancho, scrollEnd))
                        .release().perform();
                break;

            case "DOWN":
                ScreenStart = size.getHeight() * 0.2;
                scrollStart = ScreenStart.intValue();
                ScreenEnd = size.getHeight() * 0.8;
                scrollEnd = ScreenEnd.intValue();
                new TouchAction((PerformsTouchActions)driver)
                        .press(PointOption.point( Ancho, scrollStart))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                        .moveTo(PointOption.point(Ancho, scrollEnd))
                        .release().perform();
                break;

        }
    }
}
