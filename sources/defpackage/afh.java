package defpackage;

import java.util.ArrayList;
import java.util.UUID;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class afh {
    public static final WeakHashMap a = new WeakHashMap();
    public static final WeakHashMap b = new WeakHashMap();

    public static void a(Throwable th) {
        Throwable cause;
        pwg pwgVar;
        weh wehVar;
        WeakHashMap weakHashMap = b;
        synchronized (weakHashMap) {
            cause = th;
            while (cause != null) {
                try {
                    if (weakHashMap.containsKey(cause)) {
                        break;
                    } else {
                        cause = cause.getCause();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            weakHashMap.put(th, Boolean.valueOf(cause != null));
        }
        if (cause != null) {
            return;
        }
        WeakHashMap weakHashMap2 = a;
        synchronized (weakHashMap2) {
            Throwable cause2 = th;
            while (cause2 != null) {
                try {
                    if (weakHashMap2.containsKey(cause2)) {
                        break;
                    } else {
                        cause2 = cause2.getCause();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (cause2 == null) {
                pwgVar = null;
            } else {
                weakHashMap2.put(th, (xeh) weakHashMap2.get(cause2));
                pwgVar = new pwg(21);
            }
        }
        if (pwgVar != null || (wehVar = dfh.c().b) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (wehVar = dfh.c().b; wehVar != null; wehVar = wehVar.a) {
            arrayList.add(wehVar);
        }
        UUID uuid = ((weh) arrayList.get(0)).b;
        ((weh) arrayList.get(0)).getClass();
        dy6 dy6VarN = jy6.n(arrayList.size());
        dy6 dy6VarN2 = jy6.n(arrayList.size());
        for (weh wehVar2 : tq.L(arrayList)) {
            dy6VarN2.b(wehVar2.d);
            dy6VarN.b(wehVar2.h());
        }
        WeakHashMap weakHashMap3 = a;
        synchronized (weakHashMap3) {
            try {
                yob yobVarG = dy6VarN2.g();
                if (yobVarG == null) {
                    throw new NullPointerException("Null spansNames");
                }
                yob yobVarG2 = dy6VarN.g();
                if (yobVarG2 == null) {
                    throw new NullPointerException("Null extras");
                }
                weakHashMap3.put(th, new xeh(yobVarG, yobVarG2, uuid));
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
