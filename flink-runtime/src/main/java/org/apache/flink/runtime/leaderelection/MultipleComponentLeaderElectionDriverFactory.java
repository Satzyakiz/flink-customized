/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.flink.runtime.leaderelection;

import org.apache.flink.runtime.rpc.FatalErrorHandler;

/** Factory for {@link MultipleComponentLeaderElectionDriver}. */
public interface MultipleComponentLeaderElectionDriverFactory {

    /**
     * Creates a {@link MultipleComponentLeaderElectionDriver} for the given leader contender
     * description. Moreover, it registers the given leader election listener with the service.
     *
     * @param leaderElectionListener listener for the callbacks of the {@link
     *     MultipleComponentLeaderElectionDriver}
     * @param fatalErrorHandler component for handling fatal errors.
     * @return created {@link MultipleComponentLeaderElectionDriver} instance
     * @throws Exception if the creation fails
     */
    MultipleComponentLeaderElectionDriver create(
            MultipleComponentLeaderElectionDriver.Listener leaderElectionListener,
            FatalErrorHandler fatalErrorHandler)
            throws Exception;
}
