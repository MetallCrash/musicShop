package by.tms.musicshop.entity.product.equipment.microphone;

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
public class Microphone extends Product {

    @Enumerated(EnumType.STRING)
    private MicrophoneCompany manufacturer;

    @Enumerated(EnumType.STRING)
    private MicrophoneType type;

    private String frequencyRange;
    private int inputPower;
    private int selfNoiseLevel;
}
