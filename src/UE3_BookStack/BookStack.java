package UE3_BookStack;

public class BookStack
{
    // *** Membervariablen ***


private Node top;

    // *** Getter- und Setter-Methoden ***

    public Node getTop()
    {
        // TODO: Implementierung
        return this.top;
    }


    // *** Operationen ***

    public void push(String bookTitle)
    {
        // TODO: Implementierung
Node newNode = new Node(bookTitle);

newNode.setNext(top);
top = newNode;

    }

    public String pop()  throws StackEmptyException
    {
        // TODO: Implementierung
        if(top == null) {
            throw new StackEmptyException();

        } else
        {
            String tempString = top.getBookTitle();
            top = top.getNext();
            return tempString;
        }

    }

    public int getCount() {
        int count = 0;
        Node currentNode = top;
while (currentNode != null) {
    currentNode = currentNode.getNext();
            count++;
        }

        return count;
    }
}
