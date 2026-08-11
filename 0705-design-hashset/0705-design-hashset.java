class MyHashSet {
    final int n=769;
    
    
    public LinkedList<Integer>[] b;
    public MyHashSet() {
         b = new LinkedList[n];
         for (int i = 0; i < n; i++) {
            b[i] = new LinkedList<>();
        }
    }

    public int hashFunction(int key){
        return key%n;
    }
    
    public void add(int key) {
        
       if( !this.contains(key)){
         int address=hashFunction(key);
         b[address].add(key);
       }
        
    }
    
    public void remove(int key) {
        if( this.contains(key)){
            int address=hashFunction(key);
            b[address].remove(Integer.valueOf(key));

        }
        
    }
    
    public boolean contains(int key) {
        int address=hashFunction(key);
        
       return  b[address].contains(key);

    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */