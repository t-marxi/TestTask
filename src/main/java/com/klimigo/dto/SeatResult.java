package com.klimigo.dto;

public class SeatResult {
    private long id;
    private String sector;
    private String sectorName;
    private String row;
    private String rowName;
    private String seat;
    private String seatName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public String getRowName() {
        return rowName;
    }

    public void setRowName(String rowName) {
        this.rowName = rowName;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getSeatName() {
        return seatName;
    }

    public void setSeatName(String seatName) {
        this.seatName = seatName;
    }

    public String getFullSector() {
        if (sector != null && sectorName != null) {
            if (sector.equalsIgnoreCase("сектор")) {
                return sectorName;
            }
            return sector + " " + sectorName;
        }
        return "";
    }

    public String getFullRow() {
        if (row != null && rowName != null) {
            return row + " " + rowName;
        }
        return "";
    }

    public String getFullSeat() {
        if (seat != null && seatName != null) {
            return seat + " " + seatName;
        }
        return "";
    }
}
