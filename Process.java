package scratch1;

public class Process {
    public int waitingTime;
    public int turnaroundTime;
    int id, burstTime, remainingTime,priority;

    public Process(int id, int burstTime) {
        this.id = id;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
    }

    public Process(int id, int burstTime, int priority) {
        this.id = id;
        this.burstTime = burstTime;
        this.priority = priority;
    }
}
