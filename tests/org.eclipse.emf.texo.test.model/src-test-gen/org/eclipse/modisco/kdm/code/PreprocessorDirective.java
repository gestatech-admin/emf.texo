package org.eclipse.modisco.kdm.code;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>PreprocessorDirective</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "code_PreprocessorDirective")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class PreprocessorDirective extends AbstractCodeElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<AbstractCodeElement> codeElement = new HashSet<AbstractCodeElement>();

  /**
   * Returns the value of '<em><b>codeElement</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>codeElement</b></em>' feature
   * @generated
   */
  public Set<AbstractCodeElement> getCodeElement() {
    return codeElement;
  }

  /**
   * Sets the '{@link PreprocessorDirective#getCodeElement() <em>codeElement</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCodeElement
   *          the new value of the '{@link PreprocessorDirective#getCodeElement() codeElement}' feature.
   * @generated
   */
  public void setCodeElement(Set<AbstractCodeElement> newCodeElement) {
    codeElement = newCodeElement;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "PreprocessorDirective " + "{extends: " + super.toString() + "} ";
  }
}
