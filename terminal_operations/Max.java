import java.util.*;

public class Max {
    public static void main(String[] args) {
        // Tạo danh sách các số nguyên
        List<Integer> list = Arrays.asList(3, 1, 2);

        // max() tìm giá trị lớn nhất trong Stream theo Comparator cung cấp
        // get() lấy giá trị trong Optional (cần cẩn thận nếu Stream rỗng)
        System.out.println(list.stream().max(Integer::compare).get());
        // Kết quả in ra: 3
    }
}

/*
Giải thích max():
- max(Comparator) là terminal operation trả về Optional chứa phần tử lớn nhất theo Comparator.
- Nếu Stream rỗng, Optional không có giá trị, gọi get() sẽ gây lỗi NoSuchElementException.
- Nên kết hợp với isPresent() hoặc orElse() để tránh lỗi.
*/
