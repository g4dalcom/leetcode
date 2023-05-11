class MyLinkedList {
    
    int size;
    Node head;
    
    class Node {
        int value;
        Node next;
        
        public Node(int val) {
            this.value = val;
        }
    }

    public MyLinkedList() {
        size = 0;
        head = null;
    }
    
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        
        int cnt = 0;
        Node cur = head;
        while (cnt < index) {
            cur = cur.next;
            cnt++;
        }
        
        return cur.value;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        
        if (head == null) addAtHead(val);
        
        else {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }

            cur.next = newNode;
            size++;
        }

    }
    
    public void addAtIndex(int index, int val) {
        if (index > size) return;
        
        if (index == size) addAtTail(val);
        else if (index == 0) addAtHead(val);
        else {
            Node cur = head;
            int cnt = 0;
            while (cnt < index-1) {
                cur = cur.next;
                cnt++;
            }
            
            Node newNode = new Node(val);
            newNode.next = cur.next;
            cur.next = newNode;
            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if (index >= size) return;
        if (index == 0) head = head.next;
        else {
            Node cur = head;
            int cnt = 0;
            while (cnt < index-1) {
                cur = cur.next;
                cnt++;
            }

            cur.next = cur.next.next;
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */