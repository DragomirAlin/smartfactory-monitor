package ro.dragomialin.monitor.service.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ro.dragomialin.monitor.common.AcqusitionType;
import ro.dragomialin.monitor.common.Data;
import ro.dragomialin.monitor.common.Monitor;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class TemperatureFilter implements Filter {
    private final ObjectMapper objectMapper;
    private final List<AcqusitionType> allowedAcqusitions = List.of(AcqusitionType.DTH11, AcqusitionType.DTH22);

    @Override
    public boolean apply(Data data, Monitor monitor) {
        return false;
    }
}
