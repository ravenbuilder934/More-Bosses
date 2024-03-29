package com.unnamedmodding.unnamedbosses.entities.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ModelYeti<T extends YetiEntity> extends EntityModel<T>
{
    private final ModelRenderer head;
    private final ModelRenderer torso;
    private final ModelRenderer torso2;
    private final ModelRenderer torso3;
    private final ModelRenderer torso4;
    private final ModelRenderer spikes;
    private final ModelRenderer spike1;
    private final ModelRenderer top;
    private final ModelRenderer bottom;
    private final ModelRenderer spike2;
    private final ModelRenderer top2;
    private final ModelRenderer bottom2;
    private final ModelRenderer spike3;
    private final ModelRenderer top3;
    private final ModelRenderer bottom3;
    private final ModelRenderer spike4;
    private final ModelRenderer top4;
    private final ModelRenderer bottom4;

    public ModelYeti()
    {
        texWidth = 64;
        texHeight = 32;

        head = new ModelRenderer(this);
        head.setPos(0.0F, 0.0F, 0.0F);
        head.texOffs(0, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
        head.texOffs(32, 0).addBox(-3.5F, -3.5F, -3.5F, 7.0F, 7.0F, 7.0F, 0.0F, false);

        torso = new ModelRenderer(this);
        torso.setPos(0.0F, 4.0F, 2.0F);
        head.addChild(torso);
        torso.texOffs(36, 14).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        torso.texOffs(36, 20).addBox(-4.0F, 2.0F, -3.0F, 8.0F, 2.0F, 4.0F, -0.01F, false);

        torso2 = new ModelRenderer(this);
        torso2.setPos(0.0F, 4.0F, 0.0F);
        torso.addChild(torso2);
        torso2.texOffs(36, 14).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        torso2.texOffs(36, 20).addBox(-4.0F, 2.0F, -3.0F, 8.0F, 2.0F, 4.0F, -0.01F, false);

        torso3 = new ModelRenderer(this);
        torso3.setPos(0.0F, 4.0F, 0.0F);
        torso2.addChild(torso3);
        torso3.texOffs(36, 14).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        torso4 = new ModelRenderer(this);
        torso4.setPos(0.0F, 4.0F, 0.0F);
        torso3.addChild(torso4);
        torso4.texOffs(36, 14).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        spikes = new ModelRenderer(this);
        spikes.setPos(0.0F, 12.0F, 0.0F);
        setRotationAngle(spikes, 0.0F, -0.7854F, 0.0F);


        spike1 = new ModelRenderer(this);
        spike1.setPos(0.0F, 0.0F, 0.0F);
        spikes.addChild(spike1);
        spike1.texOffs(12, 16).addBox(-2.0F, -4.0F, -10.0F, 4.0F, 8.0F, 2.0F, 0.0F, false);

        top = new ModelRenderer(this);
        top.setPos(0.0F, -4.0F, -10.0F);
        spike1.addChild(top);
        setRotationAngle(top, -0.2618F, 0.0F, 0.0F);
        top.texOffs(0, 16).addBox(-2.0F, -8.0F, 0.0F, 4.0F, 8.0F, 2.0F, -0.01F, false);

        bottom = new ModelRenderer(this);
        bottom.setPos(0.0F, 4.0F, -10.0F);
        spike1.addChild(bottom);
        setRotationAngle(bottom, 0.2618F, 0.0F, 0.0F);
        bottom.texOffs(24, 16).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 8.0F, 2.0F, -0.01F, false);

        spike2 = new ModelRenderer(this);
        spike2.setPos(0.0F, 0.0F, 0.0F);
        spikes.addChild(spike2);
        setRotationAngle(spike2, 0.0F, -1.5708F, 0.0F);
        spike2.texOffs(12, 16).addBox(-2.0F, -4.0F, -10.0F, 4.0F, 8.0F, 2.0F, 0.0F, false);

        top2 = new ModelRenderer(this);
        top2.setPos(0.0F, -4.0F, -10.0F);
        spike2.addChild(top2);
        setRotationAngle(top2, -0.2618F, 0.0F, 0.0F);
        top2.texOffs(0, 16).addBox(-2.0F, -8.0F, 0.0F, 4.0F, 8.0F, 2.0F, -0.01F, false);

        bottom2 = new ModelRenderer(this);
        bottom2.setPos(0.0F, 4.0F, -10.0F);
        spike2.addChild(bottom2);
        setRotationAngle(bottom2, 0.2618F, 0.0F, 0.0F);
        bottom2.texOffs(24, 16).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 8.0F, 2.0F, -0.01F, false);

        spike3 = new ModelRenderer(this);
        spike3.setPos(0.0F, 0.0F, 0.0F);
        spikes.addChild(spike3);
        setRotationAngle(spike3, 0.0F, 3.1416F, 0.0F);
        spike3.texOffs(12, 16).addBox(-2.0F, -4.0F, -10.0F, 4.0F, 8.0F, 2.0F, 0.0F, false);

        top3 = new ModelRenderer(this);
        top3.setPos(0.0F, -4.0F, -10.0F);
        spike3.addChild(top3);
        setRotationAngle(top3, -0.2618F, 0.0F, 0.0F);
        top3.texOffs(0, 16).addBox(-2.0F, -8.0F, 0.0F, 4.0F, 8.0F, 2.0F, -0.01F, false);

        bottom3 = new ModelRenderer(this);
        bottom3.setPos(0.0F, 4.0F, -10.0F);
        spike3.addChild(bottom3);
        setRotationAngle(bottom3, 0.2618F, 0.0F, 0.0F);
        bottom3.texOffs(24, 16).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 8.0F, 2.0F, -0.01F, false);

        spike4 = new ModelRenderer(this);
        spike4.setPos(0.0F, 0.0F, 0.0F);
        spikes.addChild(spike4);
        setRotationAngle(spike4, 0.0F, 1.5708F, 0.0F);
        spike4.texOffs(12, 16).addBox(-2.0F, -4.0F, -10.0F, 4.0F, 8.0F, 2.0F, 0.0F, false);

        top4 = new ModelRenderer(this);
        top4.setPos(0.0F, -4.0F, -10.0F);
        spike4.addChild(top4);
        setRotationAngle(top4, -0.2618F, 0.0F, 0.0F);
        top4.texOffs(0, 16).addBox(-2.0F, -8.0F, 0.0F, 4.0F, 8.0F, 2.0F, -0.01F, false);

        bottom4 = new ModelRenderer(this);
        bottom4.setPos(0.0F, 4.0F, -10.0F);
        spike4.addChild(bottom4);
        setRotationAngle(bottom4, 0.2618F, 0.0F, 0.0F);
        bottom4.texOffs(24, 16).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 8.0F, 2.0F, -0.01F, false);
    }

    @Override
    public void setupAnim(T p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_) {

    }


    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha)
    {
        head.render(matrixStack, buffer, packedLight, packedOverlay);
        spikes.render(matrixStack, buffer, packedLight, packedOverlay);
        spike1.render(matrixStack, buffer, packedLight, packedOverlay);
        top.render(matrixStack, buffer, packedLight, packedOverlay);
        bottom.render(matrixStack, buffer, packedLight, packedOverlay);
        spike2.render(matrixStack, buffer, packedLight, packedOverlay);
        top2.render(matrixStack, buffer, packedLight, packedOverlay);
        bottom2.render(matrixStack, buffer, packedLight, packedOverlay);
        spike3.render(matrixStack, buffer, packedLight, packedOverlay);
        top3.render(matrixStack, buffer, packedLight, packedOverlay);
        bottom3.render(matrixStack, buffer, packedLight, packedOverlay);
        spike4.render(matrixStack, buffer, packedLight, packedOverlay);
        top4.render(matrixStack, buffer, packedLight, packedOverlay);
        bottom4.render(matrixStack, buffer, packedLight, packedOverlay);
        torso.render(matrixStack, buffer, packedLight, packedOverlay);
        torso2.render(matrixStack, buffer, packedLight, packedOverlay);
        torso3.render(matrixStack, buffer, packedLight, packedOverlay);
        torso4.render(matrixStack, buffer, packedLight, packedOverlay);
    }



    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z)
    {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }


}