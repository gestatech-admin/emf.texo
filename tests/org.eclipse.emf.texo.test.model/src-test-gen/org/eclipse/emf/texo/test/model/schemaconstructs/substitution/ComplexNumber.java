package org.eclipse.emf.texo.test.model.schemaconstructs.substitution;

import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * A representation of the model object '<em><b>ComplexNumber</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "ComplexNumber")
public class ComplexNumber {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private BigInteger value = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String unit = null;

  /**
   * Returns the value of '<em><b>value</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>value</b></em>' feature
   * @generated
   */
  public BigInteger getValue() {
    return value;
  }

  /**
   * Sets the '{@link ComplexNumber#getValue() <em>value</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link ComplexNumber#getValue() value}' feature.
   * @generated
   */
  public void setValue(BigInteger newValue) {
    value = newValue;
  }

  /**
   * Returns the value of '<em><b>unit</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>unit</b></em>' feature
   * @generated
   */
  public String getUnit() {
    return unit;
  }

  /**
   * Sets the '{@link ComplexNumber#getUnit() <em>unit</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link ComplexNumber#getUnit() unit}' feature.
   * @generated
   */
  public void setUnit(String newUnit) {
    unit = newUnit;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ComplexNumber " + " [value: " + getValue() + "]" + " [unit: " + getUnit() + "]";
  }
}
