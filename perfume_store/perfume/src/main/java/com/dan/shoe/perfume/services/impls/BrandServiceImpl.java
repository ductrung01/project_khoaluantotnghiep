package com.dan.shoe.perfume.services.impls;

import com.dan.shoe.perfume.services.BrandService;
import com.dan.shoe.perfume.dtos.responses.ResponseMessage;
import com.dan.shoe.perfume.models.Brand;
import com.dan.shoe.perfume.repositories.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandRepository brandRepository;

    @Override
    public boolean existsByName(String name) {
        return brandRepository.existsByName(name);
    }

    @Override
    public Brand findByName(String name) {
        return brandRepository.findByName(name);
    }

    @Override
    public ResponseMessage create(Brand brand) {
        Brand newBrand = brandRepository.save(brand);
        if (newBrand != null) {
            return new ResponseMessage(200, "Tạo Nhà xuất bản thành công");
        }
        throw new RuntimeException("Tạo Nhà xuất bản thất bại");
    }

    @Override
    public ResponseMessage update(Brand brand, Long id) {
        return brandRepository.findById(id).map(b -> {
            b.setName(brand.getName());
            b.setDescription(brand.getDescription());
            brandRepository.save(b);
            return new ResponseMessage(200, "Cập nhật Nhà xuất bản thành công");
        }).orElseThrow(() -> new RuntimeException("Không tìm thấy Nhà xuất bản"));
    }

    @Override
    public ResponseMessage delete(Long id) {
        brandRepository.deleteById(id);
        return new ResponseMessage(200, "Xóa Nhà xuất bản thành công");
    }

    @Override
    public Brand getById(Long id) {
        return brandRepository.findById(id).orElseThrow(() -> new RuntimeException("Không tìm thấy Nhà xuất bản"));
    }

    @Override
    public Page<Brand> getAll(String name, Pageable pageable) {
        return brandRepository.findAllByNameContaining(name, pageable);
    }
}
