package br.com.nomad.batch.utils;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Date;

public class ConverterTeclasEmVK {


    /**Converte string para digitacao do teclado
     *
     * @param character
     * @return
     */
    public  static void EscreverCharacter(char character, Robot pRobot) {



        switch (character) {
            case 'a':  escreverNormal(KeyEvent.VK_A,pRobot); break;
            case 'A':  escreverComShift(KeyEvent.VK_A,pRobot); break;
            case 'b':  escreverNormal(KeyEvent.VK_B,pRobot); break;
            case 'B':  escreverComShift(KeyEvent.VK_B,pRobot); break;
            case 'c':  escreverNormal(KeyEvent.VK_C,pRobot); break;
            case 'C':  escreverComShift(KeyEvent.VK_C,pRobot); break;
            case 'd':  escreverNormal(KeyEvent.VK_D,pRobot); break;
            case 'D':  escreverComShift(KeyEvent.VK_D,pRobot); break;
            case 'e':  escreverNormal(KeyEvent.VK_E,pRobot); break;
            case 'E':  escreverComShift(KeyEvent.VK_E,pRobot); break;
            case 'f':  escreverNormal(KeyEvent.VK_F,pRobot); break;
            case 'F':  escreverComShift(KeyEvent.VK_F,pRobot); break;
            case 'g':  escreverNormal(KeyEvent.VK_G,pRobot); break;
            case 'G':  escreverComShift(KeyEvent.VK_G,pRobot); break;
            case 'h':  escreverNormal(KeyEvent.VK_H,pRobot); break;
            case 'H':  escreverComShift(KeyEvent.VK_H,pRobot); break;
            case 'i':  escreverNormal(KeyEvent.VK_I,pRobot); break;
            case 'I':  escreverComShift(KeyEvent.VK_I,pRobot); break;
            case 'j':  escreverNormal(KeyEvent.VK_J,pRobot); break;
            case 'J':  escreverComShift(KeyEvent.VK_J,pRobot); break;
            case 'k':  escreverNormal(KeyEvent.VK_K,pRobot); break;
            case 'K':  escreverComShift(KeyEvent.VK_K,pRobot); break;
            case 'l':  escreverNormal(KeyEvent.VK_L,pRobot); break;
            case 'L':  escreverComShift(KeyEvent.VK_L,pRobot); break;
            case 'm':  escreverNormal(KeyEvent.VK_M,pRobot); break;
            case 'M':  escreverComShift(KeyEvent.VK_M,pRobot); break;
            case 'n':  escreverNormal(KeyEvent.VK_N,pRobot); break;
            case 'N':  escreverComShift(KeyEvent.VK_N,pRobot); break;
            case 'o':  escreverNormal(KeyEvent.VK_O,pRobot); break;
            case 'O':  escreverComShift(KeyEvent.VK_O,pRobot); break;
            case 'p':  escreverNormal(KeyEvent.VK_P,pRobot); break;
            case 'P':  escreverComShift(KeyEvent.VK_P,pRobot); break;
            case 'q':  escreverNormal(KeyEvent.VK_Q,pRobot); break;
            case 'Q':  escreverComShift(KeyEvent.VK_Q,pRobot); break;
            case 'r':  escreverNormal(KeyEvent.VK_R,pRobot); break;
            case 'R':  escreverComShift(KeyEvent.VK_R,pRobot); break;
            case 's':  escreverNormal(KeyEvent.VK_S,pRobot); break;
            case 'S':  escreverComShift(KeyEvent.VK_S,pRobot); break;
            case 't':  escreverNormal(KeyEvent.VK_T,pRobot); break;
            case 'T':  escreverComShift(KeyEvent.VK_T,pRobot); break;
            case 'u':  escreverNormal(KeyEvent.VK_U,pRobot); break;
            case 'U':  escreverComShift(KeyEvent.VK_U,pRobot); break;
            case 'v':  escreverNormal(KeyEvent.VK_V,pRobot); break;
            case 'V':  escreverComShift(KeyEvent.VK_V,pRobot); break;
            case 'w':  escreverNormal(KeyEvent.VK_W,pRobot); break;
            case 'W':  escreverComShift(KeyEvent.VK_W,pRobot); break;
            case 'x':  escreverNormal(KeyEvent.VK_X,pRobot); break;
            case 'X':  escreverComShift(KeyEvent.VK_X,pRobot); break;
            case 'y':  escreverNormal(KeyEvent.VK_Y,pRobot); break;
            case 'Y':  escreverComShift(KeyEvent.VK_Y,pRobot); break;
            case 'z':  escreverNormal(KeyEvent.VK_Z,pRobot); break;
            case 'Z':  escreverComShift(KeyEvent.VK_Z,pRobot); break;
            //case 'A': doType(VK_SHIFT, VK_A); break;
            case '0':  escreverNormal(KeyEvent.VK_0,pRobot); break;
            case '1':  escreverNormal(KeyEvent.VK_1,pRobot); break;
            case '2':  escreverNormal(KeyEvent.VK_2,pRobot); break;
            case '3':  escreverNormal(KeyEvent.VK_3,pRobot); break;
            case '4':  escreverNormal(KeyEvent.VK_4,pRobot); break;
            case '5':  escreverNormal(KeyEvent.VK_5,pRobot); break;
            case '6':  escreverNormal(KeyEvent.VK_6,pRobot); break;
            case '7':  escreverNormal(KeyEvent.VK_7,pRobot); break;
            case '8':  escreverNormal(KeyEvent.VK_8,pRobot); break;
            case '9':  escreverNormal(KeyEvent.VK_9,pRobot); break;

            case '.':  escreverNormal(KeyEvent.VK_PERIOD,pRobot) ; break;
            case ',':  escreverNormal(KeyEvent.VK_COMMA ,pRobot); break;
            case '_':  escreverComShift(KeyEvent.VK_MINUS,pRobot) ; break;
            case '-':  escreverNormal(KeyEvent.VK_MINUS,pRobot);break;
            case '=':  escreverNormal(KeyEvent.VK_EQUALS,pRobot);break;
            //case '~':  escreverComShift(KeyEvent.VK_CIRCUMFLEX,pRobot);break;
            case '!':  escreverComShift(KeyEvent.VK_1,pRobot);break;
            case '@':  escreverComShift(KeyEvent.VK_2,pRobot);break;
            case '#':  escreverComShift(KeyEvent.VK_3,pRobot);break;
            case '$':  escreverComShift(KeyEvent.VK_4,pRobot);break;
            case '%':  escreverComShift(KeyEvent.VK_5,pRobot);break;
            //case '^':  escreverComShift(KeyEvent.VK_CIRCUMFLEX,pRobot);break;
            case '&':  escreverComShift(KeyEvent.VK_7,pRobot);break;
            case '*':  escreverComShift(KeyEvent.VK_8,pRobot);break;
            case '(':  escreverComShift(KeyEvent.VK_9,pRobot);break;
            case ')':  escreverComShift(KeyEvent.VK_0,pRobot);break;
            case '+':  escreverComShift(KeyEvent.VK_EQUALS,pRobot);break;
            //case '\t':  escreverComShift(KeyEvent.VK_TAB,pRobot);break;
            case '\n':  escreverNormal(KeyEvent.VK_ENTER,pRobot);break;
            case '[':  escreverNormal(KeyEvent.VK_OPEN_BRACKET,pRobot);break;
            case ']':  escreverNormal(KeyEvent.VK_CLOSE_BRACKET,pRobot);break;
            //case '\\':  escreverComShift(KeyEvent.VK_BACK_SLASH,pRobot);break;
            case '{':  escreverComShift(KeyEvent.VK_OPEN_BRACKET,pRobot);break;
            case '}':  escreverComShift(KeyEvent.VK_CLOSE_BRACKET,pRobot);break;
          case '|':  escreverComShift(KeyEvent.VK_BACK_SLASH,pRobot);break;
            case ';':  escreverNormal(KeyEvent.VK_SEMICOLON,pRobot);break;
            case ':':  escreverComShift(KeyEvent.VK_SEMICOLON,pRobot);break;
            case '\'':  escreverNormal(KeyEvent.VK_QUOTE,pRobot);break;
            case '"':  escreverComShift(KeyEvent.VK_QUOTE,pRobot);break;
            case '<':  escreverComShift(KeyEvent.VK_COMMA,pRobot);break;
            case '>':  escreverComShift(KeyEvent.VK_PERIOD,pRobot);break;
            case '/': escreverNormal(KeyEvent.VK_SLASH,pRobot); break;
            case '?':  escreverComShift(KeyEvent.VK_SLASH,pRobot);break;
            case ' ':  escreverNormal(KeyEvent.VK_SPACE,pRobot);break;
            case '\b':  escreverNormal(KeyEvent.VK_BACK_SPACE,pRobot);break;

            default:
                System.out.println(ConverterTeclasEmVK.class.getName() + ": "+ new Date()+ " -- Caracteres ("+character+") não encontrado no mapeamento de teclas.");
        }


    }

    public static void escreverNormal(int code, Robot pRobot){
        pRobot.keyPress(code);
        pRobot.keyRelease(code);

    }

    public static void escreverComShift(int code, Robot pRobot){
        pRobot.keyPress(KeyEvent.VK_SHIFT);
        pRobot.keyPress(code);
        pRobot.keyRelease(code);
        pRobot.keyRelease(KeyEvent.VK_SHIFT);
    }

   public static void main(String[] args) throws AWTException, InterruptedException {


        Robot robot= new Robot();
        String  teste = "/";
        //char t = 'á';

        //System.out.println(AWTKeyStroke.getAWTKeyStroke(t).getKeyCode());
         System.out.println("Escrevendo");
       for (int i = 0; i < teste.length(); i++) {
           ConverterTeclasEmVK.EscreverCharacter(teste.charAt(i), robot);
        }
       /*String  teste  = "121| 1";


       if (teste.matches("[0-9]+")) {
           System.out.println(" è somente número");
       }else {
           System.out.println("Não è somente número erro");
       }*/
       //robot.keyPress(converterParaVK('.'));

    }
}