package gov.cipam.gi.utils;
import android.view.View;

//Interface to add user defined functions to handle click activities on recyclerview
public interface RecyclerViewClickListener {
    void onClick(View view, int position);
    void onLongClick(View view, int position);
}



