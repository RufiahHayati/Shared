package comw.example.rplrus26.shared;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Tampil extends AppCompatActivity {

    private LinearLayoutManager Layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil);


        List<Anggota> rowListItem = getAllItemList();
        Layout = new LinearLayoutManager(Tampil.this);

        RecyclerView rView = (RecyclerView)findViewById(R.id.recycler_view);
        rView.setLayoutManager(Layout);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(Tampil.this, rowListItem);
        rView.setAdapter(rcAdapter);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_marks,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.out:
                finish();
                moveTaskToBack(true);
                SharedPreferences sharedPreferences = getSharedPreferences("Login", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.commit();
                Intent intent = new Intent(Tampil.this,MainActivity.class);
                finish();
            default:
                return super.onOptionsItemSelected(item);


        }
    }

    public List<Anggota> getAllItemList() {

        List<Anggota> allItemList = new ArrayList<Anggota>();
        allItemList.add(new Anggota("Ahmad Farid Irawan"));
        allItemList.add(new Anggota("Ahmad Firman Syah"));
        allItemList.add(new Anggota("Aldi Chabibul Latief"));
        allItemList.add(new Anggota("Andrean Soekarno Putro"));
        allItemList.add(new Anggota("Anjas Syifaul Anam"));
        allItemList.add(new Anggota("Annisa Rachellita Balqist"));
        allItemList.add(new Anggota("Dhamar Husain S."));
        allItemList.add(new Anggota("Fahris Alfas Syahrial"));
        allItemList.add(new Anggota("Istiqomah"));
        allItemList.add(new Anggota("Jelita Salsabilla"));
        allItemList.add(new Anggota("Lailil Firdausiyyah"));
        allItemList.add(new Anggota("Muhammad Husnil Anam"));
        allItemList.add(new Anggota("Muhammad Julian Revananda"));
        allItemList.add(new Anggota("Muhammad Rivaldi Abdullah"));

        return allItemList;
    }
}
