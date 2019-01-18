package com.example.lubna.cloverweb;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FragmentQuiz extends Fragment {
    View view;
    ListView lview3;
    TextView txt;
Button btn3;

    private List<Food_Model> lstfood;
    public FragmentQuiz() {

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);




    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final ViewGroup rootview = (ViewGroup) inflater.inflate(R.layout.quiz_fragment, container, false);
        lview3 = rootview.findViewById(R.id.productlist);


        String[] ds = {"Rice","Pulses","Soap"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), R.layout.tablayoutlistview,R.id.name_food5,ds);
        lview3.setAdapter(adapter);
        lview3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ViewGroup viewGroup = (ViewGroup) view;
                final TextView txt = viewGroup.findViewById(R.id.name_food5);
               final Button btn3 = viewGroup.findViewById(R.id.btngroce);


            }



//            btn3.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    AlertDialog alertDialog = new AlertDialog.Builder(getContext()).create();
//                    alertDialog.setTitle("hi");
//                    alertDialog.setMessage("this is my app");
//
//                    alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
//                        public void onClick(DialogInterface dialog, int which) {
//                            // here you can add functions
//                        }
//                    });
//                    alertDialog.show();
//                    Toast.makeText(getActivity(), txt.getText().toString(), Toast.LENGTH_LONG).show();
//                    Toast.makeText(getContext(),"hi",Toast.LENGTH_LONG).show();
//                }
//            });

        });

        return rootview;


//        myrecyclerview.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, true));
//        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(),lstfood);
//        myrecyclerview.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
//        myrecyclerview.setAdapter(recyclerAdapter);
//        return view;
    }

//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//            lstfood = new ArrayList<>();
//            lstfood.add(new Food_Model("Rice", "All kind of Rice", R.drawable.clover_logo_final));
//            lstfood.add(new Food_Model("Flours", "All kind of flours", R.drawable.clover_logo_final));
//            lstfood.add(new Food_Model("Staples","Different variety of staples",R.drawable.clover_logo_final));
//            lstfood.add(new Food_Model("Oils","All kind of Oils",R.drawable.clover_logo_final));
//            lstfood.add(new Food_Model("Spices","All variety of Spices",R.drawable.clover_logo_final));
//            lstfood.add(new Food_Model("Grains","All variety of Grains",R.drawable.clover_logo_final));
//            lstfood.add(new Food_Model("Banaspati Ghee","All variety of banaspati ghee",R.drawable.clover_logo_final));
//            }
}
