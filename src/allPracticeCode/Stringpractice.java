package allPracticeCode;

public class Stringpractice {
    public static void main(String[] args) {
        String text = "Tareq";
        System.out.println("Name: " + text);
        char c = text.charAt(2);
        System.out.println(c);
        String str1 = "Hello";
        String str2 = "world";
        str1.concat(str2);
        System.out.println(str1);
        String txt="programming";
        System.out.println(txt.substring(3, 7));
        String texxt = "Java Programming";
        System.out.println(texxt.toUpperCase()); // আউটপুট: JAVA PROGRAMMING
        System.out.println(texxt.toLowerCase()); // আউটপুট: java programming
        String teext = "   Tareq Aziz   ";
        System.out.println(teext.trim()); // আউটপুট: Tareq Aziz (স্পেস ছাড়া)
        String teexxt = "I love Java";
        System.out.println(text.contains("Java")); // আউটপুট: true
        String ttext = "Java";
        System.out.println(ttext.replace('a', 'o')); // আউটপুট: Jovo
    }
}