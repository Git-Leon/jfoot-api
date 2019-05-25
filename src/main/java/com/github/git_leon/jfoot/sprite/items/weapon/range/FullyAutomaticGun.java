package com.github.git_leon.jfoot.sprite.items.weapon.range;

import com.github.git_leon.jfoot.sprite.Sprite;
import com.github.git_leon.jfoot.sprite.SpriteCreatorRemover;
import com.github.git_leon.jfoot.sprite.items.weapon.projectile.Bullet;
import com.github.git_leon.jfoot.sprite.items.weapon.projectile.Projectile;

public class FullyAutomaticGun {
    private SpriteCreatorRemover bulletCreator;

    public FullyAutomaticGun(Sprite gunner) {
        this.bulletCreator = new SpriteCreatorRemover(gunner);
    }

    public Projectile shoot(int bulletSpeed) {
        Projectile projectile = new Bullet();
        projectile.setSpeed(bulletSpeed);
        bulletCreator.add(projectile);
        return projectile;
    }
}
