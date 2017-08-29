package com.spring.examples.model.response;

import com.spring.examples.model.Links;

/**
 * Created by lulavillalobos on 6/14/17.
 */
public class ReservationResponse {

    private Long id;
    private Integer roomNumber;
    private Integer price;
    private Links links;

    public ReservationResponse() {
        super();
    }

    public ReservationResponse(Integer roomNumber, Integer price) {
        super();
        this.roomNumber = roomNumber;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

}