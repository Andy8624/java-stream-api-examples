import java.util.*;

public class FindAny {
    public static void main(String[] args) {
        // Tạo danh sách các chuỗi
        List<String> list = Arrays.asList("a", "b", "c");

        // findAny() trả về một phần tử bất kỳ trong Stream, dưới dạng Optional
        // get() lấy giá trị trong Optional (cần cẩn thận nếu Stream rỗng)
        System.out.println(list.stream().findAny().get());
        // Kết quả có thể là "a" hoặc "b" hoặc "c"
    }
}

/*
Giải thích findAny():
- findAny() là terminal operation trả về một Optional chứa một phần tử bất kỳ trong Stream.
- Thường dùng khi không cần phần tử cụ thể mà chỉ cần một phần tử nào đó có trong Stream.
- Nếu Stream rỗng, Optional sẽ không có giá trị, gọi get() sẽ lỗi NoSuchElementException.
- Nên kết hợp với isPresent() hoặc orElse() để tránh lỗi.
*/
