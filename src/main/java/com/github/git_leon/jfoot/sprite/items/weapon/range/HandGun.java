package com.github.git_leon.jfoot.sprite.items.weapon.range;

import com.github.git_leon.jfoot.sprite.temporal.TimedAbility;
import com.github.git_leon.jfoot.sprite.Sprite;
import com.github.git_leon.jfoot.sprite.items.weapon.projectile.Projectile;

import java.util.Optional;

public class HandGun {
    private FullyAutomaticGun gun;
    private Integer bulletSpeed;
    private Double coolDownInSeconds;
    private TimedAbility<Integer, Void, Projectile> gunShot;

    public HandGun(Sprite gunner) {
        this.gun = new FullyAutomaticGun(gunner);
        this.bulletSpeed = 5;
        this.coolDownInSeconds = 2.0;
        this.gunShot = new TimedAbility<>(() -> gun.shoot(bulletSpeed), coolDownInSeconds);
    }

    public Optional<Projectile> shoot() {
        return gunShot.perform();
    }

    public void setBulletSpeed(Integer bulletSpeed) {
        this.bulletSpeed = bulletSpeed;
    }

    public void setCoolDownInSeconds(Double coolDownInSeconds) {
        this.coolDownInSeconds = coolDownInSeconds;
    }

    private void upgrade() {
        this.gunShot = new TimedAbility<>(() -> gun.shoot(this.bulletSpeed), this.coolDownInSeconds);
    }
}
