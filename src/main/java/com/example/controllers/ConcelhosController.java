/*
 * CodigoPostalPortugalLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.type.TypeReference;

import com.example.*;
import com.example.models.*;
import com.example.exceptions.*;
import com.example.http.client.HttpClient;
import com.example.http.client.HttpContext;
import com.example.http.request.HttpRequest;
import com.example.http.response.HttpResponse;
import com.example.http.response.HttpStringResponse;
import com.example.http.client.APICallBack;
import com.example.controllers.syncwrapper.APICallBackCatcher;

public class ConcelhosController extends BaseController {
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static ConcelhosController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the ConcelhosController class 
     */
    public static ConcelhosController getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new ConcelhosController();
                }
            }
        }
        return instance;
    }

    /**
     * Obter todos os concelhos
     * @return    Returns the List<ConTodos1> response from the API call 
     */
    public List<ConTodos1> getConTodos(
    ) throws Throwable {

        HttpRequest _request = _buildGetConTodosRequest();
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleGetConTodosResponse(_context);
    }

    /**
     * Obter todos os concelhos
     */
    public void getConTodosAsync(
                final APICallBack<List<ConTodos1>> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildGetConTodosRequest();
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            List<ConTodos1> returnValue = _handleGetConTodosResponse(_context);
                            callBack.onSuccess(_context, returnValue);
                        } catch (Exception e) {
                            callBack.onFailure(_context, e);
                        }
                    }

                    public void onFailure(HttpContext _context, Throwable _exception) {
                        // Let the caller know of the failure
                        callBack.onFailure(_context, _exception);
                    }
                });
            }
        };

        // Execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Builds the HttpRequest object for getConTodos
     */
    private HttpRequest _buildGetConTodosRequest() throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/concelhos");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();
        _headers.put("user-agent", BaseController.userAgent);
        _headers.put("accept", "application/json");


        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for getConTodos
     * @return An object of type List<ConTodos1>
     */
    private List<ConTodos1> _handleGetConTodosResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        String _responseBody = ((HttpStringResponse)_response).getBody();
        List<ConTodos1> _result = APIHelper.deserialize(_responseBody,
									new TypeReference<List<ConTodos1>>(){});

        return _result;
    }

    /**
     * Obter todos os concelhos de um distrito
     * @param    designacaoDistrito    Required parameter: Example: 
     * @return    Returns the List<ConPorDist1> response from the API call 
     */
    public List<ConPorDist1> getConPorDist(
                final String designacaoDistrito
    ) throws Throwable {

        HttpRequest _request = _buildGetConPorDistRequest(designacaoDistrito);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleGetConPorDistResponse(_context);
    }

    /**
     * Obter todos os concelhos de um distrito
     * @param    designacaoDistrito    Required parameter: Example: 
     */
    public void getConPorDistAsync(
                final String designacaoDistrito,
                final APICallBack<List<ConPorDist1>> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildGetConPorDistRequest(designacaoDistrito);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            List<ConPorDist1> returnValue = _handleGetConPorDistResponse(_context);
                            callBack.onSuccess(_context, returnValue);
                        } catch (Exception e) {
                            callBack.onFailure(_context, e);
                        }
                    }

                    public void onFailure(HttpContext _context, Throwable _exception) {
                        // Let the caller know of the failure
                        callBack.onFailure(_context, _exception);
                    }
                });
            }
        };

        // Execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Builds the HttpRequest object for getConPorDist
     */
    private HttpRequest _buildGetConPorDistRequest(
                final String designacaoDistrito) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/concelhos");

        //process query parameters
        Map<String, Object> _queryParameters = new HashMap<String, Object>();
        _queryParameters.put("designacaoDistrito", designacaoDistrito);
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();
        _headers.put("user-agent", BaseController.userAgent);
        _headers.put("accept", "application/json");


        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for getConPorDist
     * @return An object of type List<ConPorDist1>
     */
    private List<ConPorDist1> _handleGetConPorDistResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        String _responseBody = ((HttpStringResponse)_response).getBody();
        List<ConPorDist1> _result = APIHelper.deserialize(_responseBody,
									new TypeReference<List<ConPorDist1>>(){});

        return _result;
    }

    /**
     * Obter um ou mais concelhos
     * @param    designacaoConcelho    Required parameter: Example: 
     * @return    Returns the List<ConUmConcelho1> response from the API call 
     */
    public List<ConUmConcelho1> getConUmConcelho(
                final String designacaoConcelho
    ) throws Throwable {

        HttpRequest _request = _buildGetConUmConcelhoRequest(designacaoConcelho);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleGetConUmConcelhoResponse(_context);
    }

    /**
     * Obter um ou mais concelhos
     * @param    designacaoConcelho    Required parameter: Example: 
     */
    public void getConUmConcelhoAsync(
                final String designacaoConcelho,
                final APICallBack<List<ConUmConcelho1>> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildGetConUmConcelhoRequest(designacaoConcelho);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            List<ConUmConcelho1> returnValue = _handleGetConUmConcelhoResponse(_context);
                            callBack.onSuccess(_context, returnValue);
                        } catch (Exception e) {
                            callBack.onFailure(_context, e);
                        }
                    }

                    public void onFailure(HttpContext _context, Throwable _exception) {
                        // Let the caller know of the failure
                        callBack.onFailure(_context, _exception);
                    }
                });
            }
        };

        // Execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Builds the HttpRequest object for getConUmConcelho
     */
    private HttpRequest _buildGetConUmConcelhoRequest(
                final String designacaoConcelho) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/concelhos");

        //process query parameters
        Map<String, Object> _queryParameters = new HashMap<String, Object>();
        _queryParameters.put("designacaoConcelho", designacaoConcelho);
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();
        _headers.put("user-agent", BaseController.userAgent);
        _headers.put("accept", "application/json");


        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for getConUmConcelho
     * @return An object of type List<ConUmConcelho1>
     */
    private List<ConUmConcelho1> _handleGetConUmConcelhoResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        String _responseBody = ((HttpStringResponse)_response).getBody();
        List<ConUmConcelho1> _result = APIHelper.deserialize(_responseBody,
									new TypeReference<List<ConUmConcelho1>>(){});

        return _result;
    }

    /**
     * Obter um ou mais concelhos num determinado distrito.
     * @param    designacaoDistrito    Required parameter: Example: 
     * @param    designacaoConcelho    Required parameter: Example: 
     * @return    Returns the List<ConNumDist1> response from the API call 
     */
    public List<ConNumDist1> getConNumDist(
                final String designacaoDistrito,
                final String designacaoConcelho
    ) throws Throwable {

        HttpRequest _request = _buildGetConNumDistRequest(designacaoDistrito, designacaoConcelho);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleGetConNumDistResponse(_context);
    }

    /**
     * Obter um ou mais concelhos num determinado distrito.
     * @param    designacaoDistrito    Required parameter: Example: 
     * @param    designacaoConcelho    Required parameter: Example: 
     */
    public void getConNumDistAsync(
                final String designacaoDistrito,
                final String designacaoConcelho,
                final APICallBack<List<ConNumDist1>> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildGetConNumDistRequest(designacaoDistrito, designacaoConcelho);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            List<ConNumDist1> returnValue = _handleGetConNumDistResponse(_context);
                            callBack.onSuccess(_context, returnValue);
                        } catch (Exception e) {
                            callBack.onFailure(_context, e);
                        }
                    }

                    public void onFailure(HttpContext _context, Throwable _exception) {
                        // Let the caller know of the failure
                        callBack.onFailure(_context, _exception);
                    }
                });
            }
        };

        // Execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Builds the HttpRequest object for getConNumDist
     */
    private HttpRequest _buildGetConNumDistRequest(
                final String designacaoDistrito,
                final String designacaoConcelho) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/concelhos");

        //process query parameters
        Map<String, Object> _queryParameters = new HashMap<String, Object>();
        _queryParameters.put("designacaoDistrito", designacaoDistrito);
        _queryParameters.put("designacaoConcelho", designacaoConcelho);
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();
        _headers.put("user-agent", BaseController.userAgent);
        _headers.put("accept", "application/json");


        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for getConNumDist
     * @return An object of type List<ConNumDist1>
     */
    private List<ConNumDist1> _handleGetConNumDistResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //Error handling using HTTP status codes
        int _responseCode = _response.getStatusCode();

        if (_responseCode == 501) {
            throw new ConErro1Exception("Not Implemented", _context);
        }
        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        String _responseBody = ((HttpStringResponse)_response).getBody();
        List<ConNumDist1> _result = APIHelper.deserialize(_responseBody,
									new TypeReference<List<ConNumDist1>>(){});

        return _result;
    }

    /**
     * Erro. Parâmetros válidos: [ designacaoDistrito | designacaoConcelho ]
     * @param    designacaoDistrito    Required parameter: Example: 
     * @param    designacaoConcelho    Required parameter: Example: 
     * @param    cidade    Required parameter: Example: 
     * @return    Returns the List<ConNumDist1> response from the API call 
     */
    public List<ConNumDist1> getConErro1(
                final String designacaoDistrito,
                final String designacaoConcelho,
                final String cidade
    ) throws Throwable {

        HttpRequest _request = _buildGetConErro1Request(designacaoDistrito, designacaoConcelho, cidade);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleGetConErro1Response(_context);
    }

    /**
     * Erro. Parâmetros válidos: [ designacaoDistrito | designacaoConcelho ]
     * @param    designacaoDistrito    Required parameter: Example: 
     * @param    designacaoConcelho    Required parameter: Example: 
     * @param    cidade    Required parameter: Example: 
     */
    public void getConErro1Async(
                final String designacaoDistrito,
                final String designacaoConcelho,
                final String cidade,
                final APICallBack<List<ConNumDist1>> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildGetConErro1Request(designacaoDistrito, designacaoConcelho, cidade);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            List<ConNumDist1> returnValue = _handleGetConErro1Response(_context);
                            callBack.onSuccess(_context, returnValue);
                        } catch (Exception e) {
                            callBack.onFailure(_context, e);
                        }
                    }

                    public void onFailure(HttpContext _context, Throwable _exception) {
                        // Let the caller know of the failure
                        callBack.onFailure(_context, _exception);
                    }
                });
            }
        };

        // Execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Builds the HttpRequest object for getConErro1
     */
    private HttpRequest _buildGetConErro1Request(
                final String designacaoDistrito,
                final String designacaoConcelho,
                final String cidade) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/concelhos");

        //process query parameters
        Map<String, Object> _queryParameters = new HashMap<String, Object>();
        _queryParameters.put("designacaoDistrito", designacaoDistrito);
        _queryParameters.put("designacaoConcelho", designacaoConcelho);
        _queryParameters.put("Cidade", cidade);
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();
        _headers.put("user-agent", BaseController.userAgent);
        _headers.put("accept", "application/json");


        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for getConErro1
     * @return An object of type List<ConNumDist1>
     */
    private List<ConNumDist1> _handleGetConErro1Response(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //Error handling using HTTP status codes
        int _responseCode = _response.getStatusCode();

        if (_responseCode == 501) {
            throw new ConErro1Exception("Not Implemented", _context);
        }
        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        String _responseBody = ((HttpStringResponse)_response).getBody();
        List<ConNumDist1> _result = APIHelper.deserialize(_responseBody,
									new TypeReference<List<ConNumDist1>>(){});

        return _result;
    }

    /**
     * Erro. Parâmetros válidos: [ designacaoDistrito | designacaoConcelho ]
     * @param    nomeDistrito    Required parameter: Example: 
     * @param    designacaoConcelho    Required parameter: Example: 
     * @return    Returns the List<ConNumDist1> response from the API call 
     */
    public List<ConNumDist1> getConErro2(
                final String nomeDistrito,
                final String designacaoConcelho
    ) throws Throwable {

        HttpRequest _request = _buildGetConErro2Request(nomeDistrito, designacaoConcelho);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleGetConErro2Response(_context);
    }

    /**
     * Erro. Parâmetros válidos: [ designacaoDistrito | designacaoConcelho ]
     * @param    nomeDistrito    Required parameter: Example: 
     * @param    designacaoConcelho    Required parameter: Example: 
     */
    public void getConErro2Async(
                final String nomeDistrito,
                final String designacaoConcelho,
                final APICallBack<List<ConNumDist1>> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildGetConErro2Request(nomeDistrito, designacaoConcelho);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            List<ConNumDist1> returnValue = _handleGetConErro2Response(_context);
                            callBack.onSuccess(_context, returnValue);
                        } catch (Exception e) {
                            callBack.onFailure(_context, e);
                        }
                    }

                    public void onFailure(HttpContext _context, Throwable _exception) {
                        // Let the caller know of the failure
                        callBack.onFailure(_context, _exception);
                    }
                });
            }
        };

        // Execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Builds the HttpRequest object for getConErro2
     */
    private HttpRequest _buildGetConErro2Request(
                final String nomeDistrito,
                final String designacaoConcelho) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/concelhos");

        //process query parameters
        Map<String, Object> _queryParameters = new HashMap<String, Object>();
        _queryParameters.put("nomeDistrito", nomeDistrito);
        _queryParameters.put("designacaoConcelho", designacaoConcelho);
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();
        _headers.put("user-agent", BaseController.userAgent);
        _headers.put("accept", "application/json");


        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for getConErro2
     * @return An object of type List<ConNumDist1>
     */
    private List<ConNumDist1> _handleGetConErro2Response(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //Error handling using HTTP status codes
        int _responseCode = _response.getStatusCode();

        if (_responseCode == 404) {
            throw new ConErro1Exception("Not Found", _context);
        }
        if (_responseCode == 501) {
            throw new ConErro1Exception("Not Implemented", _context);
        }
        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        String _responseBody = ((HttpStringResponse)_response).getBody();
        List<ConNumDist1> _result = APIHelper.deserialize(_responseBody,
									new TypeReference<List<ConNumDist1>>(){});

        return _result;
    }

}
