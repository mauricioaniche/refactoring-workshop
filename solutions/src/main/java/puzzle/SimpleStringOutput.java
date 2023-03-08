package puzzle;

public class SimpleStringOutput implements PuzzleOutput {
    @Override
    public String generate(Number number) {
        String output = "";
        while(number!=null) {
            output = number.getValue() + " " + output;
            number = number.getParent();
        }
        return output;
    }
}
