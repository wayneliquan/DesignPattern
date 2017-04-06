package com.wayne.singleton;

public class Singleton {

    private static Singleton uniqueInstance;

    /**
     * 私有的构造方法。不对外提供实例化。
     */
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

}
