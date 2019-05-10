package plaza.genius.lakshmi.geniususerprofile;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder>{
    Context context;
    ArrayList<Users> arrayList;
    Users users;
    public UserAdapter(Context context,ArrayList<Users> arrayList) {
        this.context=context;
        this.arrayList=arrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.my_list,viewGroup,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {
        users=arrayList.get(position);
        myViewHolder.textView1.setText(String.valueOf(users.getFirstName()));
        myViewHolder.textView2.setText(String.valueOf(users.getLastName()));
        Picasso.get().load(users.getImageUrl()).into(myViewHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textView1,textView2;
        ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView1 =itemView.findViewById(R.id.first);
            textView2 =itemView.findViewById(R.id.last);
            imageView=itemView.findViewById(R.id.image);
        }

    }
}
