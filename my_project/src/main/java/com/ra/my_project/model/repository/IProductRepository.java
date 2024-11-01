package com.ra.my_project.model.repository;

import com.ra.my_project.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IProductRepository extends JpaRepository<Product,Long>
{
    // hql -> jpql
//    @Query("select p from Product p where p.name like concat('%',:search,'%') ")
//    List<Product> findAllByNameContains(@Param("search") String search);

    List<Product> findAllByProductNameContains(String name);

}
