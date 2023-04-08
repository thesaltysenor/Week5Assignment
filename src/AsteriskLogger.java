public class AsteriskLogger implements Logger {
        @Override
        public void log(String message) {
            System.out.println("***" + message + "***");
        }

        @Override
        public void error(String message) {
            String border = "****************";
            System.out.println(border);
            System.out.println("***Error: " + message + "***");
            System.out.println(border);
        }
}
