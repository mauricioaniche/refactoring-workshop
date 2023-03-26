package puzzle;

public class PuzzleRunner {

	private PuzzleSolver puzzleSolver;
	private PuzzleOutput puzzleOutput;

	public PuzzleRunner(PuzzleSolver puzzleSolver, PuzzleOutput puzzleOutput) {
		this.puzzleSolver = puzzleSolver;
		this.puzzleOutput = puzzleOutput;
	}

	public void solve(int input, int output) {
		Number solution = puzzleSolver.generatePath(input, output);
		puzzleOutput.formatOutput(solution);
	}
}
