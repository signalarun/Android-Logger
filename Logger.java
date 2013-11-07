
import android.util.Log;

/**
 * @author Arun Gopi
 *
 */
public class Logger{

	public static void loge(String tag, String msg){
		
		if(BuildConfig.DEBUG)
		 Log.e(tag, msg);
	}
	
  public static void logi(String tag, String msg){
		
		if(BuildConfig.DEBUG)
		 Log.i(tag, msg);
	}
  
 public static void logw(String tag, String msg){
		
		if(BuildConfig.DEBUG)
		 Log.w(tag, msg);
	}
 
 public static void logd(String tag, String msg){
		
		if(BuildConfig.DEBUG)
		 Log.d(tag, msg);
	}
 
 public static void logv(String tag, String msg){
		
		if(BuildConfig.DEBUG)
		 Log.v(tag, msg);
	}
 
}
