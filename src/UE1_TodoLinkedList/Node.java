package UE1_TodoLinkedList;

public class Node {
    // *** Membervariablen ***

    private String todoText;
    private Node next;

    // *** Konstruktor (optional) ***


    // *** Getter- & Setter ***

    public void setTodoText(String todoText) {

        this.todoText = todoText;
    }

    public String getTodoText() {

        return this.todoText;
    }

    public void setNext(Node next) {

        this.next = next;
    }

    public Node getNext() {

        return this.next;
    }
}
