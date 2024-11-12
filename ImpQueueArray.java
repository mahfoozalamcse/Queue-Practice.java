public class ImpQueueArray {
       static class Queue{
        int front, rear, size;
        int cap;
        int arr[];

        Queue(int c){
            this.cap = c;
            front = this.size = 0;
            rear = cap-1;
            arr = new int[this.cap];
        }

        boolean isFull(){
            return (size == cap);
        }

        boolean isEmpty(){
            return (size == 0);
        }

        void enqueue(int x){
           if(isFull()) return;
           arr[size] = x;
           size++;
        }

        void deque(){
          if(isEmpty()) return;
          for(int i=0; i<size-1; i++){
              arr[i] = arr[i+1];
              size--;
          }
        }

        int getFront(){
           if(isEmpty()){
            return -1;
           }else{
            return 0;
           }
        }

        int getRear(){
            if(isEmpty()){
                return -1;
            }else{
                return size-1;
            }

        }
      }
    public static void main(String[] args) {
        Queue s = new Queue(4);
        s.enqueue(4);
        s.enqueue(5);
        System.out.println(s.getFront());
        System.out.println(s.getRear());
        System.out.println(s.size);
         s.deque();
         s.enqueue(34);

         
    }
}