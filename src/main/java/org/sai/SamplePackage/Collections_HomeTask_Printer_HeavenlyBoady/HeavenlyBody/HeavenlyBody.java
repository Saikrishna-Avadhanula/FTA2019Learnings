package org.sai.SamplePackage.Collections_HomeTask_Printer_HeavenlyBoady.HeavenlyBody;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<HeavenlyBody>();
    }

    @Override
    public boolean equals(Object o) {
        HeavenlyBody h = (HeavenlyBody) o;
        return this.name.equals(h.name) &&
                this.hashCode() == h.hashCode();
    }

    @Override
    public int hashCode() {
        System.out.println("hashcode called");
        return (int)orbitalPeriod;

    }


    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<HeavenlyBody>(this.satellites);
    }


}



