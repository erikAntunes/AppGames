package br.com.digitalhouse.gamesapp.model;

import android.widget.ImageView;

import com.google.gson.annotations.SerializedName;

public class Game {
    @SerializedName("name")
    private String titulo;

    @SerializedName("deck")
    private String descricao;

    @SerializedName("image")
    private GameImage imagemGame;


    public GameImage getImagemGame() {
        return imagemGame;
    }

    public void setImagemGame(GameImage imagemGame) {
        this.imagemGame = imagemGame;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
