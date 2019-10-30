package com.tjoeun.a20191030_01_event

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // xml에 그려진 초기 값이라고 적힌 텍스트 뷰의 글자를 "실행 후"로 변경

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstTextView.text = "실행 후"
        okBtn.setOnClickListener {
            firstTextView.text = "확인버튼 클릭됨"

            var inputId = loginIdEdt.text.toString()
            resultTxt.text = inputId

            Log.d("로그",inputId)

            Toast.makeText(this,inputId,Toast.LENGTH_SHORT).show()
        }

        okBtn.setOnLongClickListener {
            firstTextView.text = "확인버튼 오래 클릭됨"

            return@setOnLongClickListener true
        }

        // @라벨에 대한 예시. 책49페이지

        firstFor@ for ( i in 0..10){
            secondFor@ for ( j in 0..10){

                if(j == 2){
                    break@firstFor
                }
            }
        }


        var stringList:ArrayList<String> = ArrayList()

        // stringList에 값을 추가
        stringList.add("김기백")
        stringList.add("조경진")
        stringList.add("김문석")

        var intList:ArrayList<Int> = ArrayList()
        intList.add(10)
        intList.add(20)
        intList.add(30)

        // stringList 찾기
        val indexOfJoe = stringList.indexOf("조경진")

        // stringList 제거
        stringList.remove("조경진")

        var a = 10
        var b = 20
        var c = if(a == b){
            Log.d("로그","둘이 같다")
        }else{
            Log.d("로그","둘이 다르다")
        } // 이런 문법도 가능함 책39페이지

        when(a){
            0, 1 -> Log.d("로그","a가 0이나 1이다")
            in 2..5 -> Log.d("로그","a가 2에서 5사이다")
            in intList -> Log.d("로그","a가 intList에 포함")
            !in intList -> Log.d("로그","a가 intList에 미포함")
        }

        for(name in stringList){
            Log.d("로그",name)
        }

        for(i in 0..5){
            Log.d("로그","$i")
        }
    }
}
