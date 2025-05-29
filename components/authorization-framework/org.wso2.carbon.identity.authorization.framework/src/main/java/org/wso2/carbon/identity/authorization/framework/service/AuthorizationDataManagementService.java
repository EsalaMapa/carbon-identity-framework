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

package org.wso2.carbon.identity.authorization.framework.service;

import org.wso2.carbon.identity.authorization.framework.exception.AccessEvaluationException;
import org.wso2.carbon.identity.authorization.framework.model.DeleteAuthzDataRequest;
import org.wso2.carbon.identity.authorization.framework.model.ReadAuthzDataRequest;
import org.wso2.carbon.identity.authorization.framework.model.ReadAuthzDataResponse;
import org.wso2.carbon.identity.authorization.framework.model.UpdateAuthzDataResponse;
import org.wso2.carbon.identity.authorization.framework.model.WriteAuthzDataRequest;

/**
 * The {@code AuthorizationDataManagementService} interface contains the methods for CRUD operations in authorization
 * engine.
 * <p>
 *     Implementations of this interface should provide the following functionalities:
 *     <ul>
 *         <li>write authorization data in authorization engine database</li>
 *         <li>read authorization data in authorization engine database</li>
 *         <li>delete authorization data in authorization engine database</li>
 *     </ul>
 *     Implementations can be specific to a particular authorization engine and use the engine's API to perform the
 *     above functionalities. Note that the request models and response models given and returned are generic so you may
 *     need to convert them to the specific models of the authorization engine you are using.
 * </p>
 */
public interface AuthorizationDataManagementService {

    /**
     * Returns the name of the Authorization Engine used for evaluating authorization.
     * <p>
     *     This method should return the name of the Authorization Engine which is used to evaluate authorization to
     *     identify the engine used in a service-oriented architecture. The name should be unique to the engine.
     * </p>
     * @implNote Please ensure that the name returned is unique to the engine.
     * @return The name of the Authorization Engine.
     */
    String getEngineName();

    /**
     * Write authorization data in the authorization engine database.
     *
     * @param writeAuthzDataRequest The request to write authorization data
     * @return The response for the write authorization data request.
     * @throws AccessEvaluationException If an error occurs while checking authorization.
     */
    UpdateAuthzDataResponse writeAuthorizationData(WriteAuthzDataRequest writeAuthzDataRequest)
            throws AccessEvaluationException;

    /**
     * Read authorization data from the authorization engine database.
     *
     * @param readAuthzDataRequest The request to read authorization data
     * @return The response for the read authorization data request.
     * @throws AccessEvaluationException If an error occurs while checking authorization.
     */
    ReadAuthzDataResponse readAuthorizationData(ReadAuthzDataRequest readAuthzDataRequest)
            throws AccessEvaluationException;

    /**
     * Delete authorization data from the authorization engine database.
     *
     * @param deleteAuthzDataRequest The request to delete authorization data
     * @return The response for the delete authorization data request.
     * @throws AccessEvaluationException If an error occurs while checking authorization.
     */
    UpdateAuthzDataResponse deleteAuthorizationData(DeleteAuthzDataRequest deleteAuthzDataRequest)
            throws AccessEvaluationException;
}
