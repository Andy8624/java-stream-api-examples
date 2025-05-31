import java.util.stream.*;

public class StreamGenerate {
    public static void main(String[] args) {
        // Stream.generate(Math::random): tạo một Stream vô hạn các số ngẫu nhiên kiểu double từ 0.0 đến 1.0
        // limit(3): giới hạn lấy 3 phần tử đầu tiên từ Stream vô hạn này
        // forEach(System.out::println): in từng phần tử ra màn hình

        Stream.generate(Math::random)
                .limit(3)
                .forEach(System.out::println);
        // Kết quả in ra 3 số thực ngẫu nhiên trong khoảng [0.0, 1.0)
    }
}

/*
Giải thích Stream.generate():
- generate() là hàm tĩnh tạo Stream bằng cách gọi Supplier (hàm cung cấp giá trị) liên tục.
- Thường dùng để tạo Stream vô hạn hoặc các dữ liệu phát sinh động.
- Cần kết hợp với limit() để tránh chạy vô hạn.
*/
