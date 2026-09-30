package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ova {
    public static final String a = ff8.n("ProcessUtils");

    public static final boolean a(Context context, si2 si2Var) {
        String strC;
        Object next;
        context.getClass();
        si2Var.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            strC = s.C();
        } else {
            strC = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, yag.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, null);
                objInvoke.getClass();
                if (objInvoke instanceof String) {
                    strC = (String) objInvoke;
                } else {
                    int iMyPid = Process.myPid();
                    Object systemService = context.getSystemService("activity");
                    systemService.getClass();
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator<T> it = runningAppProcesses.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((ActivityManager.RunningAppProcessInfo) next).pid != iMyPid);
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                        if (runningAppProcessInfo != null) {
                            strC = runningAppProcessInfo.processName;
                        }
                    }
                }
            } catch (Throwable th) {
                if (ff8.h().b <= 3) {
                    Log.d(a, "Unable to check ActivityThread for processName", th);
                }
            }
        }
        return pa7.t(strC, context.getApplicationInfo().processName);
    }
}
