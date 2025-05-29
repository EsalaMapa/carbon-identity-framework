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
 * The {@code ReadAuthzDataRequest} class is a model class for an authorization data read request that is sent to an
 * authorization engine to read authorization data in its stores.
 */
public class ReadAuthzDataRequest {

    private String resourceType;
    private String resourceId;
    private String subjectType;
    private String subjectId;
    private String action;
    private HashMap<String, Object> context;

    /**
     * Gets the resource type of the authorization data read request.
     * @return The resource type.
     */
    public String getResourceType() {

        return resourceType;
    }

    public String getResourceId() {

        return resourceId;
    }

    public void setResourceId(String resourceId) {

        this.resourceId = resourceId;
    }

    public String getSubjectType() {

        return subjectType;
    }

    public String getSubjectId() {

        return subjectId;
    }

    public void setSubjectId(String subjectId) {

        this.subjectId = subjectId;
    }

    public String getAction() {

        return action;
    }

    public void setAction(String action) {

        this.action = action;
    }

    public HashMap<String, Object> getContext() {

        return context;
    }

    public void setContext(HashMap<String, Object> context) {

        this.context = context;
    }

    public void setResourceType(String resourceType) {

        this.resourceType = resourceType;
    }

    public void setSubjectType(String subjectType) {

        this.subjectType = subjectType;
    }
}
