public class SudokuBoard {
	
	SudokuSquare sb[][] = new SudokuSquare[4][4];

	public SudokuBoard(SudokuSquareLinkedList list) {

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				sb[i][j] = new SudokuSquare(i, j, 0, false);
			}
		}

		SudokuSquareNode n = list.getNext();
		SudokuSquare sq = n.getData();
		while (n != null) {
			sb[sq.getRow()][sq.getColumn()] = new SudokuSquare(sq.getRow(), sq.getRow(), sq.getValue(), true);
			n = list.getNext();
			if (n != null) {
				sq = n.getData();
			}

		}

	}

	public boolean isValid(int r, int c, int v) {
		if(sb[r][c].isLocked()){
			return false;
		}
		if(sb[r][c].getValue()==v) {
			return true;
		}	
		for (int i = 0; i < 4; i++) {
			if (i != c && sb[r][i].getValue() == v) {
				return false;
			}
		}
		
		for (int i = 0; i < 4; i++) {
			if (i != r && sb[i][c].getValue() == v) {
				return false;
			}
		}

		int x = r / 2;
		int y = c / 2;
		x = x * 2;
		y = y * 2;
		for (int i = x; i <= x + 1; i++) {
			for (int j = y; j < y + 1; j++) {
				if ((sb[i][j].getValue() == v)) {
					return false;
				}
			}
		}
		return true;
	}

	public void enterMove(int r, int c, int v) {
		if (isValid(r, c, v)) {
			sb[r][c].setValue(v);
		} else {
			throw new SudokuException("Invalid Move");
		}
	}

	public void reset() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (!sb[i][j].isLocked()) {
					sb[i][j].setValue(0);
				}
			}
		}
	}

	public boolean isFull() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (sb[i][j].getValue() == 0) {
					// System.out.println("empty spot found at row " + i + " and
					// col " + j);
					return false;
				}
			}
		}
		return true;
	}

	public SudokuSquare getSquare(int r, int c) {
		return sb[r][c];
	}

}