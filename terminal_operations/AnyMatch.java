import java.util.*;

public class AnyMatch {
    public static void main(String[] args) {
        // Tạo danh sách các chuỗi
        List<String> list = Arrays.asList("apple", "banana");

        // Kiểm tra xem có ít nhất một phần tử trong stream bắt đầu bằng chữ 'a' không
        // anyMatch trả về true nếu có ít nhất một phần tử thỏa mãn điều kiện, ngược lại trả về false
        System.out.println(list.stream().anyMatch(s -> s.startsWith("a")));
        // Kết quả in ra: true
    }
}

/*
Giải thích anyMatch():
- anyMatch(Predicate): kiểm tra xem có ít nhất một phần tử của Stream thỏa mãn điều kiện Predicate hay không.
- Trả về boolean: true nếu ít nhất một phần tử thỏa mãn, false nếu không có phần tử nào thỏa mãn.
*/
