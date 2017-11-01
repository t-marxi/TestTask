package com.klimigo.parser.impl;

import com.klimigo.parser.CyrillicReplacer;

import java.util.HashMap;
import java.util.Map;

public class CyrillicReplacerImpl implements CyrillicReplacer {
    private Map<Character, Character> misprints = new HashMap<Character, Character>() {{
        put('С', 'C');
        put('Е', 'E');
        put('Т', 'T');
        put('Н', 'H');
        put('У', 'Y');
        put('О', 'O');
        put('Р', 'P');
        put('Х', 'X');
        put('А', 'A');
        put('В', 'B');
        put('К', 'K');
        put('М', 'M');
    }};

    public String changeCyrilicLetters(String original) {
        char[] chars = original.toCharArray();
        for (int i = 0; i < chars.length; ++i) {
            Character character = misprints.get(chars[i]);
            if (character != null) {
                chars[i] = character.charValue();
            }
        }
        return String.valueOf(chars);
    }
}
