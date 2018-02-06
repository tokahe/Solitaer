//Begin Class JumpList
public class TBEJumpList
{
	private int iIndex = 1;

	public TBEJumpRef[] aList = new TBEJumpRef[34];

	public TBEJumpList()
	{
		for( int n=1; n<34; n++ )
			aList[n] = new TBEJumpRef( 0, ' ' );
	}

	public void setJumpRef( int iPos, char cDir )
	{
		//System.out.println( "Index: " + iIndex );
		aList[iIndex].setJumpPos( iPos );
		aList[iIndex].setJumpDir( cDir );
		iIndex++;
	}

	public void delJumpRef()
	{
		aList[iIndex].setJumpPos( 0 );
		aList[iIndex].setJumpDir( ' ' );
		--iIndex;
	}

	public void showList()
	{
		for( int n=1; n<34; n++ )
		{
			System.out.print( "Jump " + n + ": " );
			System.out.print( "Pos(" + aList[n].getJumpPos() + ")" );
			System.out.print( "Dir(" + aList[n].getJumpDir() + ")" );
			System.out.println();
		}
	}
} // End Class JumpList