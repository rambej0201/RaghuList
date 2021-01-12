package com.rss;

import java.util.HashMap;

public class PuttingAgeGroupObjects {
    public static class People{
        String name;
        int age;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public People(String n, int a) {
            this.name = n;
            this.age = a;
        }
    }

    public People ageTwentyToThirty(People p){
        if(p != null){
         for (People i : p.keySet()) {
             if (i.getAge() >= 20 && i.getAge() <= 30) {
                 return i;
             }
         }
        }else {
            return null;
        }
        return null;
    }



    public static void main(String[] args) {

        People p1 = new People("AndresRocky", 45);
        People p11 = new People("RockyCarlos", 28);
        People p22 = new People("RockyEnrique", 34);
        People p33 = new People("LimonRockyLimon", 87);
        People p44 = new People("ElRocky", 38);

        HashMap<People, Integer> testOne = new HashMap<People, Integer>();

        testOne.put(p1, p1.getAge());
        testOne.put(p33, p33.getAge());
        testOne.put(p44, p44.getAge());

        PuttingAgeGroupObjects pago = new PuttingAgeGroupObjects();
        People pin = pago.ageTwentyToThirty(p11);





    }

}
