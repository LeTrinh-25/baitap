import java.util.ArrayList;

public class MyLinkedListStack implements IStackQueue {

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    // Đỉnh của ngăn xếp
    Node topNode;

    // Constructor để khởi tạo ngăn xếp
    MyLinkedListStack() {
        topNode = null;
    }

    @Override
    public boolean push(int value) {
        if (!isFull()) {
            // Thêm phần tử vào đầu của linked list
            Node newNode = new Node(value);
            newNode.next = topNode;
            topNode = newNode;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            return -1; // Trả về -1 nếu ngăn xếp rỗng
        }

        int value = topNode.value;
        topNode = topNode.next;
        return value;
    }

    @Override
    public boolean isFull() {
        return false; // Linked list không bị giới hạn bộ nhớ, nên ngăn xếp không bao giờ đầy
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }

        Node temp = topNode;
        ArrayList<Integer> tempList = new ArrayList<>();

        while (temp != null) {
            tempList.add(temp.value);
            temp = temp.next;
        }

        for (int i = tempList.size() - 1; i >= 0; i--) {
            System.out.print(tempList.get(i) + " ");
        }
        System.out.println();
    }
}
