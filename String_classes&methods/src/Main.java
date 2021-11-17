import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //charAt
        String str = "patika";
        System.out.println(str.charAt(1));

        char a = 98;
        System.out.println(a); //b

        //codePointAt
        System.out.println(str.codePointAt(1)); //97 unicode degerini verir.

        //compareTo unicode karsilastirilmasi

        //concat string in sonuna bir dger eklemek için
        System.out.println(str.concat(".dev"));

        //contains true or false
        System.out.println(str.contains("b")); //false

        //endsWith true or false
        System.out.println(str.endsWith("ka"));

        //equals true or false
        System.out.println(str.equals("patiKa")); //false

        //equalsIgnoreCase
        System.out.println(str.equalsIgnoreCase("patikA")); //true

        //indexOf()
        System.out.println(str.indexOf("t")); //2
        System.out.println(str.indexOf("a")); //1 first letter

        //lastIndexOf()
        System.out.println(str.lastIndexOf("a")); //5 last letter

        //isEmpty()
        System.out.println(str.isEmpty()); // empty-> String name = ""; null ->String name;

        //length()
        System.out.println(str.length()); //6: patika

        //replace()
        System.out.println(str.replace("a", "e")); // replaced whole a letter to e letter

        //replaceFirst()
        System.out.println(str.replaceFirst("a", "b")); //replaced first a letter to b letter

        //split()
        String[] arr = str.split("a");
        System.out.println(Arrays.toString(arr)); //[p, tik// ]

        //substring()
        System.out.println(str.substring(2)); //tika

        //toLowerCase()
        //toUpperCase()

        //trim() delete spaces to the right and left of text





    }
}
