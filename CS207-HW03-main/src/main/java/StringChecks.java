public class StringChecks {

    private StringChecks(){}

    public static boolean sameSides(String str){

        boolean result = false;

        String formerHalf = new String(str.substring(0, str.length() / 2));
        String latterHalf = new String(str.substring(str.length() / 2));

        String [] first = formerHalf.split("[^aAeEiIoOuU]");
        String [] second = latterHalf.split("[^aAeEiIoOuU]");

        if(first.length == second.length)
            result = true;

        return result;
    }

    public static boolean anagram(String str1, String str2){

        boolean result = true;

        int strLength1 = 0;
        int strLength2 = 0;

        for(int i = 0; i < str1.length(); i++){

            String letter = "" + str1.charAt(i);

            String str = new String("" + str1);
            str = str.replace(letter, "");

            strLength1 = str.length();

            str = new String("" + str2);
            str = str.replace(letter, "");

            strLength2 = str.length();

            if(strLength1 != strLength2)
                result = false;
        }

        return result;
    }
}
