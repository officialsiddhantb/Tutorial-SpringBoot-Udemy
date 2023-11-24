package com.example.pma.dao;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.pma.entities.project;
public interface ProjectRepository extends CrudRepository<project,Long>{
@Override
public List<project> findAll();

}