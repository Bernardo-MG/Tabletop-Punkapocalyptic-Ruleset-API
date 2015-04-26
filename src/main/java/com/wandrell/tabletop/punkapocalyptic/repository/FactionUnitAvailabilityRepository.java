package com.wandrell.tabletop.punkapocalyptic.repository;

import java.util.Collection;

import com.wandrell.pattern.repository.Repository;
import com.wandrell.tabletop.punkapocalyptic.model.availability.FactionUnitAvailability;
import com.wandrell.tabletop.punkapocalyptic.model.faction.Faction;

public interface FactionUnitAvailabilityRepository extends
        Repository<FactionUnitAvailability> {

    public Collection<FactionUnitAvailability> getAvailabilitiesForFaction(
            final Faction faction);

    public FactionUnitAvailability getAvailabilityForUnit(final String unit);

}
