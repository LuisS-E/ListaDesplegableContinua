package mx.edu.tesoem.luis.itcis.listadesplegablecontinua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    GridView Datosgv;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] Elementossp ={ "Suma", "Resta"," Divicion" ," multiplicacion"," Potencia"}
        String [] Elementossp ={ "nombre", "edad"," correo" ," pablo escobar"," 22","22","pablo@tesoem.edu.mx","jose ramirez"}


        ListaDesplegable  = (Spinner) findViewById(R.id.ListaDesplegable);
        Datosgv = (GridLayout)findViewById(R.id.Datosgv);

        ArrayAdapter < String> Elementossp = new ArrayAdapter<String>(context:this,android.R.layout.simple_spinner_item.Elementossp);
        ArrayAdapter < String> Datosgvgv  = new ArrayAdapter<String>(context:this,android.R.layout.simple_spinner_item.Datosgv);
    }
}
