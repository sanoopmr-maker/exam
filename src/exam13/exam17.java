package exam13;

public class exam17 {

	
	public class SentenceRearranger {
	    public static void main(String[] args) {
	        String sentence = "IELTS TRAINING DETAILS";
	        String rearrangedSentence = rearrangeSentence(sentence);
	        System.out.println("Rearranged Sentence: " + rearrangedSentence);
	    }

	    public static String rearrangeSentence(String sentence) {
	        String[] words = sentence.split(" ");
	        StringBuilder rearranged = new StringBuilder();

	        for (int i = words.length - 1; i >= 0; i--) {
	            rearranged.append(words[i]);
	            if (i > 0) {
	                rearranged.append(" ");
	            }
	        }

	        return rearranged.toString();
	    }
	}

}
