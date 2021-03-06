package org.eclipse.modisco.kdm.ui.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.ui.UIResource;
import org.eclipse.modisco.kdm.ui.UiModelPackage;

/**
 * The Dao implementation for the model object '<em><b>UIResource</b></em>'.
 * 
 * @generated
 */
public class UIResourceDao extends BaseDao<UIResource> {

  /**
   * @generated
   */
  @Override
  public Class<UIResource> getEntityClass() {
    return UIResource.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return UiModelPackage.INSTANCE.getUIResourceEClass();
  }
}
