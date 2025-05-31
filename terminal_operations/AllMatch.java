import java.util.*;

public class AllMatch {
    public static void main(String[] args) {
        // Tạo danh sách số nguyên
        List<Integer> list = Arrays.asList(1, 2, 3);

        // Kiểm tra xem tất cả phần tử trong stream có thỏa mãn điều kiện n > 0 không
        // allMatch trả về true nếu tất cả phần tử đều đúng, ngược lại trả về false
        System.out.println(list.stream().allMatch(n -> n > 0));
        // Kết quả in ra: true
    }
}

/*
Giải thích allMatch():
- allMatch(Predicate): kiểm tra tất cả phần tử của Stream có thỏa mãn điều kiện Predicate hay không.
- Trả về boolean: true nếu tất cả phần tử thỏa mãn, false nếu có ít nhất một phần tử không thỏa mãn.
*/
