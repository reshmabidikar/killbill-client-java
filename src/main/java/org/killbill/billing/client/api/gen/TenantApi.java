package org.killbill.billing.client.api.gen;


import org.killbill.billing.client.model.gen.Tenant;
import java.util.UUID;


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
public class TenantApi {

    private final KillBillHttpClient httpClient;

    public TenantApi() {
        this(new KillBillHttpClient());
    }

    public TenantApi(final KillBillHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public Tenant createTenant(final Tenant body, final Boolean useGlobalDefault,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling createTenant");

        final String uri = "/1.0/kb/tenants";

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("useGlobalDefault", String.valueOf(useGlobalDefault));

        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        final RequestOptions requestOptions = inputOptions.extend()
            .withFollowLocation(followLocation)
            .withQueryParams(queryParams)
            .build();

        return httpClient.doPost(uri, body, Tenant.class, requestOptions);
    }

    public void deletePerTenantConfiguration( final RequestOptions inputOptions) throws KillBillClientException {

        final String uri = "/1.0/kb/tenants/uploadPerTenantConfig";


        final RequestOptions requestOptions = inputOptions.extend().build();

        httpClient.doDelete(uri, requestOptions);
    }

    public void deletePluginConfiguration(final String pluginName,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(pluginName, "Missing the required parameter 'pluginName' when calling deletePluginConfiguration");

        final String uri = "/1.0/kb/tenants/uploadPluginConfig/{pluginName}"
          .replaceAll("\\{" + "pluginName" + "\\}", pluginName.toString());


        final RequestOptions requestOptions = inputOptions.extend().build();

        httpClient.doDelete(uri, requestOptions);
    }

    public void deletePluginPaymentStateMachineConfig(final String pluginName,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(pluginName, "Missing the required parameter 'pluginName' when calling deletePluginPaymentStateMachineConfig");

        final String uri = "/1.0/kb/tenants/uploadPluginPaymentStateMachineConfig/{pluginName}"
          .replaceAll("\\{" + "pluginName" + "\\}", pluginName.toString());


        final RequestOptions requestOptions = inputOptions.extend().build();

        httpClient.doDelete(uri, requestOptions);
    }

    public void deletePushNotificationCallbacks( final RequestOptions inputOptions) throws KillBillClientException {

        final String uri = "/1.0/kb/tenants/registerNotificationCallback";


        final RequestOptions requestOptions = inputOptions.extend().build();

        httpClient.doDelete(uri, requestOptions);
    }

    public void deleteUserKeyValue(final String keyName,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(keyName, "Missing the required parameter 'keyName' when calling deleteUserKeyValue");

        final String uri = "/1.0/kb/tenants/userKeyValue/{keyName}"
          .replaceAll("\\{" + "keyName" + "\\}", keyName.toString());


        final RequestOptions requestOptions = inputOptions.extend().build();

        httpClient.doDelete(uri, requestOptions);
    }

    public org.killbill.billing.tenant.api.TenantKV.TenantKey getAllPluginConfiguration(final String keyPrefix,  final RequestOptions inputOptions) throws KillBillClientException {

        Preconditions.checkNotNull(keyPrefix, "Missing the required parameter 'keyPrefix' when calling getAllPluginConfiguration");

        final String uri = "/1.0/kb/tenants/uploadPerTenantConfig/{keyPrefix}/search"
          .replaceAll("\\{" + "keyPrefix" + "\\}", keyPrefix.toString());


        final RequestOptions requestOptions = inputOptions.extend().build();

        return httpClient.doGet(uri, org.killbill.billing.tenant.api.TenantKV.TenantKey.class, requestOptions);
    }

    public org.killbill.billing.tenant.api.TenantKV.TenantKey getPerTenantConfiguration( final RequestOptions inputOptions) throws KillBillClientException {


        final String uri = "/1.0/kb/tenants/uploadPerTenantConfig";


        final RequestOptions requestOptions = inputOptions.extend().build();

        return httpClient.doGet(uri, org.killbill.billing.tenant.api.TenantKV.TenantKey.class, requestOptions);
    }

    public org.killbill.billing.tenant.api.TenantKV.TenantKey getPluginConfiguration(final String pluginName,  final RequestOptions inputOptions) throws KillBillClientException {

        Preconditions.checkNotNull(pluginName, "Missing the required parameter 'pluginName' when calling getPluginConfiguration");

        final String uri = "/1.0/kb/tenants/uploadPluginConfig/{pluginName}"
          .replaceAll("\\{" + "pluginName" + "\\}", pluginName.toString());


        final RequestOptions requestOptions = inputOptions.extend().build();

        return httpClient.doGet(uri, org.killbill.billing.tenant.api.TenantKV.TenantKey.class, requestOptions);
    }

    public org.killbill.billing.tenant.api.TenantKV.TenantKey getPluginPaymentStateMachineConfig(final String pluginName,  final RequestOptions inputOptions) throws KillBillClientException {

        Preconditions.checkNotNull(pluginName, "Missing the required parameter 'pluginName' when calling getPluginPaymentStateMachineConfig");

        final String uri = "/1.0/kb/tenants/uploadPluginPaymentStateMachineConfig/{pluginName}"
          .replaceAll("\\{" + "pluginName" + "\\}", pluginName.toString());


        final RequestOptions requestOptions = inputOptions.extend().build();

        return httpClient.doGet(uri, org.killbill.billing.tenant.api.TenantKV.TenantKey.class, requestOptions);
    }

    public org.killbill.billing.tenant.api.TenantKV.TenantKey getPushNotificationCallbacks( final RequestOptions inputOptions) throws KillBillClientException {


        final String uri = "/1.0/kb/tenants/registerNotificationCallback";


        final RequestOptions requestOptions = inputOptions.extend().build();

        return httpClient.doGet(uri, org.killbill.billing.tenant.api.TenantKV.TenantKey.class, requestOptions);
    }

    public Tenant getTenant(final UUID tenantId,  final RequestOptions inputOptions) throws KillBillClientException {

        Preconditions.checkNotNull(tenantId, "Missing the required parameter 'tenantId' when calling getTenant");

        final String uri = "/1.0/kb/tenants/{tenantId}"
          .replaceAll("\\{" + "tenantId" + "\\}", tenantId.toString());


        final RequestOptions requestOptions = inputOptions.extend().build();

        return httpClient.doGet(uri, Tenant.class, requestOptions);
    }

    public Tenant getTenantByApiKey(final String apiKey,  final RequestOptions inputOptions) throws KillBillClientException {


        final String uri = "/1.0/kb/tenants";

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("apiKey", String.valueOf(apiKey));

        final RequestOptions requestOptions = inputOptions.extend().withQueryParams(queryParams).build();

        return httpClient.doGet(uri, Tenant.class, requestOptions);
    }

    public org.killbill.billing.tenant.api.TenantKV.TenantKey getUserKeyValue(final String keyName,  final RequestOptions inputOptions) throws KillBillClientException {

        Preconditions.checkNotNull(keyName, "Missing the required parameter 'keyName' when calling getUserKeyValue");

        final String uri = "/1.0/kb/tenants/userKeyValue/{keyName}"
          .replaceAll("\\{" + "keyName" + "\\}", keyName.toString());


        final RequestOptions requestOptions = inputOptions.extend().build();

        return httpClient.doGet(uri, org.killbill.billing.tenant.api.TenantKV.TenantKey.class, requestOptions);
    }

    public String insertUserKeyValue(final String keyName, final String body,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(keyName, "Missing the required parameter 'keyName' when calling insertUserKeyValue");
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling insertUserKeyValue");

        final String uri = "/1.0/kb/tenants/userKeyValue/{keyName}"
          .replaceAll("\\{" + "keyName" + "\\}", keyName.toString());


        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        final RequestOptions requestOptions = inputOptions.extend()
            .withFollowLocation(followLocation)
            .build();

        return httpClient.doPost(uri, body, String.class, requestOptions);
    }

    public void registerPushNotificationCallback(final String cb,  final RequestOptions inputOptions) throws KillBillClientException {

        final String uri = "/1.0/kb/tenants/registerNotificationCallback";

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("cb", String.valueOf(cb));

        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        final RequestOptions requestOptions = inputOptions.extend()
            .withFollowLocation(followLocation)
            .withQueryParams(queryParams)
            .build();

        httpClient.doPost(uri, null, requestOptions);
    }

    public String uploadPerTenantConfiguration(final String body,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling uploadPerTenantConfiguration");

        final String uri = "/1.0/kb/tenants/uploadPerTenantConfig";


        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        final RequestOptions requestOptions = inputOptions.extend()
            .withFollowLocation(followLocation)
            .build();

        return httpClient.doPost(uri, body, String.class, requestOptions);
    }

    public String uploadPluginConfiguration(final String body, final String pluginName,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling uploadPluginConfiguration");
        Preconditions.checkNotNull(pluginName, "Missing the required parameter 'pluginName' when calling uploadPluginConfiguration");

        final String uri = "/1.0/kb/tenants/uploadPluginConfig/{pluginName}"
          .replaceAll("\\{" + "pluginName" + "\\}", pluginName.toString());


        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        final RequestOptions requestOptions = inputOptions.extend()
            .withFollowLocation(followLocation)
            .build();

        return httpClient.doPost(uri, body, String.class, requestOptions);
    }

    public String uploadPluginPaymentStateMachineConfig(final String body, final String pluginName,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling uploadPluginPaymentStateMachineConfig");
        Preconditions.checkNotNull(pluginName, "Missing the required parameter 'pluginName' when calling uploadPluginPaymentStateMachineConfig");

        final String uri = "/1.0/kb/tenants/uploadPluginPaymentStateMachineConfig/{pluginName}"
          .replaceAll("\\{" + "pluginName" + "\\}", pluginName.toString());


        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        final RequestOptions requestOptions = inputOptions.extend()
            .withFollowLocation(followLocation)
            .build();

        return httpClient.doPost(uri, body, String.class, requestOptions);
    }

}
