import java.util.*;

public class Reduce {
    public static void main(String[] args) {
        // Tạo danh sách các số nguyên
        List<Integer> list = Arrays.asList(1, 2, 3);

        // reduce(identity, accumulator) thực hiện phép gộp các phần tử của Stream
        // Ở đây, lấy tổng các phần tử, với giá trị khởi đầu (identity) là 0
        System.out.println(list.stream().reduce(0, Integer::sum));
        // Kết quả in ra: 6 (1 + 2 + 3)
    }
}

/*
Giải thích reduce():
- reduce() là terminal operation dùng để gộp các phần tử trong Stream thành một kết quả duy nhất.
- Tham số identity là giá trị khởi tạo.
- accumulator là hàm gộp hai phần tử lại với nhau.
- Ví dụ này tính tổng các phần tử trong Stream.
*/
