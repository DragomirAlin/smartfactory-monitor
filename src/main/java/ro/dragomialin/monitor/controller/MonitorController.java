package ro.dragomialin.monitor.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ro.dragomialin.monitor.common.Monitor;
import ro.dragomialin.monitor.service.MonitorService;

import java.util.List;

@RequestMapping("/monitor")
@RestController
@RequiredArgsConstructor
public class MonitorController {
    private final MonitorService monitorService;

    public Monitor addMonitor(@RequestBody Monitor monitor) {
        return monitorService.add(monitor);
    }

    @GetMapping("/all")
    public List<Monitor> getAll() {
        return monitorService.getAllMonitors();
    }

    @GetMapping("/{id}")
    public Monitor getMonitor(@PathVariable String id){
        return monitorService.getMonitorById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteMonitor(@PathVariable String id){
        monitorService.delete(id);
    }

}
