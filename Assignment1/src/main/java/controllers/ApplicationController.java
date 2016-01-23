/**
 * Copyright (C) 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package controllers;
import models.Table;
import models.Card;
import models.Deck;
import ninja.Context;
import ninja.Result;
import ninja.Results;

import com.google.inject.Singleton;


@Singleton
public class ApplicationController {

    public Result index() {
        return Results.html();
    }

    public Result acesUp() {
        return Results.html().template("views/AcesUp/AcesUp.flt.html");
    }

    public Result init ( ){
        Table new_table=new Table();
        new_table.Fill_Column();
       // String card_rank;
      //  String card_suit;
        String return_card=new_table.Reurn_Column_1().getR_S()+new_table.Reurn_Column_2().getR_S()+new_table.Reurn_Column_3().getR_S()+new_table.Reurn_Column_4().getR_S();

        return Results.json( ).render(return_card);
    }
  /*  public Result another (Context context, Card c) {
        Card card1=new Card ( );
        card1.setRank("11");
        card1.setSuit("h");
        return Results.json( ).render(card1);
    }*/
}
