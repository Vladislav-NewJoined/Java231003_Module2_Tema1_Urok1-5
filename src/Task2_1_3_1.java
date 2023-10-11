import java.util.Arrays;
import java.util.stream.Collectors;

public class Task2_1_3_1 {
    public static void main(String[] args) {
        System.out.println("""
                Задание:\s
                Урок 3. Введение в StreamApi, создание потока данных. Цель задания: Знакомство с методом collect() совершенствование навыков работы с потоками данных в JAVA.\s
                   Задание: Используя Stream вам необходимо объединить данные три строки “I”, “LOVE”, “JAVA” 
                   Dы создаете новый поток из простых строк, а затем собираете их в одну при помощи метода collect()\s

                Решение:\s""");

        String[] array = {"I", "LOVE", "JAVA"};
        System.out.println(Arrays.asList(array)
                .stream()
                .collect(Collectors.joining(" ")));
    }
}
