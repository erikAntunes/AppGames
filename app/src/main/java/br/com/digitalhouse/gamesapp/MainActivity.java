package br.com.digitalhouse.gamesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import br.com.digitalhouse.gamesapp.adapter.GamesAdapter;
import br.com.digitalhouse.gamesapp.adapter.listener.GameListListener;
import br.com.digitalhouse.gamesapp.model.Game;
import br.com.digitalhouse.gamesapp.viewmodel.GameViewModel;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements GameListListener {

    private RecyclerView gameRecyclerView;
    private GamesAdapter gamesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gameRecyclerView = findViewById(R.id.games_recycler_view_id);
        gamesAdapter = new GamesAdapter();

        gameRecyclerView.setAdapter(gamesAdapter);

        gameRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        GameViewModel gameViewModel = ViewModelProviders.of(this).get(GameViewModel.class);

        gameViewModel.atualizarGames();

        gameViewModel.getGameLiveData()
                .observe(this, gameList -> gamesAdapter.atualizarGames(gameList));
    }

    @Override
    public void onGameClick(Game game) {

        Toast.makeText(getApplicationContext(), "This is my Toast message!",
                Toast.LENGTH_LONG).show();


      //  Intent intent = new Intent(Intent.ACTION_SEND);
        //
      //  intent.setType("text/plain");
//
      //  intent.putExtra(Intent.EXTRA_SUBJECT,game.getTitulo());
//
      //  intent.putExtra(Intent.EXTRA_TEXT,game.getTitulo()+": "+game.getDescricao());


    }
}
