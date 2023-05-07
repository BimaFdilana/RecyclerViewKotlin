package com.tiara.recyclerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.makan1,
                "Gulai Ikan Patin",
                "Gulai Ikan Patinn adalah masakan yang diolah menggunakan tempoyak yaitu daging buah yang telah di fermentasi, namun dapat digantikan juga dengan santan untuk menghindari bau dan rasa tempoyaknya yang cukup menyengat."

            ),
            Superhero(
                R.drawable.makan2,
                "Gulai Cipuik",
                "Gulai Siput sendiri dalam bahasa dialek Kuantan Singingi disebut dengan “Gulai Cipuik”, sedang dalam bahasa Melayu Rokan disebut dengan Rengkitang. Warga Riau lainnya ada yang menyebutnya \\\"Gulai Tengkuyung\\\", masakan \\\"Gulai Siput Masak Keladi\\\" atau \\\"Gulai Siput Lonceng\\"
            ),
            Superhero(
                R.drawable.makan3,
                "Sambal Cencalok",
                "Cincalok adalah makanan yang berbahan dasar udang yang difermentasikan. Makanan ini adalah makanan khas Pekanbaru, Kepulauan Riau dan berkembang di Kalimantan Barat."
            ),
            Superhero(
                R.drawable.makan4,
                "Nasi Lemak",
                "Nasi lemak adalah nasi yang dimasak menggunakan santan kelapa sehingga rasanya menjadi gurih, selain itu, kerap kali ditambahkan juga daun pandan dalam proses pembuatannya untuk memperkuat aroma."

            ),
            Superhero(
                R.drawable.makan5,
                "Lopek Bugi",
                "Lapek Bugih (dari bahasa Minangkabau: Lepat Bugis) merupakan salah satu kue tradisional Minangkabau yang terbuat dari tepung ketan yang dikukus dan dibungkus daun pisang. Lapek Bugih ini juga dimiliki oleh orang ocu (orang Melayu Kampar) di Kuapan, Kampar dengan nama \\\"Lopek Bugi\\"

            ),
            Superhero(
                R.drawable.makan6,
                "Tarempa",
                "Mie Tarempa merupakan salah satu kuliner yang cukup populer di Kota Batam. Mie Tarempa cukup berbeda, jika dibandingkan dengan beberapa mie yang dikenal masyarakat pada umumnya."

            ),
            Superhero(
                R.drawable.makan7,
                "Mie lendir",
                "Mie Lendir merupakan makanan khas Pulau Batam dan Pulau Bintan, Provinsi Kepulauan Riau. Makanan ini terdiri dari mie kuning yang direbus bersama taoge dan disajikan bersama sebutir telur rebus yang dibelah dua, kemudian disiram dengan kuah kacang yang kental."

            ),
            Superhero(
                R.drawable.makan8,
                "Ikan Cuka",
                "Ikan Cuka adalah hidangan khas Riau berbahan dasar ikan tenggiri dengan balutan bumbu merah."

            ),
            Superhero(
                R.drawable.makan9,
                "Ikan Tongkol Asam Padeh",
                "Gulai ikan asam padeh adalah suatu masakan Minangkabau yang memiliki cita rasa pedas dan asam. Gulai ikan asam padeh ini merupakan salah satu kuliner dari Sumatra Barat."

            ),
            Superhero(
                R.drawable.makan10,
                "Ayam Kemangi",
                "Citarasa dari daun kemangi memang mampu menyedapkan setiap masakan. Tak terkecuali menu ayam dengan bumbu pedas ini. Jangan lupa untuk memasukkan kemangi terakhir kali sesaat masakan akan diangkat, agar tidak terlalu layu & hilang citarasanya."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){
            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }

    }
}