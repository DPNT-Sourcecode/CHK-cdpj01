package befaster.solutions.HLO;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class HelloSolutionTest {

    @Test
    public void saysHello() {
        HelloSolution subject = new HelloSolution();
        String greeting = subject.hello("doesn't matter yet");
        assertThat(greeting, equalTo("Hello, world!"));
    }

}

