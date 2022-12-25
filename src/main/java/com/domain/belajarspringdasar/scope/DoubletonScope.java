package com.domain.belajarspringdasar.scope;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class DoubletonScope implements Scope {

    /*
     * Spring memungkinkan pengguna untuk membuat scoper sendiri. dengan membuat
     * class implements dari scope setelah scope dibuat selanjutnya meregistrasikan
     * scope tersebut di CustomScopeConfigurer.
     */
    private List<Object> objects = new ArrayList<>(2);
    private long counter = -1L;

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) { // untuk mengambil objek ketika getBean
        counter++;
        if (objects.size() == 2) {
            int index = (int) counter % 2;
            return objects.get(index);
        } else {
            Object object = objectFactory.getObject();
            objects.add(object);
            return object;
        }
    }

    @Override
    public Object remove(String name) { // menghapus objek ketika sudah tidak dipakai
        if (!objects.isEmpty()) {
            return objects.remove(0);
        }
        return null;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {
    }

    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }

}
