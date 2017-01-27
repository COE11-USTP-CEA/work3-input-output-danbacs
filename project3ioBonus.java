import java.io.*;

class project3ioBonus{
    public static void main(String[]args){
        System.out.println("Hello Guys!");
	InputStreamReader d = new InputStreamReader(System.in);
	BufferedReader b = new BufferedReader (d);
	System.out.println("Enter height of the Triangle:");
	double height =0.0
	try{
	    height=Integer.valueof(b.readLine());
	}
	catch(Exception p){
	    System.out.println("Invalid number!")
			
	}
	for(int w=1; w<=height; w++){
	    for(int z=1; z<height -(w-1); z++){
		System.out.print(" ");
	    }
	    for(int v=1; v<=w; v++){
		System.out.print("*");
		for(int d1=1; d1<v; d1+=v){
		System.out.print("*");
		}
	    }
	    System.out.println("");
	}
    }
}
