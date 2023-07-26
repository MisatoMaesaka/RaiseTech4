import java.util.List;

public class Sweet {
    public static List<String> getSweetconverted() {

        List<String> list = SweetsList.getSweetsList();

        List converted = list.stream()
                // cで始まる文字列のみ通す
                .filter(sweet -> sweet.startsWith("c")).toList()
                // 大文字に変換
                .stream().map(sweet -> sweet.toUpperCase())
                // Listにまとめる
                .toList();

        // Stream処理したListを返す
        return converted;


    }
}
