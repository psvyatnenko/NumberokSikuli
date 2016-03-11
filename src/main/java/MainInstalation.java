import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

public class MainInstalation {

    //Source Path:
    String papkaSource = "G:\\FF_PROJECTS\\NumberOK\\InstaltionSikuliTest\\src\\source\\";

    //Licenses:
    String licenseKey = "4MAZT-AKTDG-C469Z-5F52D";

    //Icons:
    Pattern istallIcon = new Pattern(papkaSource+"installIcon.png");

    //Windows:
    Pattern systemSequrityWindow = new Pattern(papkaSource+"systemSequrityWindow.png");
    Pattern changeLanguageWindow = new Pattern(papkaSource+"changeLanguageWindow.png");
    Pattern enterLicenseKeyWindow = new Pattern(papkaSource+"enterLicenseKeyWindow.png");
    Pattern installDriversWindow = new Pattern(papkaSource+"installDriversWindow.png");


    //Buttons:
    Pattern zapustitButton = new Pattern(papkaSource+"zapustitButton.png");
    Pattern okButton = new Pattern(papkaSource+"okButton.png");
    Pattern daButton = new Pattern(papkaSource+"daButton.png");
    Pattern netButton = new Pattern(papkaSource+"netButton.png");
    Pattern cancelButton = new Pattern(papkaSource+"cancelButton.png");

    //Fields:

    Pattern enterLicenseKeyField = new Pattern(papkaSource+"enterLicenseKeyField.png");
    Pattern changeLanguageField = new Pattern(papkaSource+"changeLanguageField.png");

    //Labels:
//    Pattern languageRusOnLabel = new Pattern(papkaSource+"languageRusOnLabel.png");
    Pattern languageRusOfLabel = new Pattern(papkaSource+"languageRusOfLabel.png");
    Pattern languagePolOfLabel = new Pattern(papkaSource+"languagePolOffLabel.png");

    //Other elements:
    Pattern createIconCheckBox = new Pattern(papkaSource+"createIconCheckBox.png");


    Screen descTopWindows = new Screen();
    Region window = new Region(0,0,1920,1080);


    public void doubleClickOnInstallButton(){
        try {
            window.doubleClick(istallIcon);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    public  void clickOnZapustitButton(){

        window.exists(systemSequrityWindow, 1000);
        try {
            window.click(zapustitButton);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

//    public void changeInstallRusLanguage(){
//        try {
//            window.click(changeLanguageField);
////            window = window.find(changeLanguageWindow);
//            window.click(languageRusOnLabel);
//        } catch (FindFailed findFailed) {
//            findFailed.printStackTrace();
//        }
//    }

    public void clickOnOkButton(){
        try {
            window.click(okButton);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    public  void typeLicense(){

        window.exists(enterLicenseKeyWindow, 2000);
        try {
            window.type(enterLicenseKeyField, licenseKey);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    public void clickOnCreateIconCheckBox (){
        try {
            window.click(createIconCheckBox);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }
    public void clickOnCancelButton (){
        try {
            window.click(cancelButton);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    public void clickOnDaButton(){
        try {
            window.click(daButton);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    public void clickOnNetButton(){
        try {
            window.click(netButton);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }
}
