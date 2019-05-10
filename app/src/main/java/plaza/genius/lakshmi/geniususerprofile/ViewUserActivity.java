package plaza.genius.lakshmi.geniususerprofile;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

public class ViewUserActivity extends AppCompatActivity  implements LoaderManager.LoaderCallbacks<ArrayList<Users>>{
    public RecyclerView recyclerView;
    public UserAdapter userAdapter;
    public ArrayList arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_user);
        arrayList=new ArrayList<Users>();
        recyclerView=findViewById(R.id.recycler_view);
        Log.v("inside","ViewUserActivity");
        getSupportLoaderManager().initLoader(1,null,this).forceLoad();


    }

    @NonNull
    @Override
    public Loader<ArrayList<Users>> onCreateLoader(int i, @Nullable Bundle bundle) {
        //loadingIndicator.setVisibility(View.VISIBLE);

        return new UserLoader(this);
    }

    @Override
    public void onLoadFinished(@NonNull Loader<ArrayList<Users>> loader, ArrayList<Users> arrayList) {
        userAdapter=new UserAdapter(this,arrayList);
        recyclerView.setAdapter(userAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onLoaderReset(@NonNull Loader<ArrayList<Users>> loader) {

    }
}
