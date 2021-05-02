package UE2_WagonLinkedList;

public class Node {
    // *** Membervariablen ***

   private String wagonId;
    private Node next;
    private Node prev;

    // *** Getter- & Setter-Methoden ***
    public String getWagonId() {

        return this.wagonId;
    }

    public void setWagonId(String wagonId) {

        this.wagonId = wagonId;
    }

    public Node getNext() {

        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;

    }

    public Node getPrev() {

        return this.prev;
    }

    public void setPrev(Node prev) {
     this.prev = prev;

    }
}
