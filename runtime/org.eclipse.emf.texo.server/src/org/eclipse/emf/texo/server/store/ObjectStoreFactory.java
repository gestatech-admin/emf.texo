/**
 * <copyright>
 *
 * Copyright (c) 2011 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: WebServiceHandler.java,v 1.8 2011/09/14 15:35:48 mtaal Exp $
 */
package org.eclipse.emf.texo.server.store;

import javax.servlet.http.HttpServletRequest;

import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.component.TexoComponent;
import org.eclipse.emf.texo.server.web.WebServiceHandler;
import org.eclipse.emf.texo.store.EMFResourceObjectStore;
import org.eclipse.emf.texo.store.MemoryObjectStore;
import org.eclipse.emf.texo.store.ObjectStore;

/**
 * A factory for creating an {@link ObjectStore} by a {@link WebServiceHandler}. The {@link ObjectStoreFactory} is a
 * Texo component so you can create/set your own instance.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class ObjectStoreFactory implements TexoComponent {

  private static ObjectStoreFactory instance = null;

  public static ObjectStoreFactory getInstance() {
    if (instance == null) {
      instance = ComponentProvider.getInstance().newInstance(ObjectStoreFactory.class);
    }
    return instance;
  }

  public static void setInstance(ObjectStoreFactory objectStoreFactory) {
    instance = objectStoreFactory;
  }

  public ObjectStore createObjectStore(HttpServletRequest request, String objectStoreUri) {
    final ObjectStore objectStore = createObjectStoreLocal(request, objectStoreUri);
    objectStore.setUri(objectStoreUri);
    return objectStore;
  }

  /**
   * Override point if you want to create another type of objectstore. As a default calls this
   * {@link #createEntityManagerObjectStore()}
   */
  protected ObjectStore createObjectStoreLocal(HttpServletRequest request, String objectStoreUri) {
    return createEntityManagerObjectStore();
  }

  protected ObjectStore createEMFResourceObjectStore() {
    return ComponentProvider.getInstance().newInstance(EMFResourceObjectStore.class);
  }

  protected ObjectStore createMemoryObjectStore() {
    return ComponentProvider.getInstance().newInstance(MemoryObjectStore.class);
  }

  protected ObjectStore createEntityManagerObjectStore() {
    return ComponentProvider.getInstance().newInstance(EntityManagerObjectStore.class);
  }
}
