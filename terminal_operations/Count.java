import java.util.*;

public class Count {
    public static void main(String[] args) {
        // Tạo danh sách các chuỗi
        List<String> list = Arrays.asList("a", "b", "c");

        // Dùng stream và count() để đếm số phần tử trong Stream
        System.out.println(list.stream().count());
        // Kết quả in ra: 3
    }
}

/*
Giải thích count():
- count() là một terminal operation trả về số lượng phần tử trong Stream.
- Rất hữu ích khi muốn biết kích thước hoặc số lượng phần tử thỏa mãn điều kiện sau các thao tác filter, map, ...
*/
