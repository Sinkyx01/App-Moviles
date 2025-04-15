package mx.unitecmovieplus;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText emailText;
    private EditText passwordText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        emailText = findViewById(R.id.EmailText);
        passwordText = findViewById(R.id.PasswordText);
        Button signInButton = findViewById(R.id.SignInButton);
        Button signUpButton = findViewById(R.id.SignUpButton);


        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailText.getText().toString().trim();
                String password = passwordText.getText().toString().trim();


                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Por favor, ingresa correo y contraseña", Toast.LENGTH_SHORT).show();
                } else {

                    signIn(email, password);
                }
            }
        });


        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a la actividad de registro
                Intent intent = new Intent(LoginActivity.this, RegistroActivity.class);
                startActivity(intent);
            }
        });
    }


    private void signIn(String email, String password) {


        Toast.makeText(this, "¡Inicio de sesión exitoso!", Toast.LENGTH_SHORT).show();

        // Después de iniciar sesión, redirigir al usuario a la actividad principal
        Intent intent = new Intent(LoginActivity.this, InicioActivity.class);
        startActivity(intent);
         finish(); // Cerrar la actividad de login
    }
}