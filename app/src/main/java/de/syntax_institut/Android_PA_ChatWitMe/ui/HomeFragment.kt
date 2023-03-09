package de.syntax_institut.Android_PA_ChatWitMe.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import de.syntax_institut.Android_PA_ChatWitMe.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    // Hier wird das ViewModel, in dem die Logik stattfindet, eingebunden
    // TODO

    // Das binding für das QuizFragment wird deklariert
    private lateinit var binding: FragmentHomeBinding

    /**
     * Lifecycle Funktion onCreateView
     * Hier wird das binding initialisiert und das Layout gebaut
     */
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    /**
     * Lifecycle Funktion onViewCreated
     * Hier werden die Elemente eingerichtet und z.B. onClickListener gesetzt
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Die RecyclerView bekommt den ContactAdapter zugewiesen
        // TODO
    }
}
