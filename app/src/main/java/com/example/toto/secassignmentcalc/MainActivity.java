package com.example.toto.secassignmentcalc;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
    //declaration of variable
    char operation;
    int flag = 0;
    double numbersave;
    double number_one;
    double number_two;
    EditText txt_number;
    Button Clear_Button;
    Button MC_Button;
    Button MR_Button;
    Button MPlus_Button;
    Button Back_Button;
    Button N_Button;
    Button Div_Button;
    Button Num7_Button;
    Button Num8_Button;
    Button Num9_Button;
    Button Mul_Button;
    Button Num4_Button;
    Button Num5_Button;
    Button Num6_Button;
    Button Minus_Button;
    Button Num1_Button;
    Button Num2_Button;
    Button Num3_Button;
    Button Plus_Button;
    Button Num0_Button;
    Button Equal_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //declared the button on the xml
        txt_number = (EditText) findViewById(R.id.Txtnumber);
        Clear_Button = (Button) findViewById(R.id.buttonc);
        MC_Button = (Button) findViewById(R.id.buttonmc);
        MR_Button = (Button) findViewById(R.id.buttonmr);
        MPlus_Button = (Button) findViewById(R.id.buttonmplus);
        Back_Button = (Button) findViewById(R.id.buttonback);
        N_Button = (Button) findViewById(R.id.buttonn);
        Div_Button = (Button) findViewById(R.id.buttondiv);
        Num7_Button = (Button) findViewById(R.id.button7);
        Num8_Button = (Button) findViewById(R.id.button8);
        Num9_Button = (Button) findViewById(R.id.button9);
        Mul_Button = (Button) findViewById(R.id.buttonmul);
        Num4_Button = (Button) findViewById(R.id.button4);
        Num5_Button = (Button) findViewById(R.id.button5);
        Num6_Button = (Button) findViewById(R.id.button6);
        Minus_Button = (Button) findViewById(R.id.buttonminus);
        Num1_Button = (Button) findViewById(R.id.button1);
        Num2_Button = (Button) findViewById(R.id.button2);
        Num3_Button = (Button) findViewById(R.id.button3);
        Plus_Button = (Button) findViewById(R.id.bplus);
        Num0_Button = (Button) findViewById(R.id.button0);
        Equal_Button = (Button) findViewById(R.id.buttoneq);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

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

    //on click C clear button
    public void On_Click_Clear(View view) {
        number_one = 0;
        number_two = 0;
        txt_number.setText("");


    }

    //on click MC button
    public void On_CLik_MC(View view) {

        numbersave = 0;
    }

    //on click Mr button
    public void On_CLik_MR(View view) {

        txt_number.setText(numbersave + "");
    }

    //on click M+ button
    public void On_CLik_Mplus(View view) {

        String contain_text = txt_number.getText().toString();
        numbersave = Double.parseDouble(contain_text);
        txt_number.setText("");
    }

    //on click back button
    public void On_CLik_Back(View view) {

        if (!txt_number.getText().toString().isEmpty()) {

            String string_txt = txt_number.getText().toString();
            int index = string_txt.length();
            txt_number.setText(string_txt.substring(0, (index - 1)));
        }
    }

    //on click equal button
    public void On_CLik_Equal(View view) {

        if (!txt_number.getText().toString().isEmpty()) {
            double res;
            number_two = Double.parseDouble(txt_number.getText().toString());


            if (operation == '+') {
                res = number_one + number_two;
                number_two = res;
                txt_number.setText(res + "");
            } else if (operation == '-') {

                res = number_one - number_two;
                number_two = res;
                txt_number.setText(res + "");

            } else if (operation == '/') {

                res = number_one / number_two;
                number_two = res;
                txt_number.setText(res + "");
            } else if (operation == '*') {

                res = number_one * number_two;
                number_two = res;
                txt_number.setText(res + "");

            } else {

                txt_number.setText("bh bh ");
            }


        }
    }

    //on click N button
    public void On_CLik_N(View view) {
        if (!txt_number.getText().toString().isEmpty()) {
            double numberenter = Double.parseDouble(txt_number.getText().toString());
            numberenter = numberenter * -1;
            txt_number.setText(numberenter + "");
        }
    }

    //on click div button
    public void On_CLik_Div(View view) {
        if (!txt_number.getText().toString().isEmpty()) {
            operation = '/';
            number_one = Double.parseDouble(txt_number.getText().toString());
            txt_number.setText("");

        }

    }

    //on click num7 button
    public void On_CLik_Button7(View view) {
        ChangeFlag();
        if (txt_number.getText().toString().isEmpty()) {
            txt_number.setText(7 + "");

        } else {
            txt_number.append(7 + "");
        }
    }

    //on click num8 button
    public void On_CLik_Button8(View view) {
        ChangeFlag();
        if (txt_number.getText().toString().isEmpty()) {
            txt_number.setText(8 + "");
        } else {
            txt_number.append(8 + "");
        }
    }

    //on click num9
    public void On_CLik_Button9(View view) {
        ChangeFlag();
        if (txt_number.getText().toString().isEmpty()) {
            txt_number.setText(9 + "");
        } else {
            txt_number.append(9 + "");
        }
    }

    //on click multiplication
    public void On_CLik_Mul(View view) {
        if (!txt_number.getText().toString().isEmpty()) {
            this.operation = '*';
            number_one = Double.parseDouble(txt_number.getText().toString());
            txt_number.setText("");

        }

    }

    //on click num4
    public void On_CLik_Button4(View view) {
        ChangeFlag();
        if (txt_number.getText().toString().isEmpty()) {
            txt_number.setText(4 + "");
        } else {
            txt_number.append(4 + "");
        }
    }

    //on click num5
    public void On_CLik_Button5(View view) {
        ChangeFlag();
        if (txt_number.getText().toString().isEmpty()) {
            txt_number.setText(5 + "");
        } else {
            txt_number.append(5 + "");
        }

    }

    //on click num6
    public void On_CLik_Button6(View view) {
        ChangeFlag();
        if (txt_number.getText().toString().isEmpty()) {
            txt_number.setText(6 + "");
        } else {
            txt_number.append(6 + "");
        }
    }

    //on click minus button
    public void On_CLik_Minus(View view) {
        if (!txt_number.getText().toString().isEmpty()) {
            operation = '-';
            number_one = Double.parseDouble(txt_number.getText().toString());
            txt_number.setText("");

        }
    }

    //on click num1
    public void On_CLik_Button1(View view) {
        ChangeFlag();
        if (txt_number.getText().toString().isEmpty()) {
            txt_number.setText(1 + "");
        } else {
            txt_number.append(1 + "");
        }

    }

    //on click num2
    public void On_CLik_Button2(View view) {
        ChangeFlag();
        if (txt_number.getText().toString().isEmpty()) {
            txt_number.setText(2 + "");
        } else {
            txt_number.append(2 + "");
        }
    }

    //change flage
    private void ChangeFlag() {
        if (flag == 0) {
            txt_number.setText("");
            flag = 1;
        }
    }

    //on click number 3 button
    public void On_CLik_Button3(View view) {
        ChangeFlag();
        if (txt_number.getText().toString().isEmpty()) {
            txt_number.setText(3 + "");
        } else {
            txt_number.append(3 + "");
        }
    }

    //on click zero button
    public void onClick_0(View view) {
        ChangeFlag();
        if (txt_number.getText().toString().isEmpty()) {
            txt_number.setText(0 + "");
        } else {
            txt_number.append(0 + "");
        }
    }

    public void Addbutton(View view) {//on-click add button
        if (!txt_number.getText().toString().isEmpty()) {

            operation = '+';
            number_one = Double.parseDouble(txt_number.getText().toString());
            txt_number.setText("");

        }

    }
}
