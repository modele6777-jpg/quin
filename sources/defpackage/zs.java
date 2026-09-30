package defpackage;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zs {
    public static final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public static final Map b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = hm9.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(hm9.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(wr6.class.getName(), "okhttp.Http2");
        linkedHashMap.put(kle.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        b = bm8.X(linkedHashMap);
    }

    public static void a(int i, String str, String str2, Throwable th) {
        int iMin;
        String strM0 = (String) b.get(str);
        if (strM0 == null) {
            strM0 = v4e.m0(23, str);
        }
        if (Log.isLoggable(strM0, i)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int iN = v4e.N(str2, '\n', i2, 4);
                if (iN == -1) {
                    iN = length;
                }
                while (true) {
                    iMin = Math.min(iN, i2 + 4000);
                    Log.println(i, strM0, str2.substring(i2, iMin));
                    if (iMin >= iN) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }

    public static void b(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (a.add(logger)) {
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else {
                level = Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(at.a);
        }
    }
}
