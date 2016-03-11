import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;

public class RusUninstall extends MainInstalation{

    String papkaUninstallSource = "G:\\FF_PROJECTS\\NumberOK\\InstaltionSikuliTest\\src\\source\\rusUninstall\\";

    Region window = new Region(0,0,1920,1080);



    //Windows:
    Pattern puskButton = new Pattern(papkaUninstallSource+"puskButton.png");

    //Buttons:
    Pattern daleeButton = new Pattern(papkaSource+"daleeButton.png");
    Pattern ustanovitButton = new Pattern(papkaSource+"ustanovitButton.png");

    //Fields:



    //Labels:
    Pattern allProgramsLabel = new Pattern(papkaUninstallSource+"allProgramsLabel.png");
    Pattern folderFFLabel = new Pattern(papkaUninstallSource+"folderFFLabel.png");
    Pattern uninstallNumberOkLabel = new Pattern(papkaUninstallSource+"uninstallNumberOkLabel");

    //Other elements:
    Pattern languageDropDawn = new Pattern(papkaSource+"languageDropDawn.png");

    public  void clickOnPuskButton(){
        try {
            window.click(puskButton);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    public void clickOnAllProgramsLabel(){
        try {
            window.click(allProgramsLabel);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    public  void clickOnFolderFFLabel(){
        try {
            window.click(folderFFLabel);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }

    public void  clickOnUninstallNumberOkLabel(){
        try {
            window.click(uninstallNumberOkLabel);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
    }


}
