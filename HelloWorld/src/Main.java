public class Main {
    public static void main (String[] args) {//Перебор массива
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.print(s + " ");
            System.out.println(isPalindrome(s));
        }
    }
    // с помощью метода reverse делаем реверс строки
    public static String reverseString(String strings) {
        String rev = ""; //создание локальной переменной которая начинается со строки ""
        for (int i = 0; i < strings.length(); i++) { //добавляем символы из входн. строки в выходн. данные (в обратном порядке)
            rev += strings.charAt(strings.length()-i -1);//метод length() возвр. длину строки, charAt(index) возвр. символ по указанному индексу
        } //+ - соединение строк
        return rev;
    }
    //сравниваем реверс с исходной строкой
    public static boolean isPalindrome(String s) { //метод переворачивает слово S и сравнивает с первонач. данными
        return (s.equals(reverseString(s)));
    }
}
