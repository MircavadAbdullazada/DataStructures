package exercises;

public class StringL {              //used->Sertifikat qeydlerim

    public static void main(String[] args) {

        String car = "Camaro";             //creat in String pool
        String car2 = new String("BMW M5");      //String object

        //String methods:
        //1)-length(): return length of String         -> public int length();
        System.out.println("length(): " + car.length());

        //2)charAt(): return the value of search index -> char charAt(int index)
        System.out.println("charAt(): " + car.charAt(5));

        //3)indexOf():Searches for any character or expression within the given string, and if the result is positive,
        // returns the index at which the searched expression was first found. -> int indexOf(int ch)
        //                                                                        int indexOf(int ch, int fromIndex)
        //                                                                        int indexOf(String str)
        //                                                                        int indexOf(String str, int fromIndex)

        System.out.println("indexOf(): " + car.indexOf(5)); //5 is char in Unicode
        System.out.println("indexOf(): " + car.indexOf(97, 2));
        System.out.println("indexOf(): " + car.indexOf("o"));
        System.out.println("indexOf(): " + car.indexOf("ro", 2));

        //4)substring(); returns the desired part of string -> String substring(int beginIndex)
        //                                                     String substring(int beginIndex, int endIndex)

        System.out.println("substring(): " + car2.substring(5));
        System.out.println("substring(): " + car2.substring(2,5));

        //5)toLowerCase() and toUpperCase(): ->String toLowerCase()
        //                                     String toUpperCase()

        System.out.println(car.toUpperCase());
        System.out.println("Baki".toLowerCase());

        //6)equals() and equalsIgnoreCase();-> boolean equals(Object obj)
        //                                     boolean equalsIgnoreCase(String str)

        System.out.println("Camaro".equals(car));
        System.out.println("camaro".equalsIgnoreCase(car));

        //7)starWith() and endWith();-> boolean startsWith(String prefix)
        //                              boolean endsWith(String suffix)

        System.out.println(car.startsWith("C"));
        System.out.println(car.endsWith("o"));

        //8)contains()-> boolean contains(CharSequence s)
        System.out.println(car.contains("a"));

        //9)replace()-> String replace(char oldChar, char newChar)
        //              String replace(CharSequence oldChar, CharSequence newChar)
        //*replace() is create new String object

        System.out.println("abcabc".replace('a', 'A')); // AbcAbc
        System.out.println("abcabc".replace("a", "A")); // AbcAbc

        System.out.println(car.trim());






    }


}
