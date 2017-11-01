package com.klimigo.parser;

import com.klimigo.dto.SeatResult;

public interface SeatParser {
    SeatResult parse(String seatName, long id);
}
