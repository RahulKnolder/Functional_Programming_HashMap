package HashMapImplementation;

import java.util.ArrayList;

import java.util.LinkedList;

public class HashMapImplement {

    static class HashMap<K, V> {

        private class Node { // 1st process
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;  // number of nodes  2nd
        private int N;  //number of bucket 2nd

        private LinkedList<Node> buckets[]; // array of linked lsit size  3rd process


        //constructore of hash map

        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];   //inititlizing array of linked lsit like we do in any other array
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }



        //hash function
        private int hashFunction(K key) {   //hash function for java
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private int searchInLinkedList(K key, int bucketIndex) {
            LinkedList<Node> list_In_A_bucket = buckets[bucketIndex];

            int dataIndex = 0;
            for (int i = 0; i < list_In_A_bucket.size(); i++) {
                if (list_In_A_bucket.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }


        // rehashing
        private void reHash() {
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N * 2];


            for (int i = 0; i < N * 2; i++) {
                buckets[i] = new LinkedList<>();
            }
            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (int j = 0; j < ll.size(); i++) {
                    Node node = ll.get(i);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {     // making put function
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLinkedList(key, bucketIndex);   // data index is the node in which we find the key
            //if dataIndex is a valid value then key exists other wise not

            if (dataIndex == -1) {
                //key dosent exists
                buckets[bucketIndex].add(new Node(key, value));
                n++;
            } else {
                Node node = buckets[bucketIndex].get(dataIndex);
                node.value = value;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                reHash();
            }
        }

        private V get(K key) {
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLinkedList(key, bucketIndex);   // data index is the node in which we find the key
            //if dataIndex is a valid value then key exists other wise not

            if (dataIndex == -1) {
                return null;
            } else {
                Node node = buckets[bucketIndex].get(dataIndex);
                return node.value;
            }
        }


        private boolean conatinsKey(K key) {
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLinkedList(key, bucketIndex);   // data index is the node in which we find the key
            //if dataIndex is a valid value then key exists other wise not

            if (dataIndex == -1) {
                return false;
            } else {
                return true;
            }
        }

        //remove function
        private V remove(K key) {
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLinkedList(key, bucketIndex);   // data index is the node in which we find the key
            //if dataIndex is a valid value then key exists other wise not

            if (dataIndex == -1) {
                return null;
            } else {
                Node node = buckets[bucketIndex].remove(dataIndex);
                n--;
                return node.value;
            }
        }

        //is empty function
        private boolean isEmpty() {
            return n == 0;
        }

        //keyset functoion
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for (int bucketIndex = 0; bucketIndex < buckets.length; bucketIndex++) {
                LinkedList<Node> ll = buckets[bucketIndex];
                for (int dataindex = 0; dataindex < ll.size(); dataindex++) {
                    Node node = ll.get(dataindex);
                    keys.add(node.key);

                }
            }
            return keys;
        }

    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("rahul", 56);
        map.put("rahu", 895);

        ArrayList<String> keys = map.keySet();
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }


    }
}
