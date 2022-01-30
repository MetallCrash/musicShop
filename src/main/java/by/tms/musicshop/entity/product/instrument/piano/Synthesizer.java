package by.tms.musicshop.entity.product.instrument.piano;

import by.tms.musicshop.entity.product.Product;
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
public class Synthesizer extends Product {

    private int numberOfKeys;

    @Enumerated(EnumType.STRING)
    private SynthesizerCompany manufacturer;
}
