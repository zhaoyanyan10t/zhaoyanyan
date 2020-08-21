package lesson2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest {
    public static void main(String[] args) {
        ExecutorService pool=Executors.newSingleThreadExecutor();
    }
}
