package com.venue.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto {

    private Long addressId;
    private String buildingName;
    private String roomArea;
    private String campusName;
    private String landmark;

    // Foreign key relationship with Venue
    private Integer venueId;

//    public AddressDto(Long addressId, String buildingName, String roomArea, String campusName, String landmark, Integer integer) {
//
//    }

//    public AddressDto(Long addressId, String buildingName, String roomArea, String campusName, String landmark, Integer venueId) {
//        this.addressId = addressId;
//        this.buildingName = buildingName;
//        this.roomArea = roomArea;
//        this.campusName = campusName;
//        this.landmark = landmark;
//        this.venueId = venueId;
//    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getRoomArea() {
        return roomArea;
    }

    public void setRoomArea(String roomArea) {
        this.roomArea = roomArea;
    }

    public String getCampusName() {
        return campusName;
    }

    public void setCampusName(String campusName) {
        this.campusName = campusName;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public Integer getVenueId() {
        return venueId;
    }

    public void setVenueId(Integer venueId) {
        this.venueId = venueId;
    }
}
