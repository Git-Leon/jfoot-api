package com.github.git_leon.jfoot.sprite.items.weapon.projectile;

import com.github.git_leon.jfoot.sprite.items.weapon.WeaponInterface;

public interface ProjectileInterface extends WeaponInterface {
    void setSpeed(int speed);
    int getSpeed();
}
