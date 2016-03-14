package com.arman.gambit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.arman.gambit.adapters.ContactsAdapter;
import com.arman.gambit.adapters.CustomCardAdapter;
import com.arman.gambit.objects.Contact;
import com.arman.gambit.objects.CustomCard;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView popularEventsRecyclerView;
    private LinearLayoutManager mLayoutManager;
    private RecyclerView.Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configurePopularEventsView();
        // configurePopularPlacesView();
    }

    private void configurePopularEventsView() {
        popularEventsRecyclerView = (RecyclerView) findViewById(R.id.popular_events);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        popularEventsRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        popularEventsRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter
        //String[] myDataset = {"Item 1", "Item 1", "Item 1", "Item 1"};
        //mAdapter = new PopularEventsAdapter(myDataset);
        //popularEventsRecyclerView.setAdapter(mAdapter);
//        List<Contact> contacts = Contact.createContactsList(20);
//        ContactsAdapter contactsAdapter = new ContactsAdapter(contacts);
//        popularEventsRecyclerView.setAdapter(contactsAdapter);
        List<CustomCard> cards = CustomCard.generateCards();
        CustomCardAdapter contactsAdapter = new CustomCardAdapter(cards);
        popularEventsRecyclerView.setAdapter(contactsAdapter);
    }
}
