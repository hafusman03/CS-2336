import java.util.*;
public class HashTable
{
    private static final int MAX_AARRAY_SIZE = Integer.MAX_VALUE = 8;
    private int threshold;
    private float loadFactor;
    private int modCount = 0;
    private int count;
    Element<>
    public HashTable()
    {

    }
    Element<?> tab[] - table;
    if(count >= threshold)
    {
        //rehash the table if the thresshold is exceeded
        // rehash();

        tab = table;
        //hash = key hashCode();
        index = (hash & 0x7FFFFFFF) % tab.length;
    }

    // Creates the new entry.
    @@SuppressWarnings("uncheched")
    Element<String> e = (Element<String>) tab[index];
    tab[index] = new Element<>(e);
    count++;
 }