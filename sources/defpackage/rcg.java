package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rcg {
    public static final rcg b;
    public fs a;

    static {
        rcg rcgVar = new rcg();
        rcgVar.a = null;
        b = rcgVar;
    }

    public static fs a(Context context) {
        fs fsVar;
        rcg rcgVar = b;
        synchronized (rcgVar) {
            try {
                fsVar = rcgVar.a;
                if (fsVar == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    fsVar = new fs(context, 1);
                    rcgVar.a = fsVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fsVar;
    }
}
