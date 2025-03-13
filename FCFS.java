package scratch1;

import java.util.Scanner;
public class FCFS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of processes: ");
        int n = scanner.nextInt();
        Process[] processes = new Process[n];
// Input burst times and calculate waiting and turnaround times
        int totalWaitTime = 0, totalTurnAroundTime = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter burst time for process " + (i + 1) + ": ");
            int burstTime = scanner.nextInt();
            processes[i] = new Process(i + 1, burstTime);
            if (i > 0) {
                processes[i].waitingTime = processes[i - 1].waitingTime + processes[i - 1].burstTime;
            }
            processes[i].turnaroundTime = processes[i].waitingTime + processes[i].burstTime;
            totalWaitTime += processes[i].waitingTime;
            totalTurnAroundTime += processes[i].turnaroundTime;
        }
// Display results
        System.out.println("\nPID\tBurst Time\tWaiting Time\tTurnaround Time");
        for (Process p : processes) {
            System.out.println(p.id + "\t" + p.burstTime + "\t\t" + p.waitingTime + "\t\t" + p.turnaroundTime);
        }
// Display averages
        System.out.println("\nAverage Waiting Time: " + (totalWaitTime / (double) n));
        System.out.println("Average Turnaround Time: " + (totalTurnAroundTime / (double) n));
    }
}

