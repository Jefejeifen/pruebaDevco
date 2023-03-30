package net.onlinenotepad.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static net.onlinenotepad.userinterfaces.NotePad.BTN_RICK_TEXT_NOTE;

public class ClickRickTextNote implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_RICK_TEXT_NOTE)
        );



    }

    public static ClickRickTextNote clickRickTextNote(){
    return Tasks.instrumented(ClickRickTextNote.class);
}


}


