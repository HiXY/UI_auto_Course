import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MACAddressValidator                                   //// creation of MACAddressValidator
{

    private Pattern pattern;
    private Matcher matcher;
                                                            //// pattern for MAC Address
    private static final String MACADDRESS_PATTERN =
            "^(\\d\\d|[a-f][a-f]|[A-F][A-F]|\\d[a-f]|\\d[A-F]|[a-f]\\d|[a-f][A-F]|[A-F]\\d|[A-F][a-f])\\:" +
                    "(\\d\\d|[a-f][a-f]|[A-F][A-F]|\\d[a-f]|\\d[A-F]|[a-f]\\d|[a-f][A-F]|[A-F]\\d|[A-F][a-f])\\:" +
                    "(\\d\\d|[a-f][a-f]|[A-F][A-F]|\\d[a-f]|\\d[A-F]|[a-f]\\d|[a-f][A-F]|[A-F]\\d|[A-F][a-f])\\:" +
                    "(\\d\\d|[a-f][a-f]|[A-F][A-F]|\\d[a-f]|\\d[A-F]|[a-f]\\d|[a-f][A-F]|[A-F]\\d|[A-F][a-f])\\:" +
                    "(\\d\\d|[a-f][a-f]|[A-F][A-F]|\\d[a-f]|\\d[A-F]|[a-f]\\d|[a-f][A-F]|[A-F]\\d|[A-F][a-f])\\:" +
                    "(\\d\\d|[a-f][a-f]|[A-F][A-F]|\\d[a-f]|\\d[A-F]|[a-f]\\d|[a-f][A-F]|[A-F]\\d|[A-F][a-f])$";

    MACAddressValidator()                                   //// validator constructor
    {
        pattern = Pattern.compile(MACADDRESS_PATTERN);
    }
    public boolean validate (final String mac)              //// method for validation
    {
        matcher = pattern.matcher(mac);
        return matcher.matches();
    }
}

public class Task7
{
    public static void main(String[] args)
    {
        String macaddress = "01:23:45:67:89:Az";                            //// example of MAC Address

        MACAddressValidator vldtr = new MACAddressValidator();              //// creating object of the class

        if (vldtr.validate(macaddress))                                     //// check of the MAC Address
        {
            System.out.println("MAC адрес " + macaddress + ": верный");
        } else
        {
            System.out.println("MAC адрес " + macaddress + ": не верный");
        }
    }
}
