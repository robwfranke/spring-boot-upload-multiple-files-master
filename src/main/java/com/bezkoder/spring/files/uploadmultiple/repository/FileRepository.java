package com.bezkoder.spring.files.uploadmultiple.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.bezkoder.spring.files.uploadmultiple.model.FileEntity;


public interface FileRepository extends JpaRepository<FileEntity, String> {
}
