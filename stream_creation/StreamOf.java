import java.util.stream.*;

public class StreamOf {
    public static void main(String[] args) {
        // Tạo một Stream chứa các phần tử "a", "b", "c"
        Stream<String> stream = Stream.of("a", "b", "c");

        // In từng phần tử trong Stream ra màn hình
        stream.forEach(System.out::println);
        // Kết quả in ra:
        // a
        // b
        // c
    }
}

/*
Giải thích Stream.of():
- of() là phương thức tĩnh tạo một Stream từ một hoặc nhiều phần tử.
- Dùng để nhanh chóng tạo Stream từ các giá trị cụ thể mà không cần dùng Collection.
*/
