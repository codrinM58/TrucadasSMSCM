package cat.dam.andy.trucadassmscm;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b_1, b_2, b_3, b_4, b_5, b_6, b_7, b_8, b_9, b_sms, b_call, b_del;
    EditText et_tel, et_sms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //creació dels botons del teclat
        b_1 = (Button) findViewById(R.id.b_1);
        b_2 = (Button) findViewById(R.id.b_2);
        b_3 = (Button) findViewById(R.id.b_3);
        b_4 = (Button) findViewById(R.id.b_4);
        b_5 = (Button) findViewById(R.id.b_5);
        b_6 = (Button) findViewById(R.id.b_6);
        b_7 = (Button) findViewById(R.id.b_7);
        b_8 = (Button) findViewById(R.id.b_8);
        b_9 = (Button) findViewById(R.id.b_9);
        b_sms = (Button) findViewById(R.id.b_sms);
        b_call = (Button) findViewById(R.id.b_call);
        b_del = (Button) findViewById(R.id.b_del);
        et_tel = (EditText) findViewById(R.id.et_tel);
        et_sms = (EditText) findViewById(R.id.et_sms);
        b_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et_tel.length() == 3 || et_tel.length() == 6 || et_tel.length() == 9) { //les posicions son 3 6 i 9 perque tambe es conten els mateixos espais
                    et_tel.setText(et_tel.getText() + " 1");  //amb espai
                } else {
                    et_tel.setText(et_tel.getText() + "1");   //sense espai

                }

            }
        });

        b_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (et_tel.length() == 3 || et_tel.length() == 6 || et_tel.length() == 9) {
                    et_tel.setText(et_tel.getText() + " 2");
                } else {
                    et_tel.setText(et_tel.getText() + "2");

                }

            }
        });

        b_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (et_tel.length() == 3 || et_tel.length() == 6 || et_tel.length() == 9) {
                    et_tel.setText(et_tel.getText() + " 3");
                } else {
                    et_tel.setText(et_tel.getText() + "3");

                }

            }
        });
        b_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (et_tel.length() == 3 || et_tel.length() == 6 || et_tel.length() == 9) {
                    et_tel.setText(et_tel.getText() + " 4");
                } else {
                    et_tel.setText(et_tel.getText() + "4");
                }
            }
        });

        b_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et_tel.length() == 3 || et_tel.length() == 6 || et_tel.length() == 9) {
                    et_tel.setText(et_tel.getText() + " 5");
                } else {
                    et_tel.setText(et_tel.getText() + "5");
                }
            }
        });

        b_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et_tel.length() == 3 || et_tel.length() == 6 || et_tel.length() == 9) {
                    et_tel.setText(et_tel.getText() + " 6");
                } else {
                    et_tel.setText(et_tel.getText() + "6");
                }
            }
        });

        b_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et_tel.length() == 3 || et_tel.length() == 6 || et_tel.length() == 9) {
                    et_tel.setText(et_tel.getText() + " 7");
                } else {
                    et_tel.setText(et_tel.getText() + "7");
                }
            }
        });

        b_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (et_tel.length() == 3 || et_tel.length() == 6 || et_tel.length() == 9) {
                    et_tel.setText(et_tel.getText() + " 8");
                } else {
                    et_tel.setText(et_tel.getText() + "8");

                }

            }
        });
        b_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (et_tel.length() == 3 || et_tel.length() == 6 || et_tel.length() == 9) {
                    et_tel.setText(et_tel.getText() + " 9");
                } else {
                    et_tel.setText(et_tel.getText() + "9");

                }

            }
        });
        b_sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String missatge = et_sms.getText().toString();
                String num_telefon = et_tel.getText().toString();
                if (!TextUtils.isEmpty(missatge) && !TextUtils.isEmpty(num_telefon)) {
                    Intent smsIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:" + num_telefon));
                    smsIntent.putExtra("sms_body", missatge);
                    startActivity(smsIntent);
                }
            }

        });

        b_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num_telefon = et_tel.getText().toString();
                if (num_telefon.toString().length()>=12) {// he posat mes 12 perque aixi en el mobil fa la trucada apartir de 9 nums si posu menys acepta menys.
                    if (!TextUtils.isEmpty(num_telefon)) {
                        String dial = "tel:" + num_telefon;
                        startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                    } else {
                        Toast.makeText(MainActivity.this, "Entri un número de telèfon valid",
                                Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Entri un número de telèfon valid",
                            Toast.LENGTH_SHORT).show();
                }

            }


        });

        b_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String text = et_tel.getText().toString();
                if (!TextUtils.isEmpty(text)) {
                    String newText = text.substring(1, text.length()); //borrar a lesquerra
                    String newText1 = text.substring(0, text.length() - 1); //borrar a la dreta
                    et_tel.setText(newText);
                    et_tel.setSelection(newText.length());
                    et_tel.setText(newText1);
                    et_tel.setSelection(newText1.length());
                }
            }
        });

    }
}
