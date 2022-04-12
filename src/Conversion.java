public class Conversion {

    public static void main(String[] args) {
        int intNumber = 25;
        float floatNumber = 2.6f;
        double doubleNumber = 3.12;
        String chaine = "vint cinq";


//      intNumber = floatNumber;
        intNumber = (int) floatNumber;
        System.out.println(intNumber);             //shows 2, it doesn't round, it just cuts the decimal

        intNumber = 2 + (int) floatNumber;

//        chaine = (String) intNumber;               //doesn't work'
        chaine = Integer.toString(intNumber);      //this will work.
        System.out.println(chaine);

//i make changes @#)($*@)#UP#JFP@)#UFP#@(UFPU#
        //@#P(*U@FO(U@#FO(U@#


    }
}
