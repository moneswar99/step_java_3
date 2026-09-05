package session1.assignment_1;

public class WarehouseInventoryBalancer {

    static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0, totalB = 0;

        int maxValue = sectionA[0];
        String maxSection = "Section A";
        int maxIndex = 0;

        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
            if (sectionA[i] > maxValue) {
                maxValue = sectionA[i];
                maxSection = "Section A";
                maxIndex = i;
            }
        }

        for (int i = 0; i < sectionB.length; i++) {
            totalB += sectionB[i];
            if (sectionB[i] > maxValue) {
                maxValue = sectionB[i];
                maxSection = "Section B";
                maxIndex = i;
            }
        }

        String status = (totalA == totalB) ? "Balanced" : "Not Balanced";

        System.out.printf(
                "Section A Total: %d | Section B Total: %d | Status: %s | Highest Quantity: %d (%s, Item %d)%n",
                totalA, totalB, status, maxValue, maxSection, maxIndex + 1);
    }

    public static void main(String[] args) {
        analyzeInventory(new int[] { 20, 15, 30 }, new int[] { 25, 10, 30 });
    }
}