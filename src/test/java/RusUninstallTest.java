import org.junit.Test;

public class RusUninstallTest extends RusUninstall{

    @Test
    public void rusUninstallDefaultTest() {

//        Steps:
        clickOnPuskButton();
        clickOnAllProgramsLabel();
        clickOnFolderFFLabel();
        clickOnUninstallNumberOkLabel();
        clickOnDaButton();
        clickOnDaButton();

    }
}
