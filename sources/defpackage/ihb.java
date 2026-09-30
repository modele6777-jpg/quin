package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ihb extends ewf {
    public final zgb b;
    public final s0e c;
    public final whb d;
    public boolean e;

    public ihb(zgb zgbVar) {
        this.b = zgbVar;
        s0e s0eVarA = t0e.a(dhb.a);
        this.c = s0eVarA;
        this.d = if9.n(s0eVarA);
    }

    public final void f(String str, x6d x6dVar, String str2) {
        str.getClass();
        x6dVar.getClass();
        str2.getClass();
        if (this.e) {
            return;
        }
        this.e = true;
        this.c.n(null, dhb.a);
        ynb.V(hwf.a(this), null, null, new ghb(x6dVar, this, str2, str, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object g(String str, e8d e8dVar, zn2 zn2Var) {
        hhb hhbVar;
        ehb ehbVar;
        String str2;
        if (zn2Var instanceof hhb) {
            hhbVar = (hhb) zn2Var;
            int i = hhbVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                hhbVar.label = i - Integer.MIN_VALUE;
            } else {
                hhbVar = new hhb(this, zn2Var);
            }
        } else {
            hhbVar = new hhb(this, zn2Var);
        }
        hhb hhbVar2 = hhbVar;
        Object obj = hhbVar2.result;
        int i2 = hhbVar2.label;
        if (i2 == 0) {
            jzb.q(obj);
            Object value = this.c.getValue();
            ehb ehbVar2 = value instanceof ehb ? (ehb) value : null;
            if (ehbVar2 == null) {
                qc0.p("Required value was null.");
                return null;
            }
            ugb ugbVar = (ugb) bm8.B(ehbVar2.b, e8dVar);
            String str3 = ugbVar.a;
            String str4 = ugbVar.b;
            String str5 = ugbVar.c;
            hhbVar2.L$0 = str;
            hhbVar2.L$1 = e8dVar;
            hhbVar2.L$2 = ehbVar2;
            hhbVar2.L$3 = null;
            hhbVar2.label = 1;
            Object objA = this.b.a(str, str3, str4, str5, hhbVar2);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
            ehb ehbVar3 = ehbVar2;
            obj = objA;
            ehbVar = ehbVar3;
            str2 = str;
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ehbVar = (ehb) hhbVar2.L$2;
            e8dVar = (e8d) hhbVar2.L$1;
            str2 = (String) hhbVar2.L$0;
            jzb.q(obj);
        }
        String str6 = (String) obj;
        tm7.P(str6, str2);
        if (str6.equals(bm8.B(ehbVar.a, e8dVar))) {
            return wef.a;
        }
        qc0.p("Reading share identity changed");
        return null;
    }
}
