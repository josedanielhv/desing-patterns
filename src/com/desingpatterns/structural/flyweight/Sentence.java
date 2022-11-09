package com.desingpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Vector;

public class Sentence {
    private String plainText;
    private String[] words;
    private HashMap<Integer, WordToken> wordToken;

    public Sentence(String plainText)
    {
       this.plainText = plainText;
       this.words = plainText.split(" ");
       this.wordToken = new HashMap<Integer, WordToken>();
    }

    public WordToken getWord(int index)
    {
        if(wordToken.get(index)== null){
            wordToken.put(index,new WordToken());
        }
        return wordToken.get(index);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for(int i= 0; i< words.length; i++ ){
            if (wordToken.get(i)!= null){
                sb.append(wordToken.get(i).capitalize ? words[i].toUpperCase() : words[i] );
            }else {
                sb.append(words[i]);
            }
            if(!(i ==words.length-1)){
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public class WordToken
    {
        public boolean capitalize;
    }
}
