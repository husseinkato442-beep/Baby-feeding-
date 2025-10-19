package com.mycompany.babyfeeding;

public class BabyFeeding {
    public static void main(String[] args) {
        double porridge = 2.0; // liters
        double milk = 2.0; // liters
        double porridgeFeedAmount = 0.25; // 1/2 cup
        double milkFeedAmount = 0.50; // 1 full cup
        int totalTime = 0;

        // Time for porridge feeds
        while (porridge >= porridgeFeedAmount) {
            porridge -= porridgeFeedAmount;
            totalTime += 45; // 45 mins per feed
        }

        // Time for milk feeds
        while (milk >= milkFeedAmount) {
            milk -= milkFeedAmount;
            totalTime += 30; // 30 mins per feed
        }

        System.out.println("Total time for baby to finish both: " + totalTime + " minutes");
        int hours = totalTime / 60;
        int minutes = totalTime % 60;
        System.out.println("Which is: " + hours + " hour(s) and " + minutes + " minute(s)");
    }
}
