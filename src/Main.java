public class Main {
    public static void main(String[] args) {
        // Fake Exchange Class to replace the NYSE class
        class FakeExchange implements Exchange {
            @Override
            public float rate(String origin, String target) {
                return 0.85f;
            }
        }

        // Unit Test for Cash class

        // Test setup
        Exchange exchange = new FakeExchange();
        Cash dollar = new Cash(exchange, 100);
        System.out.println("Dollar: " + dollar.toString());


        // Test 'in' method of Cash
        Cash euro = dollar.in("Euro");
        System.out.println("Dollar to Euro: " + euro.toString());
    }
}