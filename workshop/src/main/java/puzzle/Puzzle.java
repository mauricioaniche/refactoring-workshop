package puzzle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Puzzle {

    private int input;
    private int output;

    private List<Number> queue;
    private Set<Integer> visited;

    public Puzzle() {
        this.queue = new ArrayList<>();
        this.visited = new HashSet<>();
    }

    public void generatePath(int input, int output) {
        this.input = input;
        this.output = output;

        formatOutput(searchForSolution());
    }

    private Number searchForSolution() {

        addRootToTheQueue();

        while(thereAreNumbersInTheQueue()) {
            Number currentNumber = removeFromTheQueue();

            if(foundTheOutput(currentNumber)) return currentNumber;
            addToQueue(
                    multiplyByTwo(currentNumber),
                    (isEven(currentNumber)? divideByTwo(currentNumber) : null),
                    plusTwo(currentNumber)
            );
        }

        return null;
    }

    private boolean isEven(Number number) {
        return number.getValue()%2==0;
    }

    private boolean foundTheOutput(Number number) {
        return number.getValue() == output;
    }

    private boolean thereAreNumbersInTheQueue() {
        return queue.size()!=0;
    }

    private void addRootToTheQueue() {
        queue.add(new Number(input, null));
    }

    private void addToQueue(Number... numbers) {
        for(Number number : numbers) {
            if(number !=null) {
                if(!visited.contains(number.getValue())) {
                    queue.add(number);
                    visited.add(number.getValue());
                }
            }
        }
    }

    private void formatOutput(Number solution) {
        String output = "";
        while(solution!=null) {
            output = solution.getValue() + " " + output;
            solution = solution.getParent();
        }
        System.out.println(output);
    }

    private Number multiplyByTwo(Number number) {
        return new Number(number.getValue()*2, number);
    }

    private Number divideByTwo(Number number) {
        return new Number(number.getValue()/2, number);
    }

    private Number plusTwo(Number number) {
        return new Number(number.getValue()+2, number);
    }

    private Number removeFromTheQueue() {
        Number head = queue.get(0);
        queue.remove(0);
        return head;
    }


}