import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class FactorialTest {
    @Test
    void shouldReturnTheFactorialOfANumber() {

        Factorial fact = new Factorial(5);
        int result = fact.factorial();
        assertThat(result,is(equalTo(120)));

    }

}
