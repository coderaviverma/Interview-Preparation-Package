package company.coinswitch;

public class Main {

    //Keyvalue store
    //
    //LRU, LFU, FIFO
    //SOLID
    public static void main(String[] args) {

        Cache cache=new LRUCache();
        cache.add("avi","sde1");
        cache.add("avi1","sde2");
        cache.add("avi2","sde3");
        cache.add("avi3","sde4");
        cache.add("avi4","sde5");
        cache.add("avi5","sde5");

        System.out.println(cache.get("avi"));


    }

}
