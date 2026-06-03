  public boolean onCreatePanelMenu(int featureId, @NonNull Menu menu) { 
        MenuInflater inflater=getMenuInflater(); 
        inflater.inflate(R.menu.menus,menu); 
        return true; 
 
    } 
 
    @Override 
    public boolean onOptionsItemSelected(@NonNull MenuItem item) { 
        if(item.getItemId()==R.id.php) { 
            Toast.makeText(this, "Php Page", Toast.LENGTH_SHORT).show(); 
        } 
        if(item.getItemId()==R.id.java) { 
            Toast.makeText(this, "Java Page", Toast.LENGTH_SHORT).show(); 
        } 
        if(item.getItemId()==R.id.csharp) { 
            Toast.makeText(this, "C# Page", Toast.LENGTH_SHORT).show(); 
        } 
        return super.onOptionsItemSelected(item); 
    } 
} 