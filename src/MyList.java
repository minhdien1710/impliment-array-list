import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    private static final int CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[CAPACITY];
    }

    public MyList(int size) {
        this.size = size;
    }

    public void add(int index,E e) {
        if(size == elements.length){
            ensureCapacity();
        }
        elements[size] = e;
        size++;
    }

    public E remove(int index) {
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return (E) elements[index];

    }

    public int size() {
        int size = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null) {
                size++;
            }
        }
        return size;
    }

    public E clone() {
        Object elements1[] = new Object[size];
        for (int i = 0; i < size; i++) {
            elements1[i] = elements[i];
        }
        return (E) elements1;
    }

    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                return true;
            }
        }
        return false;
    }

    public boolean add(E element) {
        elements[size] = element;
        return true;
    }

    public void ensureCapacity() {
        int newCapacity = CAPACITY * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
    public E get(int i){
        if(i>=size||i<0){
            throw new IndexOutOfBoundsException("index "+ i + ", Size"+ i);
        }
        return (E) elements[i];
    }
    public void clear(){
        for (int i=0; i<size;i++){
            elements[i] = null;
        }
    }
}

