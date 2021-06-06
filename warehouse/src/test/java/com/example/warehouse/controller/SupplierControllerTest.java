package com.example.warehouse.controller;

import com.example.warehouse.controller.dto.SupplierRecordRequest;
import com.example.warehouse.dao.SupplierRepository;
import com.example.warehouse.dao.entity.Supplier;
import com.example.warehouse.service.SupplierService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)

class SupplierControllerTest {

    @Mock
    private SupplierRepository supplierRepository;
    private SupplierService underTest;

    @Test
    void canAddSupplier() throws Exception {
        //given
        SupplierRecordRequest supplierRequest = new SupplierRecordRequest(
                "TesztNev",
                "Tesztcim",
                "Tesztleiras"
        );

        //when
        underTest.addSupplier(supplierRequest);

        Supplier supplier = Supplier.addSupplier(supplierRequest);

        ArgumentCaptor<Supplier> supplierArgumentCaptor =
                ArgumentCaptor.forClass(Supplier.class);

        verify(supplierRepository)
                .save(supplierArgumentCaptor.capture());

        Supplier capturedSupplier = supplierArgumentCaptor.getValue();

        assertThat(capturedSupplier).isEqualTo(supplierRequest);

    }
}