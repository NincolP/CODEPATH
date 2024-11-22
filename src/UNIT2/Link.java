package UNIT2;

public class Link {

    public Integer data;
    public Link next;
    public Link previous;


    public Link(int i) {
        data = i;
    }

    public void displayLink()  {    // display Link data
        System.out.print(data);
    }

}
