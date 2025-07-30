package Lab1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Lab1Solution{
    public static void main(String[] args) throws Exception{
        
        Scanner scanner = new Scanner(System.in);
        Queue<Caller> queue = new LinkedList<>();

        addCallers(queue);

        while(!queue.isEmpty()){
            printQueueSize(queue,scanner);
            
            if(queue.peek().isOnHold==false){
                customerHungUp(queue);
            }
            else{
                customerServed(queue);
            }
        }

    }

    static void addCallers(Queue<Caller> queue){
        queue.offer(new Caller(9253817));
        queue.offer(new Caller(9589388));
        queue.offer(new Caller(9318492, "Aveshal", "I Would Like To Speak To Your Manager   "));
        queue.offer(new Caller(2293013));
        queue.offer(new Caller(7438293, "Ashilta", "Hello World"));

    }

    static void printQueueSize(Queue<Caller> queue, Scanner scanner){
        System.out.println("The Line Currently Has "+queue.size()+" Customer(s) on Hold");
        System.out.print("Press Enter To Serve Customer: ");
        scanner.nextLine();
    }

    static void customerHungUp(Queue<Caller> queue) throws Exception{
        System.out.println("Sorry The Customer You Are Trying to Serve Has Hung Up");
                Thread.sleep(3000);
                System.out.println();
                System.out.println(queue.peek());
                queue.poll();
                Thread.sleep(3000);
                System.out.println();
    }

    static void customerServed(Queue<Caller> queue) throws Exception{
        System.out.println("Customer is Being Served :)...");
        Thread.sleep(3000);
        queue.poll();
        System.out.println("Cutomer Served!");
        Thread.sleep(1000);
        System.out.println();
    }


}