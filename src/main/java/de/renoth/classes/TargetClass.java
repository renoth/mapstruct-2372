package de.renoth.classes;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

public class TargetClass {

    @NotNull
    private List<AAAA> aaaa = new ArrayList<>();

    @NotNull
    private BBBB BBBB;


    public List<AAAA> getAaaa() {
        return aaaa;
    }

    public void setAaaa(List<AAAA> aaaa) {
        this.aaaa = aaaa;
    }

    public BBBB getBBBB() {
        return BBBB;
    }

    public void setBBBB(BBBB BBBB) {
        this.BBBB = BBBB;
    }
}
