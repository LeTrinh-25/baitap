public class MyMain {
    

        public static void main(String[] args) {
    
            MyLinkedListQueue queue = new MyLinkedListQueue();
    
            queue.push(1); // Thêm giá trị 1 vào queue
            queue.push(2); // Thêm giá trị 2 vào queue
            queue.push(3); // Thêm giá trị 3 vào queue
    
            queue.show(); // Hiển thị các phần tử trong queue
    
            System.out.println(queue.pop()); // Lấy và in ra phần tử đầu tiên
            queue.show();
    
            System.out.println(queue.pop()); // Lấy và in ra phần tử tiếp theo
            queue.show();
    
            System.out.println(queue.pop()); // Lấy và in ra phần tử cuối cùng
            queue.show();
    
            System.out.println(queue.pop()); // Thử lấy phần tử từ queue rỗng
            queue.show();
        }
    
    
}
