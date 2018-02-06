import java.util.Scanner;

public class TBEPlaySolitaerMain
{
	static int iRecursionLevel = 0;
	static int iMaxRecLev = 0;
	
	static long lRecRunCnt = 0;
	static long lMaxRunCnt = 999999999;
	
	static long lLCount = 0;
	
	static Scanner si = new Scanner( System.in );

	public static void recursion( TBEBoard b, TBEJumpList l )
	{
	   iRecursionLevel++; lRecRunCnt++;
		    
	   // Display max achieved recursion level
	   if( iRecursionLevel > iMaxRecLev )
	   {      
	      iMaxRecLev = iRecursionLevel;
	      System.out.println( "Max Rec Level = " + iMaxRecLev + " at R-Cnt = " + lRecRunCnt );
	   }
	   
	   // Display any recursion level > 31
	   if( iRecursionLevel > 31 )
	   { 
		   b.showBoard();
		   l.showList();
		   System.out.println( "R-Level: " + iRecursionLevel + " / R-Num: " + lRecRunCnt );
		   prompt( " *** Continue *** ?" );
		   System.out.println();
	   }

	   
	   // Run thru all positions checking for possible a jump
	   for( int n=1; n<34; n++ )
	   {	
			//System.out.println( "R-Level: " + iRecursionLevel + " / R-Num: " + lRecRunCnt + " /P-Num: " + n);
			//b.showBoard();
			//prompt( " *** Continue *** ?" );
			//System.out.println();
		   
		   if( b.canJumpUp( n ) == true )
		   {
	    	  		if( lRecRunCnt > lMaxRunCnt )
	    	  		{	    	  	
	    	  			System.out.println( "R-Level: " + iRecursionLevel + " / R-Num: " + lRecRunCnt );
	   	  			b.showBoard();
	    	  			prompt( " --> jump up p(" + n + ") ?" );
	    	  		}

	    	  		b.JumpUp( n, l );
	    	  		recursion( b, l );
	    	  		b.ReverseJumpUp( n, l );
		   }

		   if( b.canJumpRight( n ) )
		   {
	   	  		if( lRecRunCnt > lMaxRunCnt )
	   	  		{	    	  	
	    	  			System.out.println( "R-Level: " + iRecursionLevel + " / R-Num: " + lRecRunCnt );
	   	  			b.showBoard();
	   	  			prompt( " --> jump right p(" + n + ") ?" );
	   	  		}
	   	  		
		        b.JumpRight( n, l );
		        recursion( b, l );
		        b.ReverseJumpRight( n, l );
		   }
	
		   if( b.canJumpDown( n ) ) 
		   {
	   	  		if( lRecRunCnt > lMaxRunCnt )
	   	  		{	    	  	
	   	  			System.out.println( "R-Level: " + iRecursionLevel + " / R-Num: " + lRecRunCnt );
	   	  			b.showBoard();
	   	  			prompt( " --> jump down p(" + n + ") ?" );
	   	  		}
	   	  		
		        b.JumpDown( n, l );
		        recursion( b, l );
		        b.ReverseJumpDown( n, l );
		   }
	
		   if( b.canJumpLeft( n ) )
		   {
	   	  		if( lRecRunCnt > lMaxRunCnt )
	   	  		{	    	  	
	   	  			System.out.println( "R-Level: " + iRecursionLevel + " / R-Num: " + lRecRunCnt );
	   	  			b.showBoard();
	   	  			prompt( " --> jump left p(" + n + ") ?" );
	   	  		}
	   	  		
		        b.JumpLeft( n, l );
		        recursion( b, l );
		        b.ReverseJumpLeft( n, l );
		   }
	   } // End For Loop

	   iRecursionLevel--;
	   
	   if( lRecRunCnt > lMaxRunCnt )
	   {	    	  	
		   b.showBoard();
		   prompt( "No jump found ! - return to R-Level: " + (iRecursionLevel) + " ?" );
	   }
	} // End Recursion

	public static void prompt( String sPromptText )
	{
	   String sText = sPromptText;
	   System.out.println( sText );
	   si.next();
	}
	
	public static void main( String args[] )
	{		
		TBEBoard b = new TBEBoard();
		TBEJumpList l = new TBEJumpList();   

		b.showBoard();
		prompt( " *** Run *** ?" );
		System.out.println();

		System.out.println( "Start Recursion" );    
		recursion( b, l );
		System.out.println( "Stop  Recursion" );
		
		b.showBoard();
		l.showList();

		System.out.println( "R-Level: " + iRecursionLevel + " / R-Num: " + lRecRunCnt );
		System.out.println( "Solution Count = " + lLCount );
		
		System.out.println(" *** END *** ");
		si.close();
	}
} // End Class TBEPlaySolitaerMain
