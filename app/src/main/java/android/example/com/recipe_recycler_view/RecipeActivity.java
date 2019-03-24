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

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;

public class RecipeActivity extends AppCompatActivity {

    /**
     * Get a handle on views
     * Set text and image resource of views
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_detail);

        TextView recipeTitle = findViewById(R.id.titleDetail);
        ImageView recipeImage = findViewById(R.id.ImageDetail);
        TextView recipeIngredients = findViewById(R.id.ingredientsDetail);
        TextView recipeDirections = findViewById(R.id.directionsDetail);

        recipeTitle.setText(getIntent().getStringExtra("name"));
        recipeIngredients.setText(getIntent().getStringExtra("recipe_ingredients"));
        recipeDirections.setText(getIntent().getStringExtra("recipe_directions"));

        // Load the image using the Glide library and the Intent extra.
        Glide.with(this).load(getIntent().getStringExtra("image_resource"))
                .into(recipeImage);

    }

}
