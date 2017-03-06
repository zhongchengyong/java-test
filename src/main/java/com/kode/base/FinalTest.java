package com.kode.base;

/**
 * finally都会执行，除非用了system.exit()
 * Created by zhongcy on 2017-03-06.
 */
public class FinalTest {
    public static void main(String[] args) {
        System.out.println(test());

    }

    private static int test() {
        try {
            System.out.println(1);
            return 1;
        }finally {
            System.exit(0);
            return 2;
        }
    }
}
