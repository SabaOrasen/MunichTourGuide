package com.example.saba.tourguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link RestaurantTab.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link RestaurantTab#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RestaurantTab extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public RestaurantTab() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RestaurantTab.
     */
    // TODO: Rename and change types and number of parameters
    public static RestaurantTab newInstance(String param1, String param2) {
        RestaurantTab fragment = new RestaurantTab();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_restaurant_tab, container, false);
        // Inflate the layout for this fragment
        ArrayList<ListItem> a = makeListItem();
        Log.v("RestaurantTap:", ""+makeListItem().get(0));
        ListItemAdapter listItemAdapter = new ListItemAdapter(getContext(), R.layout.list_item, a);
        ListView listView = (ListView) view.findViewById(R.id.list);
        listView.setAdapter(listItemAdapter);
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    public ArrayList<ListItem> makeListItem(){
        ArrayList<String> mName = new ArrayList<String>(Arrays.asList("Kusperpalast","McDonald's","BurgerKing","PizzaHut","Kusperpalast","McDonald's"));
        ArrayList<String> mAddress =new ArrayList<String>(Arrays.asList("Bahnhofstr.31 Landau","Straubingerstr. 3  München","Hauptstr. 3  München", "Auenstr. 2  München","Bahnhofstr. 31 Landau","Straubingerstr. 3  München"));
        ArrayList<Integer> mRating= new ArrayList<Integer>(Arrays.asList(10,1,2,3,10,1));
        ArrayList<Integer> mImageRescourceId= new ArrayList<Integer>(Arrays.asList(R.drawable.knusperpalast2, R.drawable.mcdonalds_mc_cafe, R.drawable.burger_king,R.drawable.pizzahut,R.drawable.knusperpalast2, R.drawable.mcdonalds_mc_cafe));;
            ArrayList<ListItem> weatherObject = new ArrayList<ListItem>();
            for (int i = 0; i < mName.size(); i++){
                ListItem w = new ListItem(mName.get(i),mAddress.get(i), mRating.get(i), mImageRescourceId.get(i));
                weatherObject.add(w);
            }
            return weatherObject;
    }
}
