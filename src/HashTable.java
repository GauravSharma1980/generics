

public class HashTable <K,V>{

    private K key;
    private V value;

    public HashTable(K key,V value){
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "HashTable{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public static void main(String[] args) {

        HashTable<String,Integer> hashTable = new HashTable<>("gaurav",21);

        System.out.println(hashTable);

        HashTable<String,Double> hashTable1 = new HashTable<>("gaurav",25.4);

        System.out.println(hashTable1);

        HashTable<Integer,String> hashTable3 = new HashTable<>(21,"gaurav");

        System.out.println(hashTable3);


    }

}
