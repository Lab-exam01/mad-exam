Button l,p; 
l=findViewById(R.id.lan); 
p=findViewById(R.id.por); 
l.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View v) { 
setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE); 
Toast.makeText(MainActivity.this, "Hey! We are in Landscape 
orientation", Toast.LENGTH_SHORT).show(); 
} 
}); 
p.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View v) { 
setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); 
Toast.makeText(MainActivity.this, "Hey! We are in Portrait orientation", 
Toast.LENGTH_SHORT).show(); 
} 
});