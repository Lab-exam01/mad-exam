public class DBhelper extends SQLiteOpenHelper { 
public static  final String DATABASE_NAME="student.db"; 
public static  final String TABLE_NAME="student_table";  
public static  final String COL_1="Regno"; 
public static  final String COL_2="Sname"; 
public static  final String COL_3="Marks"; 
public DBhelper(@Nullable Context context) { 
super(context,DATABASE_NAME,null,1); 
} 
@Override 
public void onCreate(SQLiteDatabase db) { 

db.execSQL("create table "+ TABLE_NAME+ "(Regno  integer primary key 
autoincrement, Sname Text, Marks Integer)"); 
} 
@Override 
public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) { 
 
db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME); 
onCreate(db); 
} 
public boolean Insertdata(String name, String marks) 
{ 

SQLiteDatabase db=this.getWritableDatabase(); 
  ContentValues contentValues=new ContentValues(); 
        
        contentValues.put(COL_2,name); 
        contentValues.put(COL_3,marks); 

        long result= db.insert(TABLE_NAME,null,contentValues); 
        if (result==-1) 
            return false; 
        else 
            return true; 
    } 
 
    
    public Cursor getAlldata() 
    { 
        SQLiteDatabase db=this.getWritableDatabase(); 
        Cursor res=db.rawQuery("select * from "+TABLE_NAME,null); 
        return  res; 
    } 
 
 
   
    public boolean Updatedata(String Regno, String name, String marks) 
    { 
        SQLiteDatabase db=this.getWritableDatabase(); 
        ContentValues contentValues=new ContentValues(); 
        contentValues.put(COL_1,Regno); 
        contentValues.put(COL_2,name); 
        contentValues.put(COL_3,marks); 
        db.update(TABLE_NAME,contentValues," Regno=?",new String[]{Regno}); 
        return  true; 
 
    } 
 
    public Integer deletedata(String  regno) 
   
    { 
        SQLiteDatabase db=this.getWritableDatabase(); 
        return db.delete(TABLE_NAME, "Regno=?", new String[] {regno}); 
    } 
}
