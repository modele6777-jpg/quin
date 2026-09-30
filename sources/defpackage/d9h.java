package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class d9h implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ndh d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ lah f;
    public final /* synthetic */ Object g;

    public d9h(lah lahVar, String str, String str2, ndh ndhVar, boolean z, tug tugVar) {
        this.b = str;
        this.c = str2;
        this.d = ndhVar;
        this.e = z;
        this.g = tugVar;
        this.f = lahVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        qch qchVar;
        AtomicReference atomicReference;
        switch (this.a) {
            case 0:
                String str = this.c;
                String str2 = this.b;
                tug tugVar = (tug) this.g;
                lah lahVar = this.f;
                w3h w3hVar = (w3h) lahVar.b;
                Bundle bundle = new Bundle();
                try {
                    try {
                        hzg hzgVar = lahVar.e;
                        if (hzgVar == null) {
                            w0h w0hVar = w3hVar.f;
                            w3h.h(w0hVar);
                            w0hVar.g.c(str2, str, "Failed to get user properties; not connected to service");
                            qchVar = w3hVar.w;
                            w3h.f(qchVar);
                            qchVar.t1(tugVar, bundle);
                            return;
                        }
                        List<mch> listJ = hzgVar.j(str2, str, this.e, this.d);
                        Bundle bundle2 = new Bundle();
                        if (listJ != null) {
                            for (mch mchVar : listJ) {
                                String str3 = mchVar.e;
                                String str4 = mchVar.b;
                                if (str3 != null) {
                                    bundle2.putString(str4, str3);
                                } else {
                                    Long l = mchVar.d;
                                    if (l != null) {
                                        bundle2.putLong(str4, l.longValue());
                                    } else {
                                        Double d = mchVar.g;
                                        if (d != null) {
                                            bundle2.putDouble(str4, d.doubleValue());
                                        }
                                    }
                                }
                            }
                        }
                        try {
                            lahVar.N0();
                            qch qchVar2 = w3hVar.w;
                            w3h.f(qchVar2);
                            qchVar2.t1(tugVar, bundle2);
                            return;
                        } catch (RemoteException e) {
                            e = e;
                            bundle = bundle2;
                            w0h w0hVar2 = w3hVar.f;
                            w3h.h(w0hVar2);
                            w0hVar2.g.c(str2, e, "Failed to get user properties; remote exception");
                            qchVar = w3hVar.w;
                            w3h.f(qchVar);
                            qchVar.t1(tugVar, bundle);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            bundle = bundle2;
                            qch qchVar3 = w3hVar.w;
                            w3h.f(qchVar3);
                            qchVar3.t1(tugVar, bundle);
                            throw th;
                        }
                    } catch (RemoteException e2) {
                        e = e2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.g;
                synchronized (atomicReference2) {
                    try {
                        try {
                            lah lahVar2 = this.f;
                            hzg hzgVar2 = lahVar2.e;
                            if (hzgVar2 == null) {
                                w0h w0hVar3 = ((w3h) lahVar2.b).f;
                                w3h.h(w0hVar3);
                                w0hVar3.g.d("(legacy) Failed to get user properties; not connected to service", null, this.b, this.c);
                                atomicReference2.set(Collections.EMPTY_LIST);
                                atomicReference2.notify();
                                return;
                            }
                            if (TextUtils.isEmpty(null)) {
                                atomicReference2.set(hzgVar2.j(this.b, this.c, this.e, this.d));
                            } else {
                                atomicReference2.set(hzgVar2.b(null, this.b, this.c, this.e));
                            }
                            lahVar2.N0();
                            atomicReference = (AtomicReference) this.g;
                            atomicReference.notify();
                            return;
                        } catch (RemoteException e3) {
                            w0h w0hVar4 = ((w3h) this.f.b).f;
                            w3h.h(w0hVar4);
                            w0hVar4.g.d("(legacy) Failed to get user properties; remote exception", null, this.b, e3);
                            ((AtomicReference) this.g).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.g;
                        }
                    } catch (Throwable th3) {
                        ((AtomicReference) this.g).notify();
                        throw th3;
                    }
                }
                break;
        }
    }

    public d9h(lah lahVar, AtomicReference atomicReference, String str, String str2, ndh ndhVar, boolean z) {
        this.g = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = ndhVar;
        this.e = z;
        this.f = lahVar;
    }
}
