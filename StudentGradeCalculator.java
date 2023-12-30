import java.util.Scanner;
class StudentGradeCalculator{
    public static void main(String args[]){
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of subjects:");
        int n=sc.nextInt();
      for(int i=0;i<n;i++){
        System.out.println("Enter Subject name:");  
            String subject_name=sc.next();
        System.out.println("Enter marks of the subject " + subject_name + ":");
            int subject_mark=sc.nextInt();
            sum=sum + subject_mark ;
        }
        System.out.println("Total marks:" + sum);
        int q=sum/n;
        System.out.println("Average percentage:" + q);
        if(q>=85){
            System.out.println("Grade:A");}
        else if(q>=70){
            System.out.println("Grade:B");}
        else if(q>=55){
            System.out.println("Grade:C");}
        else if(q>=35){
            System.out.println("Grade:D");}
        else if(q>=25){
            System.out.println("Grade:E");}
       else{
           System.out.println("Grade:F");}
    }
}