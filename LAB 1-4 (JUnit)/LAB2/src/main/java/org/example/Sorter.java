package org.example;

import java.util.Comparator;
class Sorter implements Comparator {
    public int compare(Object a, Object b) {
        if ((int)a < (int)b)
            return 1;
        if ((int)a == (int)b)
            return 0;
        else
            return -1;
    }
}
