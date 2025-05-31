import java.util.*;
import java.util.stream.*;

public class Collect {
    public static void main(String[] args) {
        // Tạo danh sách các chuỗi
        List<String> list = Arrays.asList("a", "b", "c");

        // Dùng stream và collect với Collectors.joining(", ") để nối các phần tử thành chuỗi,
        // các phần tử được ngăn cách bởi dấu phẩy và dấu cách ", "
        System.out.println(list.stream().collect(Collectors.joining(", ")));
        // Kết quả in ra: a, b, c
    }
}

/*
Giải thích collect():
- collect() là một terminal operation dùng để chuyển đổi Stream thành một dạng khác,
  thường là Collection hoặc chuỗi hoặc một kiểu dữ liệu khác.
- Collectors.joining(delimiter) dùng để nối các phần tử thành chuỗi với ký tự phân cách delimiter.
*/
