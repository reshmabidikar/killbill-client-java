package org.killbill.billing.client.api.gen;


import org.killbill.billing.client.model.gen.CustomField;
import org.killbill.billing.client.model.gen.Payment;
import org.killbill.billing.client.model.gen.PaymentTransaction;
import org.killbill.billing.client.model.gen.Tag;
import java.util.UUID;
import org.killbill.billing.client.model.CustomFields;
import java.util.List;
import org.killbill.billing.util.api.AuditLevel;
import org.killbill.billing.client.model.Tags;


import com.google.common.collect.Multimap;
import com.google.common.base.Preconditions;
import com.google.common.collect.HashMultimap;
import com.google.common.base.MoreObjects;

import org.killbill.billing.client.KillBillClientException;
import org.killbill.billing.client.KillBillHttpClient;
import org.killbill.billing.client.RequestOptions;
import org.killbill.billing.util.api.AuditLevel;


/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
public class PaymentTransactionApi {

    private final KillBillHttpClient httpClient;

    public PaymentTransactionApi() {
        this(new KillBillHttpClient());
    }

    public PaymentTransactionApi(final KillBillHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public CustomFields createCustomFields(final UUID transactionId, final CustomFields body,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(transactionId, "Missing the required parameter 'transactionId' when calling createCustomFields");
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling createCustomFields");

        final String uri = "/1.0/kb/paymentTransactions/{transactionId}/customFields"
          .replaceAll("\\{" + "transactionId" + "\\}", transactionId.toString());


        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        final RequestOptions requestOptions = inputOptions.extend()
            .withFollowLocation(followLocation)
            .build();

        return httpClient.doPost(uri, body, CustomFields.class, requestOptions);
    }

    public void createTags(final UUID transactionId, final String tagList,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(transactionId, "Missing the required parameter 'transactionId' when calling createTags");

        final String uri = "/1.0/kb/paymentTransactions/{transactionId}/tags"
          .replaceAll("\\{" + "transactionId" + "\\}", transactionId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("tagList", String.valueOf(tagList));

        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        final RequestOptions requestOptions = inputOptions.extend()
            .withFollowLocation(followLocation)
            .withQueryParams(queryParams)
            .build();

        httpClient.doPost(uri, null, requestOptions);
    }

    public void deleteCustomFields(final UUID transactionId, final String customFieldList,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(transactionId, "Missing the required parameter 'transactionId' when calling deleteCustomFields");

        final String uri = "/1.0/kb/paymentTransactions/{transactionId}/customFields"
          .replaceAll("\\{" + "transactionId" + "\\}", transactionId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("customFieldList", String.valueOf(customFieldList));

        final RequestOptions requestOptions = inputOptions.extend()
            .withQueryParams(queryParams)
            .build();

        httpClient.doDelete(uri, requestOptions);
    }

    public void deleteTags(final UUID transactionId, final String tagList,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(transactionId, "Missing the required parameter 'transactionId' when calling deleteTags");

        final String uri = "/1.0/kb/paymentTransactions/{transactionId}/tags"
          .replaceAll("\\{" + "transactionId" + "\\}", transactionId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("tagList", String.valueOf(tagList));

        final RequestOptions requestOptions = inputOptions.extend()
            .withQueryParams(queryParams)
            .build();

        httpClient.doDelete(uri, requestOptions);
    }

    public CustomFields getCustomFields(final UUID transactionId, final AuditLevel auditLevel,  final RequestOptions inputOptions) throws KillBillClientException {

        Preconditions.checkNotNull(transactionId, "Missing the required parameter 'transactionId' when calling getCustomFields");

        final String uri = "/1.0/kb/paymentTransactions/{transactionId}/customFields"
          .replaceAll("\\{" + "transactionId" + "\\}", transactionId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("auditLevel", String.valueOf(auditLevel));

        final RequestOptions requestOptions = inputOptions.extend().withQueryParams(queryParams).build();

        return httpClient.doGet(uri, CustomFields.class, requestOptions);
    }

    public Payment getPaymentByTransactionId(final UUID transactionId, final Boolean withPluginInfo, final Boolean withAttempts, final List<String> pluginProperty, final AuditLevel auditLevel,  final RequestOptions inputOptions) throws KillBillClientException {

        Preconditions.checkNotNull(transactionId, "Missing the required parameter 'transactionId' when calling getPaymentByTransactionId");

        final String uri = "/1.0/kb/paymentTransactions/{transactionId}"
          .replaceAll("\\{" + "transactionId" + "\\}", transactionId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("withPluginInfo", String.valueOf(withPluginInfo));
        queryParams.put("withAttempts", String.valueOf(withAttempts));
        queryParams.put("pluginProperty", String.valueOf(pluginProperty));
        queryParams.put("auditLevel", String.valueOf(auditLevel));

        final RequestOptions requestOptions = inputOptions.extend().withQueryParams(queryParams).build();

        return httpClient.doGet(uri, Payment.class, requestOptions);
    }

    public Tags getTags(final UUID transactionId, final AuditLevel auditLevel, final Boolean includedDeleted,  final RequestOptions inputOptions) throws KillBillClientException {

        Preconditions.checkNotNull(transactionId, "Missing the required parameter 'transactionId' when calling getTags");

        final String uri = "/1.0/kb/paymentTransactions/{transactionId}/tags"
          .replaceAll("\\{" + "transactionId" + "\\}", transactionId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("auditLevel", String.valueOf(auditLevel));
        queryParams.put("includedDeleted", String.valueOf(includedDeleted));

        final RequestOptions requestOptions = inputOptions.extend().withQueryParams(queryParams).build();

        return httpClient.doGet(uri, Tags.class, requestOptions);
    }

    public CustomFields modifyCustomFields(final UUID transactionId, final CustomFields body,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(transactionId, "Missing the required parameter 'transactionId' when calling modifyCustomFields");
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling modifyCustomFields");

        final String uri = "/1.0/kb/paymentTransactions/{transactionId}/customFields"
          .replaceAll("\\{" + "transactionId" + "\\}", transactionId.toString());


        final RequestOptions requestOptions = inputOptions.extend().build();

        return httpClient.doPut(uri, body, CustomFields.class, requestOptions);
    }

    public PaymentTransaction notifyStateChanged(final PaymentTransaction body, final UUID transactionId, final List<String> controlPluginName,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling notifyStateChanged");
        Preconditions.checkNotNull(transactionId, "Missing the required parameter 'transactionId' when calling notifyStateChanged");

        final String uri = "/1.0/kb/paymentTransactions/{transactionId}"
          .replaceAll("\\{" + "transactionId" + "\\}", transactionId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("controlPluginName", String.valueOf(controlPluginName));

        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        final RequestOptions requestOptions = inputOptions.extend()
            .withFollowLocation(followLocation)
            .withQueryParams(queryParams)
            .build();

        return httpClient.doPost(uri, body, PaymentTransaction.class, requestOptions);
    }

}
