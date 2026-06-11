import android.Manifest; 
import android.content.pm.PackageManager; 
import android.os.Bundle; 
import android.telephony.SmsManager; 
import android.view.View; 
import android.widget.Button; 
import android.widget.EditText; 
import android.widget.Toast; 
import androidx.activity.EdgeToEdge; 
import androidx.appcompat.app.AppCompatActivity; 
import androidx.core.app.ActivityCompat; 
import androidx.core.graphics.Insets; 
import androidx.core.view.ViewCompat; 
import androidx.core.view.WindowInsetsCompat; 
public class MainActivity extends AppCompatActivity {
  @Override 
protected void onCreate(Bundle savedInstanceState) { 
super.onCreate(savedInstanceState); 
EdgeToEdge.enable(this); 
setContentView(R.layout.activity_main); 
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
} 
} 
