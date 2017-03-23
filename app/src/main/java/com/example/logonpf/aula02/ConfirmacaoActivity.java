package com.example.logonpf.aula02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ConfirmacaoActivity extends AppCompatActivity {

    private TextView tvConfirmacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacao);

        tvConfirmacao = (TextView) findViewById(R.id.tvConfirmacao);
        Log.d("CONFIRMACAO","Passei aqui");


        if (getIntent() != null){
            tvConfirmacao.setText(Html.fromHtml(getString(R.string.confirmacao,
                    getIntent().getStringExtra(getString(R.string.lbnome)),
                    getIntent().getStringExtra(getString(R.string.label_curso)),
                    getIntent().getStringExtra(getString(R.string.lb_periodo)))));

        }

        List<Curso> cursos = new ArrayList<>();
        Curso curso = new Curso(getIntent().getStringExtra(getString(R.string.lbnome)),
                getIntent().getStringExtra(getString(R.string.label_curso)),
                getIntent().getStringExtra(getString(R.string.lb_periodo)));
        cursos.add(curso);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);

        recyclerView.setAdapter(new CursosAdapter(cursos, this));


    }
}
