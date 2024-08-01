package com.xiaoxiaoowo.yuehua.utils;

public final class Check {
    public static String removeLastChar(String str) {
        return str.substring(0, str.length() - 1);
    }


    public static boolean checkFuling(String id, int slot) {
        String prefix = removeLastChar(id);
        if (36 <= slot && slot <= 39) {
            switch (prefix) {
                case "shouhu", "yankai", "luoshi", "yuti", "shuangjia", "qiangren" -> {
                    return true;
                }
                default -> {
                    return false;
                }
            }
        }else {
            switch (prefix) {
                case "shouhu", "yankai", "luoshi", "yuti", "shuangjia", "qiangren" -> {
                    return false;
                }
                default -> {
                    return true;
                }
            }
        }
    }

    public static boolean checkYushi(String id, int slot) {
        String prefix = removeLastChar(id);
        if (36 <= slot && slot <= 39) {
            switch (prefix) {
                case "jinhuangshi", "houtushi", "zijingshi", "miyinshi", "yulushi", "bingshuangshi" -> {
                    return true;
                }

                default -> {
                    return false;
                }
            }


        } else {
            switch (prefix) {
                case "xueseshi", "cuilvshi", "dianlanshi", "tulushi", "hongyueshi", "yanyangshi", "suiyanshi" -> {
                    return true;
                }


                default -> {
                    return false;
                }
            }

        }


    }
}
