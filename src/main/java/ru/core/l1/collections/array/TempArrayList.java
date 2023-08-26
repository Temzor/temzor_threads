package ru.core.l1.collections.array;

public class TempArrayList {
    private String[] arrayStrings = new String[10];
    private int size = 0;

    public void add(String value) {
        arrayStrings[size] = value;
        size++;
        if (size == arrayStrings.length) {
            String[] newArrayStrings = new String[arrayStrings.length * 2];
            System.arraycopy(arrayStrings, 0, newArrayStrings, 0, arrayStrings.length);
            arrayStrings = newArrayStrings;
        }
    }

    public boolean remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                arrayStrings[i] = arrayStrings[i + 1];
            }
            size--;
            return true;
        }
        return false;
    }

    public boolean remove(String value) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (value.equals(arrayStrings[i])) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            remove(index);
            return true;
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    public String get(int index) {
        if(index >=0 && index<size){
            return arrayStrings[index];
        }
        return "Element not found";
    }
}
