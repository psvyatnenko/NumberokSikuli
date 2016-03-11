import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;

public class PodklyucheniyaPage extends SettingsPage{

    //Buttons:
    Pattern podklyuchitsyaButton  = new Pattern(papkaSource+"podklyuchitsyaButton.png");
//    Pattern podklyucheniyaButton = new Pattern(papkaSource+"podklyucheniyaButton.png");
//    Pattern integratsiyaButton = new Pattern(papkaSource+"integratsiyaButton.png");
//    Pattern polzovateliButton = new Pattern(papkaSource+"polzovateliButton.png");

    //Fields:
    Pattern rtspField = new Pattern(papkaSource+"rtspField.png");
//    Pattern changeLanguageField = new Pattern(papkaSource+"changeLanguageField.png");

    //Labels:
//    Pattern languageRusOfLabel = new Pattern(papkaSource+"languageRusOfLabel.png");
//    Pattern languagePolOfLabel = new Pattern(papkaSource+"languagePolOffLabel.png");

    //Other elements:
//    Pattern createIconCheckBox = ne



    public void enterRTSPString(){
        try {
            window.type(rtspField,"   ");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    public void clickOnPodklyuchitsyaButton(){
        try {
            window.click(podklyuchitsyaButton);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

}
