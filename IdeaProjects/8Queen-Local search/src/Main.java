/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        State solution = Main.greedy_hill_climbing(5);
        System.out.println(solution);
    }

    public static State greedy_hill_climbing(int n) {

        State.initializeProblem(n);

        State currentState = State.get_random_state();
        int currentObjVal = currentState.objective_function();

        while (true) {
            System.out.println("current state : " + currentState);
            System.out.println("current obj value : " + currentObjVal);

            if (currentObjVal == 0) {
                break;
            }

            State bestSuccessor = currentState.get_best_successor();
            int successorVal = bestSuccessor.objective_function();

            if (currentObjVal <= successorVal) {
                currentObjVal = successorVal;

            }

        }

        return currentState;
    }

}
