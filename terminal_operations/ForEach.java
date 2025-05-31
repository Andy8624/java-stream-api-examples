import java.util.*;

public class ForEach {
    public static void main(String[] args) {
        // Tạo danh sách các chuỗi
        List<String> list = Arrays.asList("a", "b", "c");

        // forEach() là terminal operation thực hiện hành động (ở đây là in ra màn hình)
        // cho từng phần tử trong Stream theo thứ tự
        list.stream().forEach(System.out::println);
        // Kết quả in ra:
        // a
        // b
        // c
    }
}

/*
Giải thích forEach():
- forEach(Consumer) thực thi hành động cho từng phần tử trong Stream.
- Là một terminal operation, không trả về giá trị.
- Thường dùng để xử lý đầu ra hoặc các tác vụ phụ.
*/
