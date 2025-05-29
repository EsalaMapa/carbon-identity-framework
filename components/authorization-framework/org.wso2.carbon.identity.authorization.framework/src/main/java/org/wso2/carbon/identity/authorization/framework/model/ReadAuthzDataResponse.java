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

import java.util.ArrayList;

/**
 * The {@code ReadAuthzDataResponse} class is a model class for an authorization data read response which contains a
 * list of authorization data from an authorization data store in an Authorization Engine.
 */
public class ReadAuthzDataResponse {

    private ArrayList<ReadAuthzDataResult> results;

    /**
     * Constructs an {@code ReadAuthzDataResponse} object with the list of authorization data read results.
     *
     * @param results The list of authorization data read results.
     */
    public ReadAuthzDataResponse(ArrayList<ReadAuthzDataResult> results) {

        this.results = results;
    }

    /**
     * Returns the list of authorization data read results.
     *
     * @return The list of authorization data read results.
     */
    public ArrayList<ReadAuthzDataResult> getResults() {

        return results;
    }
}
