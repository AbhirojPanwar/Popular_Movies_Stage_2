package abhiroj95.com.popular_movies_stage_2.Utility;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by APnaturals on 7/27/2016.
 */
public class UtilityMethods {

    /*
    Method to checks whether Device is connected or trying to connect to Internet.

    params-> Context
    Returns-> a boolean variable determining  whether device is -connected or trying to connect- or can not connect to internet.
     */

    public static boolean isNetworkAvailable(Context c)
    {
        ConnectivityManager connectivityManager=(ConnectivityManager) c.getSystemService(c.CONNECTIVITY_SERVICE);
        NetworkInfo active=connectivityManager.getActiveNetworkInfo();
        return active!=null && active.isConnectedOrConnecting();
    }
}
