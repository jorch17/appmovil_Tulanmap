package com.example.tulanmap;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder> {
    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView texto,nombreruta;
        ImageView fotoCombi;

        public ViewHolder(View itemView) {
            super(itemView);
            texto=(TextView)itemView.findViewById(R.id.tvruta);
            nombreruta=(TextView)itemView.findViewById(R.id.tvnameruta);
            fotoCombi=(ImageView)itemView.findViewById(R.id.imgCombi);

        }
    }

    public List<MostrarDatos> mostrarDatosLista;

    public RecyclerViewAdaptador(List<MostrarDatos> mostrarDatosLista) {
        this.mostrarDatosLista = mostrarDatosLista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rutas,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.texto.setText(mostrarDatosLista.get(position).getTexto());
        holder.nombreruta.setText(mostrarDatosLista.get(position).getNombreruta());
        holder.fotoCombi.setImageResource(mostrarDatosLista.get(position).getImgCombi());
    }

    @Override
    public int getItemCount() {
        return mostrarDatosLista.size();
    }
}
