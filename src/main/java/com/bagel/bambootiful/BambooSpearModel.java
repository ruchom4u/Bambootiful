package com.bagel.bambootiful;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;

public class BambooSpearModel extends Model {
	public static final ResourceLocation TEXTURE_LOCATION = new ResourceLocation("bambootiful:textures/entity/bamboo_spear.png");
	private final ModelRenderer modelRenderer = new ModelRenderer(32, 32, 0, 6);

	public BambooSpearModel() {

		      super(RenderType::func_228634_a_);
		      this.modelRenderer.func_228301_a_(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F, 0.0F);
		      ModelRenderer modelrenderer = new ModelRenderer(32, 32, 4, 0);
		      modelrenderer.func_228300_a_(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F);
		      this.modelRenderer.addChild(modelrenderer);
		      ModelRenderer modelrenderer1 = new ModelRenderer(32, 32, 4, 3);
		      modelrenderer1.func_228300_a_(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F);
		      this.modelRenderer.addChild(modelrenderer1);
		      ModelRenderer modelrenderer2 = new ModelRenderer(32, 32, 0, 0);
		      modelrenderer2.func_228301_a_(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F);
		      this.modelRenderer.addChild(modelrenderer2);
		      ModelRenderer modelrenderer3 = new ModelRenderer(32, 32, 4, 3);
		      modelrenderer3.mirror = true;
		      modelrenderer3.func_228300_a_(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F);
		      this.modelRenderer.addChild(modelrenderer3);
		   }	
/*
		handle = new ModelRenderer(this);
		handle.setRotationPoint(0.5F, 24.0F, 0.5F);
		setRotationAngle(handle, 0.0F, -1.5708F, 0.0F);
		handle.cubeList.add(new ModelBox(handle, 0, 0, -1.0F, -28.0F, 0.0F, 1, 28, 1, 0.0F, false));
		handle.cubeList.add(new ModelBox(handle, 4, 4, -4.0F, -30.0F, 0.0F, 6, 1, 1, 0.0F, false));
		handle.cubeList.add(new ModelBox(handle, 10, 6, -1.75F, -29.0F, 0.0F, 3, 1, 1, 0.0F, false));

		head1 = new ModelRenderer(this);
		head1.setRotationPoint(1.0F, -31.0F, 1.0F);
		handle.addChild(head1);
		head1.cubeList.add(new ModelBox(head1, 12, 0, 0.0F, -2.0F, -1.0F, 1, 3, 1, 0.0F, false));

		leaf1 = new ModelRenderer(this);
		leaf1.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(leaf1, 0.0F, 0.0F, -0.3491F);
		head1.addChild(leaf1);
		leaf1.cubeList.add(new ModelBox(leaf1, 10, 10, 0.6F, -1.5F, -0.5F, 4, 3, 0, 0.0F, false));

		head2 = new ModelRenderer(this);
		head2.setRotationPoint(-2.0F, -31.0F, 0.0F);
		setRotationAngle(head2, 0.0F, 0.0F, -0.7854F);
		handle.addChild(head2);

		head3 = new ModelRenderer(this);
		head3.setRotationPoint(-2.0F, -31.0F, 0.0F);
		handle.addChild(head3);
		head3.cubeList.add(new ModelBox(head3, 13, 14, -1.0F, -2.0F, 0.0F, 1, 1, 1, 0.0F, false));
		head3.cubeList.add(new ModelBox(head3, 4, 12, -1.0F, -1.0F, 0.0F, 2, 2, 1, 0.0F, false));

		head4 = new ModelRenderer(this);
		head4.setRotationPoint(0.0F, 0.0F, 0.0F);
		handle.addChild(head4);
		head4.cubeList.add(new ModelBox(head4, 4, 6, -1.0F, -35.0F, 0.0F, 2, 5, 1, 0.0F, false));
		head4.cubeList.add(new ModelBox(head4, 10, 13, -1.0F, -36.0F, 0.0F, 1, 1, 1, 0.0F, false));

		leaf2 = new ModelRenderer(this);
		leaf2.setRotationPoint(-1.0F, -19.0F, 0.0F);
		setRotationAngle(leaf2, 0.0F, 0.0F, 0.3491F);
		handle.addChild(leaf2);
		leaf2.cubeList.add(new ModelBox(leaf2, 4, 0, -3.7F, -2.0F, 0.5F, 4, 3, 0, 0.0F, false));
		*/

	@Override
	public void func_225598_a_(MatrixStack p_225598_1_, IVertexBuilder p_225598_2_, int p_225598_3_, int p_225598_4_, float p_225598_5_, float p_225598_6_, float p_225598_7_, float p_225598_8_) {
		this.modelRenderer.func_228309_a_(p_225598_1_, p_225598_2_, p_225598_3_, p_225598_4_, p_225598_5_, p_225598_6_, p_225598_7_, p_225598_8_);	
	}
}