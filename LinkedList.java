public class LinkedList {
    Node head;
    int index =1;
    public void addToTail(int data){
        Node node = new Node(data);
        if(head == null) head = node;
        else {
            Node currentHead = head;
                while (currentHead.next != null){
                    currentHead = currentHead.next;
                }
            currentHead.next = node;
            index++;
        }
        node.index = index;
    }
    public void addToHead(int data) {
        Node node = new Node(data);

        index = 1;
        node.index = index;
        Node temp = head;
        head = node;

        head.next = temp;
        temp = head;
        updateIndexIncrement(temp);
    }
    private void updateIndexIncrement(Node node) {
        while (node.next != null) {
            index++;
            node.next.index = index;
            node = node.next;
        }
    }
    public void addAtIndex(int index , int data){
        Node node = new Node(data);

        if (this.index >= index){
            if (index == 1){
                this.index = 1;
                node.next = head;
                head = node;
                head.index = index;
                updateIndexIncrement(head);
            }else {
                Node currentHead = head ;

                while (currentHead.index != index-1){
                    currentHead = currentHead.next;
                }

                this.index = currentHead.index;
                node.next = currentHead.next;
                currentHead.next = node;
                updateIndexIncrement(currentHead);

            }
        }else System.out.println("Provided index is unable to add.");
    }
    public void show(){
        if (head == null) System.out.println("[Empty list]");
        else {
            Node currentHead = head;
            while (currentHead != null) {
                System.out.print("[" + currentHead.data + " at index: " + currentHead.index + " ]->");
                currentHead = currentHead.next;
            }
            System.out.print("null\n");
        }
    }
    public void updateIndexDecrement(Node node){
        while (node.next != null) {
            index--;
            node.next.index = index;
            node = node.next;
        }
    }
    public void deleteByIndex(int index) {
        Node currentHead = head;
        if (head.index == index){
            head= head.next;
            while (currentHead.next != null) {
                currentHead.next.index--;
                currentHead = currentHead.next;
            }
        }
        else {
            while (currentHead.next.index != index){
                currentHead = currentHead.next;
            }
            currentHead.next = currentHead.next.next;
            while (currentHead.next != null) {
                currentHead.next.index--;
                currentHead = currentHead.next;
            }
        }
    }
    public void deleteByKey(int key) {
        Node currentHead = head;
        if (head.data == key){
            head= head.next;
            while (currentHead.next != null) {
                currentHead.next.index--;
                currentHead = currentHead.next;
            }
        }
        else {
            while (currentHead.next.data != key){
                currentHead = currentHead.next;
            }
            currentHead.next = currentHead.next.next;
            while (currentHead.next != null) {
                currentHead.next.index--;
                currentHead = currentHead.next;
            }
        }
    }
}