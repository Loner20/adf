public void sendData(View view) {
    EditText user = findViewById(R.id.username);
    EditText pass = findViewById(R.id.password);

    Intent intent = new Intent(this, SecondActivity.class);
    intent.putExtra("user", user.getText().toString());
    intent.putExtra("pass", pass.getText().toString());
    startActivity(intent);
}
