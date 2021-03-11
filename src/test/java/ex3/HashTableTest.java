package ex3;

import ex1.HashTable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class HashTableTest {
    //TODO munta-hi un joc de proves per als mètodes "put", get" , "drop" , "count" i "size".

    //pasar unos parametros de entrada
    @ParameterizedTest
    @CsvSource({"key1, value1", "key2, value2"})
    void put(String key, String value) {
        HashTable hashTable = new HashTable();
        //hashTable.put("key2","value2");
        hashTable.put(key, value);
        Assertions.assertEquals(value, hashTable.get(key));
    }

    //ALTERNATIVA
    /*
    @org.junit.jupiter.api.Test
    void get() {
        HashTable ht = new HashTable();
        ht.put("key", "value1");
        Assertions.assertEquals("value1", ht.get("key"));
    }
    */
    @ParameterizedTest
    @CsvSource({"12"})
    void get(String key) {
        HashTable hashTable = new HashTable();
        for(int i=0; i<20; i++) {
            String keys = String.valueOf(i);
            hashTable.put(keys, keys);
        }
        Assertions.assertEquals(key, hashTable.get(key));
    }

    //TODO Hacer pruebas con drop..
    /*@Test
    void drop() {
        HashTable hashTable = new HashTable();
        hashTable.put("key", "value");
        hashTable.drop("key");
        assertNull(hashTable.get("key"));
    }
    */

    @ParameterizedTest
    @CsvSource({"20", "10"})
    void drop(String key) {
        HashTable hashTable = new HashTable();
        hashTable.put(key,key);
        hashTable.drop(key);
        Assertions.assertEquals(0, hashTable.count());
        Assertions.assertNull(hashTable.get(key));
    }


    //prueba sencilla
    @Test
    void count() {
        HashTable hashTable = new HashTable();
        hashTable.put("2","3");
        Assertions.assertEquals(1, hashTable.count());
        hashTable.drop("2");
        //comprobación
        Assertions.assertEquals(0, hashTable.count());
    }

    //x2
    @Test
    void size() {
        HashTable hashTable = new HashTable();
        Assertions.assertEquals(16, hashTable.size());
    }
}
