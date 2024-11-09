public class date {
    private int day;
    private int month;
    private int year;
    public date(int day,int month,int year){
        if(day>0 && day<=31 && month>0 && month<=12 && year>0){
            this.day=day;
            this.month=month;
            this.year=year;
        }
        else{
            System.out.println("Error : Invalid date");
        }
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void setDay(int day){
        if(day>0 && day<=31){
            this.day=day;
        }
            else{
            System.out.println("Error : day incorrect");
        }
    }
    public void setMonth(int month){
        if(month>0 && month<=12){
            this.month=month;
        }
            else{
            System.out.println("Error : month incorrect");
        }
    }
    public void setYear(int year){
        if(year>0){
            this.year=year;
        }
            else{
            System.out.println("Error : year incorrect");
            }
    }
    public void display(){
        System.out.println("Date : "+day+"/"+month+"/"+year);
    }
            
    public static void main(String[] args){
        date d1=new date(1,1,2000);
        d1.display();
        d1.setDay(31);
        d1.display();
    }
}
