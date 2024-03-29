package com.luryoo.utils;

import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * StringUtil
 * @description: 字符串工具类
 **/
public class StringUtil {

    /**
     * 判断是否为空字符串最优代码
     * @param str
     * @return 如果为空，则返回true
     */
    public static boolean isEmpty(String str){
        return str == null || str.trim().length() == 0;
    }

    /**
     * 判断字符串是否非空
     * @param str 如果不为空，则返回true
     * @return
     */
    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }

    /**
     * 用户名是否符合规范   ^[\u4E00-\u9FA5A-Za-z0-9]{6,16}$，支持中文、大小写字母、数字随意组合，默认长度6~16字符
     * @return
     */
    public static boolean isValidUsername(String username) {
        System.out.println("输入的用户名不合法，6到20位");
        return isValidUsername(username, 6, 20);
    }
    /**
     * 用户名是否符合规范   ^[\u4E00-\u9FA5A-Za-z0-9]{6,16}$
     * @param username
     * @param min
     * @param max
     * @return
     */
    public static boolean isValidUsername(String username,Integer min,Integer max) {
        if (StringUtils.isBlank(username)) {
            return false;
        }
        String reg = "^[\u4E00-\u9FA5A-Za-z0-9]{" + min + "," + max + "}$";
        System.out.println("输入的用户名太短或太长");
        return username.matches(reg);
    }
    /**
     * 是否有效手机号码
     * @param mobileNum
     * @return
     */
    public static boolean isMobileNum(String mobileNum) {
        if (null == mobileNum) {
            return false;
        }
        System.out.println(mobileNum.matches("^((13[0-9])|(14[4,7])|(15[^4,\\D])|(17[0-9])|(18[0-9]))(\\d{8})$"));
        return mobileNum.matches("^((13[0-9])|(14[4,7])|(15[^4,\\D])|(17[0-9])|(18[0-9]))(\\d{8})$");
    }
    /**
     * 是否有效邮箱
     * @param email
     * @return
     */
    public static boolean isEmail(String email) {
        if (null == email) {
            return false;
        }
        System.out.println(email.matches("^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$"));
        return email.matches("^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$");
    }
    /**
     * 是否是QQ邮箱
     */
    public static boolean isQQEmail(String email){
        if(null == email)
            return false;
        System.out.println(email.matches("^[\\s\\S]*@qq.com$"));
        return email.matches("^[\\s\\S]*@qq.com$");
    }
    /**
     * 是否为16-22位银行账号
     * @param bankAccount
     * @return
     */
    public static boolean isBankAccount(String bankAccount){
        if (null == bankAccount) {
            return false;
        }
        System.out.println(bankAccount.matches("^\\d{16,22}$"));
        return bankAccount.matches("^\\d{16,22}$");
    }
    /**
     * 是否是纯数字，不含空格
     *
     * @param str
     * @return
     */
    public static boolean isNumeric(String str) {
        if (StringUtils.isBlank(str)) {
            return false;
        }
        int sz = str.length();
        for (int i = 0; i < sz; i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    /**
     * 是否数值类型，整数或小数
     * @param number
     * @return
     */
    public static boolean isNumericalValue(String str) {
        if (null == str) {
            return false;
        }
        return str.matches("^[+-]?(([1-9]{1}\\d*)|([0]{1}))(\\.(\\d)+)?$");
    }
    /**
     * 是否整数(^[+-]?(([1-9]{1}\\d*)|([0]{1}))$)
     *
     * @param str
     * @return
     *
     */
    public static boolean isNumericInt(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("(^[+-]?([0-9]|([1-9][0-9]*))$)");
    }
    /**
     * 是否正整数
     * @param number
     * @return
     */
    public static boolean isNumericPositiveInt(String number) {
        if (null == number) {
            return false;
        }
        return number.matches("^[+-]?(([1-9]{1}\\d*)|([0]{1}))$");
    }
    /**
     * 判断是否是正整数数或者一位小数
     *
     * @param str
     * @return
     *
     */
    public static boolean isOneDouble(String str) {
//
        if (str == null) {
            return false;
        }
        return str.matches("^(\\d+\\.\\d{1,1}|\\d+)$");
    }
    /**
     * 判断是否是正整数数或者一位小数
     *
     * @param str
     * @return
     *
     */
    public static boolean isTwoDouble(String str) {
//
        if (str == null) {
            return false;
        }
        return str.matches("^(\\d+\\.\\d{1,2}|\\d+)$");
    }
    /**
     * 判断给定字符串是否小于给定的值(min)
     *
     * @param str
     * @param min
     * @return
     */
    public static boolean isNumLess(String str,float min) {
        if (str == null) {
            return false;
        }
        if (!isNumeric(str)) {
            return false;
        }
        float val = Float.parseFloat(str);
        return (val < min);
    }
    /**
     * 判断给定的字符串大于说给定的值
     *
     * @param str
     * @param max
     * @return
     *
     */
    public static boolean isNumMore(String str,float max) {
        if (str == null) {
            return false;
        }
        if (!isNumeric(str)) {
            return false;
        }
        float val = Float.parseFloat(str);
        return (val > max);
    }
    /**
     * 是否小数
     *
     * @param str
     * @return
     *
     */
    public static boolean isNumericDouble(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[+-]?(([1-9]\\d*\\.?\\d+)|(0{1}\\.\\d+)|0{1})");
    }
    /**
     * 是否是16进制颜色值
     *
     * @param str
     * @return
     *
     */
    public static boolean isColor(String str){
        if (str == null) {
            return false;
        }
        return str.matches("(^([0-9a-fA-F]{3}|[0-9a-fA-F]{6})$)");
    }
    /**
     * 判断是否是Boolean值
     *
     * @param str
     * @return
     *
     */
    public static boolean isBoolean(String str) {
        if (str == null) {
            return false;
        }
        return str.equals("true") || str.equals("false");
    }
    /**
     * 判断是否是日期,格式：yyyy-MM-dd
     *
     * @param str
     * @return
     *
     */
    public static boolean isDate(String str) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            format.parse(str);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
    /**
     * 判断是否是日期,格式：yyyy-MM-dd hh:mm:ss
     *
     * @param str
     * @return
     * @author
     * @createDate 2015年12月8日
     */
    public static boolean isDateyyyyMMddhhmmss(String str) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            format.parse(str);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
    /**
     * 使用map中的值替换str的指定内容
     *
     * @description 假设:date  supervisor设置SEO规则,date。其中date和supervisor是要被替换的内容，则map中key就为date,supervisor。
     *
     * @param str
     * @param map
     * @return
     *
     */
    public static String replaceByMap(String str, Map<String,String> map){
        String result = str;
        if (map == null || map.isEmpty()) {
            return result;
        }
        for (String _key : map.keySet()) {
            result = result.replace(_key, map.get(_key));
        }
        return result;
    }
    /**
     * 计算一个颜色值的的0.7透明度
     *
     * @param color 颜色值为ffffff/fff两种形式
     * @return
     *
     */
    public static String colorByAlpha(String color){
        if(color.length() == 3){
            color = "000"+color;
        }
        String r = color.substring(0, 2);
        String g = color.substring(2, 4);
        String b = color.substring(4);
        String nColor = Integer.toHexString(Integer.parseInt(r, 16)*7/10+255*3/10)+Integer.toHexString(Integer.parseInt(g, 16)*7/10+255*3/10)+Integer.toHexString(Integer.parseInt(b, 16)*7/10+255*3/10);
        return nColor;
    }
    public static String[] toStr(int[] a){
        List<String> list = new ArrayList<String>();
        for(int i=0,max = a.length;i<max;i++){
            list.add(a[i]+"");
            if(i < max-1){
                if(a[i]+1<a[i+1]){
                    list.add("...");
                }
            }
        }
        String[] strs = new String[list.size()];
        list.toArray(strs);
        return strs;
    }
    /**
     * 脱敏处理
     *
     * @param str
     * @param start
     * @param end
     * @param count
     * @return
     * @description
     *
     * @author
     * @createDate 2018年7月13日
     */
    public static String asterisk (String str, int start, int end, int count) {
        StringBuffer result = new StringBuffer();
        int length = str.length();
        if (start <= length ) {
            result.append(str.substring(0, start));
        } else {
            result.append(str.substring(0, length));
        }
        for (int i=0; i<count; i++) {
            result.append("*");
        }
        if (end <= length ) {
            result.append(str.substring(length-end, length));
        } else {
            result.append(str.substring(0, length));
        }
        return result.toString();
    }
    /**
     * 截取字符串
     * @param oldStr 原字符串
     * @param type 类型：1.平台用户名、2.用户真实姓名、3.用户身份证号码、4.用户手机号码、5.用户邮箱
     * @return
     */
    public static String cutOutStr(String oldStr, int type) {
        String newStr = "";
        int length = oldStr.length();
        if (type == 1) {
            if (length <= 3) {
                newStr = oldStr.substring(0, oldStr.length() - 1) + "*";
            } else if (length >= 4) {
                newStr = oldStr.substring(0, 2) + copyStr("*", oldStr.length() - 3) + oldStr.substring(oldStr.length() - 1, oldStr.length());
            } else {
                newStr = oldStr;
            }
            System.out.println(newStr);
        } else if (type == 2) {
            if (length >= 2) {
                newStr = oldStr.substring(0, 1) + copyStr("*", oldStr.length() - 1);
            } else {
                newStr = oldStr;
            }
            System.out.println(newStr);
        } else if (type == 3) {
            if (length == 18) {
                newStr = oldStr.substring(0, 4) + copyStr("*", oldStr.length() - 6) + oldStr.substring(oldStr.length() - 2, oldStr.length());
            } else {
                newStr = oldStr;
            }
            System.out.println(newStr);
        } else if (type == 4) {
            System.out.println(newStr);
        } else if (type == 5) {
            System.out.println(newStr);
        }
        return newStr;
    }

    public static String copyStr(String str, int n) {
        String result = str;

        for (int i = 0; i < n - 1; i++) {
            result = result.concat(str);
        }

        return result;
    }

}
