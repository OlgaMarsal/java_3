package lesson_seven_java_three_reflection;

import myTesting.TestsHandler;

public class Main {
    public static void main(String[] args) {
        ClassForTesting classForTesting = new ClassForTesting();
        TestsHandler.start(classForTesting.getClass());
    }
}