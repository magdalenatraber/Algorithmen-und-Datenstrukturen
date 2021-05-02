package UE1_TodoLinkedList;

public class TodoLinkedList {
    // *** Membervariablen ***

    private Node first;
    private Node last;

    // *** Get-Methoden (Set-Methoden nicht notwendig) ***

    public Node getFirst() {

        return first;
    }

    public Node getLast() {

        return last;
    }

    // *** Operationen ***

    public void appendTodoText(String todoText) {

        Node newNode = new Node();
        newNode.setTodoText(todoText);

        if (first == null) {
            first = newNode;
            newNode.setNext(null);
            last = first;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
    }

    public void deleteLastTodoText() {
        //

        if (first == null) {
            return; //nichts machen
        }

        // Liste beswht US EINEM kNOTEN
        else if (first == last) {
            first = null;
            last = null;

        } else {
            Node currentNode = first;

            while (currentNode.getNext() != last) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(null);
            last = currentNode;

        }
    }

    public String getTodoTextAtIndex(int index) {
        Node currentNode = first;
        int counter = 0;

        while (counter < index) {
            if (currentNode.getNext() == null)
                return null;
            else
                currentNode = currentNode.getNext();
            counter++;
        }
        return currentNode.getTodoText();
    }
}
