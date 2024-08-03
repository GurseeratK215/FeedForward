package com.seerat.feedforward.Service;

import com.seerat.feedforward.Model.Provider;
import com.seerat.feedforward.Repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProviderService {

    @Autowired
    private ProviderRepository providerRepository;

    public List<Provider> getAllProviders() {
        return providerRepository.findAll();
    }

    public Provider getProviderById(int id) {
        Optional<Provider> provider = providerRepository.findById(id);
        return provider.orElse(null);
    }

    public Provider createProvider(Provider provider) {
        return providerRepository.save(provider);
    }

    public Provider updateProvider(int id, Provider provider) {
        if (providerRepository.existsById(id)) {
            provider.setProviderId(id);
            return providerRepository.save(provider);
        } else {
            return null;
        }
    }

    public void deleteProvider(int id) {
        if (providerRepository.existsById(id)) {
            providerRepository.deleteById(id);
        }
    }
}
