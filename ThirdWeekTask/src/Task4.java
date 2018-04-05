import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Task4
{
    public static void main (String[] args)
    {
        TreeMap<String ,ArrayList<String>> dmap = new TreeMap<>();          //// creating map for departments and amount of students
        TreeMap<String, Integer> amntst = new TreeMap<>();
        ArrayList<String> drec = new ArrayList<>();                         //// creating arrays of students for a certain department
        ArrayList<String> dasr = new ArrayList<>();
        ArrayList<String> dpqe = new ArrayList<>();
        ArrayList<String> dbmp = new ArrayList<>();


        dasr.add("Popov_Pavel");                                            //// adding students
        drec.add("Babin_Oleg");
        dpqe.add("Zorin_Gleb");
        dasr.add("Volkov_Nikita");
        dasr.add("Alexander_Kaver");
        drec.add("Anvar_Shakirov");
        dpqe.add("Sidorov_Petr");
        dbmp.add("Saveleva_Olga");

        dmap.put("dasr", dasr);                                         //// put arrays of students in a certain department
        dmap.put("drec", drec);
        dmap.put("dpqe", dpqe);
        dmap.put("dbmp", dbmp);

        amntst.put("dasr", dasr.size());                                //// counting amount of student on each department
        amntst.put("drec", drec.size());
        amntst.put("dpqe", dpqe.size());
        amntst.put("dbmp", dbmp.size());

        System.out.println(dmap.keySet());                                //// output list of departments

        amntst.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(3).forEach(System.out::println);
                                                                        //// output top 3 most popular departments for learning


    }
}