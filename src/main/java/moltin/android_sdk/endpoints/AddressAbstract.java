package moltin.android_sdk.endpoints;

import android.os.Handler;

import org.json.JSONObject;

import moltin.android_sdk.utilities.Constants;
import moltin.android_sdk.utilities.Preferences;

//handling API calls for the endpoint
public class AddressAbstract extends HttpMethodAbstract {

    public Preferences preferences;

    public AddressAbstract(Preferences preferences)
    {
        this.preferences = preferences;
    }

    public void get(String customer, String id, Handler.Callback callback) throws Exception {
        try
        {
            String endpoint = "customers/" + customer + "/addresses/" + id;

            JSONObject jsonHeaders = new JSONObject();
            jsonHeaders.put("Content-Type", "application/x-www-form-urlencoded");
            jsonHeaders.put("Authorization", "Bearer " + preferences.getToken());
            if(preferences.getCurrencyId().length()>0)
                jsonHeaders.put("X-Currency", preferences.getCurrencyId());

            super.httpGetAsync(Constants.URL, Constants.VERSION, endpoint, jsonHeaders, null, callback);
        }
        catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void find(String customer, moltin.android_sdk.models.Address terms, Handler.Callback callback) throws Exception {
        try
        {
            String endpoint = "customers/" + customer + "/addresses";

            JSONObject jsonHeaders = new JSONObject();
            jsonHeaders.put("Content-Type", "application/x-www-form-urlencoded");
            jsonHeaders.put("Authorization", "Bearer " + preferences.getToken());
            if(preferences.getCurrencyId().length()>0)
                jsonHeaders.put("X-Currency", preferences.getCurrencyId());

            super.httpGetAsync(Constants.URL, Constants.VERSION, endpoint, jsonHeaders, (terms==null ? null : terms.getData()), callback);
        }
        catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void list(String customer, moltin.android_sdk.models.Address terms, Handler.Callback callback) throws Exception {
        try
        {
            String endpoint = "customers/" + customer + "/addresses";

            JSONObject jsonHeaders = new JSONObject();
            jsonHeaders.put("Content-Type", "application/x-www-form-urlencoded");
            jsonHeaders.put("Authorization", "Bearer " + preferences.getToken());
            if(preferences.getCurrencyId().length()>0)
                jsonHeaders.put("X-Currency", preferences.getCurrencyId());

            super.httpGetAsync(Constants.URL, Constants.VERSION, endpoint, jsonHeaders, (terms==null ? null : terms.getData()), callback);
        }
        catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void create(String customer, moltin.android_sdk.models.Address data, Handler.Callback callback) throws Exception {
        try
        {
            String endpoint = "customers/" + customer + "/addresses";

            JSONObject jsonHeaders = new JSONObject();
            jsonHeaders.put("Content-Type", "application/x-www-form-urlencoded");
            jsonHeaders.put("Authorization", "Bearer " + preferences.getToken());
            if(preferences.getCurrencyId().length()>0)
                jsonHeaders.put("X-Currency", preferences.getCurrencyId());

            super.httpPostAsync(Constants.URL, Constants.VERSION, endpoint, jsonHeaders, null, (data==null ? null : data.getData()), callback);
        }
        catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void fields(String customer, String id, Handler.Callback callback) throws Exception {
        try
        {
            String endpoint = "";

            if (customer == null || customer.length()==0) {
                customer = "";
            }
            if (id == null || id.length()==0) {
                id = "";
            }
            if (customer.length()>0 && id.length()==0) {
                endpoint = "customers/" + customer + "/addresses/fields";
            } else if (customer.length()>0 && id.length()>0) {
                endpoint = "customers/" + customer + "/addresses/" + id + "/fields";
            } else {
                endpoint = "addresses/fields";
            }

            JSONObject jsonHeaders = new JSONObject();
            jsonHeaders.put("Content-Type", "application/x-www-form-urlencoded");
            jsonHeaders.put("Authorization", "Bearer " + preferences.getToken());
            if(preferences.getCurrencyId().length()>0)
                jsonHeaders.put("X-Currency", preferences.getCurrencyId());

            super.httpGetAsync(Constants.URL, Constants.VERSION, endpoint, jsonHeaders, null, callback);
        }
        catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
