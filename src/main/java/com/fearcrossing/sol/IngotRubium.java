package com.fearcrossing.sol;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class IngotRubium extends Item
	{
	public IngotRubium()
	{	
		
		setUnlocalizedName(Reference.MODID + "_" + "ingotRubium");
		setCreativeTab(CreativeTabs.tabMaterials);
	}
}