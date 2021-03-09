package de.renoth.classes;

import java.io.Serializable;
import java.util.*;


public class SourceClassMemberClass implements Serializable {
    private Map<String, Collection<CCCC>> kompetenzMap;

    public SourceClassMemberClass(Collection<String> kompetenzen) {

    }

    public List<CCCC> getCCCC() {
        List<CCCC> result = new ArrayList<>();
        for (Collection<CCCC> kompetenzen : kompetenzMap.values()) {
            result.addAll(kompetenzen);
        }
        return result;
    }

}
