package legoset;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Minifig {

    @XmlValue
    private int count;
    @XmlAttribute
    private String minifig;

    public Minifig(String minifig, int count) {
        this.minifig = minifig;
        this.count = count;
    }
}
