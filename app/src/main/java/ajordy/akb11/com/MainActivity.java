package ajordy.akb11.com;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Tgl. Buat : 6 April 2019
    //Nama      : Adam Jordy
    //Kelas     : AKB-11
    //NIM       : 10116497

    private Button mulai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView txtMonitoring;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mulai = (Button)findViewById(R.id.btnMulai);
        mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mulai = new Intent(getApplicationContext(),Verifikasi_Activity.class);
                startActivity(mulai);
            }
        });
    }
}
