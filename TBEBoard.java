//Begin Class Board
public class TBEBoard
{
	public TBEPosition[] aBoard = new TBEPosition[34];
	
	public TBEBoard()
	{
	 aBoard[ 0] = new TBEPosition( false,  0,  0,  0,  0,  0,  0,  0,  0 );
	
	
	 aBoard[ 1] = new TBEPosition( true,   0,  2,  4,  0,  0,  3,  9,  0 );
	 aBoard[ 2] = new TBEPosition( true,   0,  3,  5,  1,  0,  0, 10,  0 );
	 aBoard[ 3] = new TBEPosition( true,   0,  0,  6,  2,  0,  0, 11,  1 ); 
	
	 aBoard[ 4] = new TBEPosition( true,   1,  5,  9,  0,  0,  6, 16,  0 );
	 aBoard[ 5] = new TBEPosition( true,   2,  6, 10,  4,  0,  0, 17,  0 );
	 aBoard[ 6] = new TBEPosition( true,   3,  0, 11,  5,  0,  0, 18,  4 );
	
	 aBoard[ 7] = new TBEPosition( true,   0,  8, 14,  0,  0,  9, 21,  0 );
	 aBoard[ 8] = new TBEPosition( true,   0,  9, 15,  7,  0, 10, 22,  0 );
	 aBoard[ 9] = new TBEPosition( true,   4, 10, 16,  8,  1, 11, 23,  7 );
	 aBoard[10] = new TBEPosition( true,   5, 11, 17,  9,  2, 12, 24,  8 );
	 aBoard[11] = new TBEPosition( true,   6, 12, 18, 10,  3, 13, 25,  9 );
	 aBoard[12] = new TBEPosition( true,   0, 13, 19, 11,  0,  0, 26, 10 );
	 aBoard[13] = new TBEPosition( true,   0,  0, 20, 12,  0,  0, 27, 11 );
	
	 aBoard[14] = new TBEPosition( true,   7, 15, 21,  0,  0, 16,  0,  0 );
	 aBoard[15] = new TBEPosition( true,   8, 16, 22, 14,  0, 17,  0,  0 );
	 aBoard[16] = new TBEPosition( true,   9, 17, 23, 15,  4, 18, 28, 14 );
	 aBoard[17] = new TBEPosition( false, 10, 18, 24, 16,  5, 19, 29, 15 );
	 aBoard[18] = new TBEPosition( true,  11, 19, 25, 17,  6, 20, 30, 16 );
	 aBoard[19] = new TBEPosition( true,  12, 20, 26, 18,  0,  0,  0, 17 );
	 aBoard[20] = new TBEPosition( true,  13,  0, 27, 19,  0,  0,  0, 18 );
	
	 aBoard[21] = new TBEPosition( true,  14, 22,  0,  0,  7, 23,  0,  0 );
	 aBoard[22] = new TBEPosition( true,  15, 23,  0, 21,  8, 24,  0,  0 );
	 aBoard[23] = new TBEPosition( true,  16, 24, 28, 22,  9, 25, 31, 21 );
	 aBoard[24] = new TBEPosition( true,  17, 25, 29, 23, 10, 26, 32, 22 );
	 aBoard[25] = new TBEPosition( true,  18, 26, 30, 24, 11, 27, 33, 23 );
	 aBoard[26] = new TBEPosition( true,  19, 27,  0, 25, 12,  0,  0, 24 );
	 aBoard[27] = new TBEPosition( true,  20,  0,  0, 26, 13,  0,  0, 25 );
	
	 aBoard[28] = new TBEPosition( true,  23, 29, 31,  0, 16, 30,  0,  0 );
	 aBoard[29] = new TBEPosition( true,  24, 30, 32, 28, 17,  0,  0,  0 );
	 aBoard[30] = new TBEPosition( true,  25,  0, 33, 29, 18,  0,  0, 28 );
	
	 aBoard[31] = new TBEPosition( true,  28, 32,  0,  0, 23, 33,  0,  0 );
	 aBoard[32] = new TBEPosition( true,  29, 33,  0, 31, 24,  0,  0,  0 );
	 aBoard[33] = new TBEPosition( true,  30,  0,  0, 32, 25,  0,  0, 31 );
	
	}
	
	public boolean getPosStat( int n ) { return aBoard[n].getPosStat(); }
	
	public int get1UPos( int n ) { return aBoard[n].get1Up(); }
	public int get1RPos( int n ) { return aBoard[n].get1Right(); }
	public int get1DPos( int n ) { return aBoard[n].get1Down(); }
	public int get1LPos( int n ) { return aBoard[n].get1Left(); }
	
	public int get2UPos( int n ) { return aBoard[n].get2Up(); }
	public int get2RPos( int n ) { return aBoard[n].get2Right(); }
	public int get2DPos( int n ) { return aBoard[n].get2Down(); }
	public int get2LPos( int n ) { return aBoard[n].get2Left(); }
	
	public void setPos( int iTBEPosition, boolean bStatus )
	{ 
	 int i = iTBEPosition;
	 boolean b = bStatus;
	
	 aBoard[i].setPosStat( b );
	}
	
	public Boolean canJumpUp( int iaBoardTBEPosition )
	{
	 //String sMethod = "up";
	 //String sMText1 = "... can jump <"; 
	 //String sMText2 = "> at board index = ";
	 //System.out.println( sMText1 + sMethod + sMText2 + iaBoardTBEPosition ); 
	
	 int i = iaBoardTBEPosition;
	
	 int u1 = get1UPos( i );
	 int u2 = get2UPos( i );
	
	 boolean bi = getPosStat( i );
	 boolean b1 = getPosStat( u1 );
	 boolean b2 = getPosStat( u2 );
	
	 if( ( u1 > 0 ) && ( u2 > 0 ) && ( bi == true ) && ( b1 == true ) && ( b2 == false) )
	    return true;
	 else
	    return false;
	}
	
	public Boolean canJumpRight( int iaBoardTBEPosition )
	{
	 //String sMethod = "right";
	 //String sMText1 = "... can jump <"; 
	 //String sMText2 = "> at board index = ";
	 //System.out.println( sMText1 + sMethod + sMText2 + iaBoardTBEPosition );
	
	 int i = iaBoardTBEPosition;
	 
	 int r1 = get1RPos( i );
	 int r2 = get2RPos( i );
	
	 boolean bi = getPosStat( i );
	 boolean b1 = getPosStat( r1 );
	 boolean b2 = getPosStat( r2 );
	
	 if( ( r1 > 0 ) && ( r2 > 0 ) && ( bi == true ) && ( b1 == true ) && ( b2 == false) )
	    return true;
	 else
	    return false;
	}
	
	public Boolean canJumpDown( int iaBoardTBEPosition )
	{
	 //String sMethod = "down";
	 //String sMText1 = "... can jump <"; 
	 //String sMText2 = "> at board index = ";
	 //System.out.println( sMText1 + sMethod + sMText2 + iaBoardTBEPosition );
	
	 int i = iaBoardTBEPosition;
	
	 int d1 = get1DPos( i );
	 int d2 = get2DPos( i );
	
	 boolean bi = getPosStat( i );
	 boolean b1 = getPosStat( d1 );
	 boolean b2 = getPosStat( d2 );
	
	 if( ( d1 > 0 ) && ( d2 > 0 ) && ( bi == true ) && ( b1 == true ) && ( b2 == false) )
	    return true;
	 else
	    return false;
	}
	
	public Boolean canJumpLeft( int iaBoardTBEPosition )
	{
	 //String sMethod = "Left";
	 //String sMText1 = "... can jump <"; 
	 //String sMText2 = "> at board index = ";
	 //System.out.println( sMText1 + sMethod + sMText2 + iaBoardTBEPosition );
	
	 int i = iaBoardTBEPosition;
	
	 int l1 = get1LPos( i );
	 int l2 = get2LPos( i );
	
	 boolean bi = getPosStat( i );
	 boolean b1 = getPosStat( l1 );
	 boolean b2 = getPosStat( l2 );
	
	 if( ( l1 > 0 ) && ( l2 > 0 ) && ( bi == true ) && ( b1 == true ) && ( b2 == false) )
	    return true;
	 else
	    return false;
	}
	
	public void JumpUp( int iTBEPosition, TBEJumpList l )
	{
	 int iSrc = iTBEPosition; int iHop = get1UPos( iSrc ); int iDst = get2UPos( iSrc );
	 setPos( iSrc, false ); setPos( iHop, false ); setPos( iDst, true );
	 //System.out.print( " s = " + iSrc + " h = " + iHop + " d = " + iDst);
	 l.setJumpRef( iSrc, 'U' );
	}
	
	public void ReverseJumpUp( int iTBEPosition, TBEJumpList l )
	{
	 int iSrc = iTBEPosition; int iHop = get1UPos( iSrc ); int iDst = get2UPos( iSrc );      
	 setPos( iSrc, true ); setPos( iHop, true ); setPos( iDst, false );
	 //System.out.print( " s = " + iSrc + " h = " + iHop + " d = " + iDst);
	 l.delJumpRef();
	}
	
	public void JumpRight( int iTBEPosition, TBEJumpList l )
	{
	 int iSrc = iTBEPosition; int iHop = get1RPos( iSrc ); int iDst = get2RPos( iSrc );      
	 setPos( iSrc, false ); setPos( iHop, false ); setPos( iDst, true );
	 //System.out.print( " s = " + iSrc + " h = " + iHop + " d = " + iDst);
	 l.setJumpRef( iSrc, 'R' );
	}
	
	public void ReverseJumpRight( int iTBEPosition, TBEJumpList l )
	{
	 int iSrc = iTBEPosition; int iHop = get1RPos( iSrc ); int iDst = get2RPos( iSrc );      
	 setPos( iSrc, true ); setPos( iHop, true ); setPos( iDst, false );
	 //System.out.print( " s = " + iSrc + " h = " + iHop + " d = " + iDst);
	 l.delJumpRef();
	}
	
	public void JumpDown( int iTBEPosition, TBEJumpList l )
	{
	 int iSrc = iTBEPosition; int iHop = get1DPos( iSrc ); int iDst = get2DPos( iSrc );
	 setPos( iSrc, false ); setPos( iHop, false ); setPos( iDst, true );
	 //System.out.print( " s = " + iSrc + " h = " + iHop + " d = " + iDst);
	 l.setJumpRef( iSrc, 'D' );
	}
	
	public void ReverseJumpDown( int iTBEPosition, TBEJumpList l )
	{
	 int iSrc = iTBEPosition; int iHop = get1DPos( iSrc ); int iDst = get2DPos( iSrc );
	 setPos( iSrc, true ); setPos( iHop, true ); setPos( iDst, false );
	 //System.out.print( " s = " + iSrc + " h = " + iHop + " d = " + iDst);
	 l.delJumpRef();
	}
	
	public void JumpLeft( int iTBEPosition, TBEJumpList l )
	{
	 int iSrc = iTBEPosition; int iHop = get1LPos( iSrc ); int iDst = get2LPos( iSrc );      
	 setPos( iSrc, false ); setPos( iHop, false ); setPos( iDst, true );
	 //System.out.print( " s = " + iSrc + " h = " + iHop + " d = " + iDst);
	 l.setJumpRef( iSrc, 'L' );
	}
	
	public void ReverseJumpLeft( int iPosition, TBEJumpList l )
	{
	 int iSrc = iPosition; int iHop = get1LPos( iSrc ); int iDst = get2LPos( iSrc );      
	 setPos( iSrc, true ); setPos( iHop, true ); setPos( iDst, false );
	 //System.out.print( " s = " + iSrc + " h = " + iHop + " d = " + iDst);
	 l.delJumpRef();
	}
	
	public void showBoard()
	{
	 char sb[] = new char[34];
	
	 for( int i=1; i<34; i++ )
	 {
	    if( getPosStat( i ) )
	       sb[i] = 'X';
	    else
	       sb[i] = 'O';
	 }
	
	 System.out.println();
	 System.out.println( "     " + sb[ 1] + " " + sb[ 2] + " " + sb[ 3] );
	 System.out.println( "     " + sb[ 4] + " " + sb[ 5] + " " + sb[ 6] );
	 System.out.println( " " + sb[ 7] + " " + sb[ 8] + " " + sb[ 9] + " " + sb[10] + " " + sb[11] + " " + sb[12] + " " + sb[13] );
	 System.out.println( " " + sb[14] + " " + sb[15] + " " + sb[16] + " " + sb[17] + " " + sb[18] + " " + sb[19] + " " + sb[20] );
	 System.out.println( " " + sb[21] + " " + sb[22] + " " + sb[23] + " " + sb[24] + " " + sb[25] + " " + sb[26] + " " + sb[27] );
	 System.out.println( "     " + sb[28] + " " + sb[29] + " " + sb[30] );
	 System.out.println( "     " + sb[31] + " " + sb[32] + " " + sb[33] );
	 System.out.println();
	
	
	 //System.out.println( "Board size is = " + aBoard.length );      
	
	}
} //End Class Board