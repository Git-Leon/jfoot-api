package com.github.git_leon.jfoot.sprite.temporal;

import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class TimedAbility<FirstArgumentType, SecondArgumentType, ReturnType> {

    private final Supplier<ReturnType> supplier;
    private CountDown countDown;

    public TimedAbility(
            Supplier<ReturnType> ability, double coolDownInSeconds) {
        this.supplier = ability;
        this.countDown = new CountDown((long) (coolDownInSeconds * 1000));
    }


    public TimedAbility(
            Supplier<ReturnType> ability) {
        this(ability, 2.0);
    }

    public TimedAbility(
            BiFunction<FirstArgumentType, SecondArgumentType, ReturnType> ability,
            FirstArgumentType firstArgument,
            SecondArgumentType secondArgument) {
        this(() -> ability.apply(firstArgument, secondArgument));
    }

    public TimedAbility(
            Function<FirstArgumentType, ReturnType> ability,
            FirstArgumentType firstArgument) {
        this(() -> ability.apply(firstArgument));
    }



    public TimedAbility(
            Consumer<FirstArgumentType> ability,
            FirstArgumentType firstArgument) {
        this(() -> ability.accept(firstArgument));
    }

    public TimedAbility(Runnable ability) {
        this(() -> {
            ability.run();
            return null;
        });
    }

    public Optional<ReturnType> perform() {
        Optional<ReturnType> optionalReturnValue = Optional.empty();
        if (!countDown.isRunning()) {
            this.countDown = countDown.clone();
            optionalReturnValue = Optional.of(supplier.get());
        }
        return optionalReturnValue;
    }
}
