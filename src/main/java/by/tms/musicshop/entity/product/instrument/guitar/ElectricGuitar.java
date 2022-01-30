package by.tms.musicshop.entity.product.instrument.guitar;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ElectricGuitar extends Guitar {

    @Enumerated(EnumType.STRING)
    private ElectricGuitarCompany manufacturer;

    @Enumerated(EnumType.STRING)
    private ElectricGuitarBodyType bodyType;
}
