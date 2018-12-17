package maxplus.kmj.com.instag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.main_btn);
        et1=findViewById(R.id.main_edittext);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NetRetrofit.getInstance().GETHashtags(et1.getText().toString())
                        .enqueue(new Callback<Data>() {
                            @Override
                            public void onResponse(Call<Data> call, Response<Data> response) {
                                Log.e("response",response.body().getData().get(0).getName());
                            }

                            @Override
                            public void onFailure(Call<Data> call, Throwable t) {
                                Log.e("Fail","ㅠㅠ");
                            }
                        });
            }
        });
    }
}
