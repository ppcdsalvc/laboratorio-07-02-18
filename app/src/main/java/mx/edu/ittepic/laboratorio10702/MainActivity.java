package mx.edu.ittepic.laboratorio10702;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Boolean turno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);
        b6 = findViewById(R.id.btn6);
        b7 = findViewById(R.id.btn7);
        b8 = findViewById(R.id.btn8);
        b9 = findViewById(R.id.btn9);

        turno = true;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turno==true){
                    b1.setText("X");
                    if (b1.getText()=="X"&&b2.getText()=="X"&&b3.getText()=="X"||b4.getText()=="X"&&b5.getText()=="X"&&b6.getText()=="X"||b7.getText()=="X"&&b8.getText()=="X"&&b9.getText()=="X"||b1.getText()=="X"&&b4.getText()=="X"&&b7.getText()=="X"||b2.getText()=="X"||b5.getText()=="X"&&b8.getText()=="X"||b3.getText()=="X"&&b6.getText()=="X"&&b9.getText()=="X"||b1.getText()=="X"&&b5.getText()=="X"&&b9.getText()=="X"||b3.getText()=="X"&&b5.getText()=="X"&&b7.getText()=="X"){
                        Toast.makeText(MainActivity.this, "El jugador X gano", Toast.LENGTH_SHORT).show();
                    }
                    turno=false;
                }else {
                    b1.setText("O");
                    if (b1.getText()=="O"&&b2.getText()=="O"&&b3.getText()=="O"||b4.getText()=="O"&&b5.getText()=="O"&&b6.getText()=="O"||b7.getText()=="O"&&b8.getText()=="O"&&b9.getText()=="O"||b1.getText()=="O"&&b4.getText()=="O"&&b7.getText()=="O"||b2.getText()=="O"||b5.getText()=="O"&&b8.getText()=="O"||b3.getText()=="O"&&b6.getText()=="O"&&b9.getText()=="O"||b1.getText()=="O"&&b5.getText()=="X"&&b9.getText()=="O"||b3.getText()=="O"&&b5.getText()=="O"&&b7.getText()=="O"){
                        Toast.makeText(MainActivity.this, "El jugador O gano", Toast.LENGTH_SHORT).show();
                    }
                    turno=true;
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turno==true){
                    b2.setText("X");
                    if (b1.getText()=="X"&&b2.getText()=="X"&&b3.getText()=="X"||b4.getText()=="X"&&b5.getText()=="X"&&b6.getText()=="X"||b7.getText()=="X"&&b8.getText()=="X"&&b9.getText()=="X"||b1.getText()=="X"&&b4.getText()=="X"&&b7.getText()=="X"||b2.getText()=="X"||b5.getText()=="X"&&b8.getText()=="X"||b3.getText()=="X"&&b6.getText()=="X"&&b9.getText()=="X"||b1.getText()=="X"&&b5.getText()=="X"&&b9.getText()=="X"||b3.getText()=="X"&&b5.getText()=="X"&&b7.getText()=="X"){
                        Toast.makeText(MainActivity.this, "El jugador X gano", Toast.LENGTH_SHORT).show();
                    }
                    turno=false;
                }else {
                    b2.setText("O");
                    if (b1.getText()=="O"&&b2.getText()=="O"&&b3.getText()=="O"||b4.getText()=="O"&&b5.getText()=="O"&&b6.getText()=="O"||b7.getText()=="O"&&b8.getText()=="O"&&b9.getText()=="O"||b1.getText()=="O"&&b4.getText()=="O"&&b7.getText()=="O"||b2.getText()=="O"||b5.getText()=="O"&&b8.getText()=="O"||b3.getText()=="O"&&b6.getText()=="O"&&b9.getText()=="O"||b1.getText()=="O"&&b5.getText()=="X"&&b9.getText()=="O"||b3.getText()=="O"&&b5.getText()=="O"&&b7.getText()=="O"){
                        Toast.makeText(MainActivity.this, "El jugador O gano", Toast.LENGTH_SHORT).show();
                    }

                    turno=true;
                }

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turno==true){
                    b3.setText("X");
                    if (b1.getText()=="X"&&b2.getText()=="X"&&b3.getText()=="X"||b4.getText()=="X"&&b5.getText()=="X"&&b6.getText()=="X"||b7.getText()=="X"&&b8.getText()=="X"&&b9.getText()=="X"||b1.getText()=="X"&&b4.getText()=="X"&&b7.getText()=="X"||b2.getText()=="X"||b5.getText()=="X"&&b8.getText()=="X"||b3.getText()=="X"&&b6.getText()=="X"&&b9.getText()=="X"||b1.getText()=="X"&&b5.getText()=="X"&&b9.getText()=="X"||b3.getText()=="X"&&b5.getText()=="X"&&b7.getText()=="X"){
                        Toast.makeText(MainActivity.this, "El jugador X gano", Toast.LENGTH_SHORT).show();
                    }
                    turno=false;
                }else {
                    b3.setText("O");
                    if (b1.getText()=="O"&&b2.getText()=="O"&&b3.getText()=="O"||b4.getText()=="O"&&b5.getText()=="O"&&b6.getText()=="O"||b7.getText()=="O"&&b8.getText()=="O"&&b9.getText()=="O"||b1.getText()=="O"&&b4.getText()=="O"&&b7.getText()=="O"||b2.getText()=="O"||b5.getText()=="O"&&b8.getText()=="O"||b3.getText()=="O"&&b6.getText()=="O"&&b9.getText()=="O"||b1.getText()=="O"&&b5.getText()=="X"&&b9.getText()=="O"||b3.getText()=="O"&&b5.getText()=="O"&&b7.getText()=="O"){
                        Toast.makeText(MainActivity.this, "El jugador O gano", Toast.LENGTH_SHORT).show();
                    }
                    turno=true;
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turno==true){
                    b4.setText("X");
                    if (b1.getText()=="X"&&b2.getText()=="X"&&b3.getText()=="X"||b4.getText()=="X"&&b5.getText()=="X"&&b6.getText()=="X"||b7.getText()=="X"&&b8.getText()=="X"&&b9.getText()=="X"||b1.getText()=="X"&&b4.getText()=="X"&&b7.getText()=="X"||b2.getText()=="X"||b5.getText()=="X"&&b8.getText()=="X"||b3.getText()=="X"&&b6.getText()=="X"&&b9.getText()=="X"||b1.getText()=="X"&&b5.getText()=="X"&&b9.getText()=="X"||b3.getText()=="X"&&b5.getText()=="X"&&b7.getText()=="X"){
                        Toast.makeText(MainActivity.this, "El jugador X gano", Toast.LENGTH_SHORT).show();
                    }
                    turno=false;
                }else {
                    b4.setText("O");
                    if (b1.getText()=="O"&&b2.getText()=="O"&&b3.getText()=="O"||b4.getText()=="O"&&b5.getText()=="O"&&b6.getText()=="O"||b7.getText()=="O"&&b8.getText()=="O"&&b9.getText()=="O"||b1.getText()=="O"&&b4.getText()=="O"&&b7.getText()=="O"||b2.getText()=="O"||b5.getText()=="O"&&b8.getText()=="O"||b3.getText()=="O"&&b6.getText()=="O"&&b9.getText()=="O"||b1.getText()=="O"&&b5.getText()=="X"&&b9.getText()=="O"||b3.getText()=="O"&&b5.getText()=="O"&&b7.getText()=="O"){
                        Toast.makeText(MainActivity.this, "El jugador O gano", Toast.LENGTH_SHORT).show();
                    }
                    turno=true;
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turno==true){
                    b5.setText("X");
                    if (b1.getText()=="X"&&b2.getText()=="X"&&b3.getText()=="X"||b4.getText()=="X"&&b5.getText()=="X"&&b6.getText()=="X"||b7.getText()=="X"&&b8.getText()=="X"&&b9.getText()=="X"||b1.getText()=="X"&&b4.getText()=="X"&&b7.getText()=="X"||b2.getText()=="X"||b5.getText()=="X"&&b8.getText()=="X"||b3.getText()=="X"&&b6.getText()=="X"&&b9.getText()=="X"||b1.getText()=="X"&&b5.getText()=="X"&&b9.getText()=="X"||b3.getText()=="X"&&b5.getText()=="X"&&b7.getText()=="X"){
                        Toast.makeText(MainActivity.this, "El jugador X gano", Toast.LENGTH_SHORT).show();
                    }
                    turno=false;
                }else {
                    b5.setText("O");
                    if (b1.getText()=="O"&&b2.getText()=="O"&&b3.getText()=="O"||b4.getText()=="O"&&b5.getText()=="O"&&b6.getText()=="O"||b7.getText()=="O"&&b8.getText()=="O"&&b9.getText()=="O"||b1.getText()=="O"&&b4.getText()=="O"&&b7.getText()=="O"||b2.getText()=="O"||b5.getText()=="O"&&b8.getText()=="O"||b3.getText()=="O"&&b6.getText()=="O"&&b9.getText()=="O"||b1.getText()=="O"&&b5.getText()=="X"&&b9.getText()=="O"||b3.getText()=="O"&&b5.getText()=="O"&&b7.getText()=="O"){
                        Toast.makeText(MainActivity.this, "El jugador O gano", Toast.LENGTH_SHORT).show();
                    }
                    turno=true;
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turno==true){
                    b6.setText("X");
                    if (b1.getText()=="X"&&b2.getText()=="X"&&b3.getText()=="X"||b4.getText()=="X"&&b5.getText()=="X"&&b6.getText()=="X"||b7.getText()=="X"&&b8.getText()=="X"&&b9.getText()=="X"||b1.getText()=="X"&&b4.getText()=="X"&&b7.getText()=="X"||b2.getText()=="X"||b5.getText()=="X"&&b8.getText()=="X"||b3.getText()=="X"&&b6.getText()=="X"&&b9.getText()=="X"||b1.getText()=="X"&&b5.getText()=="X"&&b9.getText()=="X"||b3.getText()=="X"&&b5.getText()=="X"&&b7.getText()=="X"){
                        Toast.makeText(MainActivity.this, "El jugador X gano", Toast.LENGTH_SHORT).show();
                    }
                    turno=false;
                }else {
                    b6.setText("O");
                    if (b1.getText()=="O"&&b2.getText()=="O"&&b3.getText()=="O"||b4.getText()=="O"&&b5.getText()=="O"&&b6.getText()=="O"||b7.getText()=="O"&&b8.getText()=="O"&&b9.getText()=="O"||b1.getText()=="O"&&b4.getText()=="O"&&b7.getText()=="O"||b2.getText()=="O"||b5.getText()=="O"&&b8.getText()=="O"||b3.getText()=="O"&&b6.getText()=="O"&&b9.getText()=="O"||b1.getText()=="O"&&b5.getText()=="X"&&b9.getText()=="O"||b3.getText()=="O"&&b5.getText()=="O"&&b7.getText()=="O"){
                        Toast.makeText(MainActivity.this, "El jugador O gano", Toast.LENGTH_SHORT).show();
                    }
                    turno=true;
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turno==true){
                    b7.setText("X");
                    if (b1.getText()=="X"&&b2.getText()=="X"&&b3.getText()=="X"||b4.getText()=="X"&&b5.getText()=="X"&&b6.getText()=="X"||b7.getText()=="X"&&b8.getText()=="X"&&b9.getText()=="X"||b1.getText()=="X"&&b4.getText()=="X"&&b7.getText()=="X"||b2.getText()=="X"||b5.getText()=="X"&&b8.getText()=="X"||b3.getText()=="X"&&b6.getText()=="X"&&b9.getText()=="X"||b1.getText()=="X"&&b5.getText()=="X"&&b9.getText()=="X"||b3.getText()=="X"&&b5.getText()=="X"&&b7.getText()=="X"){
                        Toast.makeText(MainActivity.this, "El jugador X gano", Toast.LENGTH_SHORT).show();
                    }
                    turno=false;
                }else {
                    b7.setText("O");
                    if (b1.getText()=="O"&&b2.getText()=="O"&&b3.getText()=="O"||b4.getText()=="O"&&b5.getText()=="O"&&b6.getText()=="O"||b7.getText()=="O"&&b8.getText()=="O"&&b9.getText()=="O"||b1.getText()=="O"&&b4.getText()=="O"&&b7.getText()=="O"||b2.getText()=="O"||b5.getText()=="O"&&b8.getText()=="O"||b3.getText()=="O"&&b6.getText()=="O"&&b9.getText()=="O"||b1.getText()=="O"&&b5.getText()=="X"&&b9.getText()=="O"||b3.getText()=="O"&&b5.getText()=="O"&&b7.getText()=="O"){
                        Toast.makeText(MainActivity.this, "El jugador O gano", Toast.LENGTH_SHORT).show();
                    }
                    turno=true;
                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turno==true){
                    b8.setText("X");
                    if (b1.getText()=="X"&&b2.getText()=="X"&&b3.getText()=="X"||b4.getText()=="X"&&b5.getText()=="X"&&b6.getText()=="X"||b7.getText()=="X"&&b8.getText()=="X"&&b9.getText()=="X"||b1.getText()=="X"&&b4.getText()=="X"&&b7.getText()=="X"||b2.getText()=="X"||b5.getText()=="X"&&b8.getText()=="X"||b3.getText()=="X"&&b6.getText()=="X"&&b9.getText()=="X"||b1.getText()=="X"&&b5.getText()=="X"&&b9.getText()=="X"||b3.getText()=="X"&&b5.getText()=="X"&&b7.getText()=="X"){
                        Toast.makeText(MainActivity.this, "El jugador X gano", Toast.LENGTH_SHORT).show();
                    }
                    turno=false;
                }else {
                    b8.setText("O");
                    if (b1.getText()=="O"&&b2.getText()=="O"&&b3.getText()=="O"||b4.getText()=="O"&&b5.getText()=="O"&&b6.getText()=="O"||b7.getText()=="O"&&b8.getText()=="O"&&b9.getText()=="O"||b1.getText()=="O"&&b4.getText()=="O"&&b7.getText()=="O"||b2.getText()=="O"||b5.getText()=="O"&&b8.getText()=="O"||b3.getText()=="O"&&b6.getText()=="O"&&b9.getText()=="O"||b1.getText()=="O"&&b5.getText()=="X"&&b9.getText()=="O"||b3.getText()=="O"&&b5.getText()=="O"&&b7.getText()=="O"){
                        Toast.makeText(MainActivity.this, "El jugador O gano", Toast.LENGTH_SHORT).show();
                    }
                    turno=true;
                }
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turno==true){
                    b9.setText("X");
                    if (b1.getText()=="X"&&b2.getText()=="X"&&b3.getText()=="X"||b4.getText()=="X"&&b5.getText()=="X"&&b6.getText()=="X"||b7.getText()=="X"&&b8.getText()=="X"&&b9.getText()=="X"||b1.getText()=="X"&&b4.getText()=="X"&&b7.getText()=="X"||b2.getText()=="X"||b5.getText()=="X"&&b8.getText()=="X"||b3.getText()=="X"&&b6.getText()=="X"&&b9.getText()=="X"||b1.getText()=="X"&&b5.getText()=="X"&&b9.getText()=="X"||b3.getText()=="X"&&b5.getText()=="X"&&b7.getText()=="X"){
                        Toast.makeText(MainActivity.this, "El jugador X gano", Toast.LENGTH_SHORT).show();
                    }
                    turno=false;
                }else {
                    b9.setText("O");
                    if (b1.getText()=="O"&&b2.getText()=="O"&&b3.getText()=="O"||b4.getText()=="O"&&b5.getText()=="O"&&b6.getText()=="O"||b7.getText()=="O"&&b8.getText()=="O"&&b9.getText()=="O"||b1.getText()=="O"&&b4.getText()=="O"&&b7.getText()=="O"||b2.getText()=="O"||b5.getText()=="O"&&b8.getText()=="O"||b3.getText()=="O"&&b6.getText()=="O"&&b9.getText()=="O"||b1.getText()=="O"&&b5.getText()=="X"&&b9.getText()=="O"||b3.getText()=="O"&&b5.getText()=="O"&&b7.getText()=="O"){
                        Toast.makeText(MainActivity.this, "El jugador O gano", Toast.LENGTH_SHORT).show();
                    }
                    turno=true;
                }
            }
        });
    }
}
