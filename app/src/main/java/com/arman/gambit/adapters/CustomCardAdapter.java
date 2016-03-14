package com.arman.gambit.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.arman.gambit.R;
import com.arman.gambit.objects.CustomCard;

import java.util.List;

/**
 * Created by arman on 2/27/16.
 */
// Create the basic adapter extending from RecyclerView.Adapter
// Note that we specify the custom ViewHolder which gives us access to our views
public class CustomCardAdapter extends RecyclerView.Adapter<CustomCardAdapter.ViewHolder> {

    private List<CustomCard> mCards;

    // Pass in the contact array into the constructor
    public CustomCardAdapter(List<CustomCard> cards) {
        this.mCards = cards;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View customCardView = inflater.inflate(R.layout.card_view, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(customCardView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomCardAdapter.ViewHolder holder, int position) {
        // Get the data model based on position
        CustomCard card = mCards.get(position);

        // Set item views based on the data model
        holder.titleView.setText(card.getTitle());
        holder.imageView.setImageResource(card.getImage());
        // holder.iconView.setImageResource(card.getIcon());
    }

    @Override
    public int getItemCount() {
        return mCards.size();
    }

    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView titleView;
        public ImageView imageView;
        public ImageView iconView;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            titleView = (TextView) itemView.findViewById(R.id.item_title);
            imageView = (ImageView) itemView.findViewById(R.id.item_image);
            // iconView = (ImageView) itemView.findViewById(R.id.message_button);
        }
    }
}