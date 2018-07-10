package domain;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {

    User pobi;

    @Before
    public void setup() {
        pobi = new User("pobi");
    }

    @Test
    public void 이름이_다른_사용자_equals() {
        assertThat(pobi).isNotEqualTo(new User("crong"));
    }

    @Test
    public void 이름이_같은_사용자_equals() {
        assertThat(pobi).isEqualTo(new User("pobi"));
    }

    @Test
    public void 이름_문자열_배열에서_사용자_리스트_생성() {
        assertThat(User.listOf("pobi", "crong"))
                .containsOnly(
                        new User("pobi"),
                        new User("crong")
                );
    }
}
