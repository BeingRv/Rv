package com.being.beingRv.Model;





import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
public class Trade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter
    private Long id;

    private String date;
    private String instrument;
    private String position;
    private Integer lotSize;
    private String entryReason;
    private String slTarget;
    private String exitPrice;
    private Integer pnl;
    private String remarks;
    private Integer disciplineRating; // new field for rating discipline 1-5

    public void setId(Long id) {
        this.id=id;
    }
}

