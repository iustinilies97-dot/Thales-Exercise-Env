package dummy;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class DummyTest {

    @Test
    void dummyTest() {
        assertThat(DummyClass.dummyMethod()).isEqualTo("dummy");
    }
}