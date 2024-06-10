package Main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class FilaDeAtendimento {

    public static void main(String[] args) {
        int n = 5; // Quantidade de clientes que eu posso ter na minha fila
        Random random = new Random(); // Adicionado ponto e vírgula
        Queue<Integer> queue = new LinkedList<>(); // Utilizando LinkedList como implementação de Queue

        // Simula a chegada dos clientes
        for (int i = 1; i <= n; i++) { // Corrigido o índice para começar de 1
            int cliente = random.nextInt(101); // Cliente vai ser um número gerado de 0 a 100
            System.out.println("Chegou o cliente: " + cliente);
            queue.add(cliente); // Utilizando add para inserir na fila
        }

        // Atendimento dos clientes
        Integer clienteAtendido = queue.poll(); // Utilizando poll para remover o primeiro elemento da fila
        while (clienteAtendido != null) {
            System.out.println("Atendido o cliente: " + clienteAtendido);
            clienteAtendido = queue.poll(); // Removendo o próximo cliente da fila
        }
    }
}
