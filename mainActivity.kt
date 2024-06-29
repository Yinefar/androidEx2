class MainActivity : ComponentActivity() {
 var txtDolares: TextView? = null
 var txtSoles: TextView? = null
 override fun onCreate(savedInstanceState: Bundle?) {
 super.onCreate(savedInstanceState)
 setContentView(R.layout.main_activity)
 txtDolares = findViewById(R.id.txtDolares)
 txtSoles = findViewById(R.id.txtSoles)
 }
 fun calcular(view: View) {
 val txtMarca: EditText = findViewById(R.id.txtMarca)
 val txtPulgada: EditText = findViewById(R.id.txtPulgada)
 val marca = txtMarca.text.toString()
 val pulgada = txtPulgada.text.toString()
 var dolar = 0.0
 var soles = 0.0
 when {
 marca == "samsung" && pulgada == "19" -> dolar = 12.0
 marca == "samsung" && pulgada == "21" -> dolar = 13.0
 marca == "panasonic" && pulgada == "19" -> dolar = 14.0
 marca == "panasonic" && pulgada == "21" -> dolar = 12.0
 marca == "lg" && pulgada == "19" -> dolar = 12.0
 marca == "lg" && pulgada == "21" -> dolar = 14.0
 marca == "sony" && pulgada == "19" -> dolar = 13.0
 marca == "sony" && pulgada == "21" -> dolar = 15.0
 }
 if (dolar != 0.0) {
 // Monto en soles agregando el IGV del 18%
 soles = dolar * 3.8 * 1.18
 }
 txtDolares?.text = "Precio en dólares: $dolar"
 txtSoles?.text = "Precio en soles con IGV: %.2f".format(soles)
 }
}
