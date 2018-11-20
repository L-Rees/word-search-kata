package wordSearch;

import java.util.ArrayList;
import java.util.Arrays;


public class WordSearch {

	public ArrayList<String> search(String wordMatrix, String wordList) {
		ArrayList<String> wordListArray= new ArrayList<String>(Arrays.asList(wordList.split(" ")));
		String words =wordMatrix.replaceAll("\\s","");
		
		int rowLength = (int) Math.sqrt(words.length());
		int columnLength = rowLength;
		
		//divides into rows
		ArrayList<String> wordRowArray = new ArrayList<String>();
		for(int x = 0; x < words.length(); x+=rowLength) {
			String row = words.substring(x, x + rowLength);
			wordRowArray.add(row);
		}
		
		//divides into columns
		ArrayList<String> wordColumnArray = new ArrayList<String>();
		for(int x = 0; x< rowLength; x++) {
			String column = "";
			for(String row : wordRowArray) {
			column += row.charAt(x);
			}
			wordColumnArray.add(column);
		}

		ArrayList<String> result = new ArrayList<>();
		
		
		//finds words that are forwards horizontal
		for(int y = 0; y < wordRowArray.size(); y++) {
			for (String word : wordListArray) {
				if (wordRowArray.get(y).contains(word)){
					String coords = "";
					int startIndex = wordRowArray.get(y).indexOf(word) + 1;
					for(int x = 0; x< word.length(); x++) {
						coords += " ("+ (startIndex + x) + "," + (y + 1) +")";
					}
					word += coords;
					result.add(word);	
				}
			}
		}
		
		for(int x = 0; x < wordColumnArray.size(); x++) {
			for (String word : wordListArray) {
				if (wordColumnArray.get(x).contains(word)){
					String coords = "";
					int startIndex = wordColumnArray.get(x).indexOf(word) + 1;
					for(int y = 0; y< word.length(); y++) { 
						coords += " ("+ (x + 1) + "," + (startIndex + y) +")";
					}
					word += coords;
					result.add(word);	
				}
			}
		}
				
			
			
		
		
		
		
		return result;
	}

	
}
