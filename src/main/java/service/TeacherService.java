package service;

import domain.Teacher;

import java.util.List;

public interface TeacherService {
    void update(Teacher teacher);

    void insert(Teacher teacher);

    List<Teacher> findAll();

    Teacher findById(Integer teaher_id);

    void delete(Teacher newT);
}
