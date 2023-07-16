import java.util.regex.Pattern;

public class MatcherCheck {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("[A-Za-z0-9]*[@]gmail.com");

        System.out.println(pattern.matcher("9grzegorz65@gmail.com").matches());

    }
}
