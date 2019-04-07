package ajordy.akb11.com;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Verifikasi_Activity extends AppCompatActivity {

    //Tgl. Buat : 6 April 2019
    //Nama      : Adam Jordy
    //Kelas     : AKB-11
    //NIM       : 10116497

    private Button masuk;
    TextView txtKel,txtKode,txtPunya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verifikasi);

        masuk = (Button)findViewById(R.id.btnMasuk);
        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masuk = new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(masuk);
            }
        });
    }
}
