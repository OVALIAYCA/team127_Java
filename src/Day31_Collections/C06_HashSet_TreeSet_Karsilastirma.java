package Day31_Collections;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C06_HashSet_TreeSet_Karsilastirma {

    public static void main(String[] args) {

        //Bir HashSet ve TreeSet olusturun. Bir loop ile bu set’lere
        // element ekleyip sureleri karsilastirin.

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        Random rnd = new Random();


        long hashSetBaslangic = LocalTime.now().toNanoOfDay();
        for (int i = 0; i < 100000 ; i++) {

            hashSet.add(rnd.nextInt(1000));

        }
        long hashSetBitis = LocalTime.now().toNanoOfDay();

        System.out.println("HashSet işlem süresi : " + (hashSetBitis-hashSetBaslangic));



        long treeSetBaslangic = LocalTime.now().toNanoOfDay();
        for (int i = 0; i < 100000 ; i++) {

            treeSet.add(rnd.nextInt(1000));

        }
        long treeSetBitis = LocalTime.now().toNanoOfDay();

        System.out.println("TreeSet işlem süresi : " + (treeSetBitis-treeSetBaslangic));


    }
}
