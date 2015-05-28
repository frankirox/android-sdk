package in.molt.android_sdk.endpoints;

import android.os.Handler;
import android.os.Message;

import org.json.JSONObject;

import in.molt.android_sdk.utilities.Constants;
import in.molt.android_sdk.utilities.Preferences;

//handling the token expiration when calling endpoint
public class Category extends CategoryAbstract {

    public Category(Preferences preferences)
    {
        super(preferences);
    }

    @Override
    public void get(final String id, final Handler.Callback callback) throws Exception {
        if(preferences.isExpired())
        {
            Authenticate authenticate = new Authenticate(preferences);

            Handler.Callback callbackForAuth = new Handler.Callback() {
                @Override
                public boolean handleMessage(Message msg) {
                    if (msg.what == Constants.RESULT_OK)
                    {
                        try {
                            Category.super.get(id, callback);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        return true;
                    }
                    else
                    {
                        try {
                            Category.super.get(id, callback);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        return false;
                    }
                }
            };

            authenticate.authenticateAsync(preferences.getPublicId(),callbackForAuth);
        }
        else
        {
            super.get(id, callback);
        }
    }

    @Override
    public void find(final JSONObject terms, final Handler.Callback callback) throws Exception {
        if(preferences.isExpired())
        {
            Authenticate authenticate = new Authenticate(preferences);

            Handler.Callback callbackForAuth = new Handler.Callback() {
                @Override
                public boolean handleMessage(Message msg) {
                    if (msg.what == Constants.RESULT_OK)
                    {
                        try {
                            Category.super.find(terms, callback);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        return true;
                    }
                    else
                    {
                        try {
                            Category.super.find(terms, callback);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        return false;
                    }
                }
            };

            authenticate.authenticateAsync(preferences.getPublicId(),callbackForAuth);
        }
        else
        {
            super.find(terms, callback);
        }
    }

    @Override
    public void list(final JSONObject terms, final Handler.Callback callback) throws Exception {
        if(preferences.isExpired())
        {
            Authenticate authenticate = new Authenticate(preferences);

            Handler.Callback callbackForAuth = new Handler.Callback() {
                @Override
                public boolean handleMessage(Message msg) {
                    if (msg.what == Constants.RESULT_OK)
                    {
                        try {
                            Category.super.list(terms, callback);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        return true;
                    }
                    else
                    {
                        try {
                            Category.super.list(terms, callback);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        return false;
                    }
                }
            };

            authenticate.authenticateAsync(preferences.getPublicId(),callbackForAuth);
        }
        else
        {
            super.list(terms, callback);
        }
    }

    @Override
    public void tree(final JSONObject terms, final Handler.Callback callback) throws Exception {
        if(preferences.isExpired())
        {
            Authenticate authenticate = new Authenticate(preferences);

            Handler.Callback callbackForAuth = new Handler.Callback() {
                @Override
                public boolean handleMessage(Message msg) {
                    if (msg.what == Constants.RESULT_OK)
                    {
                        try {
                            Category.super.tree(terms, callback);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        return true;
                    }
                    else
                    {
                        try {
                            Category.super.tree(terms, callback);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        return false;
                    }
                }
            };

            authenticate.authenticateAsync(preferences.getPublicId(),callbackForAuth);
        }
        else
        {
            super.tree(terms, callback);
        }
    }

    @Override
    public void fields(final String id, final Handler.Callback callback) throws Exception {
        if(preferences.isExpired())
        {
            Authenticate authenticate = new Authenticate(preferences);

            Handler.Callback callbackForAuth = new Handler.Callback() {
                @Override
                public boolean handleMessage(Message msg) {
                    if (msg.what == Constants.RESULT_OK)
                    {
                        try {
                            Category.super.fields(id, callback);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        return true;
                    }
                    else
                    {
                        try {
                            Category.super.fields(id, callback);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        return false;
                    }
                }
            };

            authenticate.authenticateAsync(preferences.getPublicId(),callbackForAuth);
        }
        else
        {
            super.fields(id, callback);
        }
    }
}