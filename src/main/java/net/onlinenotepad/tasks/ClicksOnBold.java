package net.onlinenotepad.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static net.onlinenotepad.userinterfaces.NotePad.BTN_BOLD_TEXT;

public class ClicksOnBold implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_BOLD_TEXT)
        );

    }


    public static ClicksOnBold clicksOnBold(){
        return Tasks.instrumented(ClicksOnBold.class);
    }

}
