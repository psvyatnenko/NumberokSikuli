import org.junit.Test;

public class RusInstallTests extends RusInstall{


    @Test
    public void installToDefaultFoldersWithoutDriversTest() {

//        Steps:
        doubleClickOnInstallButton();
        clickOnZapustitButton();
        clickOnOkButton();
        typeLicense();
        clickOnOkButton();
        clickOnOkButton();
        clickOnDaleeButton();
        clickOnDaleeButton();
        clickOnDaleeButton();
        clickOnDaleeButton();
        clickOnDaleeButton();
        clickOnDaleeButton();
        clickOnCreateIconCheckBox();
        clickOnDaleeButton();
        clickOnUstanovitButton();
        clickOnCancelButton();
    }
}
