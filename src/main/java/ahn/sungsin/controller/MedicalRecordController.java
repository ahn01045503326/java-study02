package ahn.sungsin.controller;

import ahn.sungsin.model.MedicalRecord;

import java.util.ArrayList;
import java.util.List;

public class MedicalRecordController {
    private List<MedicalRecord> records=new ArrayList<>();

    // 진료기록을 등록하는 메서드
    public void addMedicalRecord(MedicalRecord record) {
        records.add(record);
    }

    // 진료기록을 삭제하는 메서드
    public void removeMedicalRecord(String phoneNumber) {
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getPhoneNumber().equals(phoneNumber)) {
                records.remove(i);
                break;
            }
        }
    }

    // 전화번호에 해당하는 모든 진료기록을 검색하여 새로운 List<MedicalRecord>를 만들어주는 메서드
    public List<MedicalRecord> findMedicalRecords(String phoneNumber) {
        List<MedicalRecord> result = new ArrayList<>();
        for (MedicalRecord record : records) {
            if (record.getPhoneNumber().equals(phoneNumber)) {
                result.add(record);
            }
        }
        return result;
    }
}
