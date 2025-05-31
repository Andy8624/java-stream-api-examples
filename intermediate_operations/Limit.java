import java.util.*;
import java.util.stream.*;

public class Limit {
    public static void main(String[] args) {
        // Tạo một List chứa các số nguyên từ 1 đến 5
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // Sử dụng Stream API:
        // 1. list.stream(): tạo một Stream từ List các số nguyên
        // 2. limit(3): giới hạn số phần tử trong Stream đầu ra chỉ lấy 3 phần tử đầu tiên
        // 3. collect(Collectors.toList()): thu thập kết quả thành một List mới

        // In ra kết quả: [1, 2, 3]
        System.out.println(list.stream()
                .limit(3)
                .collect(Collectors.toList()));
    }
}

/*
Giải thích hàm limit():
- limit(n) là hàm trung gian trong Stream API.
- Giúp giới hạn số phần tử của Stream đầu ra không vượt quá n phần tử.
- Thường dùng để lấy một phần nhỏ của tập dữ liệu lớn hoặc để phân trang.
*/
