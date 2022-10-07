package com.qc.hutool.tools;

import java.util.Calendar;
import java.util.Date;

import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.Month;

public class DateUse {
    
    public static void main(String[] args) {
        DateUse use = new DateUse();
        //获取当前时间
        use.getCurrentDateTime();
        //获取格式化时间
        use.getFormatDateTime();
        //获取部分时间
        use.getPartOfDateTime();
        //获取diff时间
        use.getDiffOfDeteTime();

    }


    //获取当前时间，具体格式是年月日时分秒
    public void getCurrentDateTime(){
        //返回年月日时分秒
        Date c1 = DateUtil.date();
        System.out.println("c1:" + c1); 

        Date c2 = DateUtil.date(Calendar.getInstance());
        System.out.println("c2:" + c2);

        Date c3 = DateUtil.date(System.currentTimeMillis()); 
        System.out.println("c3:" + c3);

        String now = DateUtil.now();
        System.out.println("now:"+now);

        //返回年月日
        String today = DateUtil.today();
        System.out.println("today:"+today);

    }

    //获取格式化时间
    public void getFormatDateTime(){
        String format = DateUtil.format(DateUtil.date(), "YYYY/MM/DD HH:mm:ss");
        System.out.println("format:"+format);

    }

    //获取部分时间
    public void getPartOfDateTime(){
        //todo
        Date date = DateUtil.date();
        //获得年的部分
        int year =  DateUtil.year(date);
        System.out.println("year:"+year);
        //获得月份，从0开始计数
        int month =  DateUtil.month(date);
        System.out.println("month:"+month);
        //获得月份枚举
        Month monthE =  DateUtil.monthEnum(date);
        System.out.println("monthEnum:"+monthE);




    }

    //获取时间偏移
    public void getDiffOfDeteTime(){
        //todo
        String dateStr = "2017-03-01 22:33:23";
        Date date = DateUtil.parse(dateStr);
        
        //结果：2017-03-03 22:33:23
        Date newDate = DateUtil.offset(date, DateField.DAY_OF_MONTH, 2);
        System.out.println("offset:"+newDate);
        
        //常用偏移，结果：2017-03-04 22:33:23
        DateTime newDate2 = DateUtil.offsetDay(date, 3);
        System.out.println("offsetDay"+ newDate2);

        DateTime newDate3 = DateUtil.offsetHour(date, -3);
        System.out.println("offsetHour:" + newDate3);


        /** 
            //简单偏移方法
            //昨天
            DateUtil.yesterday()
            //明天
            DateUtil.tomorrow()
            //上周
            DateUtil.lastWeek()
            //下周
            DateUtil.nextWeek()
            //上个月
            DateUtil.lastMonth()
            //下个月
            DateUtil.nextMonth()
        
         */
        
 
    }



}
