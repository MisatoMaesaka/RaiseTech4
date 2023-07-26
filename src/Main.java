import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = SweetsList.getSweetsList();

        System.out.println(list);

        List<String> convertedlist = Sweet.getSweetconverted();

        convertedlist.forEach(System.out::println);
    }
}
