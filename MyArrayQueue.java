public class MyArrayQueue implements IStackQueue {

    private int[] array;
    private int SIZE;
    private int headIndex;
    private int tailIndex;

    MyArrayQueue(int size) {
        SIZE = size;
        array = new int[SIZE];
        headIndex = tailIndex = -1;
    }

    @Override
    public boolean push(int value) {
        if (!isFull()) { // Kiểm tra nếu chưa đầy thì mới thêm phần tử
            if (isEmpty()) {
                headIndex = 0; // Đặt headIndex là 0 khi hàng đợi còn trống
            }
            tailIndex++;
            array[tailIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        int value = -1;
        if (!isEmpty()) {
            value = array[headIndex];
            headIndex++;
            if (headIndex > tailIndex) {
                headIndex = tailIndex = -1; // Reset lại biến headIndex và tailIndex khi hàng đợi rỗng
            }
        }
        return value;
    }

    @Override
    public boolean isFull() {
        return tailIndex == SIZE - 1;
    }

    @Override
    public boolean isEmpty() {
        return (headIndex == -1) && (tailIndex == -1);
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            for (int i = headIndex; i <= tailIndex; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }

    public int count() {
        if (isEmpty()) {
            return 0;
        }
        return tailIndex - headIndex + 1;
    }
}
