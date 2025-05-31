import java.util.*;

public class NoneMatch {
    public static void main(String[] args) {
        // Tạo danh sách các số nguyên
        List<Integer> list = Arrays.asList(1, 2, 3);

        // noneMatch() kiểm tra xem không có phần tử nào trong Stream thỏa điều kiện
        // Ở đây, kiểm tra không có phần tử nào nhỏ hơn 0
        System.out.println(list.stream().noneMatch(n -> n < 0));
        // Kết quả in ra: true (vì tất cả đều >= 0)
    }
}

/*
Giải thích noneMatch():
- noneMatch(Predicate) trả về true nếu không có phần tử nào thỏa mãn điều kiện.
- Trả về false nếu có ít nhất một phần tử thỏa mãn.
- Đây là terminal operation, trả về boolean.
*/
