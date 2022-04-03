package company.coinswitch;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class LRUCache extends Cache implements LRUInter {

    private final static Map<String,String> lruCache=new HashMap<>();
    private final int count=3;
    private final static Queue<String> q=new ConcurrentLinkedQueue<>();

//    private final static Map<String,Node> lruCache=new HashMap<>();

    //ll1->ll2->ll3->ll4
    //ll3->ll1->ll2->ll4


    @Override
    public String get(String key) {
        return lruCache.get(key);
    }

    @Override
    public boolean add(String key, String value) {

        if (q.size()>count){
           String keyTemp = q.poll();
            System.out.println("keyTemp remove : " +keyTemp );

           lruCache.remove(keyTemp);
        }

        String result = lruCache.put(key, value);
        q.add(key);
        System.out.println("Size : "+q.size() + " key "+key);

        return result != null;
    }

    @Override
    public String lastUsed() {

        return null;
    }
}
