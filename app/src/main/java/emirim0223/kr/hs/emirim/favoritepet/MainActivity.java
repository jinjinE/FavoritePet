package emirim0223.kr.hs.emirim.favoritepet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    CheckBox checkSelect;
    TextView textQuest;
    RadioGroup rg;
    RadioButton radio_dog, radio_cat, radio_rabbit;
    Button butOk;
    ImageView imgvPet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkSelect = (CheckBox)findViewById(R.id.check_select);
        textQuest = (TextView)findViewById(R.id.text_quest);
        rg = (RadioGroup)findViewById(R.id.rg);
        radio_dog = (RadioButton) findViewById(R.id.radio_dog);
        radio_cat = (RadioButton) findViewById(R.id.radio_cat);
        radio_rabbit = (RadioButton) findViewById(R.id.radio_rabbit);
        butOk = (Button)findViewById(R.id.but_ok);
        imgvPet = (ImageView) findViewById(R.id.imgv_pet);
        checkSelect.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(checkSelect.isChecked()){
            textQuest.setVisibility(View.VISIBLE);
            rg.setVisibility(View.VISIBLE);
            butOk.setVisibility(View.VISIBLE);
            imgvPet.setVisibility(View.VISIBLE);
        }
        else{
            textQuest.setVisibility(View.INVISIBLE);
            rg.setVisibility(View.INVISIBLE);
            butOk.setVisibility(View.INVISIBLE);
            imgvPet.setVisibility(View.INVISIBLE);
        }
    }
}
