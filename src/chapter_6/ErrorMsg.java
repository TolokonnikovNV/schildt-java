package chapter_6;

public class ErrorMsg {
    String msgs[] ={
            "Output error",
            "Input error",
            "No disk space",
            "Index out of range"
    };

    String getErrorMsg(int i){
        if (i >=0 & i < msgs.length){
            return  msgs[i];
        } else {
            return "Non-existent error code";
        }
    }
}
