package befaster.solutions.HLO;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class HelloSolutionTest {

    @Test
    public void saysHelloToJohn() {
        HelloSolution subject = new HelloSolution();
        String friendName = "John";

        String greeting = subject.hello(friendName);
        assertThat(greeting, equalTo("Hello, " + friendName + "!"));
    }

    @Test
    public void saysHelloToMike() {
        HelloSolution subject = new HelloSolution();
        String friendName = "Mike";

        String greeting = subject.hello(friendName);
        assertThat(greeting, equalTo("Hello, " + friendName + "!"));
    }
}



