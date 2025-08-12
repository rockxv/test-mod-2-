package main.content;

import arc.graphics.Color;
import mindustry.type.Item;

public class ModItem{
    public static Item diamond;
    
    public static void load(){
        diamond = new Item("diamond", Color.valueOf("6beeff")){{

        }};
    }


}