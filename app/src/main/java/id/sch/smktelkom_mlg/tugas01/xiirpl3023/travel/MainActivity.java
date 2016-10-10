package id.sch.smktelkom_mlg.tugas01.xiirpl3023.travel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText EtNama;
    EditText EtAlamat;
    EditText EtTlp;
    Button BPesan;
    TextView Hnam;
    TextView Hal;
    TextView Htlp, hasal, htujuan;
    Spinner asal, tujuan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EtNama = (EditText) findViewById(R.id.editTextNm);
        EtAlamat = (EditText) findViewById(R.id.editTextAlmt);
        EtTlp = (EditText) findViewById(R.id.editTextNt);
        BPesan = (Button) findViewById(R.id.buttonPesan);
        Hnam = (TextView) findViewById(R.id.Hnama);
        Hal = (TextView) findViewById(R.id.Halamat);
        Htlp = (TextView) findViewById(R.id.Htelp);
        asal = (Spinner) findViewById(R.id.spinnerAsal);
        tujuan = (Spinner) findViewById(R.id.spinnerTujuan);
        hasal = (TextView) findViewById(R.id.textView12);
        htujuan = (TextView) findViewById(R.id.textView13);


        findViewById(R.id.buttonPesan).setOnClickListener(new View.OnClickListener() {
                                                              @Override
                                                              public void onClick(View view) {
                                                                  doClick();
                                                              }

                                                              private void doClick() {
                                                                  if (isValid()) {

                                                                      String nama = EtNama.getText().toString();
                                                                      Hnam.setText(nama);
                                                                      String alamat = EtAlamat.getText().toString();
                                                                      Hal.setText(alamat);
                                                                      int no = Integer.parseInt(EtTlp.getText().toString());
                                                                      Htlp.setText(no);

                                                                  }

                                                              }


                                                              private boolean isValid()

                                                              {
                                                                  boolean valid = true;
                                                                  String nama = EtNama.getText().toString();
                                                                  String alamat = EtAlamat.getText().toString();
                                                                  String no = EtTlp.getText().toString();

                                                                  if (nama.isEmpty()) {
                                                                      EtNama.setError("Nama Belum diisi");
                                                                      valid = false;
                                                                  } else if (nama.length() < 3) {
                                                                      EtNama.setError("Nama minimal 3 karakter");
                                                                      valid = false;
                                                                  } else {
                                                                      Hnam.setText(nama);
                                                                  }
                                                                  if (alamat.isEmpty()) {
                                                                      EtAlamat.setError("Alamat belum diisi");
                                                                      valid = false;
                                                                  } else {
                                                                      Hal.setText(alamat);
                                                                  }
                                                                  if (no.isEmpty()) {
                                                                      EtTlp.setError("No Telephone Belum diisii");
                                                                      valid = false;
                                                                  } else {
                                                                      Htlp.setText(no);
                                                                  }

                                                                  hasal.setText("Asal \n " + asal.getSelectedItem().toString());
                                                                  htujuan.setText("Tujuan \n " + tujuan.getSelectedItem().toString());

                                                                  return false;
                                                              }
                                                          }
        );
    }
}


