package com.wandrell.tabletop.business.service.punkapocalyptic;

import java.util.Collection;

import com.wandrell.tabletop.business.model.punkapocalyptic.RangedValue;
import com.wandrell.tabletop.business.model.punkapocalyptic.availability.FactionUnitAvailability;
import com.wandrell.tabletop.business.model.punkapocalyptic.availability.UnitArmorAvailability;
import com.wandrell.tabletop.business.model.punkapocalyptic.availability.UnitEquipmentAvailability;
import com.wandrell.tabletop.business.model.punkapocalyptic.availability.UnitWeaponAvailability;
import com.wandrell.tabletop.business.model.punkapocalyptic.availability.WeaponOption;
import com.wandrell.tabletop.business.model.punkapocalyptic.faction.Faction;
import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.Armor;
import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.Equipment;
import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.MeleeWeapon;
import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.RangedWeapon;
import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.Weapon;
import com.wandrell.tabletop.business.model.punkapocalyptic.inventory.WeaponEnhancement;
import com.wandrell.tabletop.business.model.punkapocalyptic.ruleset.constraint.UnitGangConstraint;
import com.wandrell.tabletop.business.model.punkapocalyptic.ruleset.modifier.ArmorInitializerModifier;
import com.wandrell.tabletop.business.model.punkapocalyptic.ruleset.specialrule.SpecialRule;
import com.wandrell.tabletop.business.model.punkapocalyptic.unit.Gang;
import com.wandrell.tabletop.business.model.punkapocalyptic.unit.Unit;

public interface ModelService {

    public Armor getArmor(final String name, final Integer armor,
            final Collection<SpecialRule> rules);

    public ArmorInitializerModifier getArmorInitializerModifier(
            final String name);

    public Equipment getEquipment(final String name, final Integer cost);

    public Faction getFaction(final String name);

    public FactionUnitAvailability getFactionUnitAvailability(final Unit unit,
            final Collection<UnitGangConstraint> constraints);

    public Gang getGang(final Faction faction);

    public MeleeWeapon getMeleeWeapon(final String name, final Integer cost,
            final Integer strength, final Integer penetration,
            final Integer combat);

    public RangedValue getRangedValue(final Integer distanceShort,
            final Integer distanceMedium, final Integer distanceLong);

    public RangedWeapon getRangedWeapon(final String name, final Integer cost,
            final RangedValue penetration, final RangedValue strength,
            final RangedValue distanceCM, final RangedValue distanceInches,
            final MeleeWeapon weaponMelee);

    public SpecialRule getSpecialRule(final String name);

    public Unit getUnit(final String name, final Integer actions,
            final Integer agility, final Integer combat,
            final Integer precision, final Integer strength,
            final Integer tech, final Integer toughness, final Integer cost,
            final Collection<SpecialRule> rules);

    public UnitArmorAvailability getUnitArmorAvailability(
            final Collection<Armor> armorOptions, final Armor initialArmor);

    public UnitEquipmentAvailability getUnitEquipmentAvailability(
            final Collection<WeaponEnhancement> weaponEnhancements,
            final Collection<Equipment> equipment);

    public UnitGangConstraint getUnitGangConstraint(final String name);

    public UnitWeaponAvailability getUnitWeaponAvailability(
            final Collection<WeaponOption> weaponOptions,
            final Integer minWeapons, final Integer maxWeapons);

    public WeaponEnhancement getWeaponEnhancement(final String name,
            final Integer cost);

    public WeaponOption getWeaponOption(final Weapon weapon,
            final Collection<WeaponEnhancement> enhancements);

}
