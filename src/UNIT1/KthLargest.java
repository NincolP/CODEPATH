package UNIT1;

import java.util.PriorityQueue;

public class KthLargest {
    PriorityQueue<Integer> q = new PriorityQueue<>();
    int kth;


    //Constructor
    public KthLargest(int k, int[] nums) {
        kth = k;
        for (int i: nums) {
            q.add(i);
            if(q.size() > k)
                q.poll();
        }

    }

    public int add(int val) {
        q.add(val);

        if(q.size() > kth)
            q.poll();

        return q.peek();
    }


    public void displayQ (){
        for (int i: q
        ) {
            System.out.print(i);
        }
        System.out.println();

    }


}
