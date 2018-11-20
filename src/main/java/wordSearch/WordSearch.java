package wordSearch;

import java.util.ArrayList;
import java.util.Arrays;


public class WordSearch {

	public ArrayList<String> search(String wordMatrix, String wordList) {
		ArrayList<String> wordListArray= new ArrayList<String>(Arrays.asList(wordList.split(" ")));
		String words =wordMatrix.replaceAll("\\s","");
		int rowLength = (int) Math.sqrt(words.length());
		ArrayList<String> wordRowArray = new ArrayList<String>();
		for(int x = 0; x < words.length(); x+=rowLength) {
			String row = words.substring(x, x + rowLength);
			wordRowArray.add(row);
		}
		ArrayList<String> result = new ArrayList<>();
		for (String row : wordRowArray) {
			for(String word : wordListArray) {
				if (row.contains(word)) {
					result.add(word);
				}
			}
			
		}
		
		
		
		return result;
	}

}
