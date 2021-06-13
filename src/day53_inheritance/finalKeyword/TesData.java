package day53_inheritance.finalKeyword;

/**
 * TestData class that
 */

public final class TesData {
    public static final String ADMIN_USERNAME = "admin";
    public static final String ADMIN_PASSWORD = "password123";
    public static final int MAX_WAIT_TIME = 60;
    public static final boolean STOP_IF_FAIL = true;
}
/*
ERROR: Cannot inherit from final class
 */
//class Child extends TesData () {
//
//        }