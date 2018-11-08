/*
 * CyberSource Flex API
 * Simple PAN tokenization service
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Api;

import Invokers.ApiCallback;
import Invokers.ApiClient;
import Invokers.ApiException;
import Invokers.ApiResponse;
import Invokers.Configuration;
import Invokers.Pair;
import Invokers.ProgressRequestBody;
import Invokers.ProgressResponseBody;

import com.cybersource.authsdk.core.MerchantConfig;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import Model.CreateCreditRequest;
import Model.PtsV2CreditsPost201Response;
import Model.PtsV2PaymentsPost502Response;
import Model.PtsV2PaymentsRefundPost400Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreditApi {
    private ApiClient apiClient;

    public CreditApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CreditApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createCredit
     * @param createCreditRequest  (required)
     * @param merchantConfig  (merchant details)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createCreditCall(CreateCreditRequest createCreditRequest,MerchantConfig merchantConfig, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createCreditRequest;
        
        // create path and map variables
        String localVarPath = "/pts/v2/credits/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", merchantConfig, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createCreditValidateBeforeCall(CreateCreditRequest createCreditRequest,MerchantConfig merchantConfig, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'createCreditRequest' is set
        if (createCreditRequest == null) {
            throw new ApiException("Missing the required parameter 'createCreditRequest' when calling createCredit(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createCreditCall(createCreditRequest,merchantConfig, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Process a Credit
     * POST to the credit resource to credit funds to a specified credit card.
     * @param createCreditRequest  (required)
     *@param merchantConfig  (merchant details)
     * @return PtsV2CreditsPost201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PtsV2CreditsPost201Response createCredit(CreateCreditRequest createCreditRequest,MerchantConfig merchantConfig) throws ApiException {
        ApiResponse<PtsV2CreditsPost201Response> resp = createCreditWithHttpInfo(createCreditRequest,merchantConfig);
        return resp.getData();
    }

    /**
     * Process a Credit
     * POST to the credit resource to credit funds to a specified credit card.
     * @param createCreditRequest  (required)
     * @param merchantConfig  (merchant details)
     * @return ApiResponse&lt;PtsV2CreditsPost201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PtsV2CreditsPost201Response> createCreditWithHttpInfo(CreateCreditRequest createCreditRequest,MerchantConfig merchantConfig) throws ApiException {
        com.squareup.okhttp.Call call = createCreditValidateBeforeCall(createCreditRequest,merchantConfig, null, null);
        Type localVarReturnType = new TypeToken<PtsV2CreditsPost201Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Process a Credit (asynchronously)
     * POST to the credit resource to credit funds to a specified credit card.
     * @param createCreditRequest  (required)
     * @param merchantConfig  (merchant details)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createCreditAsync(CreateCreditRequest createCreditRequest,MerchantConfig merchantConfig, final ApiCallback<PtsV2CreditsPost201Response> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createCreditValidateBeforeCall(createCreditRequest,merchantConfig, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PtsV2CreditsPost201Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
