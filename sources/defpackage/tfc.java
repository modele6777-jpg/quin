package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tfc extends u57 {
    public ConcurrentHashMap b;

    @Override // defpackage.u57
    public final Object b(hbc hbcVar) {
        Object objA;
        if (!pa7.t(((nfc) hbcVar.b).a, this.a.a) && !pa7.t((j8f) hbcVar.f, this.a.a)) {
            throw new IllegalStateException(("Wrong Scope qualifier: trying to open instance for " + ((nfc) hbcVar.b).b + " in " + this.a).toString());
        }
        Object obj = this.b.get(((nfc) hbcVar.b).b);
        if (obj != null) {
            return obj;
        }
        synchronized (this) {
            ConcurrentHashMap concurrentHashMap = this.b;
            nfc nfcVar = (nfc) hbcVar.b;
            objA = concurrentHashMap.get(nfcVar.b);
            if (objA == null) {
                objA = a(hbcVar);
                this.b.put(nfcVar.b, objA);
            }
        }
        return objA;
    }
}
