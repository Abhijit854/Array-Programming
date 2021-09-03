package Array;

import java.util.*;

public class THE_SUDOKU_CHECKER_PROBLEM {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<List<Integer>> x = new ArrayList<List<Integer>>();
	x.add(new ArrayList<Integer>(Arrays.asList(5, 3, 0, 0, 7, 0, 0, 0, 0)));
	x.add(new ArrayList<Integer>(Arrays.asList(6, 0, 0, 1, 9, 5, 0, 0, 0)));
	x.add(new ArrayList<Integer>(Arrays.asList(0, 9, 8, 0, 0, 0, 0, 6, 0)));
	x.add(new ArrayList<Integer>(Arrays.asList(8, 0, 0, 0, 6, 0, 0, 0, 3)));
	x.add(new ArrayList<Integer>(Arrays.asList(4, 0, 0, 8, 0, 3, 0, 0, 1)));
	x.add(new ArrayList<Integer>(Arrays.asList(7, 0, 0, 0, 2, 0, 0, 0, 6)));
	x.add(new ArrayList<Integer>(Arrays.asList(0, 6, 0, 0, 0, 0, 2, 8, 0)));
	x.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 4, 1, 9, 0, 0, 5)));
	x.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 8, 0, 0, 7, 9)));
	System.out.println("Sudoku - \n ");
	printBoard(x);
	System.out.println("\nSolution -\n");
	sudoku(x);
	printBoard(x);
	System.out.println("\nIs it a valid Sudoku ? " + isValidSudoku(x));
}
public static boolean isValidSudoku(List<List<Integer>> partialAssignment) {
	for (int i = 0; i < partialAssignment.size(); ++i) {
		if (hasDuplicate(partialAssignment, i, i + 1, 0, partialAssignment.size())) {
			return false;
		}
	}
	for (int j = 0; j < partialAssignment.size(); ++j) {
		if (hasDuplicate(partialAssignment, 0, partialAssignment.size(), j, j + 1)) {
			return false;
		}
	}
	int regionSize = (int) Math.sqrt(partialAssignment.size());
	for (int I = 0; I < regionSize; ++I) {
		for (int J = 0; J < regionSize; ++J) {
			if (hasDuplicate(partialAssignment, regionSize * I, regionSize * (I + 1), regionSize * J,regionSize * (J + 1))) {
				return false;
			}
		}
	}
	return true;
}
private static boolean hasDuplicate(List<List<Integer>> partialAssignment, int startRow, int endRow, int startCol,int endCol) {
	List<Boolean> isPresent = new ArrayList<>(Collections.nCopies(partialAssignment.size() + 1, false));
	for (int i = startRow; i < endRow; ++i) {
		for (int j = startCol; j < endCol; ++j) {
			if (partialAssignment.get(i).get(j) != 0 && isPresent.get(partialAssignment.get(i).get(j))) {
				return true;
			}
			isPresent.set(partialAssignment.get(i).get(j), true);
		}
	}
	return false;
}
public static boolean sudoku(List<List<Integer>> x) {
	List<Integer> ra = Unassigned(x);
	if (ra.get(0) == -1) {
		return true;
	}
	int row = ra.get(0);
	int col = ra.get(1);
	for (int num = 1; num <= 9; num++) {
		if (isValidSudoku(x)) {
			x.get(row).set(col, num);
			boolean check = sudoku(x);
			if (check == true) {
				return true;
			}
			x.get(row).set(col, 0);
		}
	}
	return false;
}
public static List<Integer> Unassigned(List<List<Integer>> arr) {
	List<Integer> ra = new ArrayList<>();
	ra.add(-1);
	ra.add(-1);
	for (int row = 0; row < arr.size(); row++) {
		for (int col = 0; col < arr.size(); col++) {
			if (arr.get(row).get(col) == 0) {
				ra.set(0, row);
				ra.set(1, col);
				return ra;
			}
		}
	}
	return ra;
}
private static void printBoard(List<List<Integer>> x) {
	System.out.println("------|-------|-------|");
	for (int i = 0; i < x.size(); i++) {
		for (int j = 0; j < x.get(i).size(); j++) {
			System.out.print(x.get(i).get(j));
			System.out.print(" ");
			if ((j + 1) % 3 == 0) {
				System.out.print("| ");
			}
		}
		System.out.println();
		if ((i + 1) % 3 == 0) {
			System.out.println("------|-------|-------|");
		}
	}

	}
}
