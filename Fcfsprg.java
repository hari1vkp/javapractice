package scratch1;

import java.util.Arrays;
import java.util.Scanner;

public class Fcfsprg {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enterno of jobs");
        int n = scan.nextInt();
        Jobs[]jobs=new Jobs[n];
        for (int i = 0; i <n; i++) {
            System.out.println("enter arival time:"+(i+1));
            int arivalt= scan.nextInt();
            System.out.println("enter burst:"+(i+1));
            int burstt= scan.nextInt();
            jobs[i]=new Jobs(burstt,arivalt,i);
        }
        Arrays.sort(jobs,(job1,job2)->job1.at-job2.at);
        int current=0;
        for (Jobs job:jobs){
            if (current< job.at){
                current= job.at;

            }
            System.out.println("job "+job.id+" startat "+current+" finishat "+(current+ job.at));
            current+= job.at;
        }


    }
}
