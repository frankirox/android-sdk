package moltin.android_sdk.endpoints;

import android.os.Handler;

import org.json.JSONObject;

import moltin.android_sdk.models.Checkout;
import moltin.android_sdk.utilities.Constants;
import moltin.android_sdk.utilities.Preferences;

//handling API calls for the endpoint
public class CheckoutAbstract extends HttpMethodAbstract {

    public Preferences preferences;

    public CheckoutAbstract(Preferences preferences)
    {
        this.preferences = preferences;
    }

    public void payment(String method, String order, Checkout data, Handler.Callback callback) throws Exception {
        try
        {
            String endpoint = "checkout/payment/" + method + "/" + order;

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
}
