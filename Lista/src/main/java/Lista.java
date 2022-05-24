

public class Lista {
    private Node head;
    private int size;
    private Node ptr;

    public Lista(){
        size = 0;
        head = null;
        reset();

    }

    public void prepend(Object o){
        if(o instanceof Integer) {
            head = new Node((Integer)o, head);
            size++;
        }
    }

    public Integer next() {
        if(ptr != null) {
            Integer result = ptr.data;
            ptr = ptr.next;
            return result;
        }else return null;
    }

    int getSize() {
        return size;
    }

    public void reset() {
        ptr = head;
    }

}
