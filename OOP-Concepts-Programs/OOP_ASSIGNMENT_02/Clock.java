class Clock {
    private int hour;
    private int minutes;
    private int seconds;
    private boolean isAM;

    Clock() {
        this.hour = 12;
        this.minutes = 0;
        this.seconds = 0;
        this.isAM = true;
    }

    Clock(int hour, boolean isAM) {
        this(hour, 0, 0, isAM);
    }

    Clock(int hour, int minutes, int seconds, boolean isAM) {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
        this.isAM = isAM;
    }

    public int getHours() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean getisAM() {
        return isAM;
    }

    public void setTime(int hour, int minutes, int seconds, boolean isAM) {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
        this.isAM = isAM;
    }

    public void displayTime() {
        System.out.println("Time: " + hour + ":" + 
                           (minutes < 10 ? "0" + minutes : minutes) + ":" + 
                           (seconds < 10 ? "0" + seconds : seconds) + " " + 
                           (isAM ? "AM" : "PM"));
    }

    public static void main(String[] args) {
        Clock clock = new Clock(9, 5, 3, true);
        clock.displayTime();
    }
}
