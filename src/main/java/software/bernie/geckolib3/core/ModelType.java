package software.bernie.geckolib3.core;

import com.eliotlash.molang.MolangParser;

import software.bernie.geckolib3.core.builder.Animation;
import software.bernie.geckolib3.core.manager.Animator;
import software.bernie.geckolib3.core.processor.BoneTree;

public interface ModelType<E> {
	Animator<E> getOrCreateAnimator(E entity);

	BoneTree<?> getOrCreateBoneTree(E entity);

	Animation getAnimation(E entity, String animationName);

	void setMolangQueries(E object, MolangParser parser, double renderTime);
}
