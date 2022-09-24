package by.it.group151001.beryozkin.lesson02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
даны события events
реализуйте метод calcStartTimes, так, чтобы число включений регистратора на
заданный период времени (1) было минимальным, а все события events
были зарегистрированы.
Алгоритм жадный. Для реализации обдумайте надежный шаг.
*/

public class A_VideoRegistrator {

    public static void main(String[] args) {
        A_VideoRegistrator instance=new A_VideoRegistrator();
        double[] events=new double[]{2.3, 7.9, 3.2, 6.9, 4.8, 11.7, 15.9, 13.3, 11.1, 1.9, 7.4, 10.3, 3, 14.5};
        List<Double> starts=instance.calcStartTimes(events,2); //рассчитаем моменты старта, с длинной сеанса 1
        System.out.println(starts);                            //покажем моменты старта
    }
    //модификаторы доступа опущены для возможности тестирования
    public List<Double> calcStartTimes(double[] events, double workDuration){
        //events - события которые нужно зарегистрировать
        //timeWorkDuration время работы видеокамеры после старта
        List<Double> result;
        result = new ArrayList<>();
        Arrays.sort(events);
        int i=0;   //i - это индекс события events
        int j;
        while (i<events.length){
            result.add(events[i]);
            j=i;
            i++;
            while (i<events.length && events[i] <= workDuration + events[j]){
                i++;
            }

        }
        //комментарии от проверочного решения сохранены для подсказки, но вы можете их удалить.
        //подготовка к жадному поглощению массива событий
        //hint: сортировка Arrays.sort обеспечит скорость алгоритма
        //C*(n log n) + C1*n = O(n log n)

        //пока есть незарегистрированные события
        //получим одно событие по левому краю
        //и запомним время старта видеокамеры
        //вычислим момент окончания работы видеокамеры
        //и теперь пропустим все покрываемые события
        //за время до конца работы, увеличивая индекс

        return result;                        //вернем итог
    }
}