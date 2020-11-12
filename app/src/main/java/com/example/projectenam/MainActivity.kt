package com.example.projectenam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testData = createPhoneData()
        rv_part.layoutManager = LinearLayoutManager(this)
        rv_part.setHasFixedSize(true)
        rv_part.adapter = ContactAdapter(testData, {phoneItem : phoneData -> phoneItemClicked(phoneItem)})
    }

    private fun phoneItemClicked(phoneItem: phoneData) {
        val showDetailActivityIntent = Intent(this, phoneDetailActivity::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, phoneItem.phone.toString())
        showDetailActivityIntent.putExtra(Intent.EXTRA_COMPONENT_NAME, phoneItem.contactName)
        showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL,phoneItem.contactEmail)
        startActivity(showDetailActivityIntent)
    }

    private fun createPhoneData(): List<phoneData> {
        val partList = ArrayList<phoneData>()
        partList.add(phoneData("Jl Bangsri no 19. RT 04 RW 02, Bangsri, Sukodono, Sidoarjo","Marsus","Martabak dengan isian usus pedas banget \"HARGA : IDR 2000 ",R.drawable.marsus))
        partList.add(phoneData("Jl Bangsri no 19. RT 04 RW 02, Bangsri, Sukodono, Sidoarjo","Marlung","Martabak dengan isian balung/tulang ayam dengan bumbu pedas \"HARGA : IDR 2000 ", R.drawable.marlung))
        partList.add(phoneData("Jl Bangsri no 19. RT 04 RW 02, Bangsri, Sukodono, Sidoarjo","Marmie","Martabak dengan isian mie bihun/mie instant \"HARGA : IDR 2000 ",R.drawable.marmie))
        partList.add(phoneData("Jl Bangsri no 19. RT 04 RW 02, Bangsri, Sukodono, Sidoarjo","Marje","Martabak dengan isian gaje/lemak sapi \"HARGA : IDR 3000 ",R.drawable.marje))
        partList.add(phoneData("Jl Bangsri no 19. RT 04 RW 02, Bangsri, Sukodono, Sidoarjo","Marloati","Martabak dengan isian hati ayam \"HARGA : IDR 3000 ",R.drawable.marloati))
        partList.add(phoneData("Pasar Sukodono, Sukodono, Sidoarjo","TahuGO","Tahu dengan berbagai macam varian rasa",R.drawable.tahugo))
        return partList
    }
}