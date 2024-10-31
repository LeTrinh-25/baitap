public class MyLinkedListQueue implements IStackQueue {

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node headNode; // Đầu của hàng đợi
    private Node tailNode; // Cuối của hàng đợi

    public MyLinkedListQueue() {
        headNode = tailNode = null;
    }

    @Override
    public boolean push(int value) {
        if (isFull()) {
            return false; // Hàng đợi không bị giới hạn, nhưng bạn có thể thêm logic nếu cần.
        }

        Node newNode = new Node(value);
        if (isEmpty()) {
            headNode = tailNode = newNode; // Nếu hàng đợi rỗng, head và tail đều trỏ đến node mới
        } else {
            tailNode.next = newNode; // Thêm node vào cuối hàng đợi
            tailNode = newNode; // Cập nhật tail trỏ đến node mới
        }
        return true;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            return -1; // Trả về -1 nếu hàng đợi rỗng
        }

        int value = headNode.value; // Lấy giá trị của phần tử đầu tiên
        headNode = headNode.next; // Di chuyển head đến phần tử tiếp theo

        if (headNode == null) { // Nếu hàng đợi trống sau khi xóa phần tử
            tailNode = null; // Đặt tailNode thành null để chỉ rõ rằng hàng đợi rỗng
        }

        return value;
    }

    @Override
    public boolean isFull() {
        return false; // Hàng đợi liên kết không bao giờ đầy vì nó sử dụng linked list
    }

    @Override
    public boolean isEmpty() {
        return headNode == null; // Hàng đợi rỗng nếu headNode là null
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        Node temp = headNode;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
