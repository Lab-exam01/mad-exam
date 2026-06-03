    DBhelper databasehelper; 
    private EditText name, marks, edittextregno; 
    private Button btnadd, btnview, btnupdate, btndelete; 
 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        EdgeToEdge.enable(this); 
        setContentView(R.layout.activity_main); 
        databasehelper = new DBhelper(this); 
        name=(EditText)findViewById(R.id.editname); 
        marks=(EditText)findViewById(R.id.editmarks); 
        edittextregno=(EditText)findViewById(R.id.editupdate); 
        btnadd=(Button)findViewById(R.id.btnadd); 
        btnview=(Button)findViewById(R.id.btnview); 
        btnupdate=(Button)findViewById(R.id.btnupdate); 
        btndelete=(Button)findViewById(R.id.btndelete); 
        Adddata(); 
        ViewAlldata(); 
        Updatedata(); 
        Deletedata(); 
 
 
    } 
    public void Adddata() 
    { 
        btnadd.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
 
isInserted=databasehelper.Insertdata(name.getText().toString(),marks.getText().toStrin
g()); 
                if (isInserted== true) { 
                    Toast.makeText(MainActivity.this, "Data inserted", 
Toast.LENGTH_SHORT).show(); 
                    name.setText(""); 
                    marks.setText(""); 
                } 
                else 
                    Toast.makeText(MainActivity.this,"Data not 
inserted",Toast.LENGTH_SHORT).show(); 
            } 
        }); 
    } 
 public void ViewAlldata() 
    { 
        btnview.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
                Cursor res=databasehelper.getAlldata(); 
               
                if (res.getCount()==0) 
                { 
                
                    Showmessage("Error", "No record found"); 
                    return ; 
                } 
                StringBuffer buffer=new StringBuffer(); 
                while (res.moveToNext()) 
                { 
                    buffer.append("Regno  :"+res.getString(0)+"\n"); 
                    buffer.append("Sname  :"+res.getString(1)+"\n"); 
                    buffer.append("Marks  :"+res.getString(2)+"\n\n"); 
                } 
 
                Showmessage("Data", buffer.toString()); 
 
            } 
        }); 
    } 
   public void Showmessage(String title, String message) 
    { 
        AlertDialog.Builder builder= new AlertDialog.Builder(this); 
        builder.setCancelable(true); 
        builder.setTitle(title); 
        builder.setMessage(message); 
        builder.show(); 
 
    } 
 
    public void Updatedata() 
    { 
        btnupdate.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
 
                boolean isUpdated= 
databasehelper.Updatedata(edittextregno.getText().toString(), 
                        name.getText().toString(),marks.getText().toString()); 
                if(isUpdated==true) {
 Toast.makeText(MainActivity.this, "Data updated", 
Toast.LENGTH_SHORT).show(); 
                    viewData(); 
                    name.setText(""); 
                    marks.setText(""); 
                    edittextregno.setText(""); 
                } 
                else 
                    Toast.makeText(MainActivity.this," Data is not 
updated",Toast.LENGTH_SHORT).show(); 
 
 
            } 
        }); 
    } 
 
    public void Deletedata() 
    { 
        btndelete.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
              
Isdeleted=databasehelper.deletedata(edittextregno.getText().toString()); 
                if (Isdeleted>0) {  
                    Toast.makeText(MainActivity.this, "Data deleted ", 
Toast.LENGTH_SHORT).show(); 
                    viewData(); 
                    name.setText(""); 
                    marks.setText(""); 
                    edittextregno.setText(""); 
                } 
                else 
                    Toast.makeText(MainActivity.this," Not 
deleted",Toast.LENGTH_SHORT).show(); 
            } 
        }); 
    } 
    public void viewData(){ 
        Cursor res=databasehelper.getAlldata(); 
        if (res.getCount()==0) 
        { 
            Showmessage("Error", "No record found");
 Toast.makeText(MainActivity.this, "Data updated", 
Toast.LENGTH_SHORT).show(); 
                    viewData(); 
                    name.setText(""); 
                    marks.setText(""); 
                    edittextregno.setText(""); 
                } 
                else 
                    Toast.makeText(MainActivity.this," Data is not 
updated",Toast.LENGTH_SHORT).show(); 
 
 
            } 
        }); 
    } 
  
    public void Deletedata() 
    { 
        btndelete.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
Isdeleted=databasehelper.deletedata(edittextregno.getText().toString()); 
                if (Isdeleted>0) { 
                    Toast.makeText(MainActivity.this, "Data deleted ", 
Toast.LENGTH_SHORT).show(); 
                    viewData(); 
                    name.setText(""); 
                    marks.setText(""); 
                    edittextregno.setText(""); 
                } 
                else 
                    Toast.makeText(MainActivity.this," Not 
deleted",Toast.LENGTH_SHORT).show(); 
            } 
        }); 
    } 
    public void viewData(){ 
        Cursor res=databasehelper.getAlldata(); 
        if (res.getCount()==0) 
        { 
           
            Showmessage("Error", "No record found");