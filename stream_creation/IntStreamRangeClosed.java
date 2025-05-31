import java.util.stream.*;

public class IntStreamRangeClosed {
    public static void main(String[] args) {
        // IntStream.rangeClosed(1, 5): tạo một luồng số nguyên từ 1 đến 5 (bao gồm cả 5)
        // forEach(System.out::println): in từng số trong luồng ra màn hình

        IntStream.rangeClosed(1, 5).forEach(System.out::println);
        // Kết quả in ra:
        // 1
        // 2
        // 3
        // 4
        // 5
    }
}

/*
Giải thích IntStream.rangeClosed():
- rangeClosed(start, end) tạo một luồng số nguyên từ start đến end, cả hai đều bao gồm.
- Thường dùng để lặp qua một dải số nguyên theo thứ tự tăng dần.
*/
