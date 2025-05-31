import java.util.stream.*;

public class IntStreamRange {
    public static void main(String[] args) {
        // IntStream.range(1, 5): tạo một luồng số nguyên từ 1 đến 4 (không bao gồm 5)
        // forEach(System.out::println): in từng số trong luồng ra màn hình

        IntStream.range(1, 5).forEach(System.out::println);
        // Kết quả in ra:
        // 1
        // 2
        // 3
        // 4
    }
}

/*
Giải thích IntStream.range():
- range(start, end) tạo một luồng số nguyên từ start đến end - 1 (không bao gồm end).
- Thường dùng để lặp qua một dải số nguyên theo thứ tự tăng dần, không bao gồm giá trị cuối.
*/
