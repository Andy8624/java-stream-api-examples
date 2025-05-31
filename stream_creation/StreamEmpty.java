import java.util.stream.*;

public class StreamEmpty {
    public static void main(String[] args) {
        // Tạo một Stream rỗng (không chứa phần tử nào)
        Stream<String> stream = Stream.empty();

        // Đếm số phần tử trong Stream (ở đây là 0)
        System.out.println("Empty stream count: " + stream.count());
        // Kết quả in ra: Empty stream count: 0
    }
}

/*
Giải thích Stream.empty():
- empty() là hàm tĩnh tạo một Stream không chứa phần tử nào.
- Thường dùng để khởi tạo Stream khi chưa có dữ liệu hoặc cần trả về Stream rỗng.
*/
