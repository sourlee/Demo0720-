package tw.com.sourlee.demo0720;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView result;         //顯示計算結果用
    private EditText weight, height;  //使用者輸入用


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //將佈局檔載入

        result = findViewById(R.id.result);  //定義佈局檔中的元件
        weight = findViewById(R.id.userweight);
        height = findViewById(R.id.userheight);
    }

    /*為了要呼叫在佈局檔(非本檔)的bmiClick(方法)，資料夾權限要public*/
    //讓要佈局檔呼叫的方法，權限一定要是public
    public void bmiClick(View view) { //View也是列在widget
        float userweight = Float.parseFloat(weight.getText().toString());
        //weight還是屬於Editable元件，所以toString轉字串；getText()意思為抓取內容。
        float userheight = Float.parseFloat(height.getText().toString());
        float bmi = userweight / ((userheight / 100) * (userheight / 100));
        result.setText("結果："+bmi); //錯誤原因；不能放float??

    }
}