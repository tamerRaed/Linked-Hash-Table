package linkedhashtable;

public class LinkedHashTable<E, T> {

    int limit = 115000;
    int size = 0;
    Object[] entries;

    public LinkedHashTable() {

    }

    public boolean put(E Key, T value) {
        Entry<E, T> entry = new Entry(Key, value);
        int index = Math.abs(Key.hashCode()) % limit;
        for (int i = index; i < entries.length; i++) {
            if (entries[i] == null) {
                entries[i] = entry;
                return true;
            }

        }
        return false;
    }

    public T getValue(E key) {

        int index = Math.abs(key.hashCode()) % limit;
        int i = index;

        if (entries!= null) {
            Entry<E, T> temp = (Entry<E, T>) entries[index];
            while (temp != null) {
                if (key.hashCode() == ((Entry<E, T>) entries[i]).getValue().hashCode()) {
                    return ((Entry<E, T>) entries[i]).getValue();
                }

                temp = temp.after;
            }

        }

        return null;
    }

}
