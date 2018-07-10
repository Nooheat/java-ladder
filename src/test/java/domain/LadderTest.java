package domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LadderTest {
    @Test
    public void toStringTest() {
        assertThat(Ladder.EMPTY).hasToString("     ");
        assertThat(Ladder.HYPHEN).hasToString("-----");
    }
}
