import java.util.*;
import java.util.stream.*;

public class Distinct {
    public static void main(String[] args) {
        // Tạo một List chứa các số nguyên có phần tử trùng lặp
        List<Integer> list = Arrays.asList(1, 1, 2, 2, 3);

        // Sử dụng Stream API để xử lý:
        // 1. list.stream(): tạo một Stream từ list các số nguyên
        // 2. distinct(): loại bỏ các phần tử trùng lặp, chỉ giữ lại phần tử duy nhất
        // 3. collect(Collectors.toList()): thu thập kết quả thành một List mới

        // In ra kết quả: [1, 2, 3]
        System.out.println(list.stream()
                .distinct()
                .collect(Collectors.toList()));
    }
}

/*
Giải thích về hàm distinct():
- distinct() là một hàm trung gian (intermediate operation) trong Stream API.
- Hàm này trả về một Stream mới chứa các phần tử không bị trùng lặp, dựa trên phương thức equals() để so sánh.
- Giúp loại bỏ các phần tử giống nhau trong dữ liệu, thuận tiện cho việc xử lý và phân tích.
*/