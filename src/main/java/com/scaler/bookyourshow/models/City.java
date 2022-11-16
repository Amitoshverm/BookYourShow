package com.scaler.bookyourshow.models;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Entity
@Table(name ="CITIES")
@NoArgsConstructor
public class City extends BaseModel{

    private String name;

    @OneToMany
    private List<Theatre> theatres = new ArrayList<>();

}
