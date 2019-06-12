package com.example.macosx.quickhealguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcview;

    String[] img = {
            "https://hellosehat.com/wp-content/uploads/2018/11/sering-pingsan.jpg","https://res.cloudinary.com/dk0z4ums3/image/upload/v1547180134/attached_image/dehidrasi.jpg",
            "https://awsimages.detik.net.id/community/media/visual/2016/08/25/973aa750-a8d5-4d8e-a169-39949a80218f_43.jpg?w=700&q=90","http://cdn2.tstatic.net/tribunnews/foto/bank/images/ilustrasi-sakit-kepala_20180519_110813.jpg",
            "http://prfmnews.com/images/Penyebab-Sakit-Maag-dan-Cara-Mengatasinya-Secara-Alami-Tanpa-Efek-Samping.jpg","https://hellosehat.com/wp-content/uploads/2016/03/Lemah-Jantung-.jpg",
            "https://www.dictio.id/uploads/db3342/original/3X/e/6/e635ca3f78a8cd66993fde3a1d09ee507503f954.jpg","https://awsimages.detik.net.id/community/media/visual/2017/10/11/0095e905-d0b4-471c-bd96-ce3338e65ec3_43.jpg?w=700&q=90",
            "https://hellosehat.com/wp-content/uploads/2017/09/shutterstock_616444139.jpg","https://media.beritagar.id/2018-07/9ef5fe493d5a98129512a1245604116f.jpg",
            "https://asset-a.grid.id/crop/0x0:0x0/700x465/photo/grid/original/30796_keseleo.jpg","https://hellosehat.com/wp-content/uploads/2017/12/luka-terbuka-kena-air.jpg",
            "https://hellosehat.com/wp-content/uploads/2017/01/pendarahan-menyusui.jpg","https://cdn.jitunews.com/dynamic/thumb/2018/10/ilustrasi-patah-tulang_6364de56610a9abbd4d205ea79e4697d_630x420_thumb.jpg?w=630",
            "https://res.cloudinary.com/dk0z4ums3/image/upload/v1507896905/attached_image/mengenal-derajat-luka-bakar-dan-perawatannya-alodokter.jpg",
            "https://media.suara.com/pictures/653x366/2019/03/05/23967-ilustrasi-hipotermia-shutterstock.jpg","http://pedomanbengkulu.com/wp-content/uploads/2018/04/received_1755027401222810.jpeg"
    };
    String[] judul = {"Pingsan (Syncope/collapse)","Dehidrasi","Asma","Pusing/Vertigo/Nyeri Kepala","Maag/Mual","Lemah jantung","Histeria","Mimisan","Kram","Memar",
            "Keseleo","Luka","Pendarahan","Patah Tulang/fraktur","Luka Bakar","Hipotermia","Keracunan Makanan"};
    int[] gejala = {R.string.gejala_pingsan,R.string.gejala_dehidrasi,R.string.gejala_asma,R.string.gejala_pusing,R.string.gejala_maag,R.string.gejala_jantunglemah,
            R.string.gejala_histeria,R.string.gejala_mimisan,R.string.gejala_kram,R.string.gejala_memar,R.string.gejala_keseleo,
    R.string.gejala_luka,R.string.gejala_pendarahan,R.string.gejala_patahtulang,R.string.gejala_lukabakar,R.string.gejala_hipotermia,R.string.gejala_keracunanmakanan};
    int[] penanganan = {R.string.penanganan_pingsan,R.string.penanganan_dehidrasi,R.string.penanganan_asma,R.string.penanganan_pusing,R.string.penanganan_maag,
    R.string.penanganan_jantunglemah,R.string.penangaan_histeria,R.string.penanganan_mimisan,R.string.penanganan_kram,R.string.penanganan_memar,R.string.penanganan_keseleo,
    R.string.penanganan_luka,R.string.penanganan_pendarahan,R.string.penanganan_patahtulang,R.string.penanganan_lukabakar,R.string.penanganan_hipotermia,R.string.penanganan_keracunanmakanan};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcview = findViewById(R.id.rcview);
        Recyclersembuh adapter = new Recyclersembuh(this,judul,gejala,penanganan,img, this);

        rcview.setAdapter(adapter);

        rcview.setLayoutManager(new LinearLayoutManager(this));
    }
}
