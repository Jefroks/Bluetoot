package com.example.bluetooth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}
/*    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        if (blue.checkPermissions(requestCode,grantResults)){
            Toast.makeText(this, "Exit", Toast.LENGTH_SHORT).show()
            blue.initializeBluetooth()
        }else{
            if(Build.VERSION.SDK_INT < Build.VERSION_CODES.S){
                blue.initializeBluetooth()
            }else{
                Toast.makeText(this, "Algo salio mal", Toast.LENGTH_SHORT).show()
            }
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }
}
fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
    if (!blue.stateBluetoooth() && requestCode == 100){
        blue.initializeBluetooth()
    }else{
        if (requestCode == 100){
            devicesBluetooth = blue.deviceBluetooth()
            if (devicesBluetooth.isNotEmpty()){
                val adapter = ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,devicesBluetooth)
                listDeviceBluetooth.adapter = adapter
            }else{
                Toast.makeText(this, "No tienes vinculados dispositivos", Toast.LENGTH_SHORT).show()
            }

        }
    }
    super.onActivityResult(requestCode, resultCode, data)
}*/
