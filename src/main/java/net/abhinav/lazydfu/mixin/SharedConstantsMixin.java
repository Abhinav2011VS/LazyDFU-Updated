package net.abhinav.lazydfu.mixin;

import net.minecraft.SharedConstants;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(SharedConstants.class)
public class SharedConstantsMixin {
    /**
     * @author Abhinav VS
     * @reason Disables any possibility of enabling DFU "optimizations"
     */
    @Unique
    private static void enableDataFixerOptimizations() {
        // Turn this method into a no-op.
    }
}
