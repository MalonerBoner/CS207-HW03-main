public class MyString {

    private String original;

    public MyString(String original){

        this.original = original;
    }

    public String getOriginal(){

        return this.original;
    }

    public String removeVowels(){

        String noVowelStr = this.original.replaceAll("[aAeEiIoOuU]", "");

        return noVowelStr;
    }
}
