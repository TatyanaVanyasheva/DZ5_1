import apiClasses.apiSteps;
import org.junit.jupiter.api.Test;

public class dz5Test extends apiSteps {
    @Test
    public void getTest(){
        getCharacter("2");
        getLastEpisode();
        getLastCharacter();
        getLastCharInfo();
        AssertLoc();
        AssertRace();
    }
}
