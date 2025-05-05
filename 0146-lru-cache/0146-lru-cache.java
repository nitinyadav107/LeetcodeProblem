class LRUCache {
    int size;
    ArrayList<Pair<Integer,Integer>> arr=new ArrayList<>();
    public LRUCache(int capacity) {            
      size=capacity;  
    }
    
    public int get(int key) {
        for(int i=0;i<arr.size();i++){
            Pair <Integer,Integer> pair=arr.get(i);
            int k=pair.getKey();
            if (k == key) {
                arr.remove(i);
                arr.add(pair);
                return pair.getValue();
            }
        }
        return -1;
    }
    
    public void put(int key, int value) {
        for(int i=0;i<arr.size();i++){
            Pair<Integer,Integer> pair=arr.get(i);
            if(pair.getKey()==key){
                arr.remove(i);
               Pair<Integer,Integer> p = new Pair<>(key, value);
                arr.add(p);
                return;
            }
        }
        if(arr.size()<size){
            Pair<Integer,Integer> p = new Pair<>(key, value);
            arr.add(p);
        }
        else{
            arr.remove(0);
           Pair<Integer,Integer> p = new Pair<>(key, value);
            arr.add(p);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */