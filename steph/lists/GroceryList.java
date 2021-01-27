package com.viveros.steph.lists;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryList(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("you have a grocery list of " + groceryList.size() + " items in your list.");
        for (String item: groceryList){
            System.out.println(item);
        }
    }

    private void modifyGroceryList(int position, String newItem){
        groceryList.add(position, newItem);
    }

    public void modifyGroceryList(String currentItem, String newItem){
        int position = findItem(currentItem);
        if (position >=0){
            groceryList.add(position, newItem);
        }
    }
    public void removeItem(String item){
        int position = findItem(item);
        if (position >=0){
            groceryList.remove(position);
        }
    }

    private void removeItem(int position){
        groceryList.remove(position);
    }

    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        return position >= 0;
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }
}
