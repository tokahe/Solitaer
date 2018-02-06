//Begin Class Position - represents a position with all it's attributes

class TBEPosition
{
	private boolean bPosStat;
	private int i1Up , i1Right , i1Down , i1Left ;
	private int i2Up , i2Right , i2Down , i2Left ;

	public TBEPosition( boolean p, 
               int u1, int r1, int d1, int l1,
               int u2, int r2, int d2, int l2  )
	{
		bPosStat = p;
		i1Up = u1; i1Right = r1; i1Down = d1; i1Left = l1;
		i2Up = u2; i2Right = r2; i2Down = d2; i2Left = l2;
	}

	public boolean setPosStat( boolean p) { bPosStat = p; return bPosStat; }
	boolean getPosStat() { return bPosStat; }

	public int set1Up( int u1) { i1Up = u1; return i1Up; }
	public int get1Up() { return i1Up; }

	public int set2Up( int u2 ) { i2Up = u2; return i2Up; }
	public int get2Up() { return i2Up; }

	public int set1Right( int r1 ) { i1Right = r1; return i1Right; }
	public int get1Right() { return i1Right; }

	public int set2Right( int r2 ) { i2Right = r2; return i2Right; }
	public int get2Right() { return i2Right; }

	public int set1Down( int d1 ) { i1Down = d1; return i1Down; }
	public int get1Down() { return i1Down; }

	public int set2Down( int d2 ) { i2Down = d2; return i2Down; }
	public int get2Down() { return i2Down; }

	public int set1Left( int l1 ) { i1Left = l1; return i1Left; }
	public int get1Left() { return i1Left; }

	public int set2Left( int l2 ) { i2Left = l2; return i2Left; }
	public int get2Left() { return i2Left; }
} //End Class Position