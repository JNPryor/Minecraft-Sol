package com.fearcrossing.sol;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.LanguageRegistry;


@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class Sol
{
	public static Item ingotRubium;
	public static Item gemRuby;
	public static Item ingotTitanium;
	public static Block oreRuby;
	public static Block oreTitanium;
	{
		//Blocks
		//oreRuby = new OreRuby();
		//oreTitanium = new OreTitanium();
		//GameRegistry.registerBlock(oreRuby, "oreRuby");
		//GameRegistry.registerBlock(oreTitanium, "oreTitanium");
		
		//Items
		ingotRubium = new IngotRubium();
		gemRuby = new GemRuby();
		ingotTitanium = new IngotTitanium();
		GameRegistry.registerItem(gemRuby, "gemRuby");
		GameRegistry.registerItem(ingotTitanium, "ingotTitanium");
		GameRegistry.registerItem(ingotRubium, "ingotRubium");
		LanguageRegistry.addName(ingotRubium, "Rubium Ingot");
		LanguageRegistry.addName(gemRuby, "Ruby Gem");
		LanguageRegistry.addName(ingotTitanium, "Titanium Ingot");
		
		//Crafting
		GameRegistry.addShapelessRecipe(new ItemStack(ingotRubium), new Object[]
				{
				    	new ItemStack(gemRuby), ingotTitanium
				});
	}
}