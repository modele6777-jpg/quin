package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gs implements ComponentCallbacks2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gs(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        switch (this.a) {
            case 0:
                return;
            default:
                kv kvVar = (kv) this.b;
                synchronized (kvVar) {
                    if (((mib) ((WeakReference) kvVar.b).get()) == null) {
                        kvVar.g();
                        break;
                    }
                }
                return;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        switch (this.a) {
            case 0:
                break;
            default:
                onTrimMemory(80);
                break;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        qib qibVarC;
        long jG;
        switch (this.a) {
            case 0:
                if (i >= 40) {
                    ((is) this.b).d();
                    return;
                }
                return;
            default:
                kv kvVar = (kv) this.b;
                synchronized (kvVar) {
                    try {
                        mib mibVar = (mib) ((WeakReference) kvVar.b).get();
                        if (mibVar != null) {
                            hib hibVar = mibVar.a;
                            if (i >= 40) {
                                qib qibVarC2 = mibVar.c();
                                if (qibVarC2 != null) {
                                    qibVarC2.a();
                                }
                            } else if (i >= 20) {
                                ((jv) kvVar.c).a(hibVar.a);
                            } else if (i >= 10 && (qibVarC = mibVar.c()) != null) {
                                synchronized (qibVarC.c) {
                                    jG = ((y21) qibVarC.a.c).g();
                                }
                                long j = jG / 2;
                                synchronized (qibVarC.c) {
                                    ((y21) qibVarC.a.c).m(j);
                                }
                            }
                        } else {
                            kvVar.g();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    private final void b() {
    }

    private final void a(Configuration configuration) {
    }
}
