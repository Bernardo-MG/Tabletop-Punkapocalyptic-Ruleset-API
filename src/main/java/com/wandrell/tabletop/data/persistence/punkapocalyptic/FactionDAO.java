package com.wandrell.tabletop.data.persistence.punkapocalyptic;

import com.wandrell.tabletop.business.model.punkapocalyptic.faction.Faction;

public interface FactionDAO {

    public Faction getFaction(final String faction);

}