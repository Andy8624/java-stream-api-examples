# Java Stream API Examples

Repository này tập hợp các ví dụ minh họa chi tiết về cách sử dụng **Java Stream API**, bao gồm cả các hàm trung gian (**Intermediate operations**) và hàm kết thúc (**Terminal operations**). Mỗi ví dụ đều có chú thích rõ ràng bằng tiếng Việt giúp bạn dễ dàng hiểu và áp dụng.

## Mục đích của Repo

* Giúp bạn làm quen và nắm chắc kiến thức về Java Stream API.
* Hỗ trợ học tập và luyện tập để nâng cao kỹ năng lập trình Java.
* Chuẩn bị cho các buổi phỏng vấn về Java, đặc biệt về xử lý dữ liệu dạng Stream.
* Tham khảo nhanh các ví dụ minh họa các thao tác phổ biến với Stream.

---

## Nội dung Repo

Các ví dụ được chia thành các nhóm chức năng chính như sau:

### 1. Intermediate Operations (Các thao tác trung gian)

* `map` — chuyển đổi từng phần tử.
* `filter` — lọc phần tử thỏa mãn điều kiện.
* `flatMap` — làm phẳng Stream các Stream con.
* `distinct` — loại bỏ phần tử trùng lặp.
* `limit` — lấy số lượng phần tử giới hạn.
* `skip` — bỏ qua một số phần tử đầu.
* `sorted` — sắp xếp phần tử theo thứ tự tự nhiên hoặc `Comparator`.
* `peek` — thao tác phụ (debug/log) trong quá trình xử lý.

### 2. Terminal Operations (Các thao tác kết thúc)

* `forEach` — duyệt và thực thi hành động trên từng phần tử.
* `collect` — gom Stream thành Collection hoặc chuỗi.
* `reduce` — gộp các phần tử thành một kết quả duy nhất.
* `count` — đếm số phần tử.
* `findFirst` và `findAny` — tìm phần tử đầu tiên hoặc bất kỳ.
* `allMatch`, `anyMatch`, `noneMatch` — kiểm tra điều kiện với toàn bộ hoặc một phần tử.
* `max`, `min` — tìm phần tử lớn nhất hoặc nhỏ nhất.

### 3. Stream Creation

* `Stream.of` — tạo Stream từ các phần tử.
* `Stream.empty` — tạo Stream rỗng.
* `Stream.generate` — tạo Stream bất tận.
* `Stream.iterate` — tạo Stream theo chuỗi số.
* `IntStream.range` và `IntStream.rangeClosed` — tạo Stream các số nguyên trong phạm vi.
* `Stream.concat` — nối hai Stream.



---

## Hướng dẫn sử dụng

Để bắt đầu với các ví dụ này, hãy làm theo các bước đơn giản sau:

1.  **Clone** repository về máy của bạn:
    ```bash
    git clone [https://github.com/Andy8624/java-stream-api-examples.git](https://github.com/Andy8624/java-stream-api-examples.git)
    ```
2.  Mở thư mục dự án trong IDE yêu thích của bạn (IntelliJ IDEA, Eclipse, VSCode...).
3.  Chạy từng file `.java` ví dụ để hiểu và quan sát kết quả.
4.  Tham khảo các **chú thích tiếng Việt** trong mỗi file để hiểu rõ công dụng của từng hàm.

---

## Lợi ích khi học Java Stream API

* Viết code Java ngắn gọn, dễ hiểu, chuẩn **Functional Programming**.
* Xử lý tập hợp dữ liệu hiệu quả, dễ dàng áp dụng song song (**parallel processing**).
* Giúp cải thiện kỹ năng lập trình hiện đại, được nhiều công ty đánh giá cao.
* Là kiến thức quan trọng cho các bài phỏng vấn Java Backend.

---

## License

Repo được chia sẻ **miễn phí** cho mục đích học tập và nghiên cứu.

Nếu bạn thấy repo hữu ích, hãy **star** để ủng hộ mình nhé! ⭐

Nếu có thắc mắc hoặc góp ý, vui lòng tạo [issue](https://github.com/Andy8624/java-stream-api-examples/issues) hoặc contact trực tiếp.

---

**Người tạo**: Dương Lập Khang - Andy
**Liên hệ**: khangss2803@gmail.com
