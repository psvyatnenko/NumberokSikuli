import org.openqa.selenium.interactions.Keyboard;
import org.sikuli.script.*;

public class RusInstall extends MainInstalation{

//    Screen descTopWindows = new Screen();
//
//    Region window = new Region(0,0,1920,1080);
    //Icons:

    //Windows:
    Pattern installWindowRus = new Pattern(papkaSource+"installWindowRus.png");
    Pattern changeLanguageWindow = new Pattern(papkaSource+"changeLanguageWindow.png");
    Pattern enterLicenseWindow = new Pattern(papkaSource+"enterLicenseWindow.png");

    //Buttons:
    Pattern daleeButton = new Pattern(papkaSource+"daleeButton.png");
    Pattern ustanovitButton = new Pattern(papkaSource+"ustanovitButton.png");
//    Pattern okButton = new Pattern(papkaSource+"okButton.png");

    //Fields:



    //Labels:
    Pattern languageRusOnLabel = new Pattern(papkaSource+"languageRusOnLabel.png");
//    inst = new Pattern(papkaSource+"languageRusLabel.png");
    Pattern enterLicenseKeyRusLabel = new Pattern(papkaSource+"enterLicenseKeyRuslabel.png");
    //Other elements:
    Pattern languageDropDawn = new Pattern(papkaSource+"languageDropDawn.png");



    public void changeInstallRusLanguage(){
        try {
            window.click(changeLanguageField);
//            window = window.find(changeLanguageWindow);
            window.click(languageRusOnLabel);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    public void clickOnDaleeButton(){
        try {
            window.click(daleeButton);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    public  void clickOnUstanovitButton (){
        try {
            window.click(ustanovitButton);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }
}
