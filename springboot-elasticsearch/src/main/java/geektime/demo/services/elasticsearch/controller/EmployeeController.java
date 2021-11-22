package geektime.demo.services.elasticsearch.controller;

import geektime.demo.services.elasticsearch.model.Employee;
import geektime.demo.services.elasticsearch.model.OpinionEventInfo;
import geektime.demo.services.elasticsearch.model.OpinionEventMetaData;
import geektime.demo.services.elasticsearch.model.Test;
import geektime.demo.services.elasticsearch.repository.EmployeeRepository;
import geektime.demo.services.elasticsearch.repository.OpinionEventInfoRepository;
import geektime.demo.services.elasticsearch.repository.TestRepository;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/ic")
public class EmployeeController {

    @Autowired
    EmployeeRepository repository;
    @Autowired
    TestRepository testRepository;
    @Autowired
    OpinionEventInfoRepository eventInfoRepository;

//    @PostMapping
//    public Employee add(@RequestBody Employee employee) {
//        return repository.save(employee);
//    }

    @PostMapping()
    public OpinionEventInfo create(@RequestBody OpinionEventInfo opinionEventInfo) {
        List<OpinionEventMetaData> metaDataList = new ArrayList<>();
        OpinionEventMetaData eventMetaData = new OpinionEventMetaData();
        eventMetaData.setId("618c7dd334a34603229b8d08");
        eventMetaData.setRank(1);
        eventMetaData.setCount(123242);
        eventMetaData.setCreateTime(1635755036);
        metaDataList.add(eventMetaData);
        opinionEventInfo.setMetaDataList(metaDataList);
        return eventInfoRepository.save(opinionEventInfo);
    }

    @GetMapping("")
    public Iterator<OpinionEventInfo> get(String text) {
        QueryBuilder queryBuilder = QueryBuilders.matchQuery("name", text);

        Iterable<OpinionEventInfo> list = eventInfoRepository.search(queryBuilder);

        return list.iterator();
    }

//    @GetMapping("")
//    public Iterator<Test> findByText(String text) {
//        QueryBuilder queryBuilder = QueryBuilders.matchQuery("text", text);
//        Iterable<Test> list = testRepository.search(queryBuilder);
//
//        return list.iterator();
//    }
//
//    @GetMapping("/organization/{organizationName}")
//    public List<Employee> findByOrganizationName(@PathVariable("organizationName") String organizationName) {
//        return repository.findByOrganizationName(organizationName);
//    }
}
