import java.util.*;

public class FindFirst {
    public static void main(String[] args) {
        // Tạo danh sách các chuỗi
        List<String> list = Arrays.asList("a", "b", "c");

        // findFirst() trả về phần tử đầu tiên trong Stream, dưới dạng Optional
        // get() lấy giá trị trong Optional (cần cẩn thận nếu Stream rỗng)
        System.out.println(list.stream().findFirst().get());
        // Kết quả in ra: "a"
    }
}

/*
Giải thích findFirst():
- findFirst() là terminal operation trả về một Optional chứa phần tử đầu tiên trong Stream.
- Thường dùng khi cần lấy phần tử đầu tiên của Stream theo thứ tự.
- Nếu Stream rỗng, Optional sẽ không có giá trị, gọi get() sẽ lỗi NoSuchElementException.
- Nên kết hợp với isPresent() hoặc orElse() để tránh lỗi.
*/
