package Entity;

import java.util.Date;

public class Sample {
    public int date;
    public int time;
    public int num_transaction;
    public double sucRate;
    public int response_time;

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getNum_transaction() {
        return num_transaction;
    }

    public void setNum_transaction(int num_transaction) {
        this.num_transaction = num_transaction;
    }

    public double getSucRate() {
        return sucRate;
    }

    public void setSucRate(double sucRate) {
        this.sucRate = sucRate;
    }

    public int getResponse_time() {
        return response_time;
    }

    public void setResponse_time(int response_time) {
        this.response_time = response_time;
    }
}
