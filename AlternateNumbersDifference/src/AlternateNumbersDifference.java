import java.util.Scanner;
import java.lang.Math;
//Againnnnn
public class AlternateNumbersDifference {
	public static void main(String[] args) {
		int n1=30;
        int n2=1;
        Scanner sc=new Scanner(System.in);
        int a[]=new int[9];
        System.out.println("Enter the array size");
        int size=sc.nextInt();
        if(size<5||size>10)
        {
            System.out.println("Invalid array size");
            return;
        }
        System.out.println("Enter the array elements");
        for(int i=0;i<size;i++)
        {
             a[i]=sc.nextInt();
        }
        int x[]=new int[10];
        int max=x[0];
        for(int i=0;i<size;i++)
        {
            if(i+2<size){
            x[i]=Math.abs(a[i]-a[i+2]);
            if(x[i]>max){
            max=x[i];
             n1=a[i];
             n2=a[i+2];}
            }

            else
            continue;
        }
        int min=0;

            if(n1>n2)
            min=n2;
            else
            min=n1;
            

        for(int i=0;i<size;i++)
        {
            if(a[i]==min){
            System.out.println(i);
            break;}
        }

	}

}

 Editted in git36


//this alternate number difference program

//difference between numbers


