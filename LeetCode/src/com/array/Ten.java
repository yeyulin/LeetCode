package com.array;

import java.util.HashSet;

/**
 * @Function
 * @author yeyulin
 * @data 2018/06/07
 *
 */
public class Ten {
	public boolean isValidSudoku(char[][] board) {
		for (int i = 0; i < 9; i++) {
			HashSet<Character> row = new HashSet<>();
			HashSet<Character> column = new HashSet<>();
			HashSet<Character> cube = new HashSet<>();
			for (int j = 0; j < 9; j++) {
				// ����i�У��ں�����λ��
				if (board[i][j] != '.' && !row.add(board[i][j]))
					return false;
				// ����i�У���������λ��
				if (board[j][i] != '.' && !column.add(board[j][i]))
					return false;
				// �к�+ƫ����
				int RowIndex = 3 * (i / 3) + j / 3;
				// �к�+ƫ����
				int ColIndex = 3 * (i % 3) + j % 3;
				// ÿ��С�Ź����ܹ�9��
				if (board[RowIndex][ColIndex] != '.' && !cube.add(board[RowIndex][ColIndex]))
					return false;
			}
		}
		return true;
	}
}
