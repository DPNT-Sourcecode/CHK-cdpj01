package befaster.solutions.HLO;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class HelloSolutionTest {

    private HelloSolution subject = new HelloSolution();

    @Test
    public void saysHelloToJohn() {
        String friendName = "John";

        String greeting = subject.hello(friendName);
        assertThat(greeting, equalTo("Hello, " + friendName + "!"));
    }

    @Test
    public void saysHelloToMike() {
        String friendName = "Mike";

        String greeting = subject.hello(friendName);
        assertThat(greeting, equalTo("Hello, " + friendName + "!"));
    }
}
