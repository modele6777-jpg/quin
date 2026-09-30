package defpackage;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kfh extends weh {
    public static final kfh g;
    public final nfh f;

    static {
        UUID uuidRandomUUID = UUID.randomUUID();
        g = new kfh("<skip trace>", uuidRandomUUID, weh.b(uuidRandomUUID), mfh.e, dfh.c());
    }

    public kfh(String str, UUID uuid, String str2, nfh nfhVar, qfh qfhVar) {
        super(str, uuid, str2, qfhVar);
        pa7.A(nfhVar.c);
        this.f = nfhVar;
    }

    @Override // defpackage.weh
    public final nfh h() {
        nfh nfhVarL = l();
        nfh nfhVar = this.f;
        nfhVar.getClass();
        nfh nfhVar2 = mfh.e;
        if (nfhVar == nfhVar2) {
            return nfhVarL;
        }
        nfhVarL.getClass();
        if (nfhVarL == nfhVar2) {
            return nfhVar;
        }
        ry6<nfh> ry6VarM = ry6.m(2, nfhVar, nfhVarL);
        if (ry6VarM.isEmpty()) {
            return nfhVar2;
        }
        if (ry6VarM.size() == 1) {
            return (nfh) ry6VarM.iterator().next();
        }
        int i = 0;
        for (nfh nfhVar3 : ry6VarM) {
            do {
                i += nfhVar3.b.c;
                nfhVar3 = nfhVar3.a;
            } while (nfhVar3 != null);
        }
        if (i == 0) {
            return mfh.e;
        }
        wid widVar = new wid(i);
        for (nfh nfhVar4 : ry6VarM) {
            do {
                int i2 = 0;
                while (true) {
                    wid widVar2 = nfhVar4.b;
                    if (i2 >= widVar2.c) {
                        break;
                    }
                    pa7.B(widVar.put((lfh) widVar2.f(i2), widVar2.i(i2)) == null, "Duplicate bindings: %s", widVar2.f(i2));
                    i2++;
                }
                nfhVar4 = nfhVar4.a;
            } while (nfhVar4 != null);
        }
        return new mfh(null, widVar).a();
    }

    @Override // defpackage.weh
    public final nfh l() {
        return mfh.e;
    }
}
