package defpackage;

import android.view.Surface;
import io.sentry.android.core.b1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bk1 {
    public static final wh0 d = vpf.n(0);
    public final Object a = new Object();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashSet c = new LinkedHashSet();

    public final ak1 a(Surface surface) {
        ak1 ak1Var;
        List listJ1;
        surface.getClass();
        if (!surface.isValid()) {
            b1.l("CXCP", "registerSurface: Surface " + surface + " isn't valid!");
        }
        synchronized (this.a) {
            try {
                ak1Var = new ak1(this, surface);
                Integer num = (Integer) this.b.get(surface);
                int iIntValue = (num != null ? num.intValue() : 0) + 1;
                this.b.put(surface, Integer.valueOf(iIntValue));
                listJ1 = iIntValue == 1 ? s72.j1(this.c) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (listJ1 != null) {
            Iterator it = listJ1.iterator();
            while (it.hasNext()) {
                ((kkf) it.next()).c(surface);
            }
        }
        return ak1Var;
    }
}
