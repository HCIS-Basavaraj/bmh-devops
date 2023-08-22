import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DuplicateWordCount {
    public static void main(String[] args) {
        String instr = "I am Basavaraj, I am an Engineer, I got to office";
        String[] strings = instr.split(" ");
        HashMap<String, Integer> hashMap = new HashMap<>();
        int count=0;
        for(String word: strings){
            count++;
            if(hashMap.containsKey(word)){
                hashMap.put(word, hashMap.get(word)+1);
            }
            else{
                hashMap.put(word, 1);
            }
        }


        Iterator iterator = hashMap.entrySet().iterator();
        for(int i=count; i>0; i--) {
            if (iterator.hasNext()) {
                Map.Entry map = (Map.Entry) iterator.next();
                System.out.println("Key is: " + map.getKey() + "\tValue is: " + map.getValue());
            }
        }
        Set<String> keys = hashMap.keySet();
        for(String key: keys){
            if(hashMap.get(key)>1){
                System.out.println(key + " arrived " + hashMap.get(key) + "Times");
            }
        }
    }
}
