package com.MemoryGame.MemoryGame.POJO;

import com.MemoryGame.MemoryGame.DTO.GuessRequest;
import com.MemoryGame.MemoryGame.DTO.GuessResponse;
import lombok.Getter;


import java.util.HashMap;
import java.util.Objects;
import java.util.Random;


public class GameState {

    @Getter
    private  String[][] elements = new String[10][10];

    private HashMap<String, Integer> ElementType = new HashMap<String, Integer>();
    private Boolean SomethingWentWrong = false;
    private int SomethingWentWrongCounter = 0;
    private String artifact = "";
    private void ElementTypeInitialization(){
        ElementType.put("leaf",2);
        ElementType.put("carrot",2);
        ElementType.put("melon",2);
        ElementType.put("lemon",2);
        ElementType.put("orange",2);
        ElementType.put("apple",2);
        ElementType.put("banana",2);
        ElementType.put("tomato",2);
        ElementType.put("onion",2);
        ElementType.put("avocado",2);
        ElementType.put("beet",2);
        ElementType.put("celery",2);
        ElementType.put("corn",2);
        ElementType.put("cucumber",2);
        ElementType.put("leeks",2);
        ElementType.put("mushroom",2);
        ElementType.put("peppers",2);
        ElementType.put("potato",2);
        ElementType.put("spinach",2);
        ElementType.put("zucchini",2);
        ElementType.put("squash",2);
        ElementType.put("peas",2);
        ElementType.put("radish",2);
        ElementType.put("radicchio",2);
        ElementType.put("rutabaga",2);
        ElementType.put("blackberry",2);
        ElementType.put("blueberry",2);
        ElementType.put("cherry",2);
        ElementType.put("grapefruit",2);
        ElementType.put("mandarin",2);
        ElementType.put("papaya",2);
        ElementType.put("pear",2);
        ElementType.put("pineapple",2);
        ElementType.put("strawberry",2);
        ElementType.put("peach",2);
        ElementType.put("guava",2);
        ElementType.put("currants",2);
        ElementType.put("figs",2);
        ElementType.put("boysenberry",2);
        ElementType.put("kiwi",2);
        ElementType.put("lime",2);
        ElementType.put("raspberries",2);
        ElementType.put("pomegranate",2);
        ElementType.put("persimmon",2);
        ElementType.put("cabbage",2);
        ElementType.put("celeriac",2);
        ElementType.put("cress",2);
        ElementType.put("garlic",2);
        ElementType.put("greens",2);
        ElementType.put("lettuce",2);
    }

    private void ElementTypeClear(){
        ElementType.clear();
    }

    private void ElementInitialization(int width, int height){

        int RandomNumberGenerated;
        String Element;
        ElementTypeClear();
        ElementTypeInitialization();
        Random random = new Random();


        if(width * height % 2 != 0)
            elements[0][0] = "X";

        for(int i=0;i< width;i++) {

            for (int j = (i == 0 ? ((width * height % 2 == 0) ? 0 : 1) : 0); j < height; j++) {
                while (true) {
                    RandomNumberGenerated = random.nextInt(width * height / 2) + 1;
                    if (ElementType.get("leaf") != 0 && RandomNumberGenerated == 1) {
                        Element = "leaf";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("carrot") != 0 && RandomNumberGenerated == 2) {
                        Element = "carrot";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("melon") != 0 && RandomNumberGenerated == 3) {
                        Element = "melon";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("lemon") != 0 && RandomNumberGenerated == 4) {
                        Element = "lemon";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("orange") != 0 && RandomNumberGenerated == 5) {
                        Element = "orange";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("apple") != 0 && RandomNumberGenerated == 6) {
                        Element = "apple";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("banana") != 0 && RandomNumberGenerated == 7) {
                        Element = "banana";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("tomato") != 0 && RandomNumberGenerated == 8) {
                        Element = "tomato";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("onion") != 0 && RandomNumberGenerated == 9) {
                        Element = "onion";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("avocado") != 0 && RandomNumberGenerated == 10) {
                        Element = "avocado";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("beet") != 0 && RandomNumberGenerated == 11) {
                        Element = "beet";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("celery") != 0 && RandomNumberGenerated == 12) {
                        Element = "celery";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("corn") != 0 && RandomNumberGenerated == 13) {
                        Element = "corn";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("cucumber") != 0 && RandomNumberGenerated == 14) {
                        Element = "cucumber";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("leeks") != 0 && RandomNumberGenerated == 15) {
                        Element = "leeks";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("mushroom") != 0 && RandomNumberGenerated == 16) {
                        Element = "mushroom";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("peppers") != 0 && RandomNumberGenerated == 17) {
                        Element = "peppers";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("potato") != 0 && RandomNumberGenerated == 18) {
                        Element = "potato";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("spinach") != 0 && RandomNumberGenerated == 19) {
                        Element = "spinach";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("zucchini") != 0 && RandomNumberGenerated == 20) {
                        Element = "zucchini";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("squash") != 0 && RandomNumberGenerated == 21) {
                        Element = "squash";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("peas") != 0 && RandomNumberGenerated == 22) {
                        Element = "peas";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("radish") != 0 && RandomNumberGenerated == 23) {
                        Element = "radish";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("radicchio") != 0 && RandomNumberGenerated == 24) {
                        Element = "radicchio";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("rutabaga") != 0 && RandomNumberGenerated == 25) {
                        Element = "rutabaga";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("blackberry") != 0 && RandomNumberGenerated == 26) {
                        Element = "blackberry";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("blueberry") != 0 && RandomNumberGenerated == 27) {
                        Element = "blueberry";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("cherry") != 0 && RandomNumberGenerated == 28) {
                        Element = "cherry";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("grapefruit") != 0 && RandomNumberGenerated == 29) {
                        Element = "grapefruit";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("mandarin") != 0 && RandomNumberGenerated == 30) {
                        Element = "mandarin";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("papaya") != 0 && RandomNumberGenerated == 31) {
                        Element = "papaya";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("pear") != 0 && RandomNumberGenerated == 32) {
                        Element = "pear";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("pineapple") != 0 && RandomNumberGenerated == 33) {
                        Element = "pineapple";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("strawberry") != 0 && RandomNumberGenerated == 34) {
                        Element = "strawberry";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("peach") != 0 && RandomNumberGenerated == 35) {
                        Element = "peach";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("guava") != 0 && RandomNumberGenerated == 36) {
                        Element = "guava";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("currants") != 0 && RandomNumberGenerated == 37) {
                        Element = "currants";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("figs") != 0 && RandomNumberGenerated == 38) {
                        Element = "figs";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("boysenberry") != 0 && RandomNumberGenerated == 39) {
                        Element = "boysenberry";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("kiwi") != 0 && RandomNumberGenerated == 40) {
                        Element = "kiwi";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("lime") != 0 && RandomNumberGenerated == 41) {
                        Element = "lime";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("raspberries") != 0 && RandomNumberGenerated == 42) {
                        Element = "raspberries";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("pomegranate") != 0 && RandomNumberGenerated == 43) {
                        Element = "pomegranate";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("persimmon") != 0 && RandomNumberGenerated == 44) {
                        Element = "persimmon";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("cabbage") != 0 && RandomNumberGenerated == 45) {
                        Element = "cabbage";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("celeriac") != 0 && RandomNumberGenerated == 46) {
                        Element = "celeriac";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("cress") != 0 && RandomNumberGenerated == 47) {
                        Element = "cress";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("garlic") != 0 && RandomNumberGenerated == 48) {
                        Element = "garlic";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("greens") != 0 && RandomNumberGenerated == 49) {
                        Element = "greens";
                        SomethingWentWrongCounter=0;
                        break;
                    } else if (ElementType.get("lettuce") != 0 && RandomNumberGenerated == 50) {
                        Element = "lettuce";
                        SomethingWentWrongCounter=0;
                        break;
                    }
                    else if(SomethingWentWrongCounter>50)
                    {
                        Element = "Error";
                        SomethingWentWrong = true;
                        break;
                    }
                }


                System.out.println(RandomNumberGenerated);
                switch (Element) {
                    case "leaf":
                        elements[i][j] = "leaf";
                        ElementType.replace("leaf", ElementType.get("leaf") - 1);
                        break;
                    case "carrot":
                        elements[i][j] = "carrot";
                        ElementType.replace("carrot", ElementType.get("carrot") - 1);
                        break;
                    case "melon":
                        elements[i][j] = "melon";
                        ElementType.replace("melon", ElementType.get("melon") - 1);
                        break;
                    case "lemon":
                        elements[i][j] = "lemon";
                        ElementType.replace("lemon", ElementType.get("lemon") - 1);
                        break;
                    case "orange":
                        elements[i][j] = "orange";
                        ElementType.replace("orange", ElementType.get("orange") - 1);
                        break;
                    case "apple":
                        elements[i][j] = "apple";
                        ElementType.replace("apple", ElementType.get("apple") - 1);
                        break;
                    case "banana":
                        elements[i][j] = "banana";
                        ElementType.replace("banana", ElementType.get("banana") - 1);
                        break;
                    case "tomato":
                        elements[i][j] = "tomato";
                        ElementType.replace("tomato", ElementType.get("tomato") - 1);
                        break;
                    case "onion":
                        elements[i][j] = "onion";
                        ElementType.replace("onion", ElementType.get("onion") - 1);
                        break;
                    case "avocado":
                        elements[i][j] = "avocado";
                        ElementType.replace("avocado", ElementType.get("avocado") - 1);
                        break;
                    case "beet":
                        elements[i][j] = "beet";
                        ElementType.replace("beet", ElementType.get("beet") - 1);
                        break;
                    case "celery":
                        elements[i][j] = "celery";
                        ElementType.replace("celery", ElementType.get("celery") - 1);
                        break;
                    case "corn":
                        elements[i][j] = "corn";
                        ElementType.replace("corn", ElementType.get("corn") - 1);
                        break;
                    case "cucumber":
                        elements[i][j] = "cucumber";
                        ElementType.replace("cucumber", ElementType.get("cucumber") - 1);
                        break;
                    case "leeks":
                        elements[i][j] = "leeks";
                        ElementType.replace("leeks", ElementType.get("leeks") - 1);
                        break;
                    case "mushroom":
                        elements[i][j] = "mushroom";
                        ElementType.replace("mushroom", ElementType.get("mushroom") - 1);
                        break;
                    case "peppers":
                        elements[i][j] = "peppers";
                        ElementType.replace("peppers", ElementType.get("peppers") - 1);
                        break;
                    case "potato":
                        elements[i][j] = "potato";
                        ElementType.replace("potato", ElementType.get("potato") - 1);
                        break;
                    case "spinach":
                        elements[i][j] = "spinach";
                        ElementType.replace("spinach", ElementType.get("spinach") - 1);
                        break;
                    case "zucchini":
                        elements[i][j] = "zucchini";
                        ElementType.replace("zucchini", ElementType.get("zucchini") - 1);
                        break;
                    case "squash":
                        elements[i][j] = "squash";
                        ElementType.replace("squash", ElementType.get("squash") - 1);
                        break;
                    case "peas":
                        elements[i][j] = "peas";
                        ElementType.replace("peas", ElementType.get("peas") - 1);
                        break;
                    case "radish":
                        elements[i][j] = "radish";
                        ElementType.replace("radish", ElementType.get("radish") - 1);
                        break;
                    case "radicchio":
                        elements[i][j] = "radicchio";
                        ElementType.replace("radicchio", ElementType.get("radicchio") - 1);
                        break;
                    case "rutabaga":
                        elements[i][j] = "rutabaga";
                        ElementType.replace("rutabaga", ElementType.get("rutabaga") - 1);
                        break;
                    case "blackberry":
                        elements[i][j] = "blackberry";
                        ElementType.replace("blackberry", ElementType.get("blackberry") - 1);
                        break;
                    case "blueberry":
                        elements[i][j] = "blueberry";
                        ElementType.replace("blueberry", ElementType.get("blueberry") - 1);
                        break;
                    case "cherry":
                        elements[i][j] = "cherry";
                        ElementType.replace("cherry", ElementType.get("cherry") - 1);
                        break;
                    case "grapefruit":
                        elements[i][j] = "grapefruit";
                        ElementType.replace("grapefruit", ElementType.get("grapefruit") - 1);
                        break;
                    case "mandarin":
                        elements[i][j] = "mandarin";
                        ElementType.replace("mandarin", ElementType.get("mandarin") - 1);
                        break;
                    case "papaya":
                        elements[i][j] = "papaya";
                        ElementType.replace("papaya", ElementType.get("papaya") - 1);
                        break;
                    case "pear":
                        elements[i][j] = "pear";
                        ElementType.replace("pear", ElementType.get("pear") - 1);
                        break;
                    case "pineapple":
                        elements[i][j] = "pineapple";
                        ElementType.replace("pineapple", ElementType.get("pineapple") - 1);
                        break;
                    case "strawberry":
                        elements[i][j] = "strawberry";
                        ElementType.replace("strawberry", ElementType.get("strawberry") - 1);
                        break;
                    case "peach":
                        elements[i][j] = "peach";
                        ElementType.replace("peach", ElementType.get("peach") - 1);
                        break;
                    case "guava":
                        elements[i][j] = "guava";
                        ElementType.replace("guava", ElementType.get("guava") - 1);
                        break;
                    case "currants":
                        elements[i][j] = "currants";
                        ElementType.replace("currants", ElementType.get("currants") - 1);
                        break;
                    case "figs":
                        elements[i][j] = "figs";
                        ElementType.replace("figs", ElementType.get("figs") - 1);
                        break;
                    case "boysenberry":
                        elements[i][j] = "boysenberry";
                        ElementType.replace("boysenberry", ElementType.get("boysenberry") - 1);
                        break;
                    case "kiwi":
                        elements[i][j] = "kiwi";
                        ElementType.replace("kiwi", ElementType.get("kiwi") - 1);
                        break;
                    case "lime":
                        elements[i][j] = "lime";
                        ElementType.replace("lime", ElementType.get("lime") - 1);
                        break;
                    case "raspberries":
                        elements[i][j] = "raspberries";
                        ElementType.replace("raspberries", ElementType.get("raspberries") - 1);
                        break;
                    case "pomegranate":
                        elements[i][j] = "pomegranate";
                        ElementType.replace("pomegranate", ElementType.get("pomegranate") - 1);
                        break;
                    case "persimmon":
                        elements[i][j] = "persimmon";
                        ElementType.replace("persimmon", ElementType.get("persimmon") - 1);
                        break;
                    case "cabbage":
                        elements[i][j] = "cabbage";
                        ElementType.replace("cabbage", ElementType.get("cabbage") - 1);
                        break;
                    case "celeriac":
                        elements[i][j] = "celeriac";
                        ElementType.replace("celeriac", ElementType.get("celeriac") - 1);
                        break;
                    case "cress":
                        elements[i][j] = "cress";
                        ElementType.replace("cress", ElementType.get("cress") - 1);
                        break;
                    case "garlic":
                        elements[i][j] = "garlic";
                        ElementType.replace("garlic", ElementType.get("garlic") - 1);
                        break;
                    case "greens":
                        elements[i][j] = "greens";
                        ElementType.replace("greens", ElementType.get("greens") - 1);
                        break;
                    case "lettuce":
                        elements[i][j] = "lettuce";
                        ElementType.replace("lettuce", ElementType.get("lettuce") - 1);
                        break;
                    default:
                        break;


                }


            }
        }
    }



    public GameState(int row, int column){
        ElementInitialization(row,column);
    }


    public GuessResponse getElementByWidthAndHeight(GuessRequest guessRequest) {
        GuessResponse guessResponse = new GuessResponse();
        guessResponse.setGuess1(elements[guessRequest.getColumnCard1()][guessRequest.getRowCard1()]);
        guessResponse.setGuess2(elements[guessRequest.getColumnCard2()][guessRequest.getRowCard2()]);

        if(Objects.equals(guessResponse.getGuess1(), guessResponse.getGuess2()))
            guessResponse.setIsCorrect(true);
        else guessResponse.setIsCorrect(false);
        return guessResponse;
    }


}
