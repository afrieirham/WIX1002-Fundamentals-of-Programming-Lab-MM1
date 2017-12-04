///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package lab7;
//
//import java.util.Random;
//
///**
// *
// * @author pensyarah
// */
//public class Number {
//    
//    private int[] num;
//    private int size;
//    private final int MAX = 100;
//    
//    public Number(){
//        size = 10;
//        num = new int[size];
//        Random g = new Random();
//        for(int i = 0; i < size; i++){
//            num[i] = g.nextInt(MAX);
//        }
//    }
//    
//    public Number(int n){
//        size = n;
//        num = new int[size];
//        Random g = new Random();
//        for(int i = 0; i < size; i++){
//            num[i] = g.nextInt(MAX);
//        }
//    }
//    
//    public Number(int n, int r){
//        size = n;
//        num = new int[size];
//        Random g = new Random();
//        for(int i = 0; i < size; i++){
//            num[i] = g.nextInt(r);
//        }
//    }
//    
//    public void output(){
//        System.out.print("The array items are: ");
//        for(int i = 0; i<size; i++){
//            System.out.print(num[i] + " ");
//        }
//        
//        System.out.println();
//        System.out.print("Even numbers: ");
//        for(int i = 0; i<size; i++){
//            if(isEven(num[i])){
//                System.out.print(num[i] + " ");
//            }
//        }
//        
//        System.out.println();
//        System.out.print("Prime numbers: ");
//        for(int i = 0; i<size; i++){
//            if(isPrime(num[i])){
//                System.out.print(num[i] + " ");
//            }
//        }
//        
//        System.out.println();
//        System.out.println("Maximum number: " + getMax(num));
//        System.out.println("Minimum number: " + getMin(num));
//        System.out.println("Average number: " + getAverage(num));
//        
//        System.out.print("Square numbers: ");
//        for(int i = 0; i<size; i++){
//            if(isSquare(num[i])){
//                System.out.print(num[i] + " ");
//            }
//        }
//        
//    }
//    
//}
