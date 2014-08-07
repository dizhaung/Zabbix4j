/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Suguru Yajima
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.zabbix4j.hostinteface;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiMethod;

/**
 * Created by Suguru Yajima on 2014/05/08.
 */
public class HostInterface extends ZabbixApiMethod {

    public HostInterface(String apiUrl, String auth) {
        super(apiUrl, auth);
    }

    /**
     * This method allows to create new host interfaces.</br>
     * see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/hostinterface/create">hostinterface.create</a>
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     */
    public HostInterfaceCreateResponse create(HostInterfaceCreateRequest request) throws ZabbixApiException {
        HostInterfaceCreateResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        String responseJson = sendRequest(requestJson);

        response = gson.fromJson(responseJson, HostInterfaceCreateResponse.class);

        return response;
    }

    /**
     * The method allows to retrieve host interfaces according to the given parameters.</br>
     * <p/>
     * see <a href="https://www.zabbix.com/documentation/2.2/manual/api/reference/hostinterface/get">hostinterface.get</a>
     *
     * @param request
     * @return
     * @throws ZabbixApiException
     */
    public HostInterfaceGetResponse get(HostInterfaceGetRequest request) throws ZabbixApiException {
        HostInterfaceGetResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        String responseJson = sendRequest(requestJson);

        response = gson.fromJson(responseJson, HostInterfaceGetResponse.class);

        return response;
    }
}
