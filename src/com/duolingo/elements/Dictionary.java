package com.duolingo.elements;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.duolingo.util.DictionaryException;

public class Dictionary {

    private Map<Character, Set<String>> dictionary;

    public Dictionary() {

        this.dictionary = new HashMap<>();
    }

    public void addWord(String word) throws DictionaryException {

        char initial = word.charAt(0);
        Set<String> words = this.dictionary.get(initial);

        if (words != null && words.contains(word)) {
            throw new DictionaryException("La palabra '" + word + "' ya existe en el diccionario.");
        }

        if (words == null) {
            words = new HashSet<>();
            this.dictionary.put(initial, words);
        }

        words.add(word);
    }

    public void removeWord(String word) throws DictionaryException {

        char initial = word.charAt(0);
        Set<String> words = this.dictionary.get(initial);

        if (words == null || !words.contains(word)) {
            throw new DictionaryException("La palabra '" + word + "' no existe en el diccionario.");
        }

        words.remove(word);

        if (words.isEmpty()) {
            this.dictionary.remove(initial);
        }
    }

    public boolean containsWord(String word) {

        char initial = word.charAt(0);
        Set<String> words = this.dictionary.get(initial);

        return words != null && words.contains(word);
    }

    public Set<Character> getInitials() {

        Set<Character> initials = this.dictionary.keySet();

        return Collections.unmodifiableSet(initials);
    }

    public Set<String> getWordsByInitial(char initial) {

        Set<String> wordsByInitial = this.dictionary.getOrDefault(initial, Collections.emptySet());

        return Collections.unmodifiableSet(wordsByInitial);
    }
}