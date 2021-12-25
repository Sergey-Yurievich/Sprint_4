import com.google.common.base.CharMatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    private static final String USERNAME_PATTERN =
            "^(?=.{3,19}$)([a-zа-яёA-ZА-ЯЁ0-9]{1,19})+([\\s](?![\\s]))+([a-zа-яёA-ZА-ЯЁ0-9]{1,19})";

    private static final Pattern pattern = Pattern.compile(USERNAME_PATTERN);

    public boolean checkNameToEmboss() {

        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }


//        int spaceCount = CharMatcher.is(' ').countIn(name);
//        if (spaceCount != 1 || name.startsWith(" ") || name.endsWith(" ")) {
//            return false;
//        } else if (name.length() >= 3 && name.length() <= 19) {
//            return true;
//        } else {

}



