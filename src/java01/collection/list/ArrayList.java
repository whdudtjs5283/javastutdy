package java01.collection.list;

public class ArrayList {

    Object[] arr = null;
    int capacity = 0;
    int size = 0;

    public void add(Object element){
        if(size == capacity){
            expandArray();
        }

        arr[size++] = element;
    }

    public void addFirst(Object element){
        add(0, element);
    }

    public void add(int index, Object element){
        if(size == capacity){
            expandArray();
        }

        for(int i = size; i >= index; i--)
            arr[i] = arr[i-1];

        arr[index] = element;
        size++;
    }

    private void expandArray(){
        capacity *= 2;
        Object[] tempArr = new Object[capacity];
        copyArr(tempArr, arr);
        arr = new Object[capacity];
        copyArr(arr, tempArr);
    }

    private void copyArr(Object[] arr1, Object[] arr2){
        for(int i = 0; i < arr2.length; i++){
            arr1[i] = arr2[i];
        }
    }

    ArrayList(int capacity){
        this.capacity = capacity;
        arr = new Object[capacity];
        size = 0;
    }

    ArrayList(){
        capacity = 1;
        arr = new Object[capacity];
        size = 0;
    }
}
