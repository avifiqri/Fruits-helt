package com.example.fruitshelath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    List<Model> main_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_list = new ArrayList<>();
        recyclerView = findViewById(R.id.recycle);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        main_list.add(new Model(R.drawable.apel, "Buah Apel", "1. Apel bersifat sebagai anti-kanker. \n  2. Menurunkn Kolesterol. \n  3. Meningkankan Sistem Kekebalan Tubuh. \n  4. Mencegah Alzheimer. \n  5. Mengobati Asma \n  6. Mengendalikan Gula Darah. \n  7. Mencegah Batu Empedu \n  8. Menetralkan Irritable Bowel Syndrome.  "));
        main_list.add(new Model(R.drawable.belimbingwuluh, "Buah Belimbing wuluh", " 1. Membantu meredakan batuk. \n  2. Mengobati wajah berjerawat. \n  3. Mengobati sakit gigi. \n  4. Membantu meringankan kaku dan nyeri otot. \n  5. Menyembuhkan sakit linu karena rematik.  "));
        main_list.add(new Model(R.drawable.ceri, "Buah Ceri", " 1. Kaya akan Nutrisi. \n  2. Pengeluaran Racun. \n  3. Penghilang Rasa Sakit.  \n  4. Sebagai Anti Inflamasi. \n  5. Meningkatkan Gairah Suami Istri. "));
        main_list.add(new Model(R.drawable.delima, "Buah Delima", " 1. Perawatan Gigi. \n  2. Menjaga Kesehatan Jantung. \n  3. Stenosis arteri karotis. \n  4. Mencegah Kanker Prostat. \n  5. Mengatasi Gangguan Perut \n  6. Menghindari Anemia. "));
        main_list.add(new Model(R.drawable.jeruk, "Buah Jeruk ", " 1. Menjaga fungsi otak. \n  2. Daya tahan tubuh terhadap penyakit. \n  3. Sebagai Antioksidan. \n  4. Menurunkan resiko kanker hati. \n  5. Memelihara kesehatan Jantung. \n  6. Terhindar dari infeksi bakteri.  "));
        main_list.add(new Model(R.drawable.kiwi, "Buah Kiwi", " 1. Membantu Mengelola Tekanan Darah. \n  2. Melindungi dari Kerusakan DNA. \n  3. Meningkatkan Kekebalan Tubuh. \n  4. Untuk Berat Badan. \n 5. Meningkatkan Kesehatan Pencernaan. \n 6. Membantu menghilangkan Racun."));
        main_list.add(new Model(R.drawable.langsat, "Buah Langsat", " 1. Membantu Mencegah Kanker. \n  2. Mengobati Demam dan Flu. \n  3. Memperkuat Tulang dan Gigi. \n  4. Baik untuk Penderita Diabetes. \n  5. Membantu Mengontrol Kolesterol. \n  6. Meredakan Sakit Migrain. \n  7. Sebagai Anti Malaria."));
        main_list.add(new Model(R.drawable.manggis, "Buah Manggis ", " 1. Menjaga kesehatan kulit. \n  2.Mengatasi diabetes dan kardiovaskular. \n  3. Sebagai antioksidan. \n  4. Mengurangi berat badan.  "));
        main_list.add(new Model(R.drawable.nanas, "Buah Nanas ", " 1. Melawan radikal bebas. \n  2. Menjaga kesehatan jantung. \n  3. Membantu menurunkan kadar lemak. \n  4. Meningkatkan daya tahan tubuh. \n  5. Menyehatkan mata."));
        main_list.add(new Model(R.drawable.pisang, "Buah Pisang", " 1. Kaya kandungan vitamin dan serat. \n  2. Sumber energi. \n  3. Menurunkan berat badan. \n  4. Meningkatkan kesehatan otak. \n  5. Mengobati jerawat \n  6. Menghaluskan kulit wajah. "));
        main_list.add(new Model(R.drawable.tin, "Buah Tin", " 1. Anti Bakteri, virus dan jamur. \n  2. Untuk Diet. \n  3. Pembentukan sel darah merah. \n  4. Mempelancar Sistem Pencernaan. \n  5. Mencegah resiko penyakit jantung. \n  6. Kalsium. "));
        adapter = new ListItemAdapter(main_list, getApplicationContext());
        recyclerView.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int selected) {

        switch (selected){
            case R.id.about:
                Intent intent = new Intent(this, About.class);
                startActivity(intent);
                break;
        }

    }

}
