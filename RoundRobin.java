package scratch1;

import java.util.LinkedList;
import java.util.Queue;

public class RoundRobin {
    public static void roundRobin(Process[] processes, int timeQuantum) {
        Queue<Process> queue = new LinkedList<>();

        // Add processes to the queue using a normal for loop
        for (int i = 0; i < processes.length; i++) {
            queue.add(processes[i]);
        }

        int currentTime = 0;

        while (!queue.isEmpty()) {
            Process p = queue.poll();
            int execTime = Math.min(p.remainingTime, timeQuantum);
            currentTime += execTime;
            p.remainingTime -= execTime;

            if (p.remainingTime > 0) {
                queue.add(p); // Add unfinished process back to the queue
            }
            else {
                System.out.println("Process " + p.id + " finished at time " + currentTime);
            }
        }
    }

    public static void main(String[] args) {
        Process[] processes = { new Process(1, 10),
                                new Process(2, 5),
                                new Process(3, 8) };
        int timeQuantum = 4;
        roundRobin(processes, timeQuantum);
    }
}
