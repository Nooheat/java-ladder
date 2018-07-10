package domain;

import java.util.Arrays;
import java.util.List;

public class StringUtil {
    public static List<User> parseToUserList(String names) {
        return User.listOf(
                Arrays.stream(names.split(","))
                        .map(String::trim)
                        .toArray(String[]::new)
        );
    }
}
