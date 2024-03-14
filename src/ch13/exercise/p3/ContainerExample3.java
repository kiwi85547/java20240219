package ch13.exercise.p3;

public class ContainerExample3 {
    public static void main(String[] args) {
        Container<String, String> container1 = new Container<String, String>();
        container1.set("홍길동", "도적");
        String name1 = container1.getKey();
        String job = container1.getValue();
        System.out.println("name1 = " + name1);
        System.out.println("job = " + job);

        Container<String, Integer> container2 = new Container<String, Integer>();
        container2.set("홍길동", 35);
        String name2 = container2.getKey();
        int age = container2.getValue();
        System.out.println("name2 = " + name2);
        System.out.println("age = " + age);
    }
}

class Container<K, V> {
    private K key;
    private V value;


    public K getKey() {
        return key;
    }

    public void set(K key, V value) { //밑에꺼 안써도 됨
//        this.key = key;
//        this.value = value;
    }

    public V getValue() {
        return value;
    }

}