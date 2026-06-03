public class MainActivity extends AppCompatActivity {
Button btnsave,btnnext; 
EditText etUserName,etPassword; 
@Override 
protected void onCreate(Bundle savedInstanceState) { 
super.onCreate(savedInstanceState); 
EdgeToEdge.enable(this); 
setContentView(R.layout.activity_main); 
btnsave=(Button) findViewById(R.id.btnsave); 
btnnext = (Button) findViewById(R.id.btnnext); 
etUserName = (EditText)findViewById(R.id.etUserName); 
etPassword = (EditText)findViewById(R.id.etPassword); 
btnsave.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View v) { 
// Writing data to SharedPreferences 
SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", 
Context.MODE_PRIVATE); 
SharedPreferences.Editor editor = sharedPreferences.edit(); 
editor.putString("username", etUserName.getText().toString()); 
editor.putString("password", etPassword.getText().toString()); 
editor.apply(); 
Toast.makeText(getApplicationContext(),"Saved 
successfully",Toast.LENGTH_LONG).show(); 
} 
}); 
btnnext.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View v) { 
Intent intent = new Intent(getApplicationContext(),MainActivity2.class); 
startActivity(intent); 
} 
}); 
} 
}