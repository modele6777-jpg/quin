package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t4h implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ ndh c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t4h(e5h e5hVar, ndh ndhVar, Bundle bundle, ozg ozgVar, String str) {
        this.d = e5hVar;
        this.c = ndhVar;
        this.e = bundle;
        this.f = ozgVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        qch qchVar;
        switch (this.a) {
            case 0:
                e5h e5hVar = (e5h) this.d;
                ndh ndhVar = this.c;
                Bundle bundle = (Bundle) this.e;
                ozg ozgVar = (ozg) this.f;
                String str = this.b;
                ich ichVar = e5hVar.d;
                ichVar.U();
                try {
                    ozgVar.C(ichVar.e0(bundle, ndhVar));
                    return;
                } catch (RemoteException e) {
                    ichVar.v().g.c(str, e, "Failed to return trigger URIs for app");
                    return;
                }
            case 1:
                AtomicReference atomicReference2 = (AtomicReference) this.d;
                synchronized (atomicReference2) {
                    try {
                        try {
                            lah lahVar = (lah) this.f;
                            hzg hzgVar = lahVar.e;
                            if (hzgVar == null) {
                                w0h w0hVar = ((w3h) lahVar.b).f;
                                w3h.h(w0hVar);
                                w0hVar.g.d("(legacy) Failed to get conditional properties; not connected to service", null, this.b, (String) this.e);
                                atomicReference2.set(Collections.EMPTY_LIST);
                                atomicReference2.notify();
                                return;
                            }
                            if (TextUtils.isEmpty(null)) {
                                atomicReference2.set(hzgVar.u(this.b, (String) this.e, this.c));
                            } else {
                                atomicReference2.set(hzgVar.p(null, this.b, (String) this.e));
                            }
                            lahVar.N0();
                            atomicReference = (AtomicReference) this.d;
                            atomicReference.notify();
                            return;
                        } catch (Throwable th) {
                            ((AtomicReference) this.d).notify();
                            throw th;
                        }
                    } catch (RemoteException e2) {
                        w0h w0hVar2 = ((w3h) ((lah) this.f).b).f;
                        w3h.h(w0hVar2);
                        w0hVar2.g.d("(legacy) Failed to get conditional properties; remote exception", null, this.b, e2);
                        ((AtomicReference) this.d).set(Collections.EMPTY_LIST);
                        atomicReference = (AtomicReference) this.d;
                    }
                }
                break;
            default:
                tug tugVar = (tug) this.e;
                String str2 = (String) this.d;
                String str3 = this.b;
                lah lahVar2 = (lah) this.f;
                w3h w3hVar = (w3h) lahVar2.b;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        hzg hzgVar2 = lahVar2.e;
                        if (hzgVar2 == null) {
                            w0h w0hVar3 = w3hVar.f;
                            w3h.h(w0hVar3);
                            w0hVar3.g.c(str3, str2, "Failed to get conditional properties; not connected to service");
                            qchVar = w3hVar.w;
                        } else {
                            arrayList = qch.v1(hzgVar2.u(str3, str2, this.c));
                            lahVar2.N0();
                            qchVar = w3hVar.w;
                        }
                    } catch (RemoteException e3) {
                        w0h w0hVar4 = w3hVar.f;
                        w3h.h(w0hVar4);
                        w0hVar4.g.d("Failed to get conditional properties; remote exception", str3, str2, e3);
                    }
                    w3h.f(qchVar);
                    qchVar.u1(tugVar, arrayList);
                    return;
                } catch (Throwable th2) {
                    qch qchVar2 = w3hVar.w;
                    w3h.f(qchVar2);
                    qchVar2.u1(tugVar, arrayList);
                    throw th2;
                }
        }
    }

    public t4h(lah lahVar, String str, String str2, ndh ndhVar, tug tugVar) {
        this.b = str;
        this.d = str2;
        this.c = ndhVar;
        this.e = tugVar;
        this.f = lahVar;
    }

    public t4h(lah lahVar, AtomicReference atomicReference, String str, String str2, ndh ndhVar) {
        this.d = atomicReference;
        this.b = str;
        this.e = str2;
        this.c = ndhVar;
        this.f = lahVar;
    }
}
