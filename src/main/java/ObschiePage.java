import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;

public class ObschiePage extends SettingsPage{

    //Buttons:
    Pattern vypolnitButton  = new Pattern(papkaSource+"vypolnitButton.png");
//    Pattern podklyucheniyaButton = new Pattern(papkaSource+"podklyucheniyaButton.png");
//    Pattern integratsiyaButton = new Pattern(papkaSource+"integratsiyaButton.png");
//    Pattern polzovateliButton = new Pattern(papkaSource+"polzovateliButton.png");
//    Pattern offRadioButton = new Pattern(papkaSource+"offRadioButton.png");
//    Pattern onRadioButton = new Pattern(papkaSource+"onRadioButton.png");

    //Fields:
//    Pattern enterLicenseKeyField = new Pattern(papkaSource+"enterLicenseKeyField.png");
//    Pattern changeLanguageField = new Pattern(papkaSource+"changeLanguageField.png");

    //Labels:
//    Pattern languageRusOfLabel = new Pattern(papkaSource+"languageRusOfLabel.png");
//    Pattern languagePolOfLabel = new Pattern(papkaSource+"languagePolOffLabel.png");

    //Other elements:
//    Pattern createIconCheckBox = ne

    public void clickOnVypolnitButton(){
        try {
            window.click(vypolnitButton);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

}
