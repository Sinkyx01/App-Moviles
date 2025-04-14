package mx.unitecmovieplus;



import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegistroActivity extends AppCompatActivity {

    private EditText nameEditText, emailEditText, passwordEditText, confirmPasswordEditText;
    private Button registerButton;
    private ImageView logoImage;
    private TextView nameTitle;

    private ImageButton btnRegresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro); // Asegúrate de que tu archivo XML se llame así

        // Enlazamos vistas con IDs del XML
        nameEditText = findViewById(R.id.NameRegister);
        emailEditText = findViewById(R.id.EmailRegister);
        nameTitle = findViewById(R.id.nameTitle);
        passwordEditText = findViewById(R.id.PasswordRegister);
        confirmPasswordEditText = findViewById(R.id.PasswordConfirm);
        registerButton = findViewById(R.id.RegiterButton);
        logoImage = findViewById(R.id.logoIma);
        btnRegresar = findViewById(R.id.btnRegresar);

        // Acción para botón registrar
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = nameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                String confirmPassword = confirmPasswordEditText.getText().toString();

                if (nombre.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                    Toast.makeText(RegistroActivity.this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show();
                } else if (!password.equals(confirmPassword)) {
                    Toast.makeText(RegistroActivity.this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(RegistroActivity.this, "Usuario registrado exitosamente", Toast.LENGTH_SHORT).show();

                }
            }
        });

        nameEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                nameTitle.setText(s);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }

        });

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistroActivity.this, LoginActivity.class);
                startActivity(intent);

            }
        });


    }
}
