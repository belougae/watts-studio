package geektime.demo.services.elasticsearch.repository;

import geektime.demo.services.elasticsearch.model.OpinionEventInfo;
import geektime.demo.services.elasticsearch.model.Test;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OpinionEventInfoRepository extends ElasticsearchRepository<OpinionEventInfo, String> {

}
