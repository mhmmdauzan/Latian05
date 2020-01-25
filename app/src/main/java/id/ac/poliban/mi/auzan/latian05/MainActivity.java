package id.ac.poliban.mi.auzan.latian05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btKirim = findViewById(R.id.btKirim);
        final EditText etNama = findViewById(R.id.etNama);
        final EditText etAlamat = findViewById(R.id.etAlamat);
        final EditText etSubjek = findViewById(R.id.etSubjek);
        final EditText etPesan = findViewById(R.id.etPesan);

        btKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNama.getText().clear();
                etAlamat.getText().clear();
                etSubjek.getText().clear();
                etPesan.getText().clear();

                Toast.makeText(MainActivity.this, "PESAN TELAH TERKIRIM", Toast.LENGTH_SHORT).show();
            }
        });
    }
}