package UNIT1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello world!");
        /*
        A string consisting of lowercase English letters, return the first letter to appear twice

        Example
            Input s = "abccbaacz"
            Output: 'c'
        ***UNDERSTAND**
        Questions to ask for the UNDERSTANDING PART OF UMPIRE
        - Are we assuming that the user will enter a lower case, or do we have to transform
        the string to all lover case, or should we output an error message to ask for only lower
        case
        - Are spaces allowed.
        _ what if letter do not repeat. What is the expected output.

        MATCH and PSEUDOCODE

        1. double for loop.
            In place - no need for an extra data structure/ space
            outer loop will iterate over the letters
            inner loop compare the given letter to other letters
               counter that will keep track how long until we encounter that letter again
               at the end will return the letter with the lowest count.
            but time complexity will suffer.
            Time complexity O(N^2)
            space complexity O(1)
        ------------------------------------------------------------
        2. Hash map
            key, value combination
                letter key,
                initial value
                once a letter is found that already exist
                        return this letter
            Time complexity O(N)
            Space complexity O(N)
         */

        //String s = "abccbz";
        //String g = "ab";


        //doubleForLoopOption(s);
        //doubleForLoopOption(g);

        //System.out.println(firstLetterToRepeat(s));
        //System.out.println(firstLetterToRepeat(g));

        /*
    Similar problem:
    Given an integer array nums, return true if any value appears at least twice in the array,
     and return false if every element is distinct.
     We will use the same strategy as before
     using a hash map will give us a time complexity of

    1. use a for loop to iterate to the array
    time complexity is O(N)
    2. store the items in a hashmap
    3. if the item is found in the hashmap return true
    4. otherwise return false
     */

    //int [] numbers = {1,1,1,3,3,4,3,2,4,2};

    //System.out.println(containsDuplicate(numbers));

        /*
        ******Problem 2: Two Sum****
        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.
         */

       /* int [] num = {2,7,11,15};
        int [] num2 = {};
        System.out.println(Arrays.toString(twoSum(num, 9)));
        System.out.println(Arrays.toString(twoSum(num2, 5)));*/

        // TESTING PROBLEM #3

        /*int [] numbers = {100, 4, 200,1,3, 3,2, 201, 202, 203, 203, 204, 205, 206};

        int [] nums2 = {0,3,7,2,5,8,4,6,0,1};

        int [] nums3 = {100,4,200,1,3,2};

        int [] nums4 = {1, 8, 10, 100, 2};*/

        //System.out.println(longestConsecutiveSequence(numbers));

        //System.out.println(longestConsecutiveSequence(nums2));

        //System.out.println(longestConsecutiveSequence(nums3));

        //System.out.println(longestConsecutiveSequence(nums4));

        //System.out.println(numbers);


        /*System.out.println(longConsSequence(numbers));
        System.out.println(longConsSequence(nums2));
        System.out.println(longConsSequence(nums3));
        System.out.println(longConsSequence(nums4));*/

        /*HashMap<Integer, Long> hMap = new HashMap<>();
        System.out.print(fib(0, hMap) + " ");
        System.out.print(fib(1, hMap)+ " ");
        System.out.print(fib(2, hMap)+ " ");
        System.out.print(fib(3, hMap)+ " ");
        System.out.print(fib(4, hMap)+ " ");
        System.out.print(fib(5, hMap)+ " ");
        System.out.print(fib(6, hMap)+ " ");
        System.out.print(fib(7, hMap)+ " ");
        System.out.print(fib(8, hMap)+ " ");
        System.out.print(fib(50, hMap)+ " ");
        System.out.println();

        for(int i = 0; i < hMap.size(); ++i) {
            System.out.println(hMap.get(i));
        }*/

        /*String roman = "LVIII";
        String roman2 = "MCMXCIV";
        String roman3 = "III";

        System.out.println(romanToInt(roman));
        System.out.println(romanToInt(roman2));
        System.out.println(romanToInt(roman3));*/


        /*
        test cases for problem #5
         */

        /*List<List<String>> list1 = Arrays.asList(Arrays.asList("B", "C"),
                                    Arrays.asList("D", "B"),
                                            Arrays.asList("C", "A"));

        List<List<String>> list2 = Arrays.asList(Arrays.asList("London","New York"),
                Arrays.asList("New York","Lima"),
                Arrays.asList("Lima","Sao Paulo"));

        System.out.println(destinationCity(list1));
        System.out.println(destinationCity(list2));*/
        //==============================================================================================================
        //SECTION 2

        /*String s = "()[ ]{}";
        String s2 = "(]";
        String s3 = "()";
        String s4 = "((    {   }))   ";

        System.out.println(validParenthesis(s));
        System.out.println(validParenthesis(s2));
        System.out.println(validParenthesis(s3));
        System.out.println(validParenthesis(s4));*/

        /*UNIT1.KthLargest obj = new UNIT1.KthLargest(3, new int[]{4, 5, 8, 2});
        obj.displayQ();

        System.out.println(obj.add(3));
        System.out.println(obj.add(5));
        System.out.println(obj.add(10));
        System.out.println(obj.add(9));
        System.out.println(obj.add(4));
*/

       /* int [] recentCallsTimes = {1, 2, 4000};

        UNIT1.RecentCounter recentCalls = new UNIT1.RecentCounter();

        for(int i = 0; i < recentCallsTimes.length; ++i) {
            System.out.println(recentCalls.ping(recentCallsTimes[i]));
        }*/

        /*UNIT1.MinStack minStack = new UNIT1.MinStack();

        minStack.push(5);
        minStack.push(8);
        minStack.push(54);
        minStack.push(1);
        minStack.push(6);
        minStack.push(30);

        System.out.println(minStack.top());
        minStack.pop();

        System.out.println(minStack.top());

        System.out.println(minStack.getMin());

        minStack.pop();
        minStack.pop();

        System.out.println(minStack.top());

        System.out.println(minStack.getMin());*/


        /*UNIT1.MyQueue myQ = new UNIT1.MyQueue();

        myQ.push(9);
        myQ.push(8);
        myQ.push(10);

        myQ.pop();
        myQ.pop();
        myQ.pop();

        myQ.push(5);

        System.out.println(myQ.peek());

        System.out.println(myQ.empty());*/


        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(1);
        list2.add(2);
        list2.add(1);
        list2.add(2);


        System.out.println(singleNumber(list));
        System.out.println(singleNumber(list2));















    }

    //***SOLUTIONS FOR PROBLEM 1 AND SIMILAR PROBLEM 1***
    static void doubleForLoopOption (String h) {
        int index = 0;
        int minIndex = h.length()-1;
        for(int i = 0; i < h.length(); ++i) {
            for(int j = i+1; j < h.length(); ++j) {
                if(h.charAt(i) == h.charAt(j)) {
                    index = j;
                    if(minIndex > index)
                        minIndex = index;
                }
            }
        }
        System.out.println(h.charAt(minIndex));
    }

    public static char firstLetterToRepeat(String x) {
        HashMap<Character, Integer> m = new HashMap<>(x.length());
        //boolean repeats = false;
        for (int i = 0; i < x.length(); ++i) {
            if (m.containsKey(x.charAt(i))) {
                return x.charAt(i);
            }
            m.put(x.charAt(i), 2);
        }
        //if(!repeats)
        System.out.println("no character repeats");
        return ' ';
    }

    //PROBLEM 1 ANALYSIS
    // PSEUDOCODE
    /*
    1) Create Set
    2) Iterate through numbers
        a) If number is already in set return True
        b) Store number in set
    3) Return False (we have reached the end of the list without duplicate)
     */
    static boolean containsDuplicate (int [] arr) {
        HashMap<Integer, Integer> num = new HashMap<>();
        for (int j : arr) {
            if (num.containsKey(j))
                return true;
            num.put(j, 1);
        }
        return false;
    }

    /*
    Review:
        check edge cases, such as no items in array, no duplicates.

    Evaluate
        Time Complexity: O(N) as we may have to iterate all elements in the array
        Space Complexity: O(N) because we have to store all elements in the array
     */


    //***PROBLEM 2 ANALYSIS***
    /*
    UNDERSTAND
    input given is an integer array
        Can this array have duplicates?
    second input is the matching target
        2 numbers in the array that added up matches the target integer

    OUTPUT
        the two indices of the numbers that add up to the target integer


    Given:
    -Each input would have exactly one solution
    -You may not use the same element twice.
    Question
        do they have to be consecutive numbers that add up to the target?
        what should the output be if there is no two numbers that add up to the target?

    let's just say that the numbers do not have to be consecutive
    Because of the given that each input would have exactly one solution, we are not accounting for no solution

    MATCH
    We can again use a hashmap and store the numbers
    -The keys on the hashmap will be the indexes
    -the values of the hashmap will be the actual numbers

    PSEUDOCODE-PLAN
    for each item in the given array
    -if the target minus the item is equal to any of the items in the array. we have found the complement
    -otherwise store the item in the hashmap
     */

    //IMPLEMENT

    public static int [] twoSum ( int [] arr, int target) {

        HashMap<Integer, Integer> numberAndIndex = new HashMap<>();

        for(int i = 0; i < arr.length; ++i) {
            if(numberAndIndex.containsKey(target - arr[i]))
                //if the complement exist, we are returning the index for both the complementary numbers
                return new int[] {numberAndIndex.get(target - arr[i]), i };
            //The key is the number not the index, the value is the index.
            numberAndIndex.put(arr[i], i);
        }
        return new  int[] {};
    }
    //Time complexity O(N) because we may have to iterate over the number of elements in the array
    //Space complexity is also O(N) because we need a hashmap tha can store up to the number of elements


    //PROBLEM #3
    /*
    UNDERSTAND
    - Can we sort the array. Any rules against sorting the array
    - If we sort, does that operation counts against the O(N)
    -What should be the output if there is no a sequence of consecutive elements
    -What should be the output of we are given an empty array.

     */

    //***PROBLEM 3 ANALYSIS***

    /*
    Problem: Given an unsorted array of integers, return the length of the longest consecutive elements sequence.
    You must write an algorithm that runs in O(N) time.

    Understand>>> The numbers must be consecutive. We are returning a count of the sequence, not the actual sequence.
    _Questions:
        - Can we assume that we are not going to be given an empty input
            _if we are given an empty input, what is the expected output?
        -What is the expected output an array of just one item
        -Duplicates: duplicates do not add to the count.

     Match: brute force, sorting the array and then see where there is a consecutive sequence after the array:

        *sort
        * iterate and have count of the highest frequency
        Example array: [100, 4,,200, 1,3,2]
        sorted
        [1,2,3,4,100,200}

        int counter = 0;

        PLAN
        for each item in the array
        count the longest consecutive sequence

        starting index[i] // starting at index 0

        if ( index[i+1] == index[i]+1)
            add one to the counter;

         Implement
     */

    public static int longestConsecutiveSequence(int [] nums) {
        //Case where the input is an empty array
        if(nums.length == 0)
            return 0;

        Arrays.sort(nums);

        // Current and longest count initialized to 1 and will be compare later
        int currentLongest = 1;
        int longestSeq = 1;

        for (int i = 1; i < nums.length;++i) {
            //if next number is greater than previous number by one, add to the sequence counter
           if(nums[i] == nums[i-1]+1) {
               currentLongest++;
           }
           //to deal with duplicates so that the counters does not start over yet and to not add to the sequence counter.
           else if(nums[i] == nums[i-1]) {
                continue;
           }
           //no sequence, move to the possible counter
           else {
               currentLongest = 1;
           }
           //if the current sequence counter is greater than previously recorded, this is the new longest sequence
            if(currentLongest> longestSeq)
                longestSeq = currentLongest;
        }

        return longestSeq;
    }

    /*
    Another way to do this is to use a hashset to store unique values. This automatically eliminates duplicates
    if the current number has no previous numbers, we start the current count from this number
        while the set contain the current num +1, increment the current count
        after each while loop if the current count is greater than previous longest count, make this the longest count


     */

    //This version uses a hashset/ Eliminates duplicates
    public static int longConsSequence(int [] arr) {
        int longestCount = 0;
        int counter;
        int currentNumber;

        HashSet<Integer> hSet = new HashSet<>();

        for (int num: arr
             ) {
            hSet.add(num);
        }

        for (int num: hSet
             ) {
            if(!hSet.contains(num-1)){
                currentNumber = num;
                counter = 1;
                while(hSet.contains(currentNumber+1)){
                    currentNumber++;
                    counter++;
                }
                if(counter > longestCount)
                    longestCount = counter;
            }
        }

        return longestCount;
    }


    //TRYING DYNAMIC PROGRAMING
    public static long fib(int n, HashMap<Integer, Long> memo) {
        if (memo.containsKey(n))
            return memo.get(n);
        if(n == 0) {
            memo.put(n, 0l);
            return 0;
        }
        if(n > 0 && n <=2) {
            memo.put(n, 1l);
            return 1;
        }
        memo.put(n, fib(n-1, memo) + fib(n-2, memo));
        return memo.get(n);
    }

/*
PROBLEM 4. GIVEN A ROMAN NUMERAL, CONVERT IT TO INTEGER
THE ROMAN NUMERALS ARE REPRESENTED BY SEVEN DIFFERENT SYMBOLS

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

**SPECIAL CASES
4 IS REPRESENTED AS IV -->> THAT IS SUBTRACTING 1 FROM 5 FROM THE LEFT
9 SAME CONCEPT IX
THEREFORE, THIS WOULD APPLY TO ALL INTEGERS STARTING WITH 4 OR 9
LIKE 40 AND 90


UNDERSTAND
- We are given a roman numeral and we  converted to integer
- We are going to be working with the table provided, as this as the constants that
  support our conversion from roman to integer.


Match
-we can store the symbol and value in hashmap -- provide for us to have a key - value data
structure

-create a logic for the special cases

Plan

- crate and initialize a hashmap that would contain the symbols and values combinations
- Iterate over the string provided - length of the string

    -I can be placed before V (5) and X (10) to make 4 and 9.
    -X can be placed before L (50) and C (100) to make 40 and 90.
    -C can be placed before D (500) and M (1000) to make 400 and 900.

   - we are going to add the characters from to end to the beginning of the string
    - These conditions can be the first cases of our conditional statements
- Example: "MCMXCIV"
        4+50+100+

Implement:

 */

    public static long romanToInt(String s) {
        HashMap<Character, Integer> romanHash = new HashMap<>();
        long total = 0;

        romanHash.put('I',1);
        romanHash.put('V',5);
        romanHash.put('X',10);
        romanHash.put('L',50);
        romanHash.put('C',100);
        romanHash.put('D',500);
        romanHash.put('M',1000);

        //The loop iterates to the second to last character because we are using i+1
        for(int i = 0; i < s.length()-1; i++){
            // Check if the character at right of current character is bigger or smaller
            if(romanHash.get(s.charAt(i)) < romanHash.get(s.charAt(i+1))) total -= romanHash.get(s.charAt(i));
            else total += romanHash.get(s.charAt(i));
        }

        //This accounts for the last character in the string
        return total += romanHash.get(s.charAt(s.length()-1));
    }

        /*
        ANALYSIS
        TIME COMPLEXITY: O(1) BECAUSE THE NUMBER OF CHARACTER WE ITERATE IN THE STRING IS CONSTANT

        SPACE COMPLEXITY: O(1) BECAUSE THE SPACE WE USE IS CONSTANT
         */




    /*
    PROBLEM 5:
    You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path
    going from cityAi to cityBi. Return the destination city, that is, the city without any path outgoing
    to another city.
    It is guaranteed that the graph of paths forms a line without any loop, therefore,there will be
    exactly one destination city.

    Example 1:
    Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
    Output: "Sao Paulo"
    Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city.
    Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".

    UNDERSTAND:
    we are looking for a destination city that is not a departure city.

    Based on the example, the input has to be a list of list to be able to have departure-destination
    city combos.


    MATCH:
    We can use a hashset to store departure cities and compare with destination cities in the List of list
`
    PLAN:
    -create a hashset
    -using a for loop
        -iterate through the list of list and map contents into hashset
            each list in list at index 0 contains the departure city.
        the iterate the List of list once again
            if the destination city is not also a departure city in the hashset, that is the one we are
            looking for.

       IMPLEMENT:
     */

    public static String destinationCity(List<List<String>> list) {
        String destination;

        Set<String> routes = new HashSet<>();

        //first add the departure cities
        for (List<String> l: list
             ) {
            routes.add(l.get(0));
        }

        //Then check destination cities on the list of list to see if it matches a departure city in
        //hashset
        for (List<String> l: list) {
            destination = l.get(1);
            if(!routes.contains(destination))
                return destination;
        }

        return " ";
    }

    /*
    ANALYSIS:
    TIME COMPLEXITY:
    Each for loop has a time complexity of O(N) therefore the time complexity is O(N)

    SPACE COMPLEXITY:
    Space complexity is determined by hashset which will be O(N)

     */
//======================================================================================================================
    //SECTION 2


/*
PROBLEM 1
VALID PARENTHESES
Given a string st containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets. Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

UNDERSTAND:
-JUST TO MAKE SURE WE ARE ONLY EXPECTING THE CHARACTERS LISTED
-NEED TO ACCOUNT FOR SPACES-REMOVE THEM

MATCH:
-stack as last in first out - LIFO

PLAN:
-PUT THE OPEN SYMBOLS IN A STACK
-REMOVE THE OPEN SYMBOL WHEN A MATCHING CLOSING SYMBOL IS ENCOUNTERED
-MUST BE AWARE OF STOPPING WHEN THE STACK IS EMPTY
-IF STACK DOES NOT GET EMPTIED, THIS MEANS IS NOT A VALID INPUT, AS THERE ARE ITEMS LET OVER THAT DID NOT HAVE A MATCH

IMPLEMENT:
 */
    static boolean validParenthesis(String st) {
        Stack<Character> stack = new Stack<>();

       for (int i = 0; i < st.length();++i ) {
           char current = st.charAt(i);

           if((current == '(' || current == '['|| current == '{')) {
               stack.push(current);
           }
           else if ((current == ')' && stack.peek() == '(') || (current == ']' && stack.peek() == '[') ||
                   (current == '}' && stack.peek() == '{')) {
               stack.pop();
           }
       }
        return stack.empty();
    }
    /*
    EVALUATE
    TIME COMPLEXITY IS O(N)

    SPACE COMPLEXITY IS ALS0 O(N)
     */



    /*
    PROBLEM 2
    Design a class to find the kth largest element in a stream. Note that it is the kth largest element in the sorted order, not the kth distinct element.

    Implement UNIT1.KthLargest class:
    UNIT1.KthLargest(int k, int[] nums): Initializes the object with the integer k and the stream of integers nums.
    int add(int val): Appends the integer val to the stream and returns the element representing
    the kth largest element in the stream.

    UNDERSTAND:
    Could there be less than kth elements on the array. How do you want us to handle this
        output 0 perhaps?

    MATCH:
    Because we are always trying to find the max of Kth number of elements, we can use a heap
    Java implements a priority Queue that uses a min Heap


    PLAN
    Create a Class UNIT1.KthLargest

    Create a Heap by using Java Priority Queue which uses min Heap

    Create a constructor that would initialize the Priority Queue as follows:
        use a for loop to transfer the int array into this Priority Queue
        But we will limit the size to K elements

    Create an add method that will add an integer and determine which is the kth largest, accounting
    for this new integer.
        This method will also keep the size of the Priority Queue to K elements
        and will return the kth element

    IMPLEMENT
    THIS WAS IMPLEMENTED IN THE UNIT1.KthLargest class and was tested in the UNIT1.Main Class
     */


    /*
    Problem #3 - NUmber of recent calls

    You have a UNIT1.RecentCounter class which counts the number of recent requests within a certain time frame.

    Implement the UNIT1.RecentCounter class:

    UNIT1.RecentCounter() Initializes the counter with zero recent requests.
    int ping(int t) Adds a new request at time t, where t represents some time in milliseconds, and returns the number
    of requests that has happened in the past 3000 milliseconds (including the new request).
    Specifically, return the number of requests that have happened in the inclusive range [t - 3000, t].

    UNDERSTAND
    * Can we expect an empty array as an input?
    * In this case we are looking for the number of calls that happened in the past 3000 milliseconds, so that is the
      measure. ALso have to keep in mind that it is inclusive

    MATCH
    * A queue would allow us to add a new ping and remove any ping in the queue that has more than 3000 milliseconds
      compare to our new ping.

    PLAN
    * Create a new queue
    * when receiving an input ping, add it to the queue
    * remove all pings with a value of more than 3000 away from new ping
    * return the length of queue


    IMPLEMENT
    SEE UNIT1.RecentCounter class

    REVIEW
    Tracing to the code if we add a time of 3000 and other times with lower values, all those pings will count to the
    total, but when we go over 3000, pings will  be deleted.


    EVALUATE
    * TIME COMPLEXITY ----> 0(N)   as we need to remove N pings from the Q
        Time complexity can be improve to O(logN) with a binary search and pop off a portion of queue if it goes over
        the past 3000 milliseconds
    * Space complexity ----> also O(N) as we may need to store up to N pings in the queue

     */


    /*
    PROBLEM 4: Min stack
    Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

    Implement the UNIT1.MinStack class:
    UNIT1.MinStack() initializes the stack object.
    void push(int val) pushes the element val onto the stack.
    void pop() removes the element on the top of the stack.
    int top() gets the top element of the stack.
    int getMin() retrieves the minimum element in the stack. You must implement a solution with O(1) time complexity for each function.


    UNDERSTAND
    We are designing a stack that supports push, pop and getting the minimum value in constant time

    Question
    if there is an empty input, what should be the output
    Do we accept duplicates as inputs


    MATCH
    We are going to be using a stack and so pop and push will make use of the built-in Stack in Java
    to get the top, we can use the peek to return the top of the stack
    and for the minimum , we need an auxiliary data structure to have the items in order with the minimum as the head
    or first element

    PLAN
    Create the class with the methods


    class Minstack {

    -Stack - data as in comes to be able to get top, push or pop

    -Queue- to store elements in ascending order, and we can the min as the head of the queue


            void push(int input ) {
            stack.push(input)
            }

            void pop() {

            queue remove(stack.pop)

            }

            int top () {
            return stack.peek();
            }

            int min () {
            return auxDataStructure.get(0);
            }

        }


       REVIEW
       Testing for cases where push was followed by pop and getMin

        EVALUATE

        SPACE COMPLEXITY

        O(N) As we need to store up to N elements-

        TIME COMPLEXITY

       O(1) constant
     */


    /*
    PROBLEM 5
    Problem 5: Implement Queue Using Stacks
    Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal
    queue (push, peek, pop, and empty).

    Implement the UNIT1.MyQueue class:

    void push(int x) Pushes element x to the back of the queue.
    int pop() Removes the element from the front of the queue and returns it.
    int peek() Returns the element at the front of the queue.
    boolean empty() Returns true if the queue is empty, false otherwise.
    Notes:

    You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.

    UNDERSTAND
    We are only using two stacks
    Operations can happen at any given time in any order

    MATCH
    We can only use two stacks to mimic a queue

    PLAN
    Push -- if both stacks are empty -into stack 1 until a different operation is request
         -- if only stack 1 is empty - do the reverse -- move items from stack 2 to stack 1
            push new item(s)

    Pop -- pop from stack 1 and push to stack 2
            when stack 1 is empty
                pop from stack 2
    Peek -- peek from stack 2

    empty -- if stack 2 is empty -- return true
          --else return false


     IMPLEMENT



     REVIEW
     tested for accuracy of for all methods

     EVALUATE
     SPACE COMPLEXITY
     O(N)

     TIME COMPLEXITY
     O(1) AS WE ARE ALWAYS GOING TO TOP OF STACK FOR PEEK AND POP, AS WELL AS IS EMPTY

     */




    //**********************SECTION 2 **********************************************************************************

    /*
    PROBLEM 1 IMPLEMENTATION
    Remove Duplicates from Sorted List (Linked list)
     */


    public static int singleNumber(List<Integer> list) {
        HashMap<Integer, Integer> set = new HashMap<>();
        int singleNum = 0;

        for(int i = 0; i < list.size(); i++) {
            if(set.containsValue(1))
                set.remove(list.get(i));
            else{
                set.put(list.get(i), 1);
                singleNum = i;
            }
        }

        return list.get(singleNum);


    }












    }








