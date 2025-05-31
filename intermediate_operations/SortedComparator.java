import java.util.*;
import java.util.stream.*;

public class SortedComparator {
    public static void main(String[] args) {
        // Tạo một List chứa các số nguyên không theo thứ tự
        List<Integer> list = Arrays.asList(3, 1, 2);

        // Sử dụng Stream API:
        // 1. list.stream(): tạo một Stream từ List các số nguyên
        // 2. sorted(Comparator.reverseOrder()): sắp xếp các phần tử theo thứ tự giảm dần
        // 3. collect(Collectors.toList()): thu thập các phần tử đã sắp xếp thành một List mới

        // In ra kết quả: [3, 2, 1]
        System.out.println(list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()));
    }
}

/*
Giải thích hàm sorted(Comparator):
- sorted() là hàm trung gian trong Stream API.
- Sắp xếp các phần tử trong Stream dựa trên Comparator được truyền vào.
- Ở đây, Comparator.reverseOrder() sắp xếp theo thứ tự giảm dần.
*/
