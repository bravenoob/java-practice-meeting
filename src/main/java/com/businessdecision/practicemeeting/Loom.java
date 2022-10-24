package com.businessdecision.practicemeeting;

import jdk.incubator.concurrent.StructuredTaskScope;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Loom {


    public static void main(String[] args) {
        executorService();
        //structuredTaskScope(); structuredTaskScope does not exisit??
        System.out.println(getDetails());
        System.out.println(authenticateAndPlaceOrder());
    }

    public static void executorService() {
        System.out.println("Before ExecutorService");
        try (ExecutorService es = Executors.newVirtualThreadPerTaskExecutor()) {
            es.submit(() -> {
                try {
                    Thread.sleep(1000);
                    System.out.println("Finishing first task");
                } catch (InterruptedException e) {
                    throw new RuntimeException("Error when sleeping virtual thread");
                }
            });
            es.submit(() -> System.out.println("Finishing second task"));
        }
        System.out.println("After ExecutorService");
    }

    public static Integer structuredTaskScope() {
        System.out.println("Starting StructuredTaskScope");
        try (var scope = new StructuredTaskScope<Integer>()) {
            var startTime = System.currentTimeMillis();

            var getFirstResult = scope.fork(() -> {
                Thread.sleep(1000);
                return 400;
            });

            var getSecondResult = scope.fork(() -> {
                Thread.sleep(2000);
                return 20;
            });

            scope.join();

            var totalTime = System.currentTimeMillis() - startTime;

            System.out.println("Took " + totalTime + " ms");

            return getFirstResult.resultNow() + getSecondResult.resultNow();
        } catch (InterruptedException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static String getDetails() {
        try (var executorService = Executors.newVirtualThreadPerTaskExecutor()) {
            var user = executorService.submit(Loom::getUser);
            var phone = executorService.submit(Loom::getPhone);
            return user.get() + " - " + phone.get();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private static String getUser() {
        try (var executorService = Executors.newVirtualThreadPerTaskExecutor()) {
            var user = executorService.submit(() -> {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
                return "Bruno";
            });
            return user.get();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private static String getPhone() {
        try (var executorService = Executors.newVirtualThreadPerTaskExecutor()) {
            var phone = executorService.submit(() -> {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
                return "(51)12345-6789";
            });
            return phone.get();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static String authenticateAndPlaceOrder() {
        var auth = authenticate();
        var orderTotal = placeOrder(auth);
        return auth + " spent " + orderTotal + " USD";
    }

    private static String authenticate() {
        try (var es = Executors.newVirtualThreadPerTaskExecutor()) {
            var authResult = es.submit(() -> {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
                var chance = new Random().nextDouble();
                if (chance > 0.5) {
                    throw new IllegalStateException("Forbidden");
                }
                return "User1";
            });
            return authResult.get();
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static Double placeOrder(String auth) {
        try (var es = Executors.newVirtualThreadPerTaskExecutor()) {
            var total = es.submit(() -> {
                try {
                    Thread.sleep(666);
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
                return new Random().nextDouble() * 1000.0;
            });
            return total.get();
        } catch (ExecutionException | InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }

}
