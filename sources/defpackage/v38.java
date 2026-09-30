package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v38 {
    public static final v38 a = new v38();

    /* JADX WARN: Code duplicated, block: B:26:0x008f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [int] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final Object a(boolean z, zn2 zn2Var) {
        u38 u38Var;
        boolean z2;
        ?? r6;
        ?? r7;
        if (zn2Var instanceof u38) {
            u38Var = (u38) zn2Var;
            int i = u38Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                u38Var.label = i - Integer.MIN_VALUE;
            } else {
                u38Var = new u38(this, zn2Var);
            }
        } else {
            u38Var = new u38(this, zn2Var);
        }
        Object obj = u38Var.result;
        int i2 = u38Var.label;
        bw2 bw2Var = bw2.a;
        if (i2 == 0) {
            jzb.q(obj);
            z2 = !z;
            hs3 hs3Var = xqa.P0;
            Boolean boolValueOf = Boolean.valueOf(z2);
            isa isaVar = hs3Var.a;
            u38Var.L$0 = null;
            u38Var.L$1 = null;
            u38Var.Z$0 = z;
            u38Var.I$0 = z2 ? 1 : 0;
            u38Var.label = 1;
            if (bsa.n(isaVar, boolValueOf, u38Var) != bw2Var) {
            }
            r6 = z2;
            return bw2Var;
        }
        if (i2 == 1) {
            int i3 = u38Var.I$0;
            boolean z3 = u38Var.Z$0;
            jzb.q(obj);
            r6 = i3;
            z = z3;
        } else {
            if (i2 != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = u38Var.I$0;
            jzb.q(obj);
            r7 = i4;
        }
        x1f x1fVar = x1f.a;
        x1f.k(new r05("legacy_user_detected"), new pi2(r7 != 0, 4), 2);
        return wef.a;
        r6 = z2;
        hs3 hs3Var2 = xqa.Q0;
        Boolean bool = Boolean.TRUE;
        isa isaVar2 = hs3Var2.a;
        u38Var.L$0 = null;
        u38Var.L$1 = null;
        u38Var.Z$0 = z;
        u38Var.I$0 = r6;
        u38Var.label = 2;
        if (bsa.n(isaVar2, bool, u38Var) != bw2Var) {
            r7 = r6;
            x1f x1fVar2 = x1f.a;
            x1f.k(new r05("legacy_user_detected"), new pi2(r7 != 0, 4), 2);
            return wef.a;
        }
        r6 = z2;
        return bw2Var;
    }
}
