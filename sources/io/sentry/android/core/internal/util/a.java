package io.sentry.android.core.internal.util;

import android.net.ConnectivityManager;
import io.sentry.android.core.i0;
import io.sentry.r0;
import io.sentry.s0;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ a(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                bVar.R(true);
                io.sentry.util.a aVar = b.Y;
                aVar.b();
                try {
                    b.Z.clear();
                    aVar.close();
                    io.sentry.util.a aVar2 = b.z;
                    aVar2.b();
                    try {
                        b.X = null;
                        aVar2.close();
                        i0.e.u(bVar);
                        return;
                    } catch (Throwable th) {
                        try {
                            aVar2.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        aVar.close();
                        break;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            case 1:
                bVar.l();
                return;
            case 2:
                bVar.R(false);
                return;
            default:
                bVar.U(null);
                r0 r0VarU = bVar.u();
                if (r0VarU == r0.DISCONNECTED) {
                    bVar.y.set(false);
                    io.sentry.util.a aVar3 = b.Y;
                    aVar3.b();
                    try {
                        Iterator it = b.Z.iterator();
                        while (it.hasNext()) {
                            ((ConnectivityManager.NetworkCallback) it.next()).onLost(null);
                        }
                        aVar3.close();
                    } catch (Throwable th5) {
                        try {
                            aVar3.close();
                            break;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                }
                io.sentry.util.a aVar4 = bVar.f;
                aVar4.b();
                try {
                    Iterator it2 = bVar.e.iterator();
                    while (it2.hasNext()) {
                        ((s0) it2.next()).u(r0VarU);
                    }
                    aVar4.close();
                    bVar.l();
                    return;
                } catch (Throwable th7) {
                    try {
                        aVar4.close();
                        break;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                    throw th7;
                }
        }
    }
}
