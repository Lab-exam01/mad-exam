public void onImplicitButtonClicked(View view) 
{ 
Uri url=Uri.parse("https://www.google.com"); 
Intent i=new Intent(Intent.ACTION_VIEW, url); 
startActivity(i); 
} 
public void onExplicitButtonClicked(View view ) 
{ 
Intent i=new Intent(MainActivity.this, NewActivity.class); 
startActivity(i); 
} 
} 