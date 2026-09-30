package defpackage;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pib implements h87 {
    public final sw6 a;
    public final List b;
    public final int c;
    public final sw6 d;
    public final ykd e;
    public final uz4 f;
    public final boolean g;

    public pib(sw6 sw6Var, List list, int i, sw6 sw6Var2, ykd ykdVar, uz4 uz4Var, boolean z) {
        this.a = sw6Var;
        this.b = list;
        this.c = i;
        this.d = sw6Var2;
        this.e = ykdVar;
        this.f = uz4Var;
        this.g = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zn2 zn2Var) throws Throwable {
        nib nibVar;
        sv4 sv4Var;
        if (zn2Var instanceof nib) {
            nibVar = (nib) zn2Var;
            int i = nibVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nibVar.label = i - Integer.MIN_VALUE;
            } else {
                nibVar = new nib(this, zn2Var);
            }
        } else {
            nibVar = new nib(this, zn2Var);
        }
        Object obj = nibVar.result;
        int i2 = nibVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            List list = this.b;
            int i3 = this.c;
            sv4 sv4Var2 = (sv4) list.get(i3);
            uz4 uz4Var = this.f;
            boolean z = this.g;
            pib pibVar = new pib(this.a, this.b, i3 + 1, this.d, this.e, uz4Var, z);
            nibVar.L$0 = sv4Var2;
            nibVar.L$1 = null;
            nibVar.label = 1;
            Object objD = sv4Var2.d(pibVar, nibVar);
            bw2 bw2Var = bw2.a;
            if (objD == bw2Var) {
                return bw2Var;
            }
            sv4Var = sv4Var2;
            obj = objD;
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sv4Var = (sv4) nibVar.L$0;
            jzb.q(obj);
        }
        zw6 zw6Var = (zw6) obj;
        sw6 sw6VarH = zw6Var.h();
        Context context = sw6VarH.a;
        sw6 sw6Var = this.a;
        if (context != sw6Var.a) {
            r82.e(sv4Var, "' cannot modify the request's context.", "Interceptor '");
            return null;
        }
        if (sw6VarH.b == pj9.a) {
            r82.e(sv4Var, "' cannot set the request's data to null.", "Interceptor '");
            return null;
        }
        if (sw6VarH.c != sw6Var.c) {
            r82.e(sv4Var, "' cannot modify the request's target.", "Interceptor '");
            return null;
        }
        if (sw6VarH.o == sw6Var.o) {
            return zw6Var;
        }
        r82.e(sv4Var, "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.", "Interceptor '");
        return null;
    }
}
