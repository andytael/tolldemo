// Copyright (c) 2024, Oracle and/or its affiliates.
// Licensed under the Universal Permissive License v 1.0 as shown at https://oss.oracle.com/licenses/upl/

package com.example.tollreader.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRespository extends JpaRepository<Vehicle, String> {}
