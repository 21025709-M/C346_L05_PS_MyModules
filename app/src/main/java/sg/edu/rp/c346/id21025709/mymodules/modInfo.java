package sg.edu.rp.c346.id21025709.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.strictmode.IntentReceiverLeakedViolation;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class modInfo extends AppCompatActivity {

    TextView title, modCode, modName, acadYear, sem, modCredit, venue;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mod_info);

        modCode = findViewById(R.id.textViewModCode);
        modName = findViewById(R.id.textViewModName);
        acadYear = findViewById(R.id.textViewAcadYear);
        sem = findViewById(R.id.textViewSem);
        modCredit = findViewById(R.id.textViewModCredit);
        venue = findViewById(R.id.textViewVenue);
        back = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();

        String ModuleCode = intentReceived.getStringExtra("ModuleCode");
        String ModuleName = intentReceived.getStringExtra("ModuleName");
        int AcademicYear = intentReceived.getIntExtra("AcademicYear", 0);
        int Semester = intentReceived.getIntExtra("Semester", 0);
        int ModuleCredit = intentReceived.getIntExtra("ModuleCredit", 0);
        String Venue = intentReceived.getStringExtra("Venue");

        modCode.setText("Module Code: " + ModuleCode);
        modName.setText("Module Name: " + ModuleName);
        acadYear.setText("Academic Year: " + AcademicYear);
        sem.setText("Semester: " + Semester);
        modCredit.setText("Module Credit: " + ModuleCredit);
        venue.setText("Venue: " + Venue);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}