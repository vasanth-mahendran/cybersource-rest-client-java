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

import org.junit.Ignore;
import org.junit.Test;

import Invokers.ApiException;
import Model.PtsV2PaymentsRefundPost201Response;
import Model.RefundCaptureRequest;
import Model.RefundPaymentRequest;

/**
 * API tests for RefundApi
 */
@Ignore
public class RefundApiTest {

    private final RefundApi api = new RefundApi();

    
    /**
     * Refund a Capture
     *
     * Include the capture ID in the POST request to refund the captured amount. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void refundCaptureTest() throws ApiException {
        RefundCaptureRequest refundCaptureRequest = null;
        String id = null;
        PtsV2PaymentsRefundPost201Response response = api.refundCapture(refundCaptureRequest, id, null);

        // TODO: test validations
    }
    
    /**
     * Refund a Payment
     *
     * Include the payment ID in the POST request to refund the payment amount. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void refundPaymentTest() throws ApiException {
        RefundPaymentRequest refundPaymentRequest = null;
        String id = null;
        PtsV2PaymentsRefundPost201Response response = api.refundPayment(refundPaymentRequest, id, null);

        // TODO: test validations
    }
    
}
