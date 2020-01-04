package com.bagel.bambootiful;

import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.Entity;

public class BambooSpearModel extends Model {
	private final RendererModel handle;
	private final RendererModel head1;
	private final RendererModel leaf1;
	private final RendererModel head2;
	private final RendererModel head3;
	private final RendererModel head4;
	private final RendererModel leaf2;

	public BambooSpearModel() {
		textureWidth = 32;
		textureHeight = 32;

		handle = new RendererModel(this);
		handle.setRotationPoint(0.5F, 24.0F, 0.5F);
		setRotationAngle(handle, 0.0F, -1.5708F, 0.0F);
		handle.cubeList.add(new ModelBox(handle, 0, 0, -1.0F, -28.0F, 0.0F, 1, 28, 1, 0.0F, false));
		handle.cubeList.add(new ModelBox(handle, 4, 4, -4.0F, -30.0F, 0.0F, 6, 1, 1, 0.0F, false));
		handle.cubeList.add(new ModelBox(handle, 10, 6, -1.75F, -29.0F, 0.0F, 3, 1, 1, 0.0F, false));

		head1 = new RendererModel(this);
		head1.setRotationPoint(1.0F, -31.0F, 1.0F);
		handle.addChild(head1);
		head1.cubeList.add(new ModelBox(head1, 12, 0, 0.0F, -2.0F, -1.0F, 1, 3, 1, 0.0F, false));

		leaf1 = new RendererModel(this);
		leaf1.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(leaf1, 0.0F, 0.0F, -0.3491F);
		head1.addChild(leaf1);
		leaf1.cubeList.add(new ModelBox(leaf1, 10, 10, 0.6F, -1.5F, -0.5F, 4, 3, 0, 0.0F, false));

		head2 = new RendererModel(this);
		head2.setRotationPoint(-2.0F, -31.0F, 0.0F);
		setRotationAngle(head2, 0.0F, 0.0F, -0.7854F);
		handle.addChild(head2);

		head3 = new RendererModel(this);
		head3.setRotationPoint(-2.0F, -31.0F, 0.0F);
		handle.addChild(head3);
		head3.cubeList.add(new ModelBox(head3, 13, 14, -1.0F, -2.0F, 0.0F, 1, 1, 1, 0.0F, false));
		head3.cubeList.add(new ModelBox(head3, 4, 12, -1.0F, -1.0F, 0.0F, 2, 2, 1, 0.0F, false));

		head4 = new RendererModel(this);
		head4.setRotationPoint(0.0F, 0.0F, 0.0F);
		handle.addChild(head4);
		head4.cubeList.add(new ModelBox(head4, 4, 6, -1.0F, -35.0F, 0.0F, 2, 5, 1, 0.0F, false));
		head4.cubeList.add(new ModelBox(head4, 10, 13, -1.0F, -36.0F, 0.0F, 1, 1, 1, 0.0F, false));

		leaf2 = new RendererModel(this);
		leaf2.setRotationPoint(-1.0F, -19.0F, 0.0F);
		setRotationAngle(leaf2, 0.0F, 0.0F, 0.3491F);
		handle.addChild(leaf2);
		leaf2.cubeList.add(new ModelBox(leaf2, 4, 0, -3.7F, -2.0F, 0.5F, 4, 3, 0, 0.0F, false));
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handle.render(f5);
	}
	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	
	public void renderer() {
	      this.handle.render(0.0625F);
	   }
}