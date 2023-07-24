import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = SweetsList.getSweetsList();

        System.out.println(list);


        // StreamAPIを試す
        List converted = list.stream()
                // cで始まる文字列のみ通す
                .filter(sweets -> sweets.startsWith("c")).toList()
                // 大文字に変換
                .stream().map(sweets -> sweets.toUpperCase())
                // Listにまとめる
                .toList();

        converted.forEach(System.out::println);
    }
}
