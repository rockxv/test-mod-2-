package main;

import mindustry.mod.Mod;

public class Main extends Mod{
    @Override
    public void loadContent(){
        main.content.ModItem.load();
    }
}