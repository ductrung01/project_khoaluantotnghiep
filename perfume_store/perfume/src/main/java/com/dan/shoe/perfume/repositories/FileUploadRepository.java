package com.dan.shoe.perfume.repositories;

import com.dan.shoe.perfume.models.FileUpload;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileUploadRepository extends JpaRepository<FileUpload, Long>{
    public void deleteByFileCode(String fileCode);
    public FileUpload findByFileCode(String fileCode);
}
