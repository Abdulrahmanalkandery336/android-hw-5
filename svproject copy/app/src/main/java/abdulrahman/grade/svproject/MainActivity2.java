package abdulrahman.grade.svproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView n = findViewById(R.id.s);
        Bundle b = getIntent().getExtras();
        n.setText(b.getString("data1"));

        TextView re = findViewById(R.id.a);
        Bundle hs = getIntent().getExtras();
        re.setText(hs.getString("data2"));


        TextView lu = findViewById(R.id.y);
        Bundle sw = getIntent().getExtras();
        lu.setText(sw.getString("data3"));

        TextView wq = findViewById(R.id.p);
        Bundle op = getIntent().getExtras();
        wq.setText(op.getString("data4"));

        TextView uy = findViewById(R.id.e);
        Bundle tr = getIntent().getExtras();
        uy.setText(tr.getString("data5"));
    }
}