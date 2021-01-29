public class DateConversion {

    private String date;

    public DateConversion(String date){

        this.date = date.replace("June", "Jun");
    }

    public String getDate(){

        return this.date;
    }

    public String reformatDate(){

        String year = this.date.substring(this.date.length() - 4);

        String month = this.date.substring(this.date.length() - 8, this.date.length() - 5);

        String day = this.date.substring(0, this.date.indexOf(" ") - 2);

        String newDate = year + "-" + month + "-" + day;

        return newDate;
    }
}
