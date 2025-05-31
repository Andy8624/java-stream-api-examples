import java.util.*;
import java.util.stream.*;

public class Map {
    public static void main(String[] args) {
        // Tạo một List chứa các chuỗi ký tự thường
        List<String> list = Arrays.asList("a", "b", "c");

        // Sử dụng Stream API:
        // 1. list.stream(): tạo một Stream từ List các chuỗi
        // 2. map(String::toUpperCase): biến đổi từng phần tử thành chữ hoa
        // 3. collect(Collectors.toList()): thu thập kết quả thành một List mới

        // In ra kết quả: [A, B, C]
        System.out.println(list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList()));
    }
}

/*
Giải thích hàm map():
- map() là hàm trung gian trong Stream API.
- Chuyển đổi từng phần tử của Stream dựa trên hàm truyền vào (ở đây là chuyển thành chữ hoa).
- Giúp biến đổi dữ liệu dễ dàng mà không làm thay đổi Stream gốc.
*/
