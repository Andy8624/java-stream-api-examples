import java.util.*;
import java.util.stream.*;

public class Skip {
    public static void main(String[] args) {
        // Tạo một List chứa các số nguyên từ 1 đến 5
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // Sử dụng Stream API:
        // 1. list.stream(): tạo một Stream từ List các số nguyên
        // 2. skip(2): bỏ qua 2 phần tử đầu tiên trong Stream
        // 3. collect(Collectors.toList()): thu thập phần tử còn lại thành một List mới

        // In ra kết quả: [3, 4, 5]
        System.out.println(list.stream()
                .skip(2)
                .collect(Collectors.toList()));
    }
}

/*
Giải thích hàm skip():
- skip(n) là hàm trung gian trong Stream API.
- Bỏ qua n phần tử đầu tiên của Stream, lấy phần tử còn lại.
- Thường dùng để phân trang hoặc bỏ bớt phần tử không cần thiết.
*/
