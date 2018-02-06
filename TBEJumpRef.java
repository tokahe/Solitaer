//Begin Class JumpReference
class TBEJumpRef
{
	private int  iJumpPos;
	private char cJumpDir;
	
	public TBEJumpRef( int iJumpPosition, char cJumpDirection )
	{
		iJumpPos = iJumpPosition; cJumpDir = cJumpDirection;
	}
	
	public int setJumpPos( int iPosition) { iJumpPos = iPosition; return iJumpPos; }
	public int getJumpPos() { return iJumpPos; }
	
	public char setJumpDir( char cDirection) { cJumpDir = cDirection; return cJumpDir; }
	public char getJumpDir() { return cJumpDir; }

} // End Class JumpReference