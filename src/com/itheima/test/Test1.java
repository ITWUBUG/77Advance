package com.itheima.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) {
        String content = "秒杀开始时间是2020年11月11日 00:00:00,结束时间是2020年11月11日 00:10:00,用户小贾下单时间是2023年" +
                "11月11日 00:03:47,用户小皮下单时间是2021年11月11日 00:10:11,判断用户有没有成功参与秒杀活动";
//        目标匹配所有4个数字

//        1、\\d 表示一个任意数字
        String regStr = "\\d\\d\\d\\d";
//        2、创建模式对象[即正则表达式对象]
        Pattern pattern = Pattern.compile(regStr);
//        3、创建匹配器
//        说明：创建匹配器matcher ,按照 正则表达式的规则 去匹配 content 字符串
        Matcher matcher = pattern.matcher(content);

//        4、开始匹配

        /*
         * matcher.find() 完成的任务
         * 1、根据指定的规则，定位满足规则的子字符串2020
         * 2、找到后，将 子字符串的开始的索引记录到matcher对象的属性 int[] groups ;
         *    groups[0] = 7;把该子字符串的结束的索引 +1 的值记录到 groups[1] = 11;
         * 3、同时记录oldLast 的值为子字符串的结束的 索引+1 的值 即为11，即下次执行find时，就从11开始匹配
         *
         *
         * matcher.group(0)分析
         *
         * 源码
         *  public String group(int group) {
         *          if (first < 0)
         *               throw new IllegalStateException("No match found");
         *         if (group < 0 || group > groupCount())
         *              throw new IndexOutOfBoundsException("No group " + group);
         *           if ((groups[group*2] == -1) || (groups[group*2+1] == -1))
         *               return null;
         *            return getSubSequence(groups[group * 2], groups[group * 2 + 1]).toString();
         *      }
         *1、根据groups[0] = 7;groups[1] = 11; 的记录的位置，从content开始截取子字符串返回
         * 就是[7,11)包含7不包含11
         *
         * 如果再次执行find方法仍然按照上面的方式在次执行
         *
         *String regStr = "(\\d\\d)(\\d\\d)";
         * 什么是分组，比如(\\d\\d)(\\d\\d)，正则表达式中有()表示分组，第1个()表示第1组，依此类推
         *matcher.find() 完成的任务
         * 1、根据指定的规则，定位满足规则的子字符串2020
         * 2、找到后，将 子字符串的开始的索引记录到matcher对象的属性 int[] groups ;
         *  2.1groups[0] = 7;把该子字符串的结束的索引 +1 的值记录到 groups[1] = 11;
         *  2.2记录1组匹配到的字符串 groups[2] = 7;把1组 小 字符串的结束的索引 +1的值记录到 groups[3] = 9;
         *  2.3记录2组匹配到的字符串 groups[4] = 9;把2组 小 字符串的结束的索引 +1的值记录到 groups[4] = 11;
         *  2.3如果有更多分组依此类推
         *
         * 3、同时记录oldLast 的值为子字符串的结束的 索引+1 的值 即为11，即下次执行find时，就从11开始匹配
         * 1、根据groups[0] = 7;groups[1] = 11; 的记录的位置，从content开始截取子字符串返回
         * 就是[7,11)包含7不包含11
         * matcher.group(1)
         * 截取第1组的子字符串groups[group * 2] = groups[2] = 7; groups[group * 2 + 1] = groups[3] = 9;
         *
         */
        while (matcher.find()) {
//            小结
//            1、如果正则表达式有()即分组
//            2、取出匹配的字符串规则如下
//            group(0) 表示匹配到的子字符串
//            group(1) 表示匹配到的子字符串的第1组字符串
//            group(0) 表示匹配到的子字符串的第2组字符串
//            3、…但是分组的数不能越界

            System.out.println("找到：" + matcher.group(0));
        }
    }
}
