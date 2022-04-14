package application.actions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.targets.Target;

import java.nio.file.Paths;

public class EnterValue {

    public static Performable text(String value, Target target) {
        return Enter.theValue(value).into(target);
    }

    public static Performable file(String value, Target target) {
        return Upload.theFile(Paths.get(value)).to(target);
    }
}
