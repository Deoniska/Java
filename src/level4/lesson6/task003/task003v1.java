package level4.lesson6.task003;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task003v1 {



        public static void main(String[] args) throws Exception {

            int a = read();
            int b = read();
            int c = read();


            ArrayBubble array = new ArrayBubble(3); //Создаем массив array

            array.into(a);
            array.into(b);
            array.into(c);

            array.bubbleSorter();
            System.out.println(array);


        }

        public static int read() throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            int ns = Integer.parseInt(s);
            return ns;
    }

    public static class ArrayBubble {

        private long[] a;   //ссылка на массив
        private int elems;  //количество элементов в массиве

        public ArrayBubble(int max) {    //конструктор класса
            a = new long[max];          //создание массива размером max
            elems = 0;                  //при создании массив содержит 0 элементов
        }

        public void into(long value) {   //метод вставки элемента в массив
            a[elems] = value;           //вставка value в массив a
            elems++;                    //размер массива увеличивается
        }

        private void toSwap(int first, int second) { //метод меняет местами пару чисел массива
            long dummy = a[first];      //во временную переменную помещаем первый элемент
            a[first] = a[second];       //на место первого ставим второй элемент
            a[second] = dummy;          //вместо второго элемента пишем первый из временной памяти
        }

        public void bubbleSorter() {     //МЕТОД ПУЗЫРЬКОВОЙ СОРТИРОВКИ
            for (int out = elems - 1; out >= 1; out--) {  //Внешний цикл
                for (int in = 0; in < out; in++) {       //Внутренний цикл
                    if (a[in] > a[in + 1])               //Если порядок элементов нарушен
                        toSwap(in, in + 1);             //вызвать метод, меняющий местами
                }
            }
        }

        @Override
        public String toString() {
            String tmp = "";
            for (long elems : a) {
                tmp += elems + " ";
            }
            return tmp;
        }
    }


}
