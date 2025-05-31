import java.util.*;
import java.util.stream.*;

public class Filter {
    public static void main(String[] args) {
        // Tạo một List chứa các số nguyên từ 1 đến 5
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // Sử dụng Stream API để xử lý:
        // 1. list.stream(): tạo một Stream từ list các số nguyên
        // 2. filter(n -> n > 3): lọc các phần tử thỏa mãn điều kiện n > 3 (giữ lại những số lớn hơn 3)
        // 3. collect(Collectors.toList()): thu thập các phần tử thỏa điều kiện thành một List mới

        // In ra kết quả: [4, 5]
        System.out.println(list.stream()
                .filter(n -> n > 3)
                .collect(Collectors.toList()));
    }
}

/*
Giải thích về hàm filter():
- filter() là một hàm trung gian (intermediate operation) trong Stream API.
- Hàm này nhận một Predicate (hàm trả về true/false) làm điều kiện lọc.
- Chỉ giữ lại các phần tử thỏa điều kiện và loại bỏ các phần tử không thỏa.
*/
