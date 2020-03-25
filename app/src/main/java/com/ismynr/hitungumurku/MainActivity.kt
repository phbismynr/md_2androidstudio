package com.ismynr.hitungumurku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFindUmur.setOnClickListener {
//            deklarasi edit text
            var tahunLahir = etInputUmur.text.toString()

//            get tahun saat ini dengan calendar
            var tahun: Int = Calendar.getInstance().get(Calendar.YEAR)

            var umuur = 0
            if(tahunLahir.toIntOrNull() != null){
//                set umur = tahun saat ini dikurangi dengan input pada text
                var umur = tahun - tahunLahir.toInt()
                
//                hasil
                tvUmur.text = "Umur = $umur"
            }else{
                tvUmur.text = "tahun tidak valid"
            }



        }
    }
}
