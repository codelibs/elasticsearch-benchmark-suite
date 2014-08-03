/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.codelibs.bench.core.action;

import org.elasticsearch.action.ActionListener;
import org.elasticsearch.action.ActionRequestBuilder;
import org.elasticsearch.client.Client;

/**
 * Request builder for benchmark status
 */
public class BenchmarkStatusRequestBuilder extends ActionRequestBuilder<BenchmarkStatusRequest, BenchmarkStatusResponse, BenchmarkStatusRequestBuilder, Client> {

    public BenchmarkStatusRequestBuilder(Client client) {
        super(client, new BenchmarkStatusRequest());
    }

    @Override
    protected void doExecute(ActionListener<BenchmarkStatusResponse> listener) {
        // client.benchStatus(request, listener);
        client.execute(BenchmarkStatusAction.INSTANCE, request, listener);
    }
}
