package net.onlinenotepad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.onlinenotepad.userinterfaces.NotePad.TXT_WRITE;

public class ValidatesTheWrittenWord implements Question {

    private String message;

    public ValidatesTheWrittenWord(String message) {

        this.message = message;
    }


    @Override
    public Object answeredBy(Actor actor) {

        String messageFinal = TXT_WRITE.resolveFor(actor).getText();

        if (messageFinal.equals(message)) {
            return true;
        }

        return false;
    }

    public static ValidatesTheWrittenWord validatesTheWrittenWord(String message){
        return new ValidatesTheWrittenWord(message);
    }

}
