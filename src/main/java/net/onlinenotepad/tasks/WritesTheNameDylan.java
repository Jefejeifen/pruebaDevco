package net.onlinenotepad.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.onlinenotepad.userinterfaces.NotePad.TXT_AREA;

public class WritesTheNameDylan implements Task {

    private String text;


    public WritesTheNameDylan(String text) {
        this.text = text;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(TXT_AREA),
                Enter.theValue(text).into(TXT_AREA)
        );

    }

    public static WritesTheNameDylan writesTheNameDylan(String text){
        return Tasks.instrumented(WritesTheNameDylan.class, text);
    }


}
