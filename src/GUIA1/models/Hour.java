package GUIA1.models;

public class Hour {
    private Integer hour;
    private Integer minute;
    private Integer second;

    public Hour(Integer hour, Integer minute, Integer second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public void setHour(Integer hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            this.hour = 0; // Valor por defecto si el valor es inválido
        }
    }

    public void setMinute(Integer minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            this.minute = 0; // Valor por defecto si el valor es inválido
        }
    }

    public void setSecond(Integer second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            this.second = 0; // Valor por defecto si el valor es inválido
        }
    }


    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public Hour advanceOneSecond() {
        second++;
        if (second > 59) {
            second = 0;
            minute++;
            if (minute > 59) {
                minute = 0;
                hour++;
                if (hour > 23) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    public Hour retreatOneSecond() {
        second--;
        if (second < 0) {
            second = 59;
            minute--;
            if (minute < 0) {
                minute = 59;
                hour--;
                if (hour < 0) {
                    hour = 23;
                }
            }
        }
        return this;
    }

}
