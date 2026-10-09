import androidx.compose.foundation.checkScrollableContainerConstraints
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight

@Composable
fun ActivitasPertama(modifer; Modifer) {
    Column(
        modifier = Modifier.padding(top = 100.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            stringResource(id = R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            stringResource(id = R.string.univ),
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(20.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth(fraction = IF)
                    .padding(all = 12.dp)
                colors = CardDefaults.cardColors(
                        containerColor = colorResource(id = R.color.card_0_bg))
            )
            {
                Row() {
                    val gambar = painterResource( id = R.drawable.logo_umy)
                    image(
                        painter = gambar,
                        contenDescription = null,
                        modifier = Modifier.size(100.dp).padding(all = 5.dp)
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Column()
                        Text(
                            stringResource("Jundi Alfaruq"),
                            fontSize = 30.sp,

                        )

                    }
            }
    }

}