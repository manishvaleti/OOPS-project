import java.io.*;
import java.util.*;
public class theatre {
void reader(String a)throws IOException {
	try {
		FileReader in=new FileReader(a);
		int i;
		while((i=in.read())!=-1) {
			System.out.print((char)i);
		}
		in.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}		
}

void screen(int b) {
	int arr[][]=new int[20][20];
	int a=65;
	System.out.print("   ");
	for(int i=1;i<=20;i++)
	{
		System.out.printf("%-2s ",String.valueOf(i));
	}
	System.out.println(" ");
	for(int i=0;i<20;i++)
	{
		System.out.print((char)a);
		for(int j=0;j<20;j++)
		{
			System.out.print("  "+arr[i][j]);
		}
		a++;
		System.out.println(" ");
	}
}

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		String movies[]= {"movie1","movie2","movie3"};
		for(String movie:movies) {
			System.out.print(movie+" ");
		}
		System.out.println();
		System.out.println("Enter the Name of the movie:");
		String input1=new String();
		input1=sc.nextLine();
		String timings[]= {"Morning show","Matnee","First Show","Second Show"};
		for(String timing:timings) {
			System.out.print(timing+" ");
		}
		System.out.println();
		System.out.println("Enter the show timings");
		String input2=new String();
		input2=sc.nextLine();
		System.out.println("Numbers of tickets");
		System.out.println("1  2  3  4  5");
		int tickets=sc.nextInt();
		System.out.println("All the sets depicted by 0 are available and 1 are filled.\n");
		if(input1.equalsIgnoreCase("movie1") && input2.equalsIgnoreCase("Morning Show")) {
			theatre screen1=new theatre();
			//screen1.reader("F:\\Java\\Java project\\Screen1.txt");
			screen1.screen(1);
		}
		else if(input1.equalsIgnoreCase("movie1") && input2.equalsIgnoreCase("Matnee")) {
			
		}
		
		

	}

}
