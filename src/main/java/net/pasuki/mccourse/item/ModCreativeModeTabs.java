package net.pasuki.mccourse.item;

//import net.minecraft.core.registries.Registries;
//import net.minecraft.network.chat.Component;
//import net.minecraft.world.item.CreativeModeTab;
//import net.minecraft.world.item.ItemStack;
//import net.minecraftforge.eventbus.api.IEventBus;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.RegistryObject;
//import net.pasuki.mccourse.MCCourseMod;
//import net.pasuki.mccourse.block.ModBlocks;

//public class ModCreativeModeTabs {
 //   public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
//            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MCCourseMod.MOD_ID);
//
//    public static final RegistryObject<CreativeModeTab> COURSE_TAB = CREATIVE_MODE_TABS.register("course_tab",
//            ()-> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALEXANDRITE.get()))
//                    .title(Component.translatable("creativetab.course_tab"))
//                    .displayItems((itemDisplayParameters, output) -> {
//                        output.accept(ModItems.ALEXANDRITE.get());
//
//
//                    }).build());
//
//    public static void register(IEventBus eventBus) {
//        CREATIVE_MODE_TABS.register(eventBus);
//    }
//}
