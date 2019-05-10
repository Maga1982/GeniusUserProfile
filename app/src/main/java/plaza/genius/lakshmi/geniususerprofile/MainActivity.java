package plaza.genius.lakshmi.geniususerprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public Button viewUser,addUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewUser=findViewById(R.id.view_users);
        addUser=findViewById(R.id.add_users);
        viewUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v("inside","viewuser");
                //goes to ViewUserActivity
                Intent intent=new Intent(MainActivity.this,ViewUserActivity.class);
                startActivity(intent);
                //load users from userloader
            }
        });
        addUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v("inside","adduser");
                //get response from server using post method
            }
        });


    }
}
