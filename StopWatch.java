package StopWatch;

import java.text.SimpleDateFormat;
import java.util.Date;


public class StopWatch {
    final SimpleDateFormat dinhdang = new SimpleDateFormat("HH:mm:ss:SS");
    private Date startTime;
    private Date endTime;

    public StopWatch() {
        this.startTime = new Date();
    }
    public void start() {
        this.startTime = new Date();
    }
    public void stop() {
        this.endTime = new Date();
    }
    public long getStarTime() {
        long ms = 0;
        String str = dinhdang.format(this.startTime);
        String[] arr = str.split(":");
        for (int i = 0 ; i < arr.length ; i++) {
            if (i < 3) {
                ms *= 60;
                ms += Long.parseLong(arr[i]);
            }else {
                ms*=1000;
                ms += Long.parseLong(arr[i]);
            }
        }
        return ms;
    }
    public long getEndTime() {
        long ms = 0;
        String str = dinhdang.format(this.endTime);
        String[] arr = str.split(":");
        for (int i = 0 ; i < arr.length ; i++) {
            if (i < 3) {
                ms *= 60;
                ms += Long.parseLong(arr[i]);
            }else {
                ms*=1000;
                ms += Long.parseLong(arr[i]);
            }
        }
        return ms;
    }
    public long getElapsedTime() {
        return  (this.getEndTime() - this.getStarTime());
    }



}
