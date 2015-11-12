import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Assignment7 {
	static SudokuSquareLinkedList list = null;
	
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		SudokuGUI framer = new SudokuGUI("SDK Board");
		framer.setVisible(true);
	    String fileName = "starter.txt";
	    String line = null;
	    try {
	    	FileReader fr = new FileReader(fileName);
	        BufferedReader br = new BufferedReader(fr);
	        //line = br.readLine();
	        //new StringTokenizer(line, " ");
	        int i = 0;
	        while((line = br.readLine())!=null) {
	        	StringTokenizer str = new StringTokenizer(line, "	");
	        	while(str.hasMoreElements()) {
	        		if(i==0) {
	        			String m = str.nextElement().toString();
	        			int a = Integer.parseInt(m);
	        			String v = str.nextElement().toString();
	        			int b = Integer.parseInt(v);
	        			String l = str.nextElement().toString(); 
	        			int c = Integer.parseInt(l);
	        			list = new SudokuSquareLinkedList(new SudokuSquareNode(new SudokuSquare(a, b, c, true)));
	        			i++;
	        		}else{
	        			String m = str.nextElement().toString();
	        			int a = Integer.parseInt(m);
	        			String v = str.nextElement().toString();
	        			int b = Integer.parseInt(v);
	        			String l = str.nextElement().toString(); 
	        			int c = Integer.parseInt(l);
	        			list.append(new SudokuSquareNode(new SudokuSquare(a, b, c, true)));
	        		}
	        	}
	            //line = br.readLine();   
	        }    
	           br.close();            
	      }catch(IOException ex) {
	        	System.out.println("This File is bad, needs fixing! IOE exception!");
	      }catch(Exception e) {                   
	        	System.out.println("Your program is causing an exception!");
	      }
	    SudokuBoard sb = new SudokuBoard(list);
	}
}