package application.actions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class Click {

    /**
     * Is the action to make Click in a target
     */
    public static Performable on(Target target) {
        WaitUntil.the(target, isCurrentlyVisible()).forNoMoreThan(10).seconds();
        WaitUntil.the(target, isClickable());
        return net.serenitybdd.screenplay.actions.Click.on(target);
    }

    /**
     * Is the action to make DoubleClickActions in a target
     */
    public static Performable doubleOn(Target target) {
        WaitUntil.the(target, isCurrentlyVisible()).forNoMoreThan(10).seconds();
        WaitUntil.the(target, isClickable());
        return net.serenitybdd.screenplay.actions.DoubleClick.on(target);
    }

    /**
     * Is the action to make ProlongedClickActions in a target
     */
    public static void prolonged(Actor actor, WebDriver webDriver, Target target) {
        Actions actions = new Actions(webDriver);
        actions.clickAndHold(target.resolveFor(actor)).build().perform();
    }
}