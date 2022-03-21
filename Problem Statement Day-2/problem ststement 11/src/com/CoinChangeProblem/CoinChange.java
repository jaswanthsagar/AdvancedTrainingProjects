package com.CoinChangeProblem;

import java.util.Scanner;
import java.util.Vector;
	  
public class CoinChange {
	static int arr[] = {1,2,5,10,20,50,100,500,2000};
    static int n = arr.length;

    static void findMin(int V)
    {
    	int count=0;
        Vector<Integer> ans = new Vector<>();
  
        for (int i = n - 1; i >= 0; i--)
        {
            while (V >= arr[i]) 
            {
                V -= arr[i];
                ans.add(arr[i]);
                count++;

            }
        }
        System.out.print(count+". Break Down-");
        for (int i = 0; i < ans.size(); i++)
        {
            System.out.print(
                " Rs." + ans.elementAt(i)+"*1");
            if(i<1) {
            	System.out.print(" +");
            }
        }
    }
  
    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        findMin(n);
    }
	  
	  
	}
