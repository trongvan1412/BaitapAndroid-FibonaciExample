package com.example.n04_helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    protected String TAG = "N04_HelloAndroid";
    private TextView lblNhapN, lblKetQua;
    private EditText txtN;
    private Button btnKiemTra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this.setContentView(R.layout.activity_main);
        this.setContentView(R.layout.new_layout);
        this.registerControlAndEvents();
        //---------------------
        String message = "onCreated: Activity/Ứng dụng được mở chạy";
        Log.i(TAG, message); //i-info, e-error, d-debug, w-warning, v-verbose
        Toast toast = Toast.makeText(
            this.getApplicationContext(),
                message,
            Toast.LENGTH_SHORT
        );
        toast.show();
        //------------------
    }

    private void registerControlAndEvents(){
        //Gán tham chiếu
        this.lblNhapN = (TextView) this.findViewById(R.id.textViewN);
        this.lblKetQua = (TextView) this.findViewById(R.id.textViewKetQua);
        this.txtN = (EditText) this.findViewById(R.id.editTextN);
        this.btnKiemTra = (Button) this.findViewById(R.id.buttonKiemTra);
        //Đăng ký sự kiện
        this.btnKiemTra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int N = Integer.parseInt(txtN.getText().toString());
                if (laSoNT(N))
                    lblKetQua.setText("Đây là số nguyên tố");
                else
                    lblKetQua.setText("Không phải là số nguyên tố");
            }
        });
    }

    private boolean laSoNT(int N){
        if (N <= 1) return false;
        for(int i = 2; i <= N/2; i++)
            if (N%2 == 0) return false;
        return true;
    }

    @Override
    protected void onStart(){
        super.onStart();
        //Code cá biệt--------------------
        String message = "onStart: UD bắt đầu khởi động để thực thi";
        Log.i(TAG, message);
        Toast toast = Toast.makeText(
                this.getApplicationContext(),
                message,
                Toast.LENGTH_SHORT
        );
        toast.show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        //Code cá biệt--------------------
        String message = "onRestart: UD được khởi động lại";
        Log.i(TAG, message);
        Toast toast = Toast.makeText(
                this.getApplicationContext(),
                message,
                Toast.LENGTH_SHORT
        );
        toast.show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        //Code cá biệt--------------------
        String message = "onResume: UD được khôi phục tương tác";
        Log.i(TAG, message);
        Toast toast = Toast.makeText(
                this.getApplicationContext(),
                message,
                Toast.LENGTH_SHORT
        );
        toast.show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        //Code cá biệt--------------------
        String message = "onPause: UD tạm dừng nhận tương tác (mất focus)";
        Log.i(TAG, message);
        Toast toast = Toast.makeText(
                this.getApplicationContext(),
                message,
                Toast.LENGTH_SHORT
        );
        toast.show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        //Code cá biệt--------------------
        String message = "onStop: UD bị đóng (bị ngắt tài nguyên)";
        Log.i(TAG, message);
        Toast toast = Toast.makeText(
                this.getApplicationContext(),
                message,
                Toast.LENGTH_SHORT
        );
        toast.show();
    }

    @Override
    protected void onDestroy(){
        String message = "onDestroy: UD bị thoát/đóng lại";
        Log.i(TAG, message);
        Toast toast = Toast.makeText(
                this.getApplicationContext(),
                message,
                Toast.LENGTH_SHORT
        );
        toast.show();
        //Code cá biệt--------------------
        super.onDestroy();
    }
}
