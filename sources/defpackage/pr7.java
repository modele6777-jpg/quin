package defpackage;

import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pr7 implements jwf {
    public final em7 a;
    public final nfc b;
    public final x16 c;

    public pr7(em7 em7Var, nfc nfcVar, x16 x16Var) {
        em7Var.getClass();
        nfcVar.getClass();
        this.a = em7Var;
        this.b = nfcVar;
        this.c = x16Var;
    }

    @Override // defpackage.jwf
    public final ewf c(em7 em7Var, m69 m69Var) throws ofc {
        em7Var.getClass();
        yt ytVar = new yt(this.c, m69Var);
        hr7 hr7Var = this.b.e;
        vd9 vd9Var = hr7Var.e;
        vd9Var.getClass();
        Object obj = ((HashMap) vd9Var.b).get(or7.a);
        if (obj == null) {
            obj = null;
        }
        if (!pa7.t(obj, Boolean.TRUE)) {
            nfc nfcVar = this.b;
            em7 em7Var2 = this.a;
            nfcVar.getClass();
            em7Var2.getClass();
            return (ewf) nfcVar.g(em7Var2, ytVar, null);
        }
        String str = em7Var.r() + '-' + t72.A();
        j8f j8fVar = new j8f(em7Var);
        j8f j8fVar2 = mwf.a;
        szc szcVar = hr7Var.c;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) szcVar.d;
        hr7 hr7Var2 = (hr7) szcVar.b;
        rs0 rs0Var = hr7Var2.a;
        rs0Var.getClass();
        a48 a48Var = a48.a;
        rs0Var.H(a48Var, "| (+) Scope - id:'" + str + "' q:'" + j8fVar + '\'');
        Set set = (Set) szcVar.c;
        if (!set.contains(j8fVar)) {
            rs0 rs0Var2 = hr7Var2.a;
            rs0Var2.getClass();
            rs0Var2.H(a48Var, "| Scope '" + j8fVar + "' not defined. Creating it ...");
            set.add(j8fVar);
        }
        if (concurrentHashMap.containsKey(str)) {
            throw new ofc(ib8.j("Scope with id '", str, "' is already created"));
        }
        nfc nfcVar2 = new nfc(j8fVar, str, j8fVar2, (hr7) szcVar.b, 4);
        nfc[] nfcVarArr = {(nfc) szcVar.e};
        if (nfcVar2.c) {
            qc0.p("Can't add scope link to a root scope");
            return null;
        }
        nfcVar2.f.addAll(0, qd0.G0(nfcVarArr));
        concurrentHashMap.put(str, nfcVar2);
        nfc nfcVar3 = this.b;
        if (!nfcVar3.c) {
            nfc[] nfcVarArr2 = {nfcVar3};
            if (nfcVar2.c) {
                qc0.p("Can't add scope link to a root scope");
                return null;
            }
            nfcVar2.f.addAll(0, qd0.G0(nfcVarArr2));
        }
        em7 em7Var3 = this.a;
        em7Var3.getClass();
        ewf ewfVar = (ewf) nfcVar2.g(em7Var3, ytVar, null);
        nwf nwfVar = new nwf(str, hr7Var);
        fwf fwfVar = ewfVar.a;
        if (fwfVar.d) {
            fwf.a(nwfVar);
            return ewfVar;
        }
        synchronized (fwfVar.a) {
            fwfVar.c.add(nwfVar);
        }
        return ewfVar;
    }
}
