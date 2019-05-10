package plaza.genius.lakshmi.geniususerprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ViewUserActivity extends AppCompatActivity {
    public RecyclerView recyclerView;
    public UserAdapter userAdapter;
    public ArrayList arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_user);
        arrayList=new ArrayList();
        arrayList.add(new Users("Lakshmi","Krishnamoorthy"));
        recyclerView=findViewById(R.id.recycler_view);
        userAdapter=new UserAdapter(this,arrayList);
        recyclerView.setAdapter(userAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
