public class Main {
    public static void main (String[] args) {//Перебор массива
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(s + " " + isPalindrome(s));
        }

    }
    // с помощью метода reverse делаем реверс строки
    public static String reverseString(String strings) {
        String reverse = ""; //создание локальной переменной которая начинается со строки ""
        for (int i = 0; i < strings.length(); i++) { //добавляем символы из входн. строки в выходн. данные (в обратном порядке)
            reverse = reverse + strings.charAt(strings.length()-i -1);//метод length() возвр. длину строки, charAt(index) возвр. символ по указанному индексу
        } //+ - соединение строк
        return reverse;
    }
    //сравниваем реверс с исходной строкой
    public static boolean isPalindrome(String s) { //метод переворачивает слово S и сравнивает с первонач. cловом
        return (s.equals(reverseString(s)));
    }
}