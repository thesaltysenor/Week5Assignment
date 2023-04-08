public class App {
    public static void main(String[] args) {
        Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();

        // Testing AsteriskLogger
        System.out.println("AsteriskLogger");
        asteriskLogger.log("Hello");
        asteriskLogger.error("Galaxy");

        //This is to separate a line on the console so you don't blend
        System.out.println();

        // Testing SpacedLogger
        System.out.println("SpacedLogger");
        spacedLogger.log("Goodbye");
        spacedLogger.error("Universe");
    }
}
