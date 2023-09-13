package ru.core.l2.collections.hashmap;

import ru.core.l2.collections.arrayl.Car;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarMap {
    private static class Entry implements CarHashMap {

        private static final int INITIAL_CAPACITY = 16;
        private static final float LOAD_FACTOR = 0.75f;
        private Entry[] array = new Entry[INITIAL_CAPACITY];
        private int size = 0;

        private CarOwner key;
        private Car value;
        private Entry next;


        @Override
        public void put(CarOwner key, Car value) {
            if (size >= array.length * LOAD_FACTOR) {
                increaseArray();
            }
            boolean put = put(key, value, array);
            if (put) {
                size++;
            }
        }

        public boolean put(CarOwner key, Car value, Entry[] distinctArray) {
            int position = getElementsPosition(key, distinctArray.length);
            Entry existedElement = distinctArray[position];
            if (existedElement == null) {
                Entry entry = new Entry(key, value, null);
                distinctArray[position] = entry;
                size++;
                return true;
            } else {
                while (true) {
                    if (existedElement.key.equals(key)) {
                        existedElement.value = value;
                        return false;
                    }
                    if (existedElement.next == null) {
                        existedElement.next = new Entry(key, value, null);
                        size++;
                        return true;
                    }
                    existedElement = existedElement.next;
                }
            }
        }

        @Override
        public Car get(CarOwner key) {
            int position = getElementsPosition(key, array.length);
            Entry existedElement = array[position];
            while (existedElement != null) {
                if (existedElement.key.equals(key)) {
                    return existedElement.value;
                }
                existedElement = existedElement.next;
            }
            return null;
        }

        @Override
        public Set<CarOwner> keySet() {
            Set<CarOwner> result = new HashSet<>();
            for (Entry entry : array) {
                Entry exitedElement = entry;
                while (exitedElement != null) {
                    result.add(entry.key);
                    exitedElement = exitedElement.next;
                }
            }
            return result;
        }

        @Override
        public List<Car> values() {
            List<Car> result = new ArrayList<>();
            for (Entry entry : array) {
                Entry exitedElement = entry;
                while (exitedElement != null) {
                    result.add(entry.value);
                    exitedElement = exitedElement.next;
                }
            }
            return result;
        }

        @Override
        public boolean remove(CarOwner key) {
            int position = getElementsPosition(key, array.length);
            Entry existedElement = array[position];
            if (existedElement != null && existedElement.key.equals(key)) {
                array[position] = existedElement.next;
                size--;
                return true;
            } else {
                while (existedElement != null) {
                    Entry nextEntry = existedElement.next;
                    if (nextEntry == null) {
                        return false;
                    }
                    if (nextEntry.key.equals(key)) {
                        existedElement.next = nextEntry.next;
                        size--;
                        return false;
                    }
                    existedElement = existedElement.next;
                }
            }
            return false;
        }

        @Override
        public int size() {
            return size;
        }

        @Override
        public void clear() {
            array = new Entry[INITIAL_CAPACITY];
            size = 0;
        }

        private int getElementsPosition(CarOwner carOwner, int arrayLength) {
            return Math.abs(carOwner.hashCode() % arrayLength);
        }

        private void increaseArray() {
            Entry[] newArray = new Entry[this.array.length * 2];
            for (Entry entry : this.array) {
                Entry exitedElement = entry;
                while (exitedElement != null) {
                    put(exitedElement.key, exitedElement.value, newArray);
                }
            }
            array = newArray;
        }

        public Entry(CarOwner key, Car value, Entry next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}
