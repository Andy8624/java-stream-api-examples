import java.util.*;
import java.util.stream.*;

public class FlatMap {
    public static void main(String[] args) {
        // Tạo List gồm các List con chứa chuỗi ký tự
        List<List<String>> list = Arrays.asList(Arrays.asList("a"), Arrays.asList("b"));

        // Xử lý với Stream API:
        // 1. list.stream(): tạo stream từ List các List<String>
        // 2. flatMap(Collection::stream):
        //    - "phẳng hóa" (flatten) các List con thành một stream các phần tử riêng lẻ
        //    - chuyển Stream<List<String>> thành Stream<String>
        // 3. collect(Collectors.toList()): thu thập các phần tử thành List mới

        // Kết quả in ra: [a, b]
        System.out.println(list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList()));
    }
}

/*
Giải thích hàm flatMap():
- flatMap() là một hàm trung gian trong Stream API.
- Nó giúp "mở rộng" các phần tử có cấu trúc lồng nhau thành một stream phẳng.
- Thường dùng khi bạn có Stream chứa các Collection hay Arrays và muốn xử lý từng phần tử riêng biệt.
*/
