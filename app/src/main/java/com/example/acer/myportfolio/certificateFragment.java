package com.example.acer.myportfolio;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link certificateFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link certificateFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class certificateFragment extends Fragment implements View.OnClickListener {


    private MainActivity mainActivity;
    View view;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public certificateFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment certificateFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static certificateFragment newInstance(String param1, String param2) {
        certificateFragment fragment = new certificateFragment();
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

        try {
            initializeViews();
            view = inflater.inflate(R.layout.fragment_certificate, container, false);

            Button b1 = (Button)view.findViewById(R.id.button1);
            b1.setOnClickListener(this);

            Button b2 = (Button)view.findViewById(R.id.button2);
            b2.setOnClickListener(this);

            Button b3 = (Button)view.findViewById(R.id.button3);
            b3.setOnClickListener(this);


            Button b4 = (Button)view.findViewById(R.id.button4);
            b4.setOnClickListener(this);


            Button b5 = (Button)view.findViewById(R.id.button5);
            b5.setOnClickListener(this);

            return view;
        } catch (Exception e) {

            Log.e("Certificate", "onCreateView", e);
            throw e;
        }
    }
    private void initializeViews(){
        mainActivity = (MainActivity)getActivity();
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
        if (context instanceof MainActivity) {
            mainActivity = (MainActivity) context;
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

    @Override
    public void onClick(View v) {

        String URL;


        switch (v.getId()){

            case R.id.button1:
                 URL ="https://www.udemy.com/certificate/UC-3C3FIZYP/";
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse(URL)));
                break;
            case R.id.button2:
                URL ="https://drive.google.com/open?id=1zeddlSigf_KFRQ_p6tJ7TfUTtpDafXye";
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse(URL)));
                break;
            case R.id.button3:
                URL ="https://drive.google.com/open?id=1tt00zTpiZq9uqbqvRLHoe3D5_D9II8Ks";
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse(URL)));
                break;
            case R.id.button4:
                 URL ="https://drive.google.com/open?id=1XO4FSlVoeRkCN1XL-s7xHVNZ3DRzLTl4";
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse(URL)));
                break;
            case R.id.button5:
                 URL ="https://drive.google.com/open?id=1zQIYr9lpTIuZH0ZbICGYimo4iLoMwi1P";
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse(URL)));
                break;
            default:break;


        }

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
}
