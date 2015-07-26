// default package
// Generated 25/07/2015 18:50:24 by Hibernate Tools 3.2.2.GA


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * UnitValue generated by hbm2java
 */
@Entity
@Table(name="unit_value"
)
public class UnitValue  implements java.io.Serializable {


     private Long id;
     private UnitField unitField;
     private InvoiceLine invoiceLine;
     private BigDecimal value;

    public UnitValue() {
    }

    public UnitValue(UnitField unitField, InvoiceLine invoiceLine, BigDecimal value) {
       this.unitField = unitField;
       this.invoiceLine = invoiceLine;
       this.value = value;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="unit_field_id")
    public UnitField getUnitField() {
        return this.unitField;
    }
    
    public void setUnitField(UnitField unitField) {
        this.unitField = unitField;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="invoice_line_id")
    public InvoiceLine getInvoiceLine() {
        return this.invoiceLine;
    }
    
    public void setInvoiceLine(InvoiceLine invoiceLine) {
        this.invoiceLine = invoiceLine;
    }
    
    @Column(name="value")
    public BigDecimal getValue() {
        return this.value;
    }
    
    public void setValue(BigDecimal value) {
        this.value = value;
    }




}


