package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class df5 implements os0 {
    public static final AtomicReference a = new AtomicReference();

    @Override // defpackage.os0
    public final void a(boolean z) {
        synchronized (ff5.k) {
            try {
                for (ff5 ff5Var : new ArrayList(ff5.l.values())) {
                    if (ff5Var.e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = ff5Var.i.iterator();
                        while (it.hasNext()) {
                            ff5 ff5Var2 = ((cf5) it.next()).a;
                            if (!z) {
                                ((zq3) ff5Var2.h.get()).b();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
