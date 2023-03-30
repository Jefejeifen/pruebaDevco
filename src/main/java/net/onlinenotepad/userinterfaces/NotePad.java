package net.onlinenotepad.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NotePad {

    public static final Target BTN_RICK_TEXT_NOTE = Target.the("button for rick text note").
            located(By.xpath("(//button[@id='richtextnote-tab'])[1]"));


    public static final Target BTN_BOLD_TEXT = Target.the("button for bold text").
            located(By.xpath("(//button[@class='ck ck-button ck-off'])[1]"));

    public static final Target TXT_AREA = Target.the("text for write").
            located(By.xpath("//div[@id='editor']"));

    public static final Target TXT_WRITE = Target.the("text writed").
            located(By.xpath("//*[@id=\"editor\"]/p/strong"));

}
