package application.actions;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Selectors {

    public static Target byID(String constant, String name) {
        return Target.the(name).located(By.id(constant));
    }

    public static Target byCSS(String constant, String name) {
        return Target.the(name).located(By.cssSelector(constant));
    }

    public static Target byXPATH(String constant, String name) {
        return Target.the(name).located(By.xpath(constant));
    }
}
