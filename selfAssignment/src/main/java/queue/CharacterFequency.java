package queue;

import java.util.Comparator;
import java.util.Objects;

/**
 * Created by pankaj on 01,2019
 */
public class CharacterFequency {
    private char character;
    private int frequency;

    public CharacterFequency(char character,int frequency){
        this.character=character;
        this.frequency=frequency;
    }


    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "CharacterFequency{" +
                "character=" + character +
                ", frequency=" + frequency +
                '}';
    }
}
