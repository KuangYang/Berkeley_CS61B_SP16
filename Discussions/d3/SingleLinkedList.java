public class SingleLinkedList {
    private class SLNode {
        public int item;
        public SLNode next;

        public SLNode(int item, SLNode next) {
            this.item = item;
            this.next = next;
        }
    }

    private SLNode front;

    public void insertFront(int item) {
        this.front = new SLNode(item, this.front);
    }

    public void insert(int item, int position) {
        if (this.front == null || position == 0) {
            this.insertFront(item);
            return;
        }
        int p = 0;
        SLNode node = this.front;
        while(node.next != null) {
            if (p == position - 1) {
                break;
            } else {
                p += 1;
            }
            node = node.next;
        }
        node.next = new SLNode(item, node.next);
    }

    public void reverse() {

    }

    public void traverse() {
        SLNode p = this.front;
        while (p != null) {
            System.out.print(p.item + " ");
            p = p.next;
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        SingleLinkedList SLList = new SingleLinkedList();
        SLList.insert(500, 3);
        SLList.traverse();
        SLList.insert(100, 0);
        SLList.traverse();
        SLList.insertFront(8);
        SLList.insertFront(16);
        SLList.insertFront(64);
        SLList.insertFront(32);
        SLList.traverse();
        SLList.insert(128, 2);
        SLList.traverse();
        SLList.insert(256, 0);
        SLList.traverse();
        SLList.insert(1024, 10);
        SLList.traverse();
        SLList.insert(512, 5);
        SLList.traverse();
    }
}