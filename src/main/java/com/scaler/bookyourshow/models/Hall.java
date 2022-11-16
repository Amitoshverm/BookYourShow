package com.scaler.bookyourshow.models;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Entity
public class Hall extends BaseModel{
    private Integer hallNumber;

    @OneToMany
    private List<Seat> seats = new ArrayList();



}
