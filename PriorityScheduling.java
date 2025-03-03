package scratch1;

import java.util.Arrays;
import java.util.Scanner;

public class PriorityScheduling {
    // Function to perform Priority Scheduling
    public static void scheduleProcesses(Process[] processes) {
        Arrays.sort(processes, (a, b) -> a.priority - b.priority); // Sort by priority
        int currentTime = 0;
        System.out.println("\nProcess\tPriority\tBurst Time\tWaiting Time\tTurnaround Time");
        for (Process p : processes)
        {
            p.waitingTime = currentTime;
            p.turnaroundTime = currentTime + p.burstTime;
            currentTime += p.burstTime;
            System.out.println("P" + p.id + "\t\t" + p.priority + "\t\t" + p.burstTime +
                    "\t\t" + p.waitingTime + "\t\t" + p.turnaroundTime);
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // Input number of processes
        System.out.print("Enter number of processes: ");
        int n = scanner.nextInt();
        Process[] processes = new Process[n];
        // Input burst time & priority
        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter burst time & priority for process " + (i + 1) + ": ");
            processes[i] = new Process(i + 1, scanner.nextInt(), scanner.nextInt());
        }// Call function to schedule processes
        scheduleProcesses(processes);
        scanner.close();
    }
}