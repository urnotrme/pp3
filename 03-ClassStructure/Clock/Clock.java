public class Clock{
    int hour;
    int minute;
    
    int alarmHour;
    int alarmMinute;
    
    Clock(){
        this.hour = 0;
        this.minute = 0;
    }
    
    Clock(int hour, int minute){
        if ((hour >= 24) || (hour < 0)) {
            System.out.println("The hour is not correct");
        } else if ((minute >= 60) || (minute < 0)) {
            System.out.println("The minute is not correct");
        } else {
            this.hour = hour;
            this.minute = minute;
        }
    }
    
    public void setClock(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }

    public void setClock(){
        this.hour = 0;
        this.minute = 0;
    }
    
    public void displayTime() {
        String hour;
        String minute;
        if (this.hour < 10) {
            hour = "0" + String.valueOf(this.hour);
        } else {
            hour = String.valueOf(this.hour);
        }

        if (this.minute < 10) {
            minute = "0" + String.valueOf(this.minute);
        } else {
            minute = String.valueOf(this.minute);
        }

        System.out.println("It is " + hour + ":" + minute + " o'clock");
    }
    
    public void addOneMinute(){
        if (hour == 23 & minute == 59){
            this.setClock();
        } else if (minute == 59){
            this.hour +=1;
            this.minute = 0;
        } else {
            this.minute += 1;
        }
        
        if ((this.alarmHour == hour) && (this.alarmMinute == minute)){
            runAlarm();
        }
    }
    
    public void setAlarm(int hour, int minute){
        this.alarmHour = hour;
        this.alarmMinute = minute;
    }
    
    public void runAlarm(){
        System.out.println("beep-beep-beep-beep !!");
    }
    
    public static void main(String[] args) {
        Clock clock1 = new Clock(12,47);
        clock1.displayTime();

        clock1.setAlarm(1, 2);

        clock1.setClock(18,14);
        clock1.displayTime();

        clock1.setClock(9,3);
        clock1.displayTime();

        clock1.setClock(00,58);
        clock1.displayTime();
        clock1.addOneMinute();
        clock1.displayTime();
        clock1.addOneMinute();
        clock1.displayTime();
        clock1.addOneMinute();
        clock1.displayTime();
        clock1.addOneMinute();
        clock1.displayTime();
        
        clock1.setClock();
        clock1.displayTime();   
    }
}