package com.codegym.ss4;

public class StopWatch {
    private long starttime;
    private long endtime;

    public StopWatch() {
    }

    public StopWatch(long starttime, long endtime) {
        this.starttime = starttime;
        this.endtime = endtime;
    }

    public long getStarttime() {
        return starttime;
    }

    public void setStarttime(long starttime) {
        this.starttime = starttime;
    }

    public long getEndtime() {
        return endtime;
    }

    public void setEndtime(long endtime) {
        this.endtime = endtime;
    }
    public long start(){
        return this.starttime=System.currentTimeMillis();
    }
    public long stop(){
        return this.endtime=System.currentTimeMillis();
    }public long getElapsedTime(){
        long time;
        time =this.start()-this.stop();
        return  time;
    }

    @Override
    public String toString() {
        return "StopWatch{" +
                "starttime='" + starttime + '\'' +
                ", endtime='" + endtime + '\'' +
                '}';
    }
}
