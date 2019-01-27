package iPhone;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Controls extends Base {
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Controls\"]")
    public static WebElement control;

    public void checkUISwitch(){
        control.click();
        String Actual = ad.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"UISwitch\"]")).getText();
        String Expected = "UISwitch";
        System.out.println(Actual);
    }
    public void checkUISlider(){
        control.click();
        String Actual = ad.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"UISlider\"])[1]")).getText();
        String Expected = "UISlider";
        System.out.println(Actual);
    }
    public void checkUIPageControl(){
        control.click();
        String Actual = ad.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"UIPageControl\"]")).getText();
        String Expected = "UIPageControl";
        System.out.println(Actual);
    }
}