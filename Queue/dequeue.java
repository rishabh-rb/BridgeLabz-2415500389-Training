package Queue.dequeue;

class Node{
    int data;
    Node next;
    Node prev;
    
    Node(int data ){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    
}

class Dequeue{
    Node front;
    Node rear;

        void insertAtFront(int data){
            Node newNode = new Node(data);
            if(front == null){
                front = newNode;
                rear = newNode;
                return;
            }
    
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
    
        void insertAtRear(int data){
            Node newnode = new Node(data);
            if(rear ==null){
                front = newnode;
                rear = newnode;
                return;
            }
            
            newnode.prev = rear;
            rear.next = newnode;
            rear = newnode;
        }

        void deleteAtFront(){
            if(front == null){
                System.out.println("queue is empty");
                return;
            }
            if(front == rear){
                front = null;
                rear = null;
                return;
            }
            front = front.next;
            front.prev = null;
        }

        void deleteAtRear(){
            if(rear == null){
                System.out.println("queue is empty");
                return;
            }
            if(front == rear){
                front = null;
                rear = null;
                return;
            }
            rear = rear.prev;
            rear.next = null;
        }

        void display(){
            Node temp = front;
            while(temp != null){
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }

        public static void main(String[] args) {
            
            Dequeue q =new Dequeue();
            q.insertAtRear(20);
            q.insertAtRear(10);
            q.insertAtFront(1);
            q.insertAtFront(5);
            q.deleteAtRear();
            q.display();
        }

    }
    

