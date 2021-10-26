/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author camdu
 */
public class FactorsPrime {
    public int n;
    public FactorsPrime(){
        this.n = 0;
    }
    public FactorsPrime(int a){
        this.n=a;
    }
    public  List<Integer> FactorsPrime(int a) {
        int i = 2;
        List<Integer> listNumbers = new ArrayList<Integer>();
        // Analytical process
        while (a > 1) {
            if (a % i == 0) {
                a = a / i;
                listNumbers.add(i);
            } else {
                i++;
            }}
        // if listNumbers is empty then add n to listNumbers
        if (listNumbers.isEmpty()) {
            listNumbers.add(n);
        }
        return listNumbers;
    }
    public static void main(String[] args){
        FactorsPrime  p = new FactorsPrime();
        // Array
        System.out.println(p.FactorsPrime(100));
        //
        int size = p.FactorsPrime(100).size();
        for (int i = 0; i < size - 1; i++) {
            System.out.print(p.FactorsPrime(100).get(i) + " x ");
        }
        System.out.print(p.FactorsPrime(100).get(size - 1));
    }
}
