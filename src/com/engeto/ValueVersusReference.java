package com.engeto;

    public class ValueVersusReference {

        public static void main(String[] args) {
            int i = 0;
            Account j = new Account("acc1", 100.0);
            test(i,j);
            System.out.println(i + " " + j.balance());
        }

        public static void test(int primitive, Account object){
            primitive++;
            object.deposit(100);

        }
    }

