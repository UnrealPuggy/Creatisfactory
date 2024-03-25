package com.creatisfactory.item.chemicalStuff;

import com.simibubi.create.content.fluids.OpenEndedPipe;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

import static com.creatisfactory.Creatisfactory.LOGGER;

public class balloonItem extends Item{
	public balloonItem(Item.Properties properties) {
		super(properties);
	}



	@Override
	public InteractionResult useOn(UseOnContext context) {
		if(!context.getLevel().isClientSide) {
			if(context.getLevel().getBlockState(context.getClickedPos()).getBlock() != null) {
				//Entity customEntity = (EntityType<Entity>) ;
				ArmorStand balloon = EntityType.ARMOR_STAND.spawn(context.getLevel().getServer().overworld(),context.getClickedPos().offset(0,1,0), MobSpawnType.NATURAL);
				balloon.setYRot(0);
				balloon.setItemSlot(EquipmentSlot.MAINHAND, Items.IRON_SWORD.getDefaultInstance());
				//balloon.setInvisible(true);

				balloon.setShowArms(true);
				MobEffect effect = MobEffects.LEVITATION;
				MobEffectInstance instance = new MobEffectInstance(effect,-1,2,false,false,false);

				balloon.addEffect(instance);

				//instance.applyEffect(balloon);


				//effect.applyEffectTick(balloon,10);


			LOGGER.info(balloon.getActiveEffects().toString());
				//LOGGER.info();

				//balloon.addEffect()
				//double x = context.getClickedPos().getX();
				//double y = context.getClickedPos().getY();
				//double z = context.getClickedPos().getZ();

				//customEntity.teleportTo(x,y,z);
				//context.getLevel().addFreshEntity(customEntity);
				//LOGGER.info(context.getLevel().getBlockState(context.getClickedPos()).getBlock().asItem().getDescriptionId().replace("block.","").replace(".",":"));
			} else {
				LOGGER.info("Clicked on air");
			}
		}

		return super.useOn(context);
	}
}
