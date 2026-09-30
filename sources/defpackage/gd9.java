package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gd9 implements i87 {
    public final m8b a;

    public gd9() {
        hf8.Q.getClass();
        this.a = ef8.a("NetSim");
    }

    @Override // defpackage.i87
    public final ryb a(oib oibVar) throws IOException {
        Object next;
        tyb tybVarP;
        oq8 oq8VarC0;
        Object key;
        btb btbVar = oibVar.e;
        boolean z = jd9.a;
        if (jd9.a) {
            yg5.m("net-sim: simulated offline");
            return null;
        }
        long j = jd9.b;
        Long lValueOf = Long.valueOf(j);
        if (j <= 0) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            try {
                Thread.sleep(lValueOf.longValue());
            } catch (InterruptedException unused) {
            }
        }
        boolean z2 = jd9.a;
        String str = btbVar.a.i;
        Set setEntrySet = jd9.c.entrySet();
        setEntrySet.getClass();
        Iterator it = setEntrySet.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            key = ((Map.Entry) next).getKey();
            key.getClass();
        } while (!v4e.F(str, (CharSequence) key, false));
        Map.Entry entry = (Map.Entry) next;
        fd9 fd9Var = entry != null ? (fd9) entry.getValue() : null;
        if (fd9Var == null) {
            return oibVar.b(btbVar);
        }
        String str2 = fd9Var.b;
        if (str2 != null) {
            tyb tybVar = vyb.b;
            rob robVar = oq8.e;
            try {
                oq8VarC0 = kj0.c0(fd9Var.c);
            } catch (IllegalArgumentException unused2) {
                oq8VarC0 = null;
            }
            tybVarP = uyb.p(str2, oq8VarC0);
        } else {
            tyb tybVar2 = vyb.b;
            tybVarP = uyb.p("", null);
        }
        tyb tybVar3 = tybVarP;
        m8b m8bVar = this.a;
        int i = fd9Var.a;
        String str3 = btbVar.b;
        String strB = btbVar.a.b();
        String str4 = fd9Var.b;
        m8bVar.g("net-sim forced " + i + " for " + str3 + " " + strB + " bodyBytes=" + (str4 != null ? str4.length() : 0));
        tyb tybVar4 = vyb.b;
        g3e g3eVar = g2f.d0;
        ArrayList arrayList = new ArrayList(20);
        a1b a1bVar = a1b.HTTP_1_1;
        int i2 = fd9Var.a;
        String strE = tec.e(i2, "net-sim forced ");
        if (i2 >= 0) {
            return new ryb(btbVar, a1bVar, strE, i2, null, new si6((String[]) arrayList.toArray(new String[0])), tybVar3, null, null, null, null, 0L, 0L, null, g3eVar);
        }
        ho7.j(tec.e(i2, "code < 0: "));
        return null;
    }
}
