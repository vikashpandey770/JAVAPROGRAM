
public class StringBufferss {

	public static void main(String[] args) {
		
		long startTime=System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("top");
		for(int i=1;i<=100000;i++) {
		sb.append("nikol");
	
		}
		
		System.out.println("Time take by string buffer "+(System.currentTimeMillis()-startTime)+"ms");
		startTime = System.currentTimeMillis();
		StringBuilder sbul=new StringBuilder("tops");
		sbul.append("nikol");
	
		System.out.println("Time take by string buffer "+(System.currentTimeMillis()-startTime)+"ms");

}
}
