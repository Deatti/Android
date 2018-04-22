package org.androiddown.android1207;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    //무명 클래스로 이벤트 처리하는 방법
    //한 번정도 처리할 경우 이름이 클래스 이름 도 객체 이름도 붙일 필요없이 사용

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                                dlg.setTitle("로그인 하시겠습니까?");
                                //dlg.setIcon(R.drawble.ic_launcher);
                                dlg.setPositiveButton("확인",
                                        new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this, "환영합니다", Toast.LENGTH_SHORT).show();
                                Intent pcIntent = new Intent(MainActivity.this, MainpcActivity.class);
                                MainActivity.this.startActivity(pcIntent);
                            }
                        });
                dlg.show();

            };
        });
        final TextView registerButton = (TextView) findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                TextView registerButton = (TextView) findViewById(R.id.registerButton);
                registerButton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        Intent registerIntent = new Intent(MainActivity.this, RegisterActivity.class);
                        MainActivity.this.startActivity(registerIntent);
                    }

                    ;
                });
            };


        });

    }
}

