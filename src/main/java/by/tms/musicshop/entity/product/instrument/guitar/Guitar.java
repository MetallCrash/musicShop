package by.tms.musicshop.entity.product.instrument.guitar;

import by.tms.musicshop.entity.product.Material;
import by.tms.musicshop.entity.product.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
//@MappedSuperclass
public abstract class Guitar extends Product {

    private int numberOfStrings;
    private int numberOfFrets;
    private boolean pickups;

    @Enumerated(EnumType.STRING)
    private Material bodyMaterial;

    @Enumerated(EnumType.STRING)
    private Material fingerBoardMaterial;
}
