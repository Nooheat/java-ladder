package domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringUtilTest {
    @Test
    public void 문자열에서_사용자_추출() {
        assertThat(StringUtil.parseToUserList("pobi, crong, honux"))
                .containsOnly(
                        new User("pobi"),
                        new User("crong"),
                        new User("honux")
                );
    }
}
