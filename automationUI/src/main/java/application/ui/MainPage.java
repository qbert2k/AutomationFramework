package application.ui;

import application.actions.Selectors;
import net.serenitybdd.screenplay.targets.Target;

public class MainPage {

    public static final Target USERNAME = Selectors.byID("User Name", "user");
    public static final Target PASSWORD = Selectors.byID("Password", "pass");
    public static final Target LOGIN_BUTTON = Selectors.byID("Login Button", "loginButton");
}
