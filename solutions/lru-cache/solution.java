
class Node {
    int value;
    int key;
    Node next;
    Node prev ;
    Node(int key , int val){
        this.key = key;
        this.value = val;
        this.next = null;
        this.prev = null;
    }
}
class LRUCache {
HashMap <Integer,Node> map ;
private int cap;
private Node head;
private Node tail;
    public LRUCache(int capacity) {
        map = new HashMap<>();
        cap = capacity;
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node res = map.get(key);
        removeElem(res);
        addFirst(res);
        return res.value;
    }
    
    public void put(int key, int value) {
       if(map.containsKey(key)){
         Node node = map.get(key);
         node.value = value;
         removeElem(node);
         addFirst(node);
         return;
       }
       if(map.size() == cap){
        Node node = tail.prev;
        removeElem(node);
        map.remove(node.key);
       }
       Node node = new Node(key,value);
       map.put(key,node);
       addFirst(node);
       


      

    }
    public void addFirst(Node temp){
        head.next.prev = temp;
        temp.next =head.next;
        head.next = temp ;
        temp.prev = head;
        
        
    }
    public void removeElem(Node temp){
        temp.prev.next = temp.next;
        temp.next.prev =temp.prev;
    }

    public int getCap(){
        return cap;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */