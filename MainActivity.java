package edu.whitworth.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;

    Button button;
    Random r;
    Integer[] images = {    R.drawable.side1,
                            R.drawable.side2,
                            R.drawable.side3,
                            R.drawable.side4,
                            R.drawable.side5,
                            R.drawable.side6
    };
    int pickedImage =0, lastPicked = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView4 = (ImageView) findViewById(R.id.imageView4);

        button = (Button) findViewById(R.id.ButtonView);
        r = new Random();
        button.setOnClickListener

        (
                new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                do {pickedImage = r.nextInt(images.length);
                }  while (pickedImage == lastPicked);
                lastPicked = pickedImage;
                //this will display the random images
                imageView.setImageResource(images[pickedImage]);
                imageView1.setImageResource(images[pickedImage]);
                imageView2.setImageResource(images[pickedImage]);
                imageView3.setImageResource(images[pickedImage]);
                imageView4.setImageResource(images[pickedImage]);


            }
        }
     );



    }

}
