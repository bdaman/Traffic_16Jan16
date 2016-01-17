package lbiz.bdaman.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    private TextView titleTextView;
    private ImageView detailImageView;
    private TextView detailTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Bind Widget
        bindWidget();

        //Show View
        showView();


    }    //Main Method

    private void showView() {

        //Show Title
        String strTitle = getIntent().getStringExtra("Title");
        titleTextView.setText(strTitle);
        //Show Image
        int intImage = getIntent().getIntExtra("Image", 0);
        detailImageView.setImageResource(intImage);
        //Show Detail
        //int strPosition = getIntent().getIntExtra("Index",0);


    }   //Show View

    private void bindWidget() {

        titleTextView = (TextView) findViewById(R.id.txtTitle);
        detailImageView = (ImageView) findViewById(R.id.imageView);
        detailTextView = (TextView) findViewById(R.id.txtDetail);


    }   //Bind Widget

}   //Main Class
