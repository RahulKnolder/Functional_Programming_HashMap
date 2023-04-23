package hashmap_implementation;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapCode {

    public static void main(String[] args) {
        HashMap<String ,Integer> map = new HashMap<>();
        map.put("rahul",9);
    }
    static class HashMap<K, V> {
        private class Node {
            K key;
            V vlaue;

            public Node(K key, V vlaue) {
                this.key = key;
                this.vlaue = vlaue;
            }
        }

            private int n;// number of nodes in the Bucket
            private int N; //number of bucket
            private LinkedList<Node> buckets[]; // type of bucket is linked list type so we create a bucket of linked list type


            public void HashMap() {
                this.N = 4;
                this.buckets = new LinkedList[4];

                //creating linkelist in every index of bucket
                for (int index = 0; index < 4; index++) {
                    this.buckets[index] = new LinkedList<>();
                }
            }


            private int hashFunction(K key) {
                int bi = key.hashCode();
                return Math.abs(bi) % N;
            }


            //reshashing function
            private void rehash() {
                // first of all we have to store the data of my currant buncket inot other bucket
                LinkedList<Node> oldBucket[] = buckets;
                buckets = new LinkedList[N * 2];

                // we will create an empty linked list in every new bucket index of

                for (int i = 0; i < N * 2; i++) {
                    buckets[i] = new LinkedList<>();
                }

                for (int i = 0; i < oldBucket.length; i++) {
                    LinkedList<Node> ll = oldBucket[i];
                    for (int j = 0; j < ll.size(); j++) {
                        Node node = ll.get(j);
                        put(node.key, node.vlaue);
                    }
                }
            }

            private int searchInLL(K key, int bi) {
                LinkedList<Node> ll = buckets[bi];
                int di = 0;
                for (int i = 0; i < ll.size(); i++) {
                    if (ll.get(i).key == key) {
                        return i;  // data inedex
                    }
                }
                return -1;
            }

            public void put(K key, V value) {
                int Bi = hashFunction(key);
                int di = searchInLL(key,Bi);

                if(di==-1){
                    buckets[Bi].add(new Node(key,value));
                }
                else {
                 Node node=   buckets[Bi].get(di);
                 node.vlaue=value;

                }
            }


            public V get (K key){
                int Bi = hashFunction(key);
                int di = searchInLL(key,Bi);

                if(di==-1){
                   return null;
                }
                else {
                    Node node=   buckets[Bi].get(di);
                    return node.vlaue;

                }
            }





    }
}

