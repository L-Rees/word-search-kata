package wordSearch;


import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;


import org.junit.Test;

public class WordSearchTest {

	
	String wordMatrix = "R T L W I L L I A M K T A A G " +
			"K U S H N G B I H E O H X H R " +
			"Z O F A L E L A L M O O R B E " +
			"G E O O G E C R R Q T R U A A " +
			"E O I T B A O R E D R I B L T " +
			"B N L O A N D L O E E N M I G " +
			"F E L L D N V A N M R D O N O " +
			"L D O L U E N O R I A E B H B " +
			"A A I R N M I O R K O N T C L " +
			"D I L K N L S O D A R O C C I " +
			"N N I L A W D L S A L B I E N " +
			"A N K G L U B M I F L O G R R " +
			"G S M A U G B E R T U L N I O " +
			"R U F I B I L I F B B G E G Q " +
			"B I L B O B A G G I N S L B G";
	
	
	String wordList = "BALIN " + 
			"BARD " + 
			"BELLADONNATOOK " + 
			"BEORN " + 
			"BERT " + 
			"BIFUR " + 
			"BILBOBAGGINS " + 
			"BOFUR " + 
			"BOLG " + 
			"BOMBUR " + 
			"BULLROARERTOOK " + 
			"DAIN " + 
			"DORI " + 
			"DWALIN " + 
			"ELROND " + 
			"ELVENKING " + 
			"FILI " + 
			"GALION " + 
			"GANDALF " + 
			"GLOIN " + 
			"GOLFIMBUL " + 
			"GOLLUM " + 
			"GREATGOBLIN " + 
			"KILI " + 
			"LOBELIA " + 
			"LOTHO " + 
			"NECROMANCER " + 
			"NORI " + 
			"OIN " + 
			"ORI " + 
			"RADAGAST " + 
			"SMAUG " + 
			"THORIN " + 
			"TOM " + 
			"WILLIAM";
	

//	@Test
//	public void shouldReturnWords() {
//		WordSearch hobbit = new WordSearch();
//		String shortList = "BALIN BARD SMAUG";
//		ArrayList<String> result = hobbit.search(wordMatrix, shortList);
//		assertThat(result, containsInAnyOrder("BALIN", "SMAUG","BARD"));	
//	}
	
//	@Test
//	public void shouldFindHorizontalForwardsWords() {
//		WordSearch hobbit = new WordSearch();
//		ArrayList<String> result = hobbit.search(wordMatrix, wordList);
//		assertThat(result, containsInAnyOrder("NORI", "WILLIAM", "ORI", "SMAUG","BILBOBAGGINS", "BERT"));
//	}
	
	@Test
	public void shouldReturnHorizontalForwardWordsWithCoordinates() {
		WordSearch hobbit = new WordSearch();
		String shortList = "NORI";
		ArrayList<String> result = hobbit.search(wordMatrix, shortList);
		assertThat(result, contains("NORI (7,8) (8,8) (9,8) (10,8)"));
	}
	
	@Test
	public void shouldReturnVerticaForwardsWordsWithCoordinates() {
		WordSearch hobbit = new WordSearch();
		String shortList = "THORIN";
		ArrayList<String> result = hobbit.search(wordMatrix, shortList);
		assertThat(result, contains("THORIN (12,1) (12,2) (12,3) (12,4) (12,5) (12,6)"));
	}
	
}
