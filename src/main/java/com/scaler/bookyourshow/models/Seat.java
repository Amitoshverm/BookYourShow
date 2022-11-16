package com.scaler.bookyourshow.models;

import com.scaler.bookyourshow.enums.SeatType;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import java.util.Date;

@Getter
@Entity
public class Seat extends BaseModel{
    private Integer rowNumber;
    private Integer columnNumber;

    @Enumerated
    private SeatType type;

}
