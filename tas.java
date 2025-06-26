@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_second);

    String username = getIntent().getStringExtra("user");
    String password = getIntent().getStringExtra("pass");

    TextView result = findViewById(R.id.resultText);

    if (username.equals("admin") && password.equals("1234")) {
        result.setText("Login Successful!");
    } else {
        result.setText("Login Failed!");
    }
}
