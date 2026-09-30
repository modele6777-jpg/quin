package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lg9 {
    public final gic a;
    public final l26 b;
    public sw3 c;
    public boolean d;
    public final w84 e = new w84(0);

    public lg9(gic gicVar, l26 l26Var, sw3 sw3Var) {
        this.a = gicVar;
        this.b = l26Var;
        this.c = sw3Var;
    }

    public static void a(hia hiaVar) {
        List list = hiaVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((oia) list.get(i)).a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(l26 l26Var, zn2 zn2Var) throws Throwable {
        jg9 jg9Var;
        if (zn2Var instanceof jg9) {
            jg9Var = (jg9) zn2Var;
            int i = jg9Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                jg9Var.label = i - Integer.MIN_VALUE;
            } else {
                jg9Var = new jg9(this, zn2Var);
            }
        } else {
            jg9Var = new jg9(this, zn2Var);
        }
        Object obj = jg9Var.result;
        int i2 = jg9Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            this.d = true;
            kg9 kg9Var = new kg9(this, l26Var, null);
            jg9Var.label = 1;
            s8e s8eVar = new s8e(jg9Var, jg9Var.getContext());
            Object objC = gcc.C(s8eVar, true, s8eVar, kg9Var);
            bw2 bw2Var = bw2.a;
            if (objC == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        this.d = false;
        return wef.a;
    }
}
