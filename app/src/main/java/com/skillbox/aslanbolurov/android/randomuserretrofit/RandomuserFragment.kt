package com.skillbox.aslanbolurov.android.randomuserretrofit

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import coil.load
import com.skillbox.aslanbolurov.android.randomuserretrofit.databinding.FragmentRandomuserBinding
import com.skillbox.aslanbolurov.android.randomuserretrofit.model.Results
import retrofit2.Response

class RandomuserFragment : Fragment() {

    private var _binding:FragmentRandomuserBinding?=null
    private val binding get()=_binding!!

    private val viewModel:RandomuserViewModel by viewModels{
        RandomuserViewModelFactory()
    }

    companion object {
        fun newInstance() = RandomuserFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentRandomuserBinding.inflate(inflater,container,false)
        binding.btnRestart.setOnClickListener {
            viewModel.btnRestartOnClick()
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewLifecycleOwner.lifecycleScope.
            launchWhenStarted {
                viewModel.state.collect{
                    when(it){
                        State.Loading -> {
                            binding.progressBar.isVisible=true
                            binding.btnRestart.isEnabled=false
                        }
                        State.Success -> {
                            binding.progressBar.isVisible=false
                            binding.btnRestart.isEnabled=true
                        }
                    }
                }
            }
        viewLifecycleOwner.lifecycleScope.launchWhenStarted {
            viewModel.randomUser.collect{
                binding.userImg.load(it?.picture?.medium)
                binding.tvName.setText("${it?.name?.title} ${it?.name?.first} ${it?.name?.last}, age:${it?.dob?.age}")
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }
}

