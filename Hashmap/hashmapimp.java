
import java.util.LinkedList;
import java.util.Scanner;
import java.util.LinkedList;

class hashmapimp{
    
    static class Mynewhashmap<k,v>{

        public static int Default_Capacity =0;
        
        public static final float  Default_load_factor = 0.75f;     //literal
        
        class Node {
            k key;
            v value;

            Node(k key, v value) {
                this.key = key;
                this.value = value;
            }
        }


        private int n;
        private LinkedList<Node> buckets[];

        
        private void initbuckets(int n) {
            buckets = new LinkedList[n];

            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        public Mynewhashmap(int n) {
            Default_Capacity = n;
            initbuckets(n);
        }

        public int Findhashind(k key) {
            int currbucket = key.hashCode();
            return Math.abs(currbucket) % buckets.length;
        }

        public int size() {
            return n;
        }

        private int SearchinBuckets(LinkedList<Node> LL,k key) {
            
            for (int i = 0; i < LL.size(); i++) {
                if (LL.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }

        public void put(k key,v value) {
            int alloverbucketind = Findhashind(key);    //it finds the alloverbuckets index

            LinkedList<Node> currbucket = buckets[alloverbucketind]; //jo node allover buckets index par h usko lakar curr bucket daal diya phela LL;

            int findind = SearchinBuckets(currbucket,key);      //curr bucket or key lekar traverse ki key present hai ya nhi 

            if (findind != -1) {        //agar findind not equal to -1 to node present hai 
                currbucket.get(findind).value = value;
            }
            else {              //-1 hai to naya node banao or usko add krdo Lnkedlist mein
                Node newnode = new Node(key, value);
                currbucket.add(newnode);
                n++;
            }

            float threeshold=Default_Capacity*Default_load_factor;

            if (n >= threeshold) {
                rehash();
            }

        }

        private void rehash() {

            LinkedList<Node>[] oldbuckets = buckets;

            initbuckets(oldbuckets.length * 2);

            n = 0;
            for (var bucket : oldbuckets) {
                for (var node : bucket) {
                    put(node.key, node.value);
                }
            }
        }

        public int capacity() {
            return buckets.length;
        }

        public float Findloadfactor() {
            
            return (n * 1.0f) % buckets.length;
        }
        
        public v get(k key) {

            int alloverbucketind = Findhashind(key);

            LinkedList<Node> currNode = buckets[alloverbucketind];

            int findind = SearchinBuckets(currNode, key);

            if (findind != -1) {
                return (v) currNode.get(findind).value; //return the value of the this key
            }
            return null;
        }
        
        public v Remove(k key) {
            int alloverbucketind = Findhashind(key);

            LinkedList<Node> currNode = buckets[alloverbucketind];

            int findind = SearchinBuckets(currNode, key);

            if (findind != -1) {
                n--;
                return currNode.remove(findind).value;
            }
            return null;
        }


    }
    
    
    
    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in) ;

    System.out.println("Hello everyone now your in hashmap creation ");
    System.out.print("Give me a intial size of new hashmap :- ");
    int n=sc.nextInt();

    Mynewhashmap Mhm = new Mynewhashmap<>(n);

    Mhm.put("A", 1);
    Mhm.put("B", 2);
    Mhm.put("C", 3);
    
    System.out.println("After inserting element :- " + Mhm.size());
    
    Mhm.put("D", 4);
    
    System.out.println("After :- "+Mhm.capacity());

    System.out.println("Remove key value :- "+Mhm.Findloadfactor());
    
    }
}