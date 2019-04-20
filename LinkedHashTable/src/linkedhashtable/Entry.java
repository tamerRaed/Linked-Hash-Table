/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedhashtable;


public class Entry<E,T> {
    E key;
    T value;
    Entry<E,T> after;

    public Entry(E key, T value) {
        this.key = key;
        this.value = value;
    }

    public E getKey() {
        return key;
    }

    public void setKey(E key) {
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Entry<E, T> getAfter() {
        return after;
    }

    public void setAfter(Entry<E, T> after) {
        this.after = after;
    }
    
}
