package util;

public class Time {

    private long startTime;
    private long stopTime;

    public void start() {
        this.startTime = System.currentTimeMillis();
        this.stopTime = this.startTime;
    }

    public void stop() {
        this.stopTime = System.currentTimeMillis();
    }

    public Time() {
        this.startTime = 0;
        this.stopTime = 0;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getStopTime() {
        return stopTime;
    }

    public void setStopTime(long stopTime) {
        this.stopTime = stopTime;
    }

    public long getTimeLapse() {
        return this.stopTime - this.startTime;
    }
}
