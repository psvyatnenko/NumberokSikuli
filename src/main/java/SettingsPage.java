import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;

public class SettingsPage extends MainPage{


//    //Windows:
//    Pattern mainWindow = new Pattern(papkaSource+"mainWindow.png");

    //Buttons:
    Pattern obschieButton  = new Pattern(papkaSource+"obschieButton.png");
    Pattern podklyucheniyaButton = new Pattern(papkaSource+"podklyucheniyaButton.png");
    Pattern integratsiyaButton = new Pattern(papkaSource+"integratsiyaButton.png");
    Pattern polzovateliButton = new Pattern(papkaSource+"polzovateliButton.png");
    Pattern offRadioButton = new Pattern(papkaSource+"offRadioButton.png");
    Pattern onRadioButton = new Pattern(papkaSource+"onRadioButton.png");

    //Fields:
//    Pattern enterLicenseKeyField = new Pattern(papkaSource+"enterLicenseKeyField.png");
//    Pattern changeLanguageField = new Pattern(papkaSource+"changeLanguageField.png");

    //Labels:
//    Pattern languageRusOfLabel = new Pattern(papkaSource+"languageRusOfLabel.png");
//    Pattern languagePolOfLabel = new Pattern(papkaSource+"languagePolOffLabel.png");

    //Other elements:
//    Pattern createIconCheckBox = ne

    public ObschiePage clickOnObschieButton(){
        try {
            window.click(obschieButton);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        return new ObschiePage();
    }

    public  void clickOnPodklyucheniyaButton(){
        try {
            window.click(podklyucheniyaButton);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    public void clickOnIntegratsiyaButton(){
        try {
            window.click(integratsiyaButton);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    public void clickOnPolzovateliButton(){
        try {
            window.click(polzovateliButton);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    public void clickOnOffRadioButton(){
        try {
            window.click(offRadioButton);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    public void clickOnOnRadioButton(){
        try {
            window.click(onRadioButton);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }
}
