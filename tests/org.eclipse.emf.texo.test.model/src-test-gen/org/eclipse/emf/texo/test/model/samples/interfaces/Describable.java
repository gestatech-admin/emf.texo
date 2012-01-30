package org.eclipse.emf.texo.test.model.samples.interfaces;

import javax.persistence.Access;
import javax.persistence.AccessType;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableInterface;

/**
 * A representation of the model object '<em><b>Describable</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Access(AccessType.PROPERTY)
public interface Describable extends IdentifiableInterface {

  /**
   * Returns the value of '<em><b>description</em></b>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>description</b></em>' feature
   * @generated
   */
  public String getDescription();

  /**
   * Sets the '{@link Describable#getDescription() <em>description</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Describable#getDescription() <em>description</em>}' feature.
   * @generated
   */
  public void setDescription(String newDescription);

}
