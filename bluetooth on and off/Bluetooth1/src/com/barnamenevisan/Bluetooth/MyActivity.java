package com.barnamenevisan.Bluetooth;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MyActivity extends Activity {
    private static final int REQUEST_ENABLE_BT = 0;
    private static final int REQUEST_DISCOVERABLE_BT = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final TextView out=(TextView)findViewById(R.id.out);
        final Button button1 = (Button) findViewById(R.id.button1);

        final Button button3 = (Button) findViewById(R.id.button3);
        final BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.
                getDefaultAdapter();
        if (mBluetoothAdapter == null) {
            out.append("device not supported");
        }
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!mBluetoothAdapter.isEnabled()) {
                    Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                    startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                mBluetoothAdapter.disable();
//            out.append("TURN_OFF BLUETOOTH");
                Context context = getApplicationContext();
                CharSequence text = "TURNING_OFF BLUETOOTH";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, 15);
                toast.show();
            }
        });
    }
    /**
     * Called when the activity is first created.
     */
    }

