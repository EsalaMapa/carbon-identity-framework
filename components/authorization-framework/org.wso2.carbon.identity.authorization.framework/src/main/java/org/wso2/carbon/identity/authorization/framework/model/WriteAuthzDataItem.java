/*
 * Copyright (c) 2025, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.authorization.framework.model;

import java.util.HashMap;

/**
 * The {@code WriteAuthzDataItem} class is a model class for an authorization data write request item which contains
 * the information required to the authorization data store in the Authorization Engine. This can be used to update data
 * as well.
 */
public class WriteAuthzDataItem {

    private String operation;
    private AuthorizationResource resourceObject;
    private AuthorizationAction actionObject;
    private AuthorizationSubject authorizationSubject;
    private HashMap<String, Object> context;

    /**
     * Constructs an {@code WriteAuthzDataItem} object with the operation, resource, action, and subject.
     *
     * @param resourceObject       The resource object.
     * @param actionObject         The action object.
     * @param authorizationSubject The subject object.
     */
    public WriteAuthzDataItem(AuthorizationResource resourceObject, AuthorizationAction actionObject,
                              AuthorizationSubject authorizationSubject) {

        this.resourceObject = resourceObject;
        this.actionObject = actionObject;
        this.authorizationSubject = authorizationSubject;
    }

    /**
     * Sets the operation of the authorization data write item, whether it is a create or update operation.
     *
     * @param operation The operation of the authorization data write item.
     */
    public void setOperation(String operation) {

        this.operation = operation;
    }
    /**
     * Returns the operation of the authorization data write item.
     *
     * @return The operation of the authorization data write item.
     */
    public String getOperation() {

        return operation;
    }

    /**
     * Returns the resource object of the authorization data write item.
     *
     * @return The resource object of the authorization data write item.
     */
    public AuthorizationResource getResourceObject() {

        return resourceObject;
    }

    /**
     * Returns the action object of the authorization data write item.
     *
     * @return The action object of the authorization data write item.
     */
    public AuthorizationAction getActionObject() {

        return actionObject;
    }

    /**
     * Returns the subject object of the authorization data write item.
     *
     * @return The subject object of the authorization data write item.
     */
    public AuthorizationSubject getAuthzSubjectObject() {

        return authorizationSubject;
    }

    /**
     * Returns the context of the authorization data write item.
     *
     * @return The context of the authorization data write item.
     */
    public HashMap<String, Object> getContext() {

        return context;
    }

    /**
     * Sets the context of the authorization data write item.
     *
     * @param context The context of the authorization data write item.
     */
    public void setContext(HashMap<String, Object> context) {

        this.context = context;
    }
}
