package com.scaler.bookyourshow.models;


import com.scaler.bookyourshow.enums.SeatStatus;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Getter
@Entity
public class ShowSeat extends BaseModel{
    private Double price;
    private SeatStatus status;

    @ManyToOne
    private Seat seat;


}
