package com.koles.myfitness.dishes_activities;
import android.content.Context;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListsDishes {

    private Context context;
    public ListsDishes(Context context){
        this.context = context;
    }

    private List<Dish> meat = new ArrayList<>();

    public List<Dish> getMeat(){
        test();
        fillList(meat);
        return meat;
    }

    /**
     * заполняет список
     * @param dishes название списка который нужно заполнить
     */
    private void fillList(List<Dish> dishes){
       try(FileInputStream inputStream = context.openFileInput("test1.txt")){
           while (inputStream.available() > 0){
               System.out.println(inputStream.read());
           }
       }catch (IOException e){
            e.printStackTrace();
       }
    }

    private void test(){
        try(FileOutputStream outputStream = context.openFileOutput("test.txt",
                Context.MODE_PRIVATE)){
            outputStream.write(0);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
