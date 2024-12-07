package String_Builder;

public class Ensurecapacity_Practice_StringBuffer_Stringbuilder {
	
	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder ("ka");
	System.out.println(	sb.capacity());
	//capacity = default value + lenghth of string
	// in this example (16+2)=18 is output
	
	
	sb.ensureCapacity(40);    // EnsureCapacity= {2( old capacity)+2 },
	//if the calculation is less than given then it will take given one (in this case it is 40)
	//output: capacity=18, EnsureCapacity=40(18*2+2=38<40), so output is 40.
	
	System.out.println(sb.capacity());
		
		
	}

}
