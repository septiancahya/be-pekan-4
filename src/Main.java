import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static String check(String param) {
        String email = "^((?!\\.)[\\w-_.]*[^.])(@\\w+)(\\.\\w+(\\.\\w+)?[^.\\W])$";
        String shortDate = "(^0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(\\d{4}$)";
        String longDate = "([a-zA-Z]+)(, )([a-zA-Z]+)( )(\\d{2}$)";
        String ipRegex = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

        Pattern emailPattern = Pattern.compile(email);
        Pattern shortDatePattern = Pattern.compile(shortDate);
        Pattern longDatePattern = Pattern.compile(longDate);
        Pattern ipPattern = Pattern.compile(ipRegex);

        Matcher emailMatcher = emailPattern.matcher(param);
        Matcher shortDateMatcher = shortDatePattern.matcher(param);
        Matcher longDateMatcher = longDatePattern.matcher(param);
        Matcher ipMatcher = ipPattern.matcher(param);

        if (emailMatcher.matches()) {
            return param + " merupakan String bertipe E-mail";
        } else if (shortDateMatcher.matches()) {
            return param + " merupakan String bertipe Tanggal (dd-MM-yyyy)";
        } else if(longDateMatcher.matches()) {
            return param + " merupakan String bertipe Tanggal (dddd, MMMM yy)";
        } else if (ipMatcher.matches()) {
            return param + " merupakan String bertipe IP Address";
        } else {
            return "String yang dimasukan tidak valid untuk method ini";
        }
    }
    public static void main(String[] args) {
        System.out.println(check("cahyaseptian39@gmail.com"));
        System.out.println(check("19-02-2023"));
        System.out.println(check("192.168.1.0"));
        System.out.println(check("Senin, Januari 23"));
        System.out.println(check("Sembarang string"));
    }
}