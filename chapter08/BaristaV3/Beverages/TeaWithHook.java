package BaristaV3.Beverages;

import BaristaV3.TemplateMethod.CaffeineBeverageWithHook;

public class TeaWithHook extends CaffeineBeverageWithHook {
    public void brew() {
        System.out.println("Steeping the tea");
    }

    public void addCondiments() {
        System.out.println("Adding lemon");
    }

    public boolean customerWantsCondiments() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;

        System.out.print("Would you like lemon with your tea (y/n)? ");

        try {
            java.io.BufferedReader in = new java.io.BufferedReader(
                    new java.io.InputStreamReader(System.in));
            answer = in.readLine();
        } catch (java.io.IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }

        if (answer == null) {
            return "no";
        }
        return answer;
    }

}
