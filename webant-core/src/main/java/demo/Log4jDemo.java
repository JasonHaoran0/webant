package demo;


import org.apache.log4j.Logger;

public class Log4jDemo {
    final static Logger logger=Logger.getLogger(Log4jDemo.class);

    public static void main(String[] args) {

        Log4jDemo obj = new Log4jDemo();
        obj.runMe("w3cschool");

    }

    private void runMe(String parameter){

        if(logger.isDebugEnabled()){
            logger.debug("This is debug : " + parameter);
        }

        if(logger.isInfoEnabled()){
            logger.info("This is info : " + parameter);
        }
        if(logger.isTraceEnabled()) {
            logger.trace("This is trace : " + parameter);
        }
        logger.warn("This is warn : " + parameter);
        logger.error("This is error : " + parameter);
        logger.fatal("This is fatal : " + parameter);

        //记录异常
        try{
            dividedTest();
        }catch (Exception e){
            e.printStackTrace();
            logger.error("不能除以0",e);
        }

    }

    private void dividedTest(){
        int a=10/0;
    }
}
