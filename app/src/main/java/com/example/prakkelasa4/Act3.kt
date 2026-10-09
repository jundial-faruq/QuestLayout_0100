import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

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

        )
    }
}