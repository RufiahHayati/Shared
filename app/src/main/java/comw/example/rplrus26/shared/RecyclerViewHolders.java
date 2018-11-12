package comw.example.rplrus26.shared;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerViewHolders extends RecyclerView.ViewHolder {

    public TextView personName;

    public RecyclerViewHolders(View itemView) {
        super(itemView);

        personName = (TextView)itemView.findViewById(R.id.person_name);
    }
}
