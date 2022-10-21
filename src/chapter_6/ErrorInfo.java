package chapter_6;

public class ErrorInfo {
    String msgs[] = {
            "Output error",
            "Input error",
            "No disk space",
            "Index out of range"
    };

    int howBad[] = {3, 3, 2, 4};

    Err getErrorInfo(int i){
        if(i>=0 & i < msgs.length){
            return new Err(msgs[i], howBad[i] );
        } else {
            return new Err("Non-existent error code", 0);
        }
    }


}
