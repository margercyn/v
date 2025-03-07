package com.example.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.google.android.engage.common.datamodel.Image

class Menu : AppCompatActivity() {

    private lateinit var nR: RecyclerView
    private lateinit var nA: ArrayList<Post>
    lateinit var imageId : Array<Int>
    lateinit var heading:Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        imageId = arrayOf(
            R.drawable.q,
            R.drawable.q,
            R.drawable.q,
            R.drawable.q,
            R.drawable.q,
            R.drawable.q,

        )
        heading = arrayOf(
            "",
            "",
            "",
            "",
            ""
        )
        nR = findViewById(R.id.list)
        nR.layoutManager = LinearLayoutManager(this)
        nR.setHasFixedSize(true)

        nA= arrayListOf<Post>()
            getUserdata()
        }

      private fun getUserdata(){
          for (i in imageId.indices){
              val post = Post(imageId[i],heading[i])
              nA.add(post)
          }
          nR.adapter = Adapter(nA)
      }

    }
