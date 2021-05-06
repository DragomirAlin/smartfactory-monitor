package ro.dragomialin.monitor.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ro.dragomialin.monitor.model.Monitor;
import ro.dragomialin.monitor.repository.MonitorRepository;
import ro.dragomialin.monitor.service.SubscriptionService;

import java.util.List;


@Slf4j
@Service
@RequiredArgsConstructor
public class SubscriptionServiceImpl implements SubscriptionService {
    private final MonitorRepository repository;

    @Override
    public Monitor add(Monitor monitor) {
        log.info("Add new subscription to system. Subscription type={}.", monitor.getType());
        return repository.save(monitor);
    }

    @Override
    public void delete(String id) {
        Monitor monitor = getById(id);
        log.info("Delete subscription with id={}.", monitor.getId());
        repository.delete(monitor);
    }

    @Override
    public List<Monitor> getAll() {
        log.info("Get all subscriptions.");
        return repository.findAll();
    }

    @Override
    public Monitor getById(String id) {
        log.info("Get subscription by id={}.", id);
        return repository.findById(id)
                .orElseThrow(() -> new NullPointerException());
    }
}
