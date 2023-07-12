package controller;

public class SentenceProcessor {

    private int size = 65535;
    private String sentence;

    public SentenceProcessor(byte[] byteData) {
    	
        this.sentence = new String(byteData);
    }

    public String getSentence() {
    	
        return sentence;
    }
    
    
    /**
	 * This method convert value into an array of byte
	 * @param length
	 * @return
	 */
    public byte[] convertToByteArray(int totalCharacters) {
    	
        byte[] outData = new byte[size];
        String stringValue = Integer.valueOf(totalCharacters).toString();
        
        outData = stringValue.getBytes();
        
        return outData;
    }

    
    public int countCharacters() {
        int index = 0;
        
        char currentChar = sentence.charAt(index);
        
        while (currentChar != '\0') {
            currentChar = sentence.charAt(index++);
            
        }
        
        return index - 1;
        
    }

    
    public int countVowels() {
    	
        int vowelCount = 0;
        
        sentence = sentence.toLowerCase();
        
        for (int index = 0; index < sentence.length(); index++) {
        	
            char currentChar = sentence.charAt(index);
            
            if (currentChar == 'a' || currentChar == 'e' 
            		|| currentChar == 'i' || currentChar == 'o' 
            		|| currentChar == 'u') {
            	
                vowelCount++;
            }
        }
        
        return vowelCount;
    }

    public int countConsonants() {
    	
        int consonantCount = 0;
        
        sentence = sentence.toLowerCase();
        
        for (int index = 0; index < sentence.length(); index++) {
            char currentChar = sentence.charAt(index);
            
            if (currentChar >= 'a' && currentChar <= 'z' 
            		&& currentChar != 'a' && currentChar != 'e'
            		&& currentChar != 'i' && currentChar != 'o' && currentChar != 'u') {
                consonantCount++;
            }
        }
        
        return consonantCount;
    }

    public int countSymbols() {
    	
        int symbolCount = 0;
        
        for (int index = 0; index < sentence.length(); index++) {
        	
            char currentChar = sentence.charAt(index);
            
            if (!Character.isLetterOrDigit(currentChar)
            		&& !Character.isWhitespace(currentChar)) {
            	
                symbolCount++;
            }
        }
        
        return symbolCount;
    }

    
   

}
