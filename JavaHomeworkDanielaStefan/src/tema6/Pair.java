/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;
   //2.What is the following class converted to after "type erasure"?
public class Pair<K, V> { //there is no bound specified so the compiler will and replace them with each type parameter with type Objecs
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }    
    public K getKey() { return key; }
    public V getValue() { return value; }
    public void setKey(K key)     { this.key = key; }
    public void setValue(V value) { this.value = value; }
    private K key;
    private V value;
}
    

    

