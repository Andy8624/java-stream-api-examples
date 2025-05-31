import java.util.*;
import java.util.stream.*;

public class Peek {
    public static void main(String[] args) {
        // Tạo một List chứa các chuỗi ký tự
        List<String> list = Arrays.asList("a", "b", "c");

        // Sử dụng Stream API:
        // 1. list.stream(): tạo một Stream từ List các chuỗi
        // 2. peek(System.out::println): thực hiện thao tác phụ (in từng phần tử ra console)
        //    - peek không thay đổi Stream, chỉ dùng để quan sát hoặc debug
        // 3. collect(Collectors.toList()): thu thập kết quả thành một List mới

        list.stream()
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}

/*
Giải thích hàm peek():
- peek() là hàm trung gian trong Stream API.
- Được dùng để thực hiện hành động phụ (side-effect) trên từng phần tử của Stream, ví dụ như in log hoặc debug.
- Không làm thay đổi dữ liệu trong Stream.
*/
