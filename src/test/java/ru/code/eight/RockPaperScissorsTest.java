package ru.code.eight;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RockPaperScissorsTest {
    @Test
    public void test1() {
        System.out.println("Fixed Tests Player 1 won!");
        assertThat("Player 1 won!").isEqualTo(RockPaperScissors.rps("rock", "scissors"));
        assertThat("Player 1 won!").isEqualTo(RockPaperScissors.rps("scissors", "paper"));
        assertThat("Player 1 won!").isEqualTo(RockPaperScissors.rps("paper", "rock"));
    }

    @Test
    public void test2() {
        System.out.println("Fixed Tests Player 2 won!");
        assertThat("Player 2 won!").isEqualTo(RockPaperScissors.rps("scissors", "rock"));
        assertThat("Player 2 won!").isEqualTo(RockPaperScissors.rps("paper", "scissors"));
        assertThat("Player 2 won!").isEqualTo(RockPaperScissors.rps("rock", "paper"));
    }

    @Test
    public void test3() {
        System.out.println("Fixed Tests Draw!");
        assertThat("Draw!").isEqualTo(RockPaperScissors.rps("scissors", "scissors"));
        assertThat("Draw!").isEqualTo(RockPaperScissors.rps("paper", "paper"));
        assertThat("Draw!").isEqualTo(RockPaperScissors.rps("rock", "rock"));
    }

}