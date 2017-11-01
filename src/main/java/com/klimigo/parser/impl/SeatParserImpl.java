package com.klimigo.parser.impl;

import com.klimigo.dto.SeatResult;
import com.klimigo.parser.CyrillicReplacer;
import com.klimigo.parser.SeatParser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SeatParserImpl implements SeatParser {

    private CyrillicReplacer replacer = new CyrillicReplacerImpl();

    @Override
    public SeatResult parse(String seatName, long id) {
        SeatResult result = new SeatResult();
        result.setId(id);
        Matcher m = Pattern.compile("(?:(?<sector>.*?) (?<sectorName>(?:\\p{Lu}|\\d).*?)|(?<sectorWithoutName>.*)) (?<row>Ряд) (?<rowName>.*) (?<seat>Место) (?<seatName>.*)").matcher(seatName);
        if (!m.find()) {
            return null;
        }
        if (m.group("sectorWithoutName") != null) {
            result.setSector(m.group("sectorWithoutName"));
            result.setSectorName("");
        } else {
            result.setSector(m.group("sector"));
            result.setSectorName(m.group("sectorName"));
        }
        result.setRow(m.group("row"));
        result.setRowName(m.group("rowName"));
        result.setSeat(m.group("seat"));
        result.setSeatName(m.group("seatName"));

        result.setSectorName(replacer.changeCyrilicLetters(result.getSectorName()));

        return result;
    }

}
