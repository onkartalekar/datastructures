package practice_problems.cache;

/**
 * Created by taleko01 on 2/1/2019
 */

public class Main {

    public static void main(String... args) {
        LRUCache cache = new LRUCache(2 /* capacity */);
//["LRUCache", "get", "put", "get", "put", "put", "get", "get"]
//[[2],[2],[2, 6],[1],[1, 5],[1, 2],[1],[2]]

        //[null,-1,null,-1,null,null,2,6]
        cache.get(2);
        cache.put(2, 6);
        cache.get(1);
        cache.put(1, 5);
        cache.put(1, 2);
        cache.get(1);
        cache.get(2);
    }
}
