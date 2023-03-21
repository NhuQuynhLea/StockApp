# RxAndroid
## 1.Thread (Luồng)
- Khi một ứng dụng Androoid được khởi chạy, sẽ có 1 Process được tạo ra cùng với 1 Thread để thực thi
- Thread là một thực thể trong Process, là đối tượng để thực thi 1 nhiệm vụ nào đó
- Có thể có nhiều Thread trong 1 Process, mỗi Thread có 1 công việc riêng và chiếm 1 phần tài nguyên của Process
> Process = Program (chương trình cần thực hiện) + all Threads executing in Program

## 2. Multiple Thread(Đa luồng)
 Khi 1 chương trình nhiều công việc, có nhiều Thread đồng thời làm việc thì công việc sẽ hiệu quả hơn

*Main Thread:* Khi chương trình được khởi chạy, sẽ có một Thread ban đầu cùng 1 Process -> Main Thread

*UI Thread*

*Worker Thread*

*Background Thread*

## 3. Reactive Programing
Là phương pháp tập trung vào các Luồng dữ liệu không đồng bộ (các module chạy trên các Thread khác nhau, từ đó rút ngắn thời gian thực hiện mà không làm block Main Thread) và quan sát sự thay đổi của các luồng dữ liệu không đồng bộ đó

## 4. Reactive Extension (RX)
Reactive Extension (ReactiveX hay RX) là một thư viện follow theo những quy tắc của Reactive Programming tức là nó soạn ra các chương trình bất đồng bộ và dựa trên sự kiện bằng cách sử dụng các chuỗi quan sát được.
Các thư viện này cung cấp một list các interface và method giúp các developers viết code một cách đơn giản và sáng sủa hơn.

## 5. RxJava
Khái niệm: Reactive Extension (ReactiveX hay RX) sử dụng ngôn ngữ Java → RxJava

Những thành phần quan trọng trong RxJava:

Về cơ bản RxJava có hai thành phần chính: Observable và Observer

Thêm vào đó, có những thứ khác như Schedulers, Operators và Subscription là các thành phần đóng vai trò như đa luồng, thao tác dữ liệu và kết nối.

- Observable: Là luồng dữ liệu thực hiện một số công việc và phát ra dữ liệu.
- Observer : Là thành phần đi kèm không thể thiếu của Observable. Nó nhận dữ liệu được phát ra bởi Observable.
- Subcription: Là mối liên kết giữa Observable và Observer. Có thể có nhiều Observer đăng ký một Observable duy nhất.
- Operator: Hỗ trợ cho việc sửa đổi dữ liệu được phát ra bởi Observable trước khi Observer nhận chúng.
- Schedulers: Scheduler quyết định thread mà Observable sẽ phát ra dữ liệu và trên thread nào Observer sẽ nhận dữ liệu.
- Disposable : Disposable được sử dụng để hủy sự kết nối của Observer với Observable khi không còn cần thiết việc này rất hữu dụng để tránh việc rò rỉ bộ nhớ.

## 6. RxAndroid

RxAndroid được đặc biệt sử dụng cho nền tảng Android được phát triển dựa trên RxJava. Đặc biệt Schedulers được bổ sung cho RxAndroid nhằm hỗ trợ cho đa luồng trong ứng dụng Android. Schedulers sẽ giúp bạn phân chia luồng chạy cho từng module code sao cho phù hợp.

Một vài luồng chạy phổ biến được sử dụng qua Schedulers.

- Schedulers.io(): Được sử dụng để thực hiện các hoạt động không tốn nhiều CPU như thực \\hiện cuộc gọi mạng, đọc đĩa/tệp, thao tác cơ sở dữ liệu, v.v.
- AndroidSchedulers.mainThread(): Cung cấp quyền truy cập vào Android Main Thread/UI Thread.
- Schedulers.newThread(): Thread mới sẽ được tạo ra mỗi khi một nhiệm vụ được tạo


