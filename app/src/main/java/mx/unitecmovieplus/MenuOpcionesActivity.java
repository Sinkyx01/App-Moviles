package mx.unitecmovieplus;




import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import androidx.core.view.GravityCompat;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class MenuOpcionesActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_opciones);

        // Inicializamos el DrawerLayout
        drawerLayout = findViewById(R.id.drawer_layout);

        // Botón para abrir el menú deslizante
        findViewById(R.id.btnMenu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abrir el menú desde la derecha
                drawerLayout.openDrawer(GravityCompat.END);
            }
        });
    }

    // Métodos para manejar las opciones del menú
    public void onOptionInicioClicked(View view) {
        startActivity(new Intent(this, InicioActivity.class));
        drawerLayout.closeDrawer(GravityCompat.END);
    }

    public void onOptionCatalogoClicked(View view) {
        startActivity(new Intent(this, CatalogoActivity.class));
        drawerLayout.closeDrawer(GravityCompat.END);
    }

    public void onOptionDetallePeliculaClicked(View view) {
        startActivity(new Intent(this, DetallePeliculaActivity.class));
        drawerLayout.closeDrawer(GravityCompat.END);
    }

    public void onOptionAcercaDeClicked(View view) {
        startActivity(new Intent(this, AcercaDeActivity.class));
        drawerLayout.closeDrawer(GravityCompat.END);
    }
}