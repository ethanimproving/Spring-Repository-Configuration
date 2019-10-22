package org.hibernate.jht;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
    Topic findOne(String id);
//    getAllTopics();
//    getTopic(String id);
//    updateTopic(Topic t);
//    deleteTopic(String id);
}
