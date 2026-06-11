import android.content.Context; 
import android.content.SharedPreferences; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 
import android.widget.EditText; 
import androidx.activity.EdgeToEdge; 
import androidx.appcompat.app.AppCompatActivity; 
import androidx.core.graphics.Insets; 
import androidx.core.view.ViewCompat; 
import androidx.core.view.WindowInsetsCompat; 
public class MainActivity2 extends AppCompatActivity { 
Button btnFetch; 
EditText etUserName,etPassword; 
@Override 
protected void onCreate(Bundle savedInstanceState) { 
super.onCreate(savedInstanceState); 
EdgeToEdge.enable(this); 
setContentView(R.layout.activity_main2); 
btnFetch = (Button) findViewById(R.id.btnFetch); 
etUserName `= (EditText)findViewById(R.id.etUserName); 
etPassword = (EditText)findViewById(R.id.etPassword); 
btnFetch.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View v) { 
// Reading data from SharedPreferences 
SharedPreferences sharedPreferences =getSharedPreferences("MyPrefs", 
Context.MODE_PRIVATE); 
String username = sharedPreferences.getString("username", ""); 
String password = sharedPreferences.getString("password", ""); 
etUserName.setText(username); 
etPassword.setText(password); 
} 
}); 
} 
}
