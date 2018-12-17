package maxplus.kmj.com.instag;

import java.util.ArrayList;

public class Data {
    private int status;
    private int count;

    public ArrayList<TwoData> getData() {
        return data;
    }

    public void setData(ArrayList<TwoData> data) {
        this.data = data;
    }

    private ArrayList<TwoData> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


}
