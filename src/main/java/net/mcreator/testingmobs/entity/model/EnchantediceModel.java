package net.mcreator.testingmobs.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.testingmobs.entity.EnchantediceEntity;

public class EnchantediceModel extends GeoModel<EnchantediceEntity> {
	@Override
	public ResourceLocation getAnimationResource(EnchantediceEntity entity) {
		return new ResourceLocation("testing_mobs", "animations/ice.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EnchantediceEntity entity) {
		return new ResourceLocation("testing_mobs", "geo/ice.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EnchantediceEntity entity) {
		return new ResourceLocation("testing_mobs", "textures/entities/" + entity.getTexture() + ".png");
	}

}
