package com.example.bancodedadosvivi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView mostraConteudo;
    String text = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mostraConteudo = (TextView) findViewById(R.id.mostraConteudo);
        BancoDeDados banco = new BancoDeDados(this);

        //INSERIR CONTATOS
       /* banco.insereContatos(new Contatos("Vivian", "0800"));
        banco.insereContatos(new Contatos("XX ", "0700"));
       */

        // DELETAR CONTATOS
        /*Contatos contato = new Contatos();
        contato.setId(7);
        banco.deletaContatos(contato);*/
        //banco.deletaContatos(new Contatos(8, null, null));

        //UPDATE CONTATOS
       /* Contatos contato = new Contatos();
        contato.setId(1);
        contato.setNome("Yorkie");
        contato.setCelular("0500");
        banco.atualizaContatos(contato);*/
        //banco.atualizaContatos(new Contatos(3, "Testeupdate", "26042023"));

        List<Contatos> contatos = banco.listaTodosContatos();
        for (Contatos c : contatos) {
            String log = "ID: " + c.getId() + ", NOME: " + c.getNome() + ", CELULAR: " + c.getCelular() + "\n";
            text = text + log;
        }
        mostraConteudo.setText(text);
    }
}