import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> virtualNodes = new TreeMap<>();
        virtualNodes.put(1,"A");
        virtualNodes.put(2,"B");
        virtualNodes.put(3,"C");
        virtualNodes.put(4,"D");
        virtualNodes.put(5,"E");
        virtualNodes.put(6,"F");
        SortedMap<Integer, String> sortedMap = virtualNodes.tailMap(2);
        Integer integer = sortedMap.firstKey();
        System.out.println(integer);
        for(Map.Entry<Integer,String> entry:sortedMap.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("===========");
        }
    }
}
