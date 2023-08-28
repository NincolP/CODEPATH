package UNIT1;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
    private int recentCalls;

   public Queue<Integer> q;

    final int setInterval = 3000;


    public RecentCounter () {
        q = new LinkedList<>();
    }

    public int ping(int t) {
        //Add new pings as they come
        q.add(t);

        //But we are removing all pings in the Queue with value more than 3000 milliseconds from the new ping.
        while (q.peek() < t - setInterval)
            q.poll();

        //Return the amount of calls or request at that time in the Queue
        return q.size();
    }
}
