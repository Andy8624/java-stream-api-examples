import java.util.stream.*;

public class StreamIterate {
    public static void main(String[] args) {
        // Stream.iterate(1, n -> n + 1): tạo một Stream vô hạn bắt đầu từ 1,
        // mỗi phần tử kế tiếp bằng phần tử trước cộng thêm 1
        // limit(5): lấy 5 phần tử đầu tiên từ Stream này
        // forEach(System.out::println): in từng phần tử ra màn hình

        Stream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(System.out::println);
        // Kết quả in ra:
        // 1
        // 2
        // 3
        // 4
        // 5
    }
}

/*
Giải thích Stream.iterate():
- iterate(seed, UnaryOperator): tạo Stream bằng cách bắt đầu từ giá trị seed,
  rồi áp dụng hàm UnaryOperator để tạo các phần tử tiếp theo.
- Thường dùng để tạo Stream các chuỗi số hoặc các phần tử theo quy luật.
- Cần kết hợp với limit() để tránh tạo Stream vô hạn gây tắc chương trình.
*/
