package to.msn.wings.viewpagercustom;

//import android.os.Bundle;
//import android.support.annotation.NonNull;
//import android.support.annotation.Nullable;
//import android.support.v4.app.Fragment;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//public class Page1Fragment extends Fragment {
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container, @NonNull Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.page1, container, false);
//    }
//}
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


public class Page1Fragment extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saVedInstanceState){
        super.onCreate(saVedInstanceState);
        setContentView(R.layout.page1);

    }
    public void next_0(View v){
        finish();
    }
    public void next_1(View v) {
        Intent intent1 = new Intent(this,Page2Fragment.class);
        startActivity(intent1);
    }

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,@Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.page1, container, false);
    }
}