/*
 * #%L
 * BroadleafCommerce Framework
 * %%
 * Copyright (C) 2009 - 2013 Broadleaf Commerce
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package org.broadleafcommerce.admin.server.service.extension;

import org.broadleafcommerce.common.exception.ServiceException;
import org.broadleafcommerce.common.extension.ExtensionHandler;
import org.broadleafcommerce.common.extension.ExtensionResultStatusType;
import org.broadleafcommerce.core.catalog.domain.Category;
import org.broadleafcommerce.openadmin.dto.PersistencePackage;

/**
 * Extension handler for {@link org.broadleafcommerce.admin.server.service.handler.CategoryCustomPersistenceHandler}
 *
 * @author Jeff Fischer
 */
public interface CategoryCustomPersistenceHandlerExtensionHandler extends ExtensionHandler {

    /**
     * Perform any special handling for the parent category during a category add
     *
     * @param category
     * @return
     */
    ExtensionResultStatusType manageParentCategoryForAdd(PersistencePackage persistencePackage, Category category) throws ServiceException;

    /**
     * Perform any special handling for the parent category during a category update
     *
     * @param category
     * @return
     */
    ExtensionResultStatusType manageParentCategoryForUpdate(PersistencePackage persistencePackage, Category category) throws ServiceException;
}
