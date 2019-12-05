package leet;

public class LeetLRU {
    Storage arr[];
    int accessNum;

    public LeetLRU(int capacity) {
        this.arr = new Storage[capacity];
        this.accessNum = 0;
    }

    public int get(int key) {
        for(Storage stored : this.arr){
            if(stored == null){
                return -1;
            }
            if(stored.key == key){
                stored.accessOrder = this.accessNum;
                this.accessNum++;
                return stored.value;
            }
        }
        return -1;
    }

    public void put(int key, int value) {
        int index = findIndex(key);
        this.arr[index] = new Storage(key, value, this.accessNum);
        this.accessNum++;
    }

    public int findIndex(int key){
        int index = -1;
        int minAccesNumber = this.accessNum;
        for(int i = 0; i < arr.length; i++){
            //checking for empty cells
            if(arr[i] == null || arr[i].key == key){
                return i;
            }
            //checking for the last used cell
            if(arr[i].accessOrder < minAccesNumber){
                minAccesNumber = arr[i].accessOrder;
                index = i;
            }
        }
        return index;
    }

}

class Storage {
    public int key;
    public int value;
    public int accessOrder;

    Storage(int key, int value, int accessOrder){
        this.key = key;
        this.value = value;
        this.accessOrder = accessOrder;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */