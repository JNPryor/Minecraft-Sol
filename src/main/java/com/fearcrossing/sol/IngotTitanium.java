package com.fearcrossing.sol;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class IngotTitanium extends Item
		{
		public IngotTitanium()
		{	
			
			setUnlocalizedName(Reference.MODID + "_" + "ingotTitanium");
			setCreativeTab(CreativeTabs.tabMaterials);
		}
	}