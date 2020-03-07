package com.javarush.games.snake;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    private static final String HEAD_SIGN = "\uD83D\uDC7E";
    private static final String BODY_SIGN = "\u26AB";

    public boolean isAlive = true;
    private Direction direction = Direction.LEFT;

    private List<GameObject> snakeParts = new ArrayList<>();

    public Snake(int x, int y) {
        GameObject head = new GameObject(x, y);
        GameObject bodyPart1 = new GameObject(x + 1, y);
        GameObject bodyPart2 = new GameObject(x + 2, y);
        snakeParts.add(head);
        snakeParts.add(bodyPart1);
        snakeParts.add(bodyPart2);
    }

    public void setDirection(Direction direction) {
        if (this.direction == Direction.LEFT
                && direction != Direction.RIGHT
                && snakeParts.get(0).y == snakeParts.get(1).y) {
            this.direction = direction;
        }
        if (this.direction == Direction.RIGHT
                && direction != Direction.LEFT
                && snakeParts.get(0).y == snakeParts.get(1).y) {
            this.direction = direction;
        }
        if (this.direction == Direction.UP
                && direction != Direction.DOWN
                && snakeParts.get(0).x == snakeParts.get(1).x) {
            this.direction = direction;
        }
        if (this.direction == Direction.DOWN
                && direction != Direction.UP
                && snakeParts.get(0).x == snakeParts.get(1).x) {
            this.direction = direction;
        }
    }

    public void draw(Game game) {
        for (int i = 0; i < snakeParts.size(); i++) {
            if (i == 0) {
                game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, HEAD_SIGN, isAlive ? Color.BLACK : Color.RED, 75);
            } else {
                game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, BODY_SIGN, isAlive ? Color.BLACK : Color.RED, 75);
            }
        }
    }

    public void move(Apple apple) {
        GameObject head = createNewHead();
        int i = apple.x;
        int j = apple.y;
        if (head.x < 0 || head.x >= SnakeGame.WIDTH || head.y < 0 || head.y >= SnakeGame.HEIGHT) {
            isAlive = false;
        } else if (head.x == i && head.y == j) {
            if (!checkCollision(head)) {
                apple.isAlive = false;
                snakeParts.add(0, head);
            } else {
                this.isAlive = false;
            }
        } else {
            if (!checkCollision(head)) {
                snakeParts.add(0, head);
                removeTail();
            } else {
                this.isAlive = false;
            }
        }
    }

    public GameObject createNewHead() {
        GameObject head = snakeParts.get(0);
        int x = 0, y = 0;
        switch (direction) {
            case LEFT:
                x = head.x - 1;
                y = head.y;
                break;
            case RIGHT:
                x = head.x + 1;
                y = head.y;
                break;
            case UP:
                x = head.x;
                y = head.y - 1;
                break;
            case DOWN:
                x = head.x;
                y = head.y + 1;
                break;
        }
        return new GameObject(x, y);
    }

    public void removeTail() {
        snakeParts.remove(snakeParts.size() - 1);
    }

    public boolean checkCollision(GameObject gameObject) {
        for (GameObject go : snakeParts
        ) {
            if (go.x == gameObject.x && go.y == gameObject.y) {
                return true;
            }
        }
        return false;
    }

    public int getLength() {
        return snakeParts.size();
    }
}
