import java.util.stream.*;

public class StreamConcat {
    public static void main(String[] args) {
        // Tạo 2 Stream chứa các chuỗi đơn
        Stream<String> stream1 = Stream.of("a");
        Stream<String> stream2 = Stream.of("b");

        // Sử dụng Stream API:
        // Stream.concat(stream1, stream2): nối 2 Stream lại thành một Stream duy nhất
        // forEach(System.out::println): in từng phần tử của Stream mới ra màn hình

        // Kết quả in ra:
        // a
        // b
        Stream.concat(stream1, stream2).forEach(System.out::println);
    }
}

/*
Giải thích hàm Stream.concat():
- concat() là hàm tĩnh để nối 2 Stream cùng kiểu lại thành một Stream duy nhất.
- Giúp xử lý dữ liệu từ nhiều nguồn như một luồng dữ liệu thống nhất.
*/
