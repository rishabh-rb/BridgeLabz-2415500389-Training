package Queue.circular;
//circular queue using singly linked list

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public class circular{

            Node front;
            Node rear;

            void enqueue(int data){
                Node newNode = new Node(data);
                if(front == null){
                    front = newNode;
                    rear = newNode;
                    rear.next = front; 
                    return;
                }
                rear.next = newNode; 
                rear = newNode; 
                rear.next = front; 
            }
            void dequeue(int data){

                if(front == null){
                    System.out.println("Queue is Empty.");
                }

                if(front==rear){
                    front = null;
                    rear = null;
                    return;
                }

                front = front.next;
                rear.next = front; 

            }
            void display(){
                if(front == null){
                    System.out.println("Queue is Empty.");
                    return;
                }
                Node temp = front;
                while(temp.next != front){
                    System.out.println(temp.data + " ");
                    temp = temp.next;
                }
                System.out.println(temp.data + " ");
            }

        public static void main(String[] args) {

                circular queue = new circular();
                
                queue.enqueue(10);
                queue.enqueue(20);
                queue.enqueue(30);
                queue.enqueue(40);

                queue.dequeue(0);
                queue.dequeue(0);
                queue.display();
            

            }

        }
    
    
