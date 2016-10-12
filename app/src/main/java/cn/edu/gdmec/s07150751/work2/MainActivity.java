package cn.edu.gdmec.s07150751.work2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private TextView tv1,tv2;
    private int iNum1,iNum2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=(TextView)findViewById(R.id.textView1);
        tv2=(TextView)findViewById(R.id.textView2);
        tv1.setText("on oncreat mothed get value");
        tv2.setText("on oncreat mothed get value");
        iNum1=0;
        iNum2=0;
        Toast.makeText(this,"onCreate",Toast.LENGTH_LONG);
    }



    @Override
    protected void onRestart() {
        super.onRestart();
        tv1.setText("start onRestart,show view1");
        tv2.setText("start onRestart,show view2");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        iNum1++;
        iNum2++;
        outState.putString("tv1","onSaveInstanceState serve num  is"+iNum1);
        outState.putString("tv2",String.valueOf(iNum2));
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        tv1.setText(savedInstanceState.getString("tv1"));
        tv2.setText("onSaveInstanceState serve num  is" +savedInstanceState.getString("tv2"));
        iNum2=Integer.parseInt(savedInstanceState.getString("tv2"));
    }
}