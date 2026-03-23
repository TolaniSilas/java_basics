package day4.chapterEight;

public class Time {
    private int hour;  
    private int minute; 
    private int second;

    public Time(int hour, int minute, int second) {

        ValidateMinute(hour)
        ValidateMinute(minute)
        ValidateMinute(second)

        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 ||
                second < 0 || second >= 60) {
            throw new IllegalArgumentException(
                "hour, minute and/or second was out of range");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    static void ValidateHour(int hour) {
        boolean validHour = hour < 0 || hour >= 24;

        if (validHour) {
            throw new IllegalArgumentException("Invalid hour. Please enter an hour between 0 and 23.");
                }
        }
    
    static void ValidateMinute(int minute) {
        boolean validHour = minute < 0 || minute >= 60;

        if (validHour) {
            throw new IllegalArgumentException("Invalid hour. Please enter an hour between 0 and 23.");
                }
        }
    
    static void ValidateSecond(int second) {
        boolean validHour = second < 0 || second >= 60;

        if (validHour) {
            throw new IllegalArgumentException("Invalid hour. Please enter an hour between 0 and 23.");
                }
        }



}