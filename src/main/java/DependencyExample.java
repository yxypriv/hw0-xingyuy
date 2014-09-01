import java.io.StringReader;

import edu.stanford.nlp.ling.Word;
import edu.stanford.nlp.process.PTBTokenizer.PTBTokenizerFactory;
import edu.stanford.nlp.process.Tokenizer;
import edu.stanford.nlp.process.TokenizerFactory;

public class DependencyExample {

    public static void main(String[] args) {
        TokenizerFactory<Word> factory = PTBTokenizerFactory.newTokenizerFactory();
        Tokenizer<Word> tokenizer = factory.getTokenizer(new StringReader(args[0]));
        for(Word w : tokenizer.tokenize()) {
        	System.out.println(w.toString());
        }
    }

}
