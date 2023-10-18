package com.itheima.day12.work;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        RedEnvelope redEnvelope = new RedEnvelope(3);

        ArrayList<FamilyMembers> list = new ArrayList<>();
        FamilyMembers familyMember1 = new FamilyMembers(redEnvelope, "黄蓉");
        list.add(familyMember1);

        FamilyMembers familyMember2 = new FamilyMembers(redEnvelope, "瑛姑");
        list.add(familyMember2);

        FamilyMembers familyMember3 = new FamilyMembers(redEnvelope, "黄药师");
        list.add(familyMember3);

        FamilyMembers familyMember4 = new FamilyMembers(redEnvelope, "周伯通");
        list.add(familyMember4);

        FamilyMembers familyMember5 = new FamilyMembers(redEnvelope, "郭靖");
        list.add(familyMember5);

        list.forEach(o->new Thread(o).start());

    }
}
