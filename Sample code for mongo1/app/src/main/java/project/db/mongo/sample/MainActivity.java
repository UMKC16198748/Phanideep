package project.db.mongo.sample;

import java.net.UnknownHostException;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import project.db.mongo.sample.MongoHQ.SaveAsyncTask;
import com.wordpress.michaelkyazze.codeperspective101.R;

public class MainActivity extends Activity {
	EditText editText_last_name;
	EditText editText_phone;
	EditText editText_email;
	EditText editText_fname;
    EditText editText_middle_name;
    EditText editText_user_name;
    EditText editText_pin;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		editText_fname = (EditText) findViewById(R.id.editText_fname);
		editText_last_name = (EditText) findViewById(R.id.editText_last_name);
		editText_email = (EditText) findViewById(R.id.editText_email);
		editText_phone = (EditText) findViewById(R.id.editText_phone);
        editText_user_name = (EditText) findViewById(R.id.editText_user_name);
        editText_pin = (EditText) findViewById(R.id.editText_pin);
        editText_middle_name =(EditText) findViewById(R.id.editText_middle_name);
	}

	public void saveContact(View v) throws UnknownHostException {

		MyContact contact = new MyContact();
		contact.first_name = editText_fname.getText().toString();
		contact.last_name = editText_last_name.getText().toString();
		contact.email = editText_email.getText().toString();
		contact.phone = editText_phone.getText().toString();
        contact.middle_name = editText_middle_name.getText().toString();
        contact.pin = Integer.parseInt(editText_pin.getText().toString());
        contact.user_name = editText_user_name.getText().toString();




		SaveAsyncTask tsk = new SaveAsyncTask();
		tsk.execute(contact);

	}

}
