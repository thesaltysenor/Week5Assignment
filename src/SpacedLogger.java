public class SpacedLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println(spacedString(message));
    }


    @Override
    public void error(String message) {
        System.out.println("ERROR: " + spacedString(message));
    }

    private String spacedString(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            output.append(input.charAt(i)).append(" ");
        }
        return output.toString();
    }
}
