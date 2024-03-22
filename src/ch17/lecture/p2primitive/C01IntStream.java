package ch17.lecture.p2primitive;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C01IntStream {
    public static void main(String[] args) {
        // 기본타입 원소를 처리하는 Stream
        // IntStream, LongStream, DoubleStream

        // IntStream
        int[] arr = {9, 3, 10, 5, 1, 2, 3, 5, 0};
        IntStream stream1 = Arrays.stream(arr);
        IntStream stream2 = IntStream.of(arr);

        List<Integer> list = List.of(5, 3, 1, 2, 0, 10, 6); // 참조타입 Integer
        IntStream intStream = list.stream()  // 참조타입을 원소로 하는 Stream<Integer>
                .mapToInt(Integer::intValue); // 기본타입을 원소로 하는 IntStream

        // 최종연산
        // sum
        int sum = Arrays.stream(arr)
                .sum();
        System.out.println("sum = " + sum);

        // min
        OptionalInt min = Arrays.stream(arr)
                .min();
        System.out.println("min = " + min);

        // max
        OptionalInt max = Arrays.stream(arr)
                .max();
        System.out.println("max = " + max);

        // average
        OptionalDouble average = Arrays.stream(arr)
                .average();
        System.out.println("average = " + average);

        // toArray
        int[] array = Arrays.stream(arr)
                .toArray();
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));


        // 중간연산
        // boxed
        // 참조타입 메소드를 가지고 오면 boxed에서 실행된다(?)
        Stream<Integer> boxed = Arrays.stream(arr)
                .boxed();
        long count = boxed.count();
        System.out.println("count = " + count);


    }
}
