package com.koles.myfitness;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;

public class AddCategoryDialog extends DialogFragment {

    private AlertDialog myDialog;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(getContext());
        dialogBuilder.setTitle(R.string.add_category);
        dialogBuilder.setView(R.layout.activity_add_food_category);
        dialogBuilder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getContext(), "Категория добавлена!",
                        Toast.LENGTH_LONG);

            }
        });
        myDialog = dialogBuilder.create();
        return myDialog;
    }

    public AlertDialog getMyDialog(){
        return myDialog;
    }


}
