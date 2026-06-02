setContentView(R.layout.activity_main); 
Button b; 
b=findViewById(R.id.hello); 
b.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View v) { 
Toast.makeText(MainActivity.this, "Hey! We are using Android 
Application", Toast.LENGTH_SHORT).show(); 
} 
}); 