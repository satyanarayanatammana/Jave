/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jsonapis.Repository;

import com.example.jsonapis.model.Messages;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Manohar
 */
@Repository
public interface MessagesRepository extends JpaRepository<Messages, Integer> {

    @Query("select count(*) from Messages m where m.module=:module and m.subModule=:subModule and m.key=:key and m.appName=:appName ")
    int validateByKeySubName(@Param("module") String module, @Param("subModule") String subModule, @Param("key") String key, @Param("appName") String appName);

    @Query("select count(*) from Messages m where m.module=:module and m.subModule='' and m.key=:key and m.appName=:appName")
    int validateByKeyModuleName(@Param("module") String module, @Param("key") String key, @Param("appName") String appName);

    @Query("select m from Messages m where m.description=:description order by m.appName asc")
    List<Messages> getByDescription(@Param("description") String description);

    @Query("select m from Messages m where m.appName=:appName order by m.appName asc")
    List<Messages> getByAppname(@Param("appName") String appName);

    @Query("select m from Messages m order by m.appName asc ")
    List<Messages> getAllData();

 
    
}
