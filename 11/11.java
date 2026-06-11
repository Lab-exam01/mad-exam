import android.content.Intent; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 
import android.widget.EditText; 
import android.widget.Toast; 
import androidx.activity.EdgeToEdge; 
import androidx.appcompat.app.AppCompatActivity; 
import androidx.core.graphics.Insets; 
import androidx.core.view.ViewCompat; 
import androidx.core.view.WindowInsetsCompat; 
public class MainActivity extends AppCompatActivity { 
EditText etTo, etSub, etMsg;
  Button btSend; 
String to, subject, message; 
@Override 
protected void onCreate(Bundle savedInstanceState) { 
super.onCreate(savedInstanceState); 
EdgeToEdge.enable(this); 
setContentView(R.layout.activity_main); 
etTo = (EditText) findViewById(R.id.etTo); 
etSub = (EditText) findViewById(R.id.etSub); 
etMsg = (EditText) findViewById(R.id.etMsg); 
btSend = (Button) findViewById(R.id.btSend); 
btSend.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View v) { 
to = etTo.getText().toString(); 
subject = etSub.getText().toString(); 
message = etMsg.getText().toString(); 
Intent email = new Intent(Intent.ACTION_SEND); 
email.putExtra(Intent.EXTRA_EMAIL, new String[]{ to}); 
email.putExtra(Intent.EXTRA_SUBJECT, subject); 
email.putExtra(Intent.EXTRA_TEXT, message); 
//need this to prompts email client only 
email.setType("message/rfc822"); 
startActivity(Intent.createChooser(email, "Choose Email client :")); 
Toast.makeText(MainActivity.this, "Maessage Sent Successfully", 
Toast.LENGTH_SHORT).show(); 
} 
}); 
} 
} 
