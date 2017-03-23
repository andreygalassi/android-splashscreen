package com.example.logonpf.aula02;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by usuario on 22/03/2017.
 */

public class CursosAdapter extends RecyclerView.Adapter {

    private List<Curso> cursos;
    private Context context;

    public CursosAdapter(List<Curso> cursos, Context context) {
        this.cursos = cursos;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_livro, parent, false);
        CursosViewHolder holder = new CursosViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        CursosViewHolder holder = (CursosViewHolder) holder;

        Curso curso  = cursos.get(position) ;

        holder.nome.setText(curso.getNome());

        //demais campos
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
