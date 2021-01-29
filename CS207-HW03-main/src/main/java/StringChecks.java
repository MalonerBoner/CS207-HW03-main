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


}
