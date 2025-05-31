import java.util.*;
import java.util.stream.*;

public class Sorted {
    public static void main(String[] args) {
        // Tạo một List chứa các số nguyên không theo thứ tự
        List<Integer> list = Arrays.asList(3, 1, 2);

        // Sử dụng Stream API:
        // 1. list.stream(): tạo một Stream từ List các số nguyên
        // 2. sorted(): sắp xếp các phần tử theo thứ tự tự nhiên (tăng dần)
        // 3. collect(Collectors.toList()): thu thập các phần tử đã sắp xếp thành một List mới

        // In ra kết quả: [1, 2, 3]
        System.out.println(list.stream()
                .sorted()
                .collect(Collectors.toList()));
    }
}

/*
Giải thích hàm sorted():
- sorted() là hàm trung gian trong Stream API.
- Sắp xếp các phần tử trong Stream theo thứ tự tự nhiên (tăng dần).
- Thường dùng để sắp xếp các dữ liệu như số, chuỗi...
*/
