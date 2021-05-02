package UE2_WagonLinkedList;

public class WagonLinkedList {
    // *** Membervariables ***
   private Node first;
    private Node last;
    // *** Methoden ***

    public Node getFirst() {
        //
        return this.first;
    }



    public Node getLast() {

        return last;
    }


    void insertWagonAtFirstPos(String wagonId) {
       Node newNode = new Node();
       newNode.setWagonId(wagonId);
       if(first == null) {
           first = newNode;
           first.setPrev(null);
           last = first;
       }
       else
        newNode.setNext(first);
        first.setPrev(newNode);
       newNode.setPrev(null);
       first = newNode;
    }

    void removeWagonFromLastPos() {

        if (first == null) {
            return;
        }

        // Liste besteht aus einem knoten
        else if (first == last) {
            first = null;
            last = null;

        } else {
            Node currentNode = last.getPrev();
            currentNode.setNext(null);
            last = currentNode;

        }


    }

    void printList() {
        System.out.print("* List: ");

        if (this.getFirst() == null) {
            System.out.print("<empty>");
        } else {
            Node currentNode = this.getFirst();
            while (currentNode != null) {
                System.out.print(currentNode.getWagonId() + ", ");
                currentNode = currentNode.getNext();
            }
        }

        System.out.println();
    }
}
