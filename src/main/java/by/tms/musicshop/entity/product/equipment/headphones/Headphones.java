package by.tms.musicshop.entity.product.equipment.headphones;

import by.tms.musicshop.entity.product.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Headphones extends Product {

    @Enumerated(EnumType.STRING)
    private HeadphonesCompany manufacturer;

    @Enumerated(EnumType.STRING)
    private HeadphonesType type;

    private String frequencyRange;
    private int inputPower;
}
