package application.actions;

import net.serenitybdd.screenplay.actions.WithChainableActions;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class MoveMouse {

    public static WithChainableActions to(Target target) {
        WaitUntil.the(target, isCurrentlyVisible()).forNoMoreThan(10).seconds();
        return MoveMouse.to(target);
    }
}