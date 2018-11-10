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

import org.joda.time.DateTime;
import org.junit.Ignore;
import org.junit.Test;

import Invokers.ApiException;
import Model.PtsV1TransactionBatchesGet200Response;

/**
 * API tests for TransactionBatchesApi
 */
@Ignore
public class TransactionBatchesApiTest {

    private final TransactionBatchesApi api = new TransactionBatchesApi();

    
    /**
     * Get a list of batch files processed through the Offline Transaction Submission Services
     *
     * Provide the search range
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ptsV1TransactionBatchesGetTest() throws ApiException {
        DateTime startTime = null;
        DateTime endTime = null;
        PtsV1TransactionBatchesGet200Response response = api.ptsV1TransactionBatchesGet(startTime, endTime, null);

        // TODO: test validations
    }
    
}
