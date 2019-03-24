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

public class Recipe {

    public String name;
    public String description;
    public String imageResource;
    public String ingredients;
    public String directions;

    public Recipe(String name, String description, String imageResource, String ingredients, String directions) {
        this.name = name;
        this.description = description;
        this.imageResource = imageResource;
        this.ingredients = ingredients;
        this.directions = directions;
    }

}