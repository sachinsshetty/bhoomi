package planareas.config;

import com.camptocamp.planareas.api.PlanAreaController;
import com.camptocamp.planareas.repository.PlanArea;
import com.camptocamp.planareas.repository.PlanAreaRepository;
import com.camptocamp.planareas.service.CoordinateTransformationService;
import com.camptocamp.planareas.service.PlanAreaService;
import org.locationtech.jts.geom.GeometryFactory;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackageClasses = PlanAreaRepository.class)
@EntityScan(basePackageClasses = PlanArea.class)
public class PlanAreasAutoConfiguration {

    public @Bean PlanAreaController planAreasController(PlanAreaService service) {
        return new PlanAreaController(service);
    }

    @Bean
    PlanAreaService planAreaService(
            GeometryFactory gFac, CoordinateTransformationService cts, PlanAreaRepository repo) {
        return new PlanAreaService(gFac, cts, repo);
    }

    @Bean
    GeometryFactory geometryFactory() {
        return new GeometryFactory();
    }

    @Bean
    CoordinateTransformationService coordinateTransformationService() {
        return new CoordinateTransformationService();
    }
}
