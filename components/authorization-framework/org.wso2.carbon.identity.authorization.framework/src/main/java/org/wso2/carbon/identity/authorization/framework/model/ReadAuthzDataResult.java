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
 * The {@code ReadAuthzDataResult} class is a model class for an authorization data read result from an authorization
 * engine.
 */
public class ReadAuthzDataResult {

    private AuthorizationResource resourceObject;
    private AuthorizationAction actionObject;
    private AuthorizationSubject subjectObject;
    private HashMap<String, Object> context;

    /**
     * Constructs an {@code ReadAuthzDataResult} object with the resource, action, and subject.
     *
     * @param resourceObject The resource object.
     * @param actionObject   The action object.
     * @param subjectObject  The subject object.
     */
    public ReadAuthzDataResult(AuthorizationResource resourceObject, AuthorizationAction actionObject,
                               AuthorizationSubject subjectObject) {

        this.resourceObject = resourceObject;
        this.actionObject = actionObject;
        this.subjectObject = subjectObject;
    }

    /**
     * Returns the resource object of the authorization data read result.
     *
     * @return The resource object.
     */
    public AuthorizationResource getResourceObject() {

        return resourceObject;
    }

    /**
     * Returns the action object of the authorization data read result.
     *
     * @return The action object.
     */
    public AuthorizationAction getActionObject() {

        return actionObject;
    }

    /**
     * Returns the subject object of the authorization data read result.
     *
     * @return The subject object.
     */
    public AuthorizationSubject getSubjectObject() {

        return subjectObject;
    }

    /**
     * Returns the context of the authorization data read result.
     *
     * @return The context.
     */
    public HashMap<String, Object> getContext() {

        return context;
    }

    /**
     * Sets the context of the authorization data read result.
     *
     * @param context The context.
     */
    public void setContext(HashMap<String, Object> context) {

        this.context = context;
    }
}
