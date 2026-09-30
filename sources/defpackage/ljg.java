package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ljg {
    public static final os a = new os("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        mjg.O(context).P();
        Set set = thg.b;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            ec6.a();
        } else {
            ((thg) it.next()).getClass();
            cva.f();
        }
    }
}
