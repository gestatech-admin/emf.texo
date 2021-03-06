/**
 * <copyright>
 * </copyright>
 *
 * $Id: AssociationOverrideImpl.java,v 1.6 2011/10/26 05:29:39 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.texo.orm.annotations.model.orm.AssociationOverride;
import org.eclipse.emf.texo.orm.annotations.model.orm.JoinColumn;
import org.eclipse.emf.texo.orm.annotations.model.orm.JoinTable;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;
import org.eclipse.emf.texo.orm.annotator.ORMJavaAnnotationGenerator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Association Override</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.AssociationOverrideImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.AssociationOverrideImpl#getJoinColumn <em>Join Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.AssociationOverrideImpl#getJoinTable <em>Join Table</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.AssociationOverrideImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationOverrideImpl extends BaseOrmAnnotationImpl implements AssociationOverride {
  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getJoinColumn() <em>Join Column</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getJoinColumn()
   * @generated
   * @ordered
   */
  protected EList<JoinColumn> joinColumn;

  /**
   * The cached value of the '{@link #getJoinTable() <em>Join Table</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getJoinTable()
   * @generated
   * @ordered
   */
  protected JoinTable joinTable;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected AssociationOverrideImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getAssociationOverride();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getDescription() {
    return description;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription) {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ASSOCIATION_OVERRIDE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<JoinColumn> getJoinColumn() {
    if (joinColumn == null) {
      joinColumn = new EObjectContainmentEList<JoinColumn>(JoinColumn.class, this, OrmPackage.ASSOCIATION_OVERRIDE__JOIN_COLUMN);
    }
    return joinColumn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public JoinTable getJoinTable() {
    return joinTable;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJoinTable(JoinTable newJoinTable, NotificationChain msgs) {
    JoinTable oldJoinTable = joinTable;
    joinTable = newJoinTable;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ASSOCIATION_OVERRIDE__JOIN_TABLE, oldJoinTable, newJoinTable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setJoinTable(JoinTable newJoinTable) {
    if (newJoinTable != joinTable) {
      NotificationChain msgs = null;
      if (joinTable != null)
        msgs = ((InternalEObject)joinTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ASSOCIATION_OVERRIDE__JOIN_TABLE, null, msgs);
      if (newJoinTable != null)
        msgs = ((InternalEObject)newJoinTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ASSOCIATION_OVERRIDE__JOIN_TABLE, null, msgs);
      msgs = basicSetJoinTable(newJoinTable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ASSOCIATION_OVERRIDE__JOIN_TABLE, newJoinTable, newJoinTable));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ASSOCIATION_OVERRIDE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmPackage.ASSOCIATION_OVERRIDE__JOIN_COLUMN:
        return ((InternalEList<?>)getJoinColumn()).basicRemove(otherEnd, msgs);
      case OrmPackage.ASSOCIATION_OVERRIDE__JOIN_TABLE:
        return basicSetJoinTable(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.ASSOCIATION_OVERRIDE__DESCRIPTION:
        return getDescription();
      case OrmPackage.ASSOCIATION_OVERRIDE__JOIN_COLUMN:
        return getJoinColumn();
      case OrmPackage.ASSOCIATION_OVERRIDE__JOIN_TABLE:
        return getJoinTable();
      case OrmPackage.ASSOCIATION_OVERRIDE__NAME:
        return getName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case OrmPackage.ASSOCIATION_OVERRIDE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case OrmPackage.ASSOCIATION_OVERRIDE__JOIN_COLUMN:
        getJoinColumn().clear();
        getJoinColumn().addAll((Collection<? extends JoinColumn>)newValue);
        return;
      case OrmPackage.ASSOCIATION_OVERRIDE__JOIN_TABLE:
        setJoinTable((JoinTable)newValue);
        return;
      case OrmPackage.ASSOCIATION_OVERRIDE__NAME:
        setName((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case OrmPackage.ASSOCIATION_OVERRIDE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case OrmPackage.ASSOCIATION_OVERRIDE__JOIN_COLUMN:
        getJoinColumn().clear();
        return;
      case OrmPackage.ASSOCIATION_OVERRIDE__JOIN_TABLE:
        setJoinTable((JoinTable)null);
        return;
      case OrmPackage.ASSOCIATION_OVERRIDE__NAME:
        setName(NAME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case OrmPackage.ASSOCIATION_OVERRIDE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case OrmPackage.ASSOCIATION_OVERRIDE__JOIN_COLUMN:
        return joinColumn != null && !joinColumn.isEmpty();
      case OrmPackage.ASSOCIATION_OVERRIDE__JOIN_TABLE:
        return joinTable != null;
      case OrmPackage.ASSOCIATION_OVERRIDE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (description: "); //$NON-NLS-1$
    result.append(description);
    result.append(", name: "); //$NON-NLS-1$
    result.append(name);
    result.append(')');
    return result.toString();
  }

  @Override
  public String getJavaAnnotation(String identifier) {
    final List<EStructuralFeature> features = new ArrayList<EStructuralFeature>();
    features.add(OrmPackage.eINSTANCE.getAssociationOverride_JoinColumn());
    features.add(OrmPackage.eINSTANCE.getAssociationOverride_JoinTable());
    features.add(OrmPackage.eINSTANCE.getAssociationOverride_Name());

    return ORMJavaAnnotationGenerator.getInstance().generateJavaAnnotation(this, features, true, identifier);
  }

} // AssociationOverrideImpl
