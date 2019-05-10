package plaza.genius.lakshmi.geniususerprofile;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.content.AsyncTaskLoader;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class UserLoader extends AsyncTaskLoader<ArrayList<Users>> {
    ArrayList<Users> arrayList;
    public UserLoader(Context context) {
        super(context);
    }

    @Nullable
    @Override
    public ArrayList<Users> loadInBackground() {
        arrayList= new ArrayList<Users>();
        HttpHelper sh = new HttpHelper();
        String jsonStr = null;
         try {
            jsonStr = sh.makeHttpRequest(createUrl("https://reqres.in/api/users"));

        } catch (IOException e) {
            Log.e("UserLoader", "Error ", e);
            return null;
        }
        JSONObject jsonObject= null;
        try {
            jsonObject = new JSONObject(jsonStr);
            JSONArray jsonArray=jsonObject.getJSONArray("data");
            for(int i=0;i<jsonArray.length();i++){
                JSONObject arrayJSONObject = jsonArray.getJSONObject(i);
                String firstName= arrayJSONObject.getString("first_name");
                String lastName= arrayJSONObject.getString("last_name");
                String imageUrl= arrayJSONObject.getString("avatar");
                arrayList.add(new Users(firstName,lastName,imageUrl));
                Log.v("firstName",firstName);
                Log.v("LastName",lastName);

            }
        } catch (JSONException e) {
            e.printStackTrace();
        }



        return arrayList;
    }
    private URL createUrl(String stringUrl) {
        URL url = null;
        try {
            url = new URL(stringUrl);
        } catch (MalformedURLException exception) {
            return null;
        }
        return url;
    }

}
