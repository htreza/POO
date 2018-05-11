package br.com.bandtec.floricultura.enums;

public enum AgentePolinizador {
    

    ORNITOFILA("Ornitófila", "Polinizada por pássaros"),
    ANEMOFILA("Anemófila", "Polinizada pelo vento"),
    QUIROTEROFILA("Quiropterófila", "Polinizada por morcegos"),
    ENTOMOFILAS("Entomófilas", "Polinizada por insetos"),
    ANTOPOFILA("Antropófila", "Polinizada pelo homem");

    private String tipo;
    private String descricao;

    private AgentePolinizador(String tipo, String descricao) {
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
