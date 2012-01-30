package org.eclipse.emf.texo.test.model.samples.rental;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

/**
 * A representation of the model object '<em><b>RentalBicycle</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "RentalBicycle")
public class RentalBicycle extends RentalUnit {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private RentalBicycleType type = RentalBicycleType.STANDARD;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true, targetEntity = RentalCar.class)
  @JoinColumns({ @JoinColumn() })
  private RentalCar rentalCar = null;

  /**
   * Returns the value of '<em><b>type</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>type</b></em>' feature
   * @generated
   */
  public RentalBicycleType getType() {
    return type;
  }

  /**
   * Sets the '{@link RentalBicycle#getType() <em>type</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link RentalBicycle#getType() type}' feature.
   * @generated
   */
  public void setType(RentalBicycleType newType) {
    type = newType;
  }

  /**
   * Returns the value of '<em><b>rentalCar</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>rentalCar</b></em>' feature
   * @generated
   */
  public RentalCar getRentalCar() {
    return rentalCar;
  }

  /**
   * Sets the '{@link RentalBicycle#getRentalCar() <em>rentalCar</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link RentalBicycle#getRentalCar() rentalCar}' feature.
   * @generated
   */
  public void setRentalCar(RentalCar newRentalCar) {
    rentalCar = newRentalCar;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "RentalBicycle " + " [type: " + getType() + "]";
  }
}
