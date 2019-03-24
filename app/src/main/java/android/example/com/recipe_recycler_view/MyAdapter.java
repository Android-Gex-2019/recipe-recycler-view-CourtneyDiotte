/**
 *
 * @author Courtney Diotte
 *
 * @version 1.0
 * *
 * @section DESCRIPTION
 * Recipe Recycler View App
 *
 * @section LICENSE
 * *
 * Copyright 2018
 * Permission to use, copy, modify, and/or distribute this software for
 * any purpose with or without fee is hereby granted, provided that the
 * above copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 *
 * @section Academic Integrity
 * I certify that this work is solely my own and complies with
 * NBCC Academic Integrity Policy (policy 1111)
 */

package android.example.com.recipe_recycler_view;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.List;

//Adapter class for RecyclerView
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    List<Recipe> recipes;
    Context context;

    /**
     * Initialize context and recipe List
     * @param context
     * @param recipes
     */
    MyAdapter(Context context, List<Recipe> recipes){
        this.recipes = recipes;
        this.context = context;
    }

    /**
     * Inflate layout
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(
            ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).
                inflate(R.layout.list_item, parent, false));
    }

    /**
     * Get the current recipe and bind
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder,
                                 int position) {
        // Get current recipe
        Recipe currentRecipe = recipes.get(position);

        // Populate the textviews with data.
        holder.bindTo(currentRecipe);
    }

    /**
     * Return the number of items in recipes
     * @return size of recipe List
     */
    @Override
    public int getItemCount() {
        return recipes.size();
    }

    /**
     * Setup OnClickListener
     * Set textviews to appropriate itemViews
     * Set the text of the text views
     */
    public class ViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {

        TextView title;
        TextView desc;


        ViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.recipe_title);
            desc = itemView.findViewById(R.id.recipe_desciption);


            itemView.setOnClickListener(this);
        }

        void bindTo(Recipe recipe) {
            title.setText(recipe.name);
            desc.setText(recipe.description);

        }

        /**
         * OnClick event
         * Add Extras to intent
         * Launch activity with intent
         * @param view
         */
        @Override
        public void onClick(View view) {
            Recipe currentRecipe = recipes.get(getAdapterPosition());
            Intent detailIntent = new Intent(context, RecipeActivity.class);
            detailIntent.putExtra("name", currentRecipe.name);
             detailIntent.putExtra("image_resource",
                    currentRecipe.imageResource);
             detailIntent.putExtra("recipe_ingredients", currentRecipe.ingredients);
            detailIntent.putExtra("recipe_directions", currentRecipe.directions);

            context.startActivity(detailIntent);
        }
    }
}