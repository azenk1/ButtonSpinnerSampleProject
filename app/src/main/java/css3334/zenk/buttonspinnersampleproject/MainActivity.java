package css3334.zenk.buttonspinnersampleproject;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView toDisplay;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ArrayList<String> items = new ArrayList();
        items.add("Mercury");
        items.add("Venus");

        //ArrayAdapter
        ArrayAdapter<String> itemAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);


        //***************************************
        toDisplay = (TextView)findViewById(R.id.TextViewDisplay);
        button2 = (Button)findViewById(R.id.Button2);
        button3 = (Button)findViewById(R.id.Button3);


        //*************set onClickListener for button 2 by passing method below as arg.*********
        button2.setOnClickListener(buttonClick2);

        //************set onClicklistener with inline declaration for button3*************
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                toDisplay.setText("Button Three Clicked!");
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    //Method declaration for above onClicklistener for button2
    private View.OnClickListener buttonClick2 = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            toDisplay.setText("Button Two Clicked!");
        }
    };

    //onClick is defined in xml for button1
    public void onButtonClick1(View view)
    {
        toDisplay.setText("Button One Clicked!");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
