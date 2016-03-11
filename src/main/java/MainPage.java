import org.sikuli.basics.Settings;
import org.sikuli.script.*;

import java.awt.image.BufferedImage;

public class MainPage {

    //Source Path:
    String papkaSource = "G:\\FF_PROJECTS\\NumberOK\\InstaltionSikuliTest\\src\\source\\MainPage\\";

    //Windows:
    Pattern mainWindow = new Pattern(papkaSource+"mainWindow.png");

    //Buttons:
    Pattern bazaDanykhButton  = new Pattern(papkaSource+"bazaDanykhButton.png");
    Pattern nastroykiButton = new Pattern(papkaSource+"nastroykiButton.png");
    Pattern otchetyButton = new Pattern(papkaSource+"otchetyButton.png");
    Pattern prosmotrButton = new Pattern(papkaSource+"prosmotrButton.png");
    Pattern rezultatyButtonn = new Pattern(papkaSource+"rezultatyButton.png");
    Pattern okButtonn = new Pattern(papkaSource+"okButton.png");

    //Fields:
//    Pattern enterLicenseKeyField = new Pattern(papkaSource+"enterLicenseKeyField.png");
//    Pattern changeLanguageField = new Pattern(papkaSource+"changeLanguageField.png");

    //Labels:
//    Pattern languageRusOfLabel = new Pattern(papkaSource+"languageRusOfLabel.png");
//    Pattern languagePolOfLabel = new Pattern(papkaSource+"languagePolOffLabel.png");

    //Other elements:
//    Pattern createIconCheckBox = new Pattern(papkaSource+"createIconCheckBox.png");


    Screen descTopWindows = new Screen();
    Region window = new Region(0,0,1920,1080);

    public  void  clickOnProsmotrButton(){
        try {
            window.click(prosmotrButton);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

        public void clickOnRezultatyButton(){
            try {
                window.click(rezultatyButtonn);
            } catch (FindFailed findFailed) {
                findFailed.printStackTrace();
            }
        }

    public void clickOnBazaDanykhButton(){
        try {
            window.click(bazaDanykhButton);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    public void clickOnOtchetyButton(){
        try {
            window.click(otchetyButton);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    public void  clickOnNastroykiButton(){
        try {
            window.click(nastroykiButton);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    public void clickOnOkButton(){
        try {
            window.click(okButtonn);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    public void recognize () {
        Settings.OcrTextRead = true;
        Settings.OcrTextSearch =true;
        Region region = new Screen().selectRegion();
        System.out.println("The text is "+region.text());

    }

}
