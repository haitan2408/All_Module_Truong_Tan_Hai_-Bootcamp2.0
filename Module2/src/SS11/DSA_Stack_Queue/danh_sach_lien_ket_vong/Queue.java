package SS11.DSA_Stack_Queue.danh_sach_lien_ket_vong;

public class Queue {
    private Node front;
    private Node rear;


    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getRear() {
        return rear;
    }

    public void setRear(Node rear) {
        this.rear = rear;
    }

    public Queue(Node front, Node rear) {
        this.front = front;
        this.rear = rear;
    }

    public Queue() {
    }
}
