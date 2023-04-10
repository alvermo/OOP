package Second;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcess {
    public static String insertAfter(String text, String s, String t) {
        StringBuilder sb = new StringBuilder();
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]+|\\w+");
        Matcher matcher = pattern.matcher(text);

        for (int i = 0; i < text.length(); i = matcher.end()) {
            if (matcher.find(i)) {
                String word = matcher.group();
                sb.append(word);
                if (word.matches("\\w+") && word.endsWith(s)) {
                    sb.append(" " + t);
                }
            } else {
                sb.append(text.substring(i));
                break;
            }
        }

        return sb.toString();
    }
}
