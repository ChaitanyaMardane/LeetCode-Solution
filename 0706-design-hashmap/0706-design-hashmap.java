class Pair {
    public int key;
    public int value;

    public Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class MyHashMap {

    final static int n = 769;
    LinkedList<Pair>[] map;

    public MyHashMap() {
        map = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            map[i] = new LinkedList<>();
        }

    }

    public static int hash(int key) {
        System.out.println(key % n);
        return key % n;
    }

    public void put(int key, int value) {
        int add = hash(key);
        boolean foundkey = false;
        for (Pair p : map[add]) {
            if (p.key == key) {
                p.value = value;
                foundkey = true;
            }
        }
        if (foundkey)
            return;
        else {
            map[add].add(new Pair(key, value));
            System.out.println("List " + map[add]);

        }

    }

    public int get(int key) {
        int add = hash(key);
        System.out.println(map[add]);

        for (Pair p : map[add]) {
            if (p.key == key) {
                return p.value;
            }
        }
        return -1;
    }

    public void remove(int key) {
        int add = hash(key);
        for (Pair p : map[add]) {
            if (p.key == key) {
                map[add].remove(p);
                return;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */