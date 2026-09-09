package collectionFrameworks.mapTut.enumMapTut;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* EnumMap only accepts enum keys */
public class EnumMapDemo {
    public static void main(String[] args) {
        EnumMap<Day, String> enumMap = new EnumMap<>(Day.class); /* When we write new EnumMap<>(Day.class), then java needs to know which enum type are the keys? and we are telling key type -> Day */
        enumMap.put(Day.MONDAY, "Java");
        enumMap.put(Day.MONDAY, "GoLang"); /* Like every Map, EnumMap doesn't allow duplicate keys. The second value replaces the first: */
        enumMap.put(Day.FRIDAY, "DBMS");
        enumMap.put(Day.SATURDAY, null); /* Unlike ConcurrentHashMap, EnumMap allows null values. Note: enum map cannot have a null key*/
        enumMap.put(Day.WEDNESDAY, "Spring Boot");
        System.out.println(enumMap); /* Does EnumMap maintain order? Yes.
EnumMap maintains its keys in the natural order of the enum constants. */

//        Every enum constant has an ordinal position.
        /* Unlike ordinary maps EnumMap does not use hashCode() to generate index instead it used known ordinal positions to find the required index.  */
        System.out.println(Day.MONDAY.ordinal());
        System.out.println(Day.TUESDAY.ordinal());
        System.out.println(Day.WEDNESDAY.ordinal());

        Collections.unmodifiableMap(enumMap);
        enumMap.put(Day.SUNDAY, "Kafka");
        Map<String, Integer> map1 = Map.of("Zubair", 99, "Ahmed", 98); /* this will make an immutable map and we wont be able to add more in map1 */
//        map1.put("Akshit", 87); // this will give UnsupportedOperationException

    }
}
