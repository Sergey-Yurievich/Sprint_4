import com.google.common.base.CharMatcher;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {

        int spaceCount = CharMatcher.is(' ').countIn(name);

        if (spaceCount != 1 || name.startsWith(" ") || name.endsWith(" ")) {
            return false;
        } else if (name.length() >= 3 && name.length() <= 19) {
            return true;
        } else {
            return false;
        }
    }
}



