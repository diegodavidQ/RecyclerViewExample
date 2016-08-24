package diedav.david.diego.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import diedav.david.diego.recyclerviewexample.adapters.PlaceCardAdapter;
import diedav.david.diego.recyclerviewexample.model.Place;

public class MainActivity extends AppCompatActivity {

    //variables
    private RecyclerView recycler;
    private PlaceCardAdapter adapter;
    private RecyclerView.LayoutManager lManager;
    private List<Place> listItemsPlaces;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       adListPlaces();
        startRecycler();
    }

    private void adListPlaces() {
        Place venecia = new Place(R.drawable.venecia,"Venecia Canal","Italy");
        Place egipto = new Place(R.drawable.egipto,"Egyptian pyramids","Egypt");
        Place london = new Place(R.drawable.london,"Houses of Parliamen","England");
        Place machu_picchu = new Place(R.drawable.machu_picchu,"Machu Picchu","Perú");
        Place galapagos = new Place(R.drawable.galapagos,"Galapagos","Ecuador");
        Place paris = new Place(R.drawable.paris,"Eiffel Tower","France");
        Place roma = new Place(R.drawable.roma,"Roman Coliseum","Italy");
        Place san_francisco = new Place(R.drawable.san_francisco,"Golden Gate Bridge","United States");
        Place taj_mahal = new Place(R.drawable.taj_mahal,"taj_Mahal","India");

        listItemsPlaces = new ArrayList<Place>();
        listItemsPlaces.add(venecia);
        listItemsPlaces.add(egipto);
        listItemsPlaces.add(london);
        listItemsPlaces.add(machu_picchu);
        listItemsPlaces.add(galapagos);
        listItemsPlaces.add(paris);
        listItemsPlaces.add(roma);
        listItemsPlaces.add(san_francisco);
        listItemsPlaces.add(taj_mahal);
    }


    private void startRecycler() {
        recycler = (RecyclerView) findViewById(R.id.recyclerView);
        recycler.setHasFixedSize(true);

        //administrator for LinearLayout
        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);

        //create new adapter
        adapter = new PlaceCardAdapter(listItemsPlaces,this);
        //add adapter
        recycler.setAdapter(adapter);

        recycler.setItemAnimator(new DefaultItemAnimator());
    }


}
