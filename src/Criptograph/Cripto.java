package Criptograph;

import java.util.*;

public class Cripto {
    /**
     * Aqui estão chaves que podem ser usadas na codificação
     * As chaves contem 64 caracteres não repetidos e não podem conter o caractere ponto ('.')
     * Podem ser geradas no portal https://www.gigacalculator.com/randomizers/random-string-generator.php
     */
    private static final String[] keys = {
        "oMLN{zSa5ql4}Yk#nFp~XK<b@W9`V)jt8HI(Z'v0=eRc&;DE:%TBwid+№xJ?UA^-",
        "C.m*;fjR0tF<GZE7L)~qku№%Ubo{KiIS#Tr!wc(AaMslJhV'OBpy\"dHYP>^`&v6-",
        "tu?9E~yofvgkOw#sTJYQ+CM=WjGq:0i'c\"@!mD`lz8R5S-KdF№an{e4(&L<*bh)r",
        "EpPZ-Je0iw~cAC'9\"M5d*F#4lXq>7vN.6xbLI`y!YjV+}=z{Hk8%?r)nG;oQhmK(",
        "J5vq>gb7+№UKmZsG4Q=R!`XBYIlzO6\"#fi*FWj90@erSt?wkh'<{EN(;HV)adxnL",
        "uT(5№nECb{m;}`VDHNFPI4&Ma%~p!owz.R?=yx'K+k6<QOAY#s70)dit\"LWJjBS9",
        ":cm+rD\"Fg-H5t>CTSB9&fA%vUnhOKN=Q#PZEX}~es8d*jx?7'LYpGb.{Ma;`IkRw"
    };
    private static String key = keys[0];
    private static final Map<Character, Object[]> roles = new HashMap<>(){{
        put(' ', new Integer[]{63});
        put('!', new Integer[]{18, 5});
        put('"', new Integer[]{63, 42, 41});
        put('#', new Integer[]{5, 18});
        put('$', new Integer[]{13, 59});
        put('%', new Integer[]{24});
        put('&', new Integer[]{41, 42, 25});
        put('\'', new Integer[]{51, 37, 3});
        put('(', new Integer[]{5, 61, 0});
        put(')', new Integer[]{6, 56});
        put('*', new Integer[]{21, 53});
        put('+', new Integer[]{25, 22});
        put(',', new Integer[]{59});
        put('-', new Integer[]{16});
        put('.', new Integer[]{35, 33});
        put('/', new Integer[]{27});
        put('0', new Integer[]{7});
        put('1', new Integer[]{43});
        put('2', new Integer[]{44});
        put('3', new Integer[]{23});
        put('4', new Integer[]{32});
        put('5', new Integer[]{31});
        put('6', new Integer[]{17, 52});
        put('7', new Integer[]{62, 48});
        put('8', new Integer[]{2, 5, 59});
        put('9', new Integer[]{52, 7, 0});
        put(':', new Integer[]{55, 21});
        put(';', new Integer[]{7, 59});
        put('<', new Integer[]{36});
        put('=', new Integer[]{5, 38});
        put('>', new Integer[]{11, 2});
        put('?', new Integer[]{46});
        put('@', new Integer[]{61, 18});
        put('A', new Integer[]{48});
        put('B', new Integer[]{0, 9});
        put('C', new Integer[]{60, 6});
        put('D', new Integer[]{23, 42});
        put('E', new Integer[]{9});
        put('F', new Integer[]{61, 13});
        put('G', new Integer[]{13, 32});
        put('H', new Integer[]{22});
        put('I', new Integer[]{30, 33});
        put('J', new Integer[]{36, 23});
        put('K', new Integer[]{31, 5});
        put('L', new Integer[]{42, 38});
        put('M', new Integer[]{14, 52});
        put('N', new Integer[]{10, 16});
        put('O', new Integer[]{18});
        put('P', new Integer[]{54, 53});
        put('Q', new Integer[]{56, 55});
        put('R', new Integer[]{50});
        put('S', new Integer[]{19});
        put('T', new Integer[]{5});
        put('U', new Integer[]{48, 60});
        put('V', new Integer[]{30, 2});
        put('W', new Integer[]{34, 47});
        put('X', new Integer[]{36, 57});
        put('Y', new Integer[]{28, 48});
        put('Z', new Integer[]{25, 3});
        put('[', new Integer[]{13});
        put('\\', new Integer[]{61, 20, 0});
        put(']', new Integer[]{29, 33, 46});
        put('^', new Integer[]{60});
        put('_', new Integer[]{38});
        put('`', new Integer[]{56});
        put('a', new Integer[]{12});
        put('b', new Integer[]{15, 27});
        put('c', new Integer[]{32, 41});
        put('d', new Integer[]{9, 20});
        put('e', new Integer[]{15});
        put('f', new Integer[]{22, 59});
        put('g', new Integer[]{55, 38});
        put('h', new Integer[]{48, 25});
        put('i', new Integer[]{39});
        put('j', new Integer[]{37, 33});
        put('k', new Integer[]{28});
        put('l', new Integer[]{0, 43});
        put('m', new Integer[]{53, 50});
        put('n', new Integer[]{16, 13});
        put('o', new Integer[]{41});
        put('p', new Integer[]{18, 7});
        put('q', new Integer[]{59, 18});
        put('r', new Integer[]{52, 15});
        put('s', new Integer[]{25});
        put('t', new Integer[]{61, 55});
        put('u', new Integer[]{3});
        put('v', new Integer[]{26});
        put('w', new Integer[]{0, 62});
        put('x', new Integer[]{9, 31});
        put('y', new Integer[]{63, 8});
        put('z', new Integer[]{24, 31});
        put('{', new Integer[]{49, 1});
        put('|', new Integer[]{13, 46, 54});
        put('}', new Integer[]{20});
        put('~', new Integer[]{43, 25, 58});
        put('', new Integer[]{32, 31});
        put('', new Integer[]{34});
        put('', new Integer[]{18, 30});
        put('', new Integer[]{52, 51});
        put('', new Integer[]{33, 6, 1});
        put('', new Integer[]{14, 42, 5});
        put('', new Integer[]{18, 54, 41});
        put('', new Integer[]{45, 9});
        put('', new Integer[]{10, 52});
        put('', new Integer[]{7, 58});
        put('', new Integer[]{30, 47, 21});
        put('', new Integer[]{40});
        put('', new Integer[]{14, 46});
        put('', new Integer[]{18, 32, 10});
        put('', new Integer[]{42});
        put('', new Integer[]{36, 15});
        put('', new Integer[]{42, 16, 10});
        put('', new Integer[]{11, 37});
        put('', new Integer[]{12, 4});
        put('', new Integer[]{59, 15});
        put('', new Integer[]{17, 56, 62});
        put('', new Integer[]{8});
        put('', new Integer[]{24, 34, 33});
        put('', new Integer[]{32, 0, 0});
        put('', new Integer[]{17, 40, 60});
        put('', new Integer[]{61});
        put('', new Integer[]{29, 19, 38});
        put('', new Integer[]{21, 54});
        put('', new Integer[]{6});
        put('', new Integer[]{53, 51, 52});
        put('', new Integer[]{40, 56, 46});
        put('', new Integer[]{58});
        put('', new Integer[]{4, 57, 48});
        put(' ', new Integer[]{38, 21, 21});
        put('¡', new Integer[]{19, 4, 48});
        put('¢', new Integer[]{57, 21, 27});
        put('£', new Integer[]{3, 43});
        put('¤', new Integer[]{1});
        put('¥', new Integer[]{14});
        put('¦', new Integer[]{44, 39, 10});
        put('§', new Integer[]{57});
        put('¨', new Integer[]{1, 59});
        put('©', new Integer[]{17, 44, 34});
        put('ª', new Integer[]{24, 53});
        put('«', new Integer[]{18, 36});
        put('¬', new Integer[]{51});
        put('­', new Integer[]{50, 28});
        put('®', new Integer[]{21});
        put('¯', new Integer[]{2, 32, 20});
        put('°', new Integer[]{57, 10, 59});
        put('±', new Integer[]{36, 18, 25});
        put('²', new Integer[]{5, 0});
        put('³', new Integer[]{62, 10, 35});
        put('´', new Integer[]{6, 8});
        put('µ', new Integer[]{53, 31});
        put('¶', new Integer[]{35, 34});
        put('·', new Integer[]{46, 7, 53});
        put('¸', new Integer[]{7, 30, 10});
        put('¹', new Integer[]{27, 43, 0});
        put('º', new Integer[]{55});
        put('»', new Integer[]{7, 41});
        put('¼', new Integer[]{41, 42});
        put('½', new Integer[]{20, 48});
        put('¾', new Integer[]{14, 37});
        put('¿', new Integer[]{13, 54, 56});
        put('À', new Integer[]{11});
        put('Á', new Integer[]{56, 12, 40});
        put('Â', new Integer[]{21, 27});
        put('Ã', new Integer[]{46, 50});
        put('Ä', new Integer[]{41, 58});
        put('Å', new Integer[]{9, 47, 60});
        put('Æ', new Integer[]{11, 21, 41});
        put('Ç', new Integer[]{48, 26});
        put('È', new Integer[]{42, 16});
        put('É', new Integer[]{31, 40, 43});
        put('Ê', new Integer[]{58, 2, 28});
        put('Ë', new Integer[]{27, 38, 29});
        put('Ì', new Integer[]{18, 26});
        put('Í', new Integer[]{18, 46});
        put('Î', new Integer[]{37});
        put('Ï', new Integer[]{47});
        put('Ð', new Integer[]{53});
        put('Ñ', new Integer[]{3, 9});
        put('Ò', new Integer[]{22, 17, 2});
        put('Ó', new Integer[]{49, 18});
        put('Ô', new Integer[]{32, 28});
        put('Õ', new Integer[]{36, 26});
        put('Ö', new Integer[]{2});
        put('×', new Integer[]{39, 27, 31});
        put('Ø', new Integer[]{17, 27, 46});
        put('Ù', new Integer[]{9, 56});
        put('Ú', new Integer[]{29, 59});
        put('Û', new Integer[]{21, 32});
        put('Ü', new Integer[]{22, 38, 47});
        put('Ý', new Integer[]{48, 41});
        put('Þ', new Integer[]{21, 0});
        put('ß', new Integer[]{6, 2, 48});
        put('à', new Integer[]{24, 61});
        put('á', new Integer[]{22, 52});
        put('â', new Integer[]{53, 41, 56});
        put('ã', new Integer[]{26, 48, 3});
        put('ä', new Integer[]{59, 59, 27});
        put('å', new Integer[]{37, 39, 36});
        put('æ', new Integer[]{12, 50});
        put('ç', new Integer[]{12, 4, 49});
        put('è', new Integer[]{44, 56, 34});
        put('é', new Integer[]{16, 36, 38});
        put('ê', new Integer[]{51, 0, 47});
        put('ë', new Integer[]{3, 61});
        put('ì', new Integer[]{19, 2});
        put('í', new Integer[]{30});
        put('î', new Integer[]{38, 48, 61});
        put('ï', new Integer[]{55, 57});
        put('ð', new Integer[]{24, 44});
        put('ñ', new Integer[]{44, 58});
        put('ò', new Integer[]{20, 61});
        put('ó', new Integer[]{13, 28});
        put('ô', new Integer[]{50, 63, 0});
        put('õ', new Integer[]{57, 39});
        put('ö', new Integer[]{62});
        put('÷', new Integer[]{26, 17, 58});
        put('ø', new Integer[]{3, 15});
        put('ù', new Integer[]{33});
        put('ú', new Integer[]{56, 31, 9});
        put('û', new Integer[]{49});
        put('ü', new Integer[]{50, 49, 50});
        put('ý', new Integer[]{52, 15, 62});
        put('þ', new Integer[]{39, 3});
        put('ÿ', new Integer[]{5, 45, 50});
    }};

    /**
     * Criptografa um texto com base em uma chave registrada no array de chaves
     * @param text texto a ser criptografado
     * @param keyIndex índice da chave. Se null ou fora do intervalo, assume-se a chave de índice zero
     * @return texto criptografado
     */
    public static String encode(String text, Integer keyIndex){
        selectKey(keyIndex);
        StringBuilder sb = new StringBuilder();
        for(char ch : text.toCharArray()){
            sb.append(encodeChar(ch));
        }
        System.out.println(sb);
        return sb.toString();
    }
    private static String encodeChar(char ch){
        var values = roles.get(ch);
        StringBuilder sb = new StringBuilder();

        for (Object value : values) {
            sb.append(key.charAt((int) value));
        }
        sb.append(values.length);
        return sb.toString();
    }

    private static void selectKey(Integer myKey){
        if(myKey == null || myKey < 0 || myKey > keys.length-1){
            key = keys[0];
        } else {
            key = keys[myKey];
        }
    }

    /**
     * Decodifica um texto previamente criptografado
     * @param text texto criptografado
     * @param keyIndex índice da chave. Se null ou fora do intervalo, assume-se a chave de índice zero.
     *                 A chave usada precisa ser a mesma utilizada na função encode().
     * @return
     */
    public static String decode(String text, Integer keyIndex){
        selectKey(keyIndex);
        StringBuilder sbVerificator = new StringBuilder();

        for (char s : text.toCharArray()) {
            if(s == '1' || s == '2' || s == '3') sbVerificator.append(s);
        }

        text = text.replaceAll("[1-3]+","");
        int pointer = 0;
        String decodedText = "";
        StringBuilder stringBuilder = new StringBuilder();
        for (char character : sbVerificator.toString().toCharArray()){
            var length = Integer.parseInt(String.valueOf(character));
            var str = text.substring(pointer, pointer + length).toCharArray();
            pointer += length;
            Integer[] values = new Integer[length];
            for (int i=0; i< length; i++){
                values[i] = key.indexOf(str[i]);
            }
            roles.forEach((key, value) -> {
                if (Arrays.equals(value, values)) {
                    stringBuilder.append(key);
                }
            });
        }
        return stringBuilder.toString();

    }

    /**
     * Usada para auxiliar na geração das regras de codificacao em tempo de desenvolvimento
     */
    public static void generateRoles(){
        Map<Character, List<Integer>> roles = new HashMap<>();
        Random random = new Random();
        char asciiIndex = 31;
        StringBuilder verificator = new StringBuilder();
        while (roles.size() < 224){
            int keysNumber = random.nextInt(3)+1;
            List<Integer> keys = new ArrayList<>();
            for(int i=0; i<keysNumber; i++){
                keys.add(random.nextInt(key.length()));
            }
            if(! roles.containsValue(keys)){
                roles.put(asciiIndex, keys);
                asciiIndex++;
                verificator.append(keysNumber);
                System.out.println("put('"+asciiIndex+ "', new Integer[]" + keys.toString()
                        .replace("[", "{")
                        .replace("]","}")+");");
            }
        }
    }
}
