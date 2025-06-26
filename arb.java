public void calculate(View view) {
    EditText et1 = findViewById(R.id.input1);
    EditText et2 = findViewById(R.id.input2);
    RadioGroup rg = findViewById(R.id.radioGroup);

    double n1 = Double.parseDouble(et1.getText().toString());
    double n2 = Double.parseDouble(et2.getText().toString());
    double result = 0;

    int selected = rg.getCheckedRadioButtonId();
    switch (selected) {
        case R.id.add: result = n1 + n2; break;
        case R.id.sub: result = n1 - n2; break;
        case R.id.mul: result = n1 * n2; break;
        case R.id.div: result = n1 / n2; break;
    }

    Toast.makeText(this, "Result: " + result, Toast.LENGTH_SHORT).show();
}
