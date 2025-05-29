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
import java.util.List;

/**
 * The {@code WriteAuthzDataRequest} class is a model class for an authorization data write request which contains a
 * list of updates to be made to the authorization data store in the Authorization Engine. This can be used to update
 * data as well.
 */
public class WriteAuthzDataRequest {

    private List<WriteAuthzDataItem> updates;
    private HashMap<String, Object> context;

    /**
     * Constructs an {@code WriteAuthzDataRequest} object with the list of updates to be made to the authorization data
     * store.
     *
     * @param updates The list of updates to be made to the authorization data store.
     */
    public WriteAuthzDataRequest(List<WriteAuthzDataItem> updates) {

        this.updates = updates;
    }

    /**
     * Returns the context of the authorization data write request.
     *
     * @return The context of the authorization data write request.
     */
    public HashMap<String, Object> getContext() {

        return context;
    }

    /**
     * Sets the context of the authorization data write request.
     *
     * @param context The context of the authorization data write request.
     */
    public void setContext(HashMap<String, Object> context) {

        this.context = context;
    }

    /**
     * Returns the list of updates to be made to the authorization data store.
     *
     * @return The list of updates to be made to the authorization data store.
     */
    public List<WriteAuthzDataItem> getUpdatesList() {

        return updates;
    }
}
