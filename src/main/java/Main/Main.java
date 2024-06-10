package Main;

import dataStructure.Stack;

public class Main {

    public static void main(String[] args){

        int[] numeros = {5,4,3,2,1};

        inverter(numeros);
        

    }

    private static void inverter(int[] numeros) {
        Stack stack = new Stack(numeros[0]);

        for (int i = 1; i < numeros.length; i++) {
            stack.push(numeros[i]);

        }
        var node = stack.pop();
        while(node != null){
            System.out.println(node.getValue());
            node = stack.pop();
        }
    }
}
