package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ub1 implements AutoCloseable {
    public final qn2 a;
    public final CopyOnWriteArrayList b;

    public ub1(vb1 vb1Var, String str) {
        qn2 qn2VarK = jgb.k(i7h.I(vb1Var.b.f, new t8e(vb1Var.c)));
        this.a = qn2VarK;
        this.b = new CopyOnWriteArrayList();
        ynb.V(qn2VarK, null, null, new rb1(vb1Var, str, this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, zn2 zn2Var) {
        sb1 sb1Var;
        ya2 ya2Var;
        if (zn2Var instanceof sb1) {
            sb1Var = (sb1) zn2Var;
            int i = sb1Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sb1Var.label = i - Integer.MIN_VALUE;
            } else {
                sb1Var = new sb1(this, zn2Var);
            }
        } else {
            sb1Var = new sb1(this, zn2Var);
        }
        Object obj = sb1Var.result;
        int i2 = sb1Var.label;
        CopyOnWriteArrayList copyOnWriteArrayList = this.b;
        if (i2 == 0) {
            jzb.q(obj);
            za2 za2Var = new za2();
            copyOnWriteArrayList.add(za2Var);
            tb1 tb1Var = new tb1(za2Var, null);
            sb1Var.L$0 = za2Var;
            sb1Var.label = 1;
            Object objS = rs0.S(j, tb1Var, sb1Var);
            bw2 bw2Var = bw2.a;
            if (objS == bw2Var) {
                return bw2Var;
            }
            obj = objS;
            ya2Var = za2Var;
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ya2Var = (ya2) sb1Var.L$0;
            jzb.q(obj);
        }
        boolean z = obj != null;
        copyOnWriteArrayList.remove(ya2Var);
        return Boolean.valueOf(z);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        jgb.I(this.a, null);
    }
}
