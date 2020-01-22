package com.enviopost2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.enviopost2.Entities.Post;
import com.enviopost2.Remote.ApiUtils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private APIService mAPIService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText claveEt = (EditText) findViewById(R.id.etClave);
        final EditText fechaEt = (EditText) findViewById(R.id.etFecha);
        final EditText lectorEt = (EditText) findViewById(R.id.etLector);
        final EditText fecha_lecturaEt = (EditText) findViewById(R.id.etFechaLectura);

        Button enviar = (Button)findViewById(R.id.BTN_ENVIAR);


        mAPIService = ApiUtils.getApiService();

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String CLAVE = claveEt.getText().toString().trim();
                String FECHA = fechaEt.getText().toString().trim();
                String LECTOR = lectorEt.getText().toString().trim();
                String FECHA_LECTURA = fecha_lecturaEt.getText().toString().trim();

                if(!TextUtils.isEmpty(CLAVE)&&!TextUtils.isEmpty(FECHA) && !TextUtils.isEmpty(LECTOR) && !TextUtils.isEmpty(FECHA_LECTURA)){
                    sendPost(CLAVE,FECHA,LECTOR,FECHA_LECTURA);
                }


            }

            private void sendPost(String CLAVE, String FECHA, String LECTOR, String FECHA_LECTURA) {
                mAPIService.savePost(CLAVE, FECHA, LECTOR, FECHA_LECTURA).enqueue(new Callback<Post>() {
                    String TAG = "myLogs";

                    @Override
                    public void onResponse(Call<Post> call, Response<Post> response) {

                        if(response.isSuccessful()){
                            Log.i(TAG, "post submitted to API." + response.body().toString());


                        }
                    }

                    @Override
                    public void onFailure(Call<Post> call, Throwable t) {
                        Log.e(TAG, "No se subio a la api");


                    }
                });
            }



        });



    }
}
