ActivityCompat.requestPermissions(this,new 
String[]{Manifest.permission.SEND_SMS}, 
PackageManager.PERMISSION_GRANTED); 
EditText ph=(EditText) findViewById(R.id.phonenumber); 
EditText msg=(EditText) findViewById(R.id.messagebox); 
Button btnsend=(Button) findViewById(R.id.send); 
btnsend.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View v) { 
SmsManager s=SmsManager.getDefault(); 
s.sendTextMessage(ph.getText().toString(),null,msg.getText().toString(),null,null); 
Toast.makeText(MainActivity.this, "Message Sent", 
Toast.LENGTH_SHORT).show(); 
} 
}); 