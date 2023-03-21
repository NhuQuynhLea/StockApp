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





