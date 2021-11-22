package geektime.demo.services.elasticsearch.repository;

import geektime.demo.services.elasticsearch.model.Employee;
import geektime.demo.services.elasticsearch.model.Test;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends ElasticsearchRepository<Test, String> {
    List<Test> findByText(String text);

}
