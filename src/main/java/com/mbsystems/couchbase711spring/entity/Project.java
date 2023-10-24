package com.mbsystems.couchbase711spring.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;
import org.springframework.data.couchbase.repository.Collection;
import org.springframework.data.couchbase.repository.Scope;

import java.util.List;

@Document
@Scope(value = "dev")
@Collection(value = "project")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Project {

    @Id
    private String _id;
    private String name;
    private String code;

    @Field("desc")
    private String description;
    private String startDate;
    private String endDate;

    @Field("cost")
    private Long estimatedCost;
    private List<String> countryList;

    @Version
    private Long version;
}
