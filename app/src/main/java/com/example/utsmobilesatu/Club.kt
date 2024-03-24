package com.example.utsmobilesatu

data class Club(
    val nama: String,
    val ligaPrimerInggris: Int,
    val fa: Int,
    val efl: Int,
    val ligaChampions: Int,
    val uefa: Int,
) {
    val totalTrophy: Int
        get() = ligaPrimerInggris + fa + efl + ligaChampions + uefa
}

// extension function recap
fun Club.recap(): String {
    return "$nama berhasil meraih $ligaPrimerInggris trofi Liga Premier Inggris, $fa trofi FA, $efl trofi EFL, $ligaChampions trofi Liga Champions Eropa, dan $uefa trofi Liga Eropa UEFA"
}