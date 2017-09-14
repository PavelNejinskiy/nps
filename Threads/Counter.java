package Threads;

public class Counter {
    static int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {

        this.count = count;
    }

    void counter()
    {
       count++;

    }

}
