package br.edu.unis.minhasdisciplinas.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import br.edu.unis.minhasdisciplinas.R;
import br.edu.unis.minhasdisciplinas.model.Disciplina;

public class ListaDisciplinasAdapter extends BaseAdapter {

    private final Context context;
    private final ArrayList<Disciplina>ListaDisciplinas = new ArrayList<>();

    public ListaDisciplinasAdapter(Context context){
        this.context = context ;
    }

    @Override
    public int getCount() {
        return ListaDisciplinas.size();
    }

    @Override
    public Object getItem(int position) {
        return ListaDisciplinas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return ListaDisciplinas.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewCriada = LayoutInflater.from(this.context).inflate(R.layout.item_disciplina, parent, false);

        Disciplina disciplina = ListaDisciplinas.get(position);

        TextView titulo = viewCriada.findViewById(R.id.item_disciplina_titulo_disciplina);
        TextView cargaHoraria = viewCriada.findViewById(R.id.item_disciplina_carga_horaria);
        TextView verEmenta = viewCriada.findViewById(R.id.item_disciplina_ver_ementa);

        titulo.setText(disciplina.getTitulo().toString());
        cargaHoraria.setText(disciplina.getCargaHoraria() + "horas");
        verEmenta.setText("ver ementa");

        return viewCriada;
    }

    public void addAll(ArrayList<Disciplina> listaDisciplinas){
        this.ListaDisciplinas.addAll(listaDisciplinas);
    }
}
