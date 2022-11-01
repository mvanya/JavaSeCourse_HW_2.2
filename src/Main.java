public class Main {
    public static void main(String[] args) {


        // Ввод массива с клавиатуры
        int[][] array = {{1, 2, 3,},
                         {2, 3, 4,},
                         {3, 4, 5,},
                         {4, 5, 6,}
        };

        // 1. Создал переменную 'sum' для хранения данных и дальнейшего использования
        System.out.println("1. Задание");
        for (int i = 0; i < array.length; i++) {
            int sum1 = 0;
            for( int j = 0; j < array[i].length; j++) {
                sum1 += array[i][j];
            }
            System.out.println("Сумма строки " + sum1);
        }


        // 1. Внутренний цикл делаю приоритетным
        System.out.println("\n2. Задание");
        for (int i = 0; i < array[i].length; i++) {
            int sum2 = 0;
            for (int j = 0; j < array.length; j++) {
             sum2 += array[j][i];
            }
            System.out.println("Сумма столбцов " + sum2);
        }

        System.out.println("\n3. Задание");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("\n\n4. Задание");
        for (int i = 0; i < array.length; i++) {
            int sum1 = 0, mean = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum1 += array[i][j];
                mean = sum1 / array[i].length;
            }
            System.out.println("Среднее значение строки: " + mean);
        }

        System.out.println("\n5. Массив в строчку и обратную сторону: ");
        for (int i = array.length - 1; i >= 0; --i) {
            for (int j = array[i].length - 1; j >= 0; --j) {
                System.out.print(array[i][j] + " ");
            }

        }

    }
}