package ex3;

import ex2.HashTable;

public class Main {
    public static void main(String[] args) {
        ex2.HashTable hashTable = new ex2.HashTable();

        // Put some key values.
        for (int i = 0; i < 30; i++) {
            final String key = String.valueOf(i);
            hashTable.put(key, key);
        }

        // Print the HashTable structure
        ex2.HashTable.log("****   HashTable  ***");
        ex2.HashTable.log(hashTable.toString());
        HashTable.log("\nValue for key(20) : " + hashTable.get("20"));
    }
}