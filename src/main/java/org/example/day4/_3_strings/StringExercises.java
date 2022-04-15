package org.example.day4._3_strings;

public class StringExercises {
    /*
       TODO 9
       Prefix the param with 'Good job, '

       goodJob("Anna")          -> "Good job, Anna!"
       goodJob("my friend")     -> "Good job, my friend!"
       goodJob("XYZ")           -> "Good job, XYZ!"
       goodJob("Indiana Jones") -> "Good job, Indiana Jones!"

    */
    String goodJob(String name) {
        return "Good job, " + name + "!";
    }

    /*
       TODO 10
       If String is even length, return first half x2. Else return original String.

       doubleFirstHalf("HeyYou")   -> "HeyHey"
       doubleFirstHalf("12345678") -> "12341234"
       doubleFirstHalf("M")        -> "M"
       doubleFirstHalf("panda")    -> "panda"
    */
    String doubleFirstHalf(String str) {

        String finalString="";

        if(str.length()%2==0){

            for(int i = 0;i<str.length()/2;i++){

                finalString += str.charAt(i);

            }

            return finalString + finalString;

        }

        return str;



    }

    /*
        TODO 11

        interlace("A", "B")      -> "ABABA"
        interlace("Sun", "Moon") -> "SunMoonSunMoonSun"
        interlace("blue", "red") -> "blueredblueredblue"
        interlace("Hi", "Ciao")  -> "HiCiaoHiCiaoHi"
     */
    String interlace(String a, String b) {


        return a+b+a+b+a;
    }

    /*
        TODO 12

        cutEnds("Java")  -> "av"
        cutEnds("koala") -> "oal"
        cutEnds("XX")    -> ""
        cutEnds("a")     -> ""
     */
    String cutEnds(String str) {

        if (str.length()<=2){

            return "";

        }

        return str.substring(1,str.length()-1);

    }

    /*

       TODO 13

       addTags("smile", "i")        -> <i>smile</i>
       addTags("777666555", "phone" -> <phone>777666555</phone>
       addTags("welcome", "header"  -> <header>welcome</header>
     */
    String addTags(String word, String tag) {

        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    /*

       TODO 14

       copyLastChars("computer") -> "ter ter"
       copyLastChars("ABCD")     -> "BCD BCD"
       copyLastChars("Hi")       -> "Hi Hi"
       copyLastChars("Amazing")  -> "ing ing"
     */
    String copyLastChars(String str) {

        if(str.length()>3){

            String lastThreeLetters = str.substring(str.length()-3,str.length());

            return lastThreeLetters + " " + lastThreeLetters ;

        }

        return str + " " + str;
    }
}
