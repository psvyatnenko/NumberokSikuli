import org.junit.Test;
import org.sikuli.script.Region;

public class ConnectionTests extends PodklyucheniyaPage{

//   @Test
   public  void connectRtspTest(){

//      Steps:
      clickOnOffRadioButton();
      enterRTSPString();
      clickOnPodklyuchitsyaButton();
      clickOnOkButton();
      clickOnObschieButton()
              .clickOnVypolnitButton();
      clickOnPodklyucheniyaButton();
      clickOnOnRadioButton();

   }
   @Test

   public void ok (){
   recognize();
   }
}
