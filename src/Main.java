public class Main {
    public static void main(String[] args) {
        StoreOneA store = new StoreOneA(
            true, 
            100000, 
            12, 
            true
        );

        store.enterStoreDetails();

        store.showStoreInfo();

        System.out.println("\nFinal Monthly Payment: €" + store.calculateLoanFinancing());
    }
}