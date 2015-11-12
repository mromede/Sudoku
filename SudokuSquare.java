public class SudokuSquare {
	private int value;
	private int row;
	private int column;
	private boolean locked;

	public SudokuSquare(int r, int c, int v, boolean l) {
		
		if ((v >= 0) && (v <= 4)) {
			value = v;
		} else {
			value =0;
		}
		if ((r < 0) || (r > 3)) {
			row = 0;
		} else {
			row = r;
		}
		if ((c < 0) || (c > 3)) {
			column = 0;
		} else {
			column = c;
		}
		locked = l;

	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

	public int getValue() {
		return value;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean b) {
		locked =b;
	}


	public void setValue(int v) {
		if ((v >= 0) && (v <= 4) && (!locked)) {
			value = v;
		}

	}

}