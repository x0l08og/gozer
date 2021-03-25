/**
Copyright (c) 2018-present, Walmart, Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package com.walmartlabs.x12.asn856;

import com.walmartlabs.x12.AbstractX12TransactionSet;
import com.walmartlabs.x12.common.segment.DTMDateTimeReference;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class AsnTransactionSet extends AbstractX12TransactionSet {

    //
    // BSN
    // 
    // BSN 01
    private String purposeCode;
    // BSN 02
    private String shipmentIdentification;
    // BSN 03
    private String shipmentDate; // CCYYMMDD
    // BSN 04
    private String shipmentTime;
    // BSN 05
    private String hierarchicalStructureCode;
    
    // DTM segments (can appear between BSN and HL*S
    private List<DTMDateTimeReference> dtmReferences;
    
    // HL (Shipment)
    // the first loop in the HL hierarchy
    private Shipment shipment;
    
    //
    // CTT
    //
    // CTT 01
    private Integer transactionLineItems;

    
    
    /**
     * helper method to add DTM to list
     * @param dtm
     */
    public void addDTMDateTimeReference(DTMDateTimeReference dtm) {
        if (CollectionUtils.isEmpty(dtmReferences)) {
            dtmReferences = new ArrayList<>();
        }
        dtmReferences.add(dtm);
    }
    
    public String getPurposeCode() {
        return purposeCode;
    }

    public void setPurposeCode(String purposeCode) {
        this.purposeCode = purposeCode;
    }

    public String getShipmentIdentification() {
        return shipmentIdentification;
    }

    public void setShipmentIdentification(String shipmentIdentification) {
        this.shipmentIdentification = shipmentIdentification;
    }

    public String getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(String shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    public String getShipmentTime() {
        return shipmentTime;
    }

    public void setShipmentTime(String shipmentTime) {
        this.shipmentTime = shipmentTime;
    }

    public String getHierarchicalStructureCode() {
        return hierarchicalStructureCode;
    }

    public void setHierarchicalStructureCode(String hierarchicalStructureCode) {
        this.hierarchicalStructureCode = hierarchicalStructureCode;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    public Integer getTransactionLineItems() {
        return transactionLineItems;
    }

    public void setTransactionLineItems(Integer transactionLineItems) {
        this.transactionLineItems = transactionLineItems;
    }

    public List<DTMDateTimeReference> getDtmReferences() {
        return dtmReferences;
    }

    public void setDtmReferences(List<DTMDateTimeReference> dtmReferences) {
        this.dtmReferences = dtmReferences;
    }
    
}
