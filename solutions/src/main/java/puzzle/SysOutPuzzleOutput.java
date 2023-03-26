package puzzle;

public class SysOutPuzzleOutput implements PuzzleOutput {

	@Override
	public void formatOutput(Number solution) {
		String output = "";
		while(solution!=null) {
			output = solution.getValue() + " " + output;
			solution = solution.getParent();
		}
		System.out.println(output);
	}
}
