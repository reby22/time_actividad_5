package uaslp.objetos.parcial1.time;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        if(hour < 24){
            this.hour = hour;
        }else{
            System.out.println("Not valid hour");
        }
        if(minute < 60){
            this.minute = minute;
        }else{
            System.out.println("Not valid minute");
        }
        if(second < 60){
            this.second = second;
        }else{
            System.out.println("Not valid second");
        }
    }

    public void setTime(int hour, int minute, int second){
        if(hour < 24){
            this.hour = hour;
        }else{
            System.out.println("Not valid hour");
        }
        if(minute < 60){
            this.minute = minute;
        }else{
            System.out.println("Not valid minute");
        }
        if(second < 60){
            this.second = second;
        }else{
            System.out.println("Not valid second");
        }
    }

    public int getHour(){
        return hour;
    }

    public  int getMinute(){
        return minute;
    }

    public  int getSecond(){
        return second;
    }

    public void addHour(int delta){
        //0->23 hours
        int i;
        for(i=0; i<delta; i++){
            if(getHour() < 23){
                hour++;
            }else{
                hour = 0;
            }
        }
    }

    public void addMinute(int delta){
        //0->59 minutes
        int i;
        for(i=0; i<delta; i++){
            if(getMinute() < 59){
                minute++;
            }else{
                minute = 0;
                addHour(1);
            }
        }
    }

    public void addSecond(int delta){
        //0->59 seconds
        int i;
        for(i=0; i<delta; i++){
            if(getSecond() < 59){
                second++;
            }else{
                second = 0;
                addMinute(1);

            }
        }
    }

    public String toString(){
        return String.format("%02d:%02d:%02d", hour,minute,second);
    }


}
