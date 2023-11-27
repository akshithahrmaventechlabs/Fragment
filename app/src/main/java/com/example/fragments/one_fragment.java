package com.example.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class one_fragment extends Fragment {

    EditText firstname, lastname;
    Button submitBtn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){

        // Inflate the layout for this fragment
    View rootView = inflater.inflate(R.layout.one_fragment, container, false);

        // Initialize UI elements
    firstname=(EditText)rootView.findViewById(R.id.firstname);
    lastname=(EditText)rootView.findViewById(R.id.lastname);

        // Set a click listener for the submit button
    submitBtn=(Button) rootView.findViewById(R.id.submitBtn);

    submitBtn.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        String first = firstname.getText().toString();
        String last = lastname.getText().toString();


            // Create a Bundle to pass data to the next fragment
        Bundle bundle = new Bundle();
        bundle.putString("FirstName", first);
        bundle.putString("LastName", last);


            // Obtain the FragmentManager and start a FragmentTransaction
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


            // Create an instance of the second_fragment and set arguments
        second_fragment second_fragment = new second_fragment();
        second_fragment.setArguments(bundle);


            // Replace the current fragment with the second_fragment
        fragmentTransaction.replace(R.id.frame_container, second_fragment);
        fragmentTransaction.commit();


    }
    });

    return rootView;
}
}



//    This line declares a class named one_fragment that extends the Fragment class.
//        In Android, a Fragment represents a modular section of an activity, often used for UI and functionality.
//
//        These lines declare three member variables (firstname, lastname, and submitBtn) of types EditText and Button.
//        These variables will be used to reference the corresponding UI elements defined in the XML layout.

//    This method is called when the fragment is creating its user interface.
//        It inflates (creates) the view hierarchy defined in the XML layout file.
//        It receives three parameters: inflater to inflate the layout, container where the fragment's
//        UI should be attached, and savedInstanceState for saving and restoring the state of the fragment.

//    This line inflates the XML layout resource (R.layout.one_fragment) and assigns it to the rootView variable.
//        This layout defines the visual structure of the fragment.
//false- will not be automatically attached to the container.

//These lines initialize the firstname and lastname variables with references to the EditText elements in the inflated layout.

//This line initializes the submitBtn variable with a reference to the Button element in the inflated layout.

//This block sets up a click listener for the submitBtn button. When the button is clicked, the onClick method is executed.

//These lines retrieve the text entered in the EditText fields (firstname and lastname) and store them in the first and last variables

//This block creates a Bundle object to pass data between fragments.
// It puts the first and last names into the bundle using keys ("FirstName" and "LastName").

//These lines obtain the FragmentManager and start a FragmentTransaction.
// The FragmentManager is responsible for managing fragments, and
// the FragmentTransaction is used to perform operations such as adding, replacing, or removing fragments.

//Here, an instance of second_fragment is created,
// and the previously created Bundle is set as its arguments. This is a way to pass data to the next fragment.

//These lines replace the current fragment in the specified container (R.id.frame_container)
// with the second_fragment. The commit method applies the transaction.