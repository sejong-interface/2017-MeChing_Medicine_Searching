package test.com.a1team_meching;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class result18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result18);
    }
    public void rrr5(View v) {
        Intent intent = new Intent(this, drug8.class);
        startActivity(intent);
    }
    public void rrr6(View v) {
        Intent intent = new Intent(this, drug9.class);
        startActivity(intent);
    }
    public void resultback(View v) {
        this.finish();
    }
    public void resultbutton(View v) {
        Intent intent = new Intent(this, h_popup.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }
}
