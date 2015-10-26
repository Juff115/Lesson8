import hsa.*;
public class TestRev1 {
    static Console c;
    
    public static void main(String[] args) {
        c =new Console();
        String ath[]= {"Bob", "Sue", "Joe", "Amy", "Fred", "Jack"};
        double times[][]={
            {18.2,19.1,18.5},
            {17.5},
            {21.5,21.1,20.5,19.5},
            {19.5,18.9},
            {15.6,17.8,19.2},
            {20.1}
        };
        stats(ath,times);
        //get an array of averages
        double avg[] = getAvg(times);
        //print the averages
        for (int x=0; x<avg.length; x++){
            c.print(ath[x]+"\t\t");
            c.println(avg[x]);
        }
    }
    
    public static void stats(String a[], double t[][]){
        //loop through four athletes
        for (int x =0; x<a.length; x++){
            c.print(a[x]+"\t");
            for(int y=0;y<t[x].length; y++ ){
                c.print(t[x][y]+"\t");
            }
            c.println("");
        }
    }
    
    public static double[] getAvg(double t[][]){
        double result[]= new double[t.length];
        //loop trhough each inner array to get average
        double total;
        for (int x=0; x<t.length; x++){
            total=0;
            for( int y=0; y<t[x].length; y++){
                total += t[x][y];
            }
            result[x]= total/ t[x].length;
        }
        return result;
    }
    
}
