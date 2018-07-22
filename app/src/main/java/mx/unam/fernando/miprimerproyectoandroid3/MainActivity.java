package mx.unam.fernando.miprimerproyectoandroid3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/*
No he creado las imágenes del marcianito en las diferentes densidades (xxhdpi xdhpi etc.) porque
me daban resultados no deseados al querer poner esas imágenes como fondo.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
