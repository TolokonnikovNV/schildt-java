package chapter_7;

public class ErrorMsg {
    final int OUTERR = 0;
    final int INERR = 1;
    final int DISKERR = 2;
    final int INDEXERR = 3;

    String msgs[] = {
            "Output error",
            "Input error",
            "No disk space",
            "index out of range"
    };

    String getErrorMsg(int i){
        if(i >= 0 & i < msgs.length){
            return msgs[i];
        } else {
            return "Non -existent error code";
        }
    }
}
