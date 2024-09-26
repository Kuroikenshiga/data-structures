package org.example;

public class Main {
    public static void main(String[] args) {
        Stack<Integer>nums = new Stack<>();
        nums.push(1);
        nums.push(2);
        nums.push(3);

        while(true){
            Integer i = nums.pop();
            if(i == null){
                break;
            }
            System.out.println(i);
        }
    }
}