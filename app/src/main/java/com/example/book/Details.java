package com.example.book;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Details extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        listView=(ListView)findViewById(R.id.listview);
        String[] title=getIntent().getStringArrayExtra("data");
        getSupportActionBar().setTitle(title[0]);
        String[] details=getIntent().getStringArrayExtra("data2");
        Baseadaptarcustom baseadaptarcustom=new Baseadaptarcustom(Details.this,title,details);
        listView.setAdapter(baseadaptarcustom);


    }
}
class Baseadaptarcustom extends ArrayAdapter<String> {
    private final Context context;
    private final String[] title;
    private final String[] details;


    public Baseadaptarcustom(Context context, String[] title, String[] details) {
        super(context, R.layout.details,title);
        this.context=context;
        this.title=title;
        this.details=details;


    }
    @Override
    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater layoutInflater=(LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowview= layoutInflater.inflate(R.layout.details,parent,false);
        TextView titlev=(TextView) rowview.findViewById(R.id.title);
        TextView detailsv=(TextView)rowview.findViewById(R.id.details);
        titlev.setText(title[position]);
        detailsv.setText(details[position]);
        return rowview;



    }
}
