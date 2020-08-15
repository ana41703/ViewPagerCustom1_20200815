package to.msn.wings.viewpagercustom;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;
//import android.view.View.setOnClickListener;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.text.BreakIterator;


import android.os.Bundle;
    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            ViewPager pager = findViewById(R.id.pager);
            pager.setAdapter(
                    new PageAdapter(getSupportFragmentManager()));



            Button btn = (Button) findViewById(R.id.button2);
            // ボタンクリック時の動作
                        btn.setOnClickListener(new View.OnClickListener()
            {
                public void onClick (View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                //データの設定、URI形式で設定
                intent.setData(Uri.parse("https://dpoint.jp/store/coupon/index.html"));

                    startActivity(intent);
                }
            });

            Button btn2 = (Button) findViewById(R.id.button8);
            // ボタンクリック時の動作
                        btn2.setOnClickListener(new View.OnClickListener()
            {
                public void onClick (View v){
                Intent intent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("http://www.jaf.or.jp/jafnavi/membership/facility/index.php?genre_cd=H&br=H40\n"));

                    startActivity(intent);
                }
            });
            Button btn3 = (Button) findViewById(R.id.button9);
            // ボタンクリック時の動作
                        btn3.setOnClickListener(new View.OnClickListener()
            {
                public void onClick (View v){
                Intent intent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.benricho.org/chimei/\n"));

                    startActivity(intent);
                }
            });
            Button btn4 = (Button) findViewById(R.id.button10);
            // ボタンクリック時の動作
                        btn4.setOnClickListener(new View.OnClickListener()
            {
                public void onClick (View v){
                Intent intent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.google.co.jp/maps/place/%E7%8B%AC%E7%AB%8B%E8%A1%8C%E6%94%BF%E6%B3%95%E4%BA%BA%E9%AB%98%E9%BD%A2%E3%83%BB%E9%9A%9C%E5%AE%B3%E3%83%BB%E6%B1%82%E8%81%B7%E8%80%85%E9%9B%87%E7%94%A8%E6%94%AF%E6%8F%B4%E6%A9%9F%E6%A7%8B+%E8%8C%A8%E5%9F%8E%E6%94%AF%E9%83%A8+%E3%83%9D%E3%83%AA%E3%83%86%E3%82%AF%E3%82%BB%E3%83%B3%E3%82%BF%E3%83%BC%E8%8C%A8%E5%9F%8E/@36.0044651,139.9820708,17z/data=!3m1!4b1!4m5!3m4!1s0x6018a031c420eef7:0x2edbcee5d85510e1!8m2!3d36.0044608!4d139.9842595?hl=ja\n"));

                startActivity(intent);
            }
            });
            Button btn5 = (Button) findViewById(R.id.button11);
            // ボタンクリック時の動作
                        btn5.setOnClickListener(new View.OnClickListener()
            {
                public void onClick (View v){
                Intent intent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://earth.google.com/web/search/%e3%83%9d%e3%83%aa%e3%83%86%e3%82%af%e3%82%bb%e3%83%b3%e3%82%bf%e3%83%bc%e8%8c%a8%e5%9f%8e/@36.0044608,139.9842595,20.41524589a,835.13844292d,35y,0h,45t,0r/data=CokBGl8SWQolMHg2MDE4YTAzMWM0MjBlZWY3OjB4MmVkYmNlZTVkODU1MTBlMRmXDucrkgBCQCHgaMcNf39hQCoe44Od44Oq44OG44Kv44K744Oz44K_44O86Iyo5Z-OGAIgASImCiQJccB0CQfdR0ARVW0oCcBCOkAZur0ugsaXU8AhWwOaNUawYsAoAg\n"));

                startActivity(intent);
            }
            });
            public void next_0(View v) {
                Intent intent1 = new Intent(this,Flagment11.class);
                startActivity(intent1);
            }

        }
    }

    //@Override
    //protected void onCreate(Bundle savedInstanceState) {
    //        super.onCreate(savedInstanceState);
    //        setContentView(R.layout.activity_main);
    //        setContentView(R.layout.flagment11_main);
    //        setContentView(R.layout.flagment12_main);
    //        setContentView(R.layout.flagment13_main);

            //        public void onClick(View v){
    //            //暗黙的インテントの生成、引数は指定しない
    //            Intent intent = new Intent();
    //            //アクションの設定、画面表示のアクティビティを指定
    //            intent.setAction(Intent.ACTION_VIEW);
    //            //データの設定、URI形式で設定
    //            intent.setData(Uri.parse("http://www.yahoo.co.jp"));
    //            //アクティビティを開く
    //            startActivity(intent);
    //        }

//    }
//}
