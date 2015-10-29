import hsa.*;
public class TestPractice {

   
    public static void main(String[] args) {
        Console c= new Console();
        String survey[][]= {
            {"Bob","C"},
            {"Sue","C"},
            {"Joe","V"},
            {"Amy","S"},
            {"Greg","S"},
            {"Tom","C"},
            {"Jack","C"},
        };
        String cpeople[]= countFlavour(survey, "C");
        String vpeople[]= countFlavour(survey, "V");
        String speople[]= countFlavour(survey, "S");
        c.println("Here are the survey result: ");
        c.println("Chocolate\n============");
        for(int x=0; x<cpeople.length;x++){
            c.println(cpeople[x]);
        }
        c.println("------------");
        c.println("Vanilla\n============");
        for(int x=0; x<vpeople.length;x++){
            c.println(vpeople[x]);
        }
        c.println("------------");
        c.println("Strawberry\n============");
        for(int x=0; x<speople.length;x++){
            c.println(speople[x]);
        }
    }
    
    public static String[] countFlavour(String d[][], String f){
        //forst step count how big the array needs to be
        int count=0;
        for (int x=0; x< d.length; x++){
            if(d[x][1].equals(f)) count++;
        }
        //creat name array
        String names[]= new String[count];
        //go through again and build list of names
        count=0;
        for (int x=0; x< d.length; x++){
            if(d[x][1].equals(f)){
                //add the name to the list
                names[count]=d[x][0];
                count++;//go to next location
            }
        }
        return names;
    }
}
