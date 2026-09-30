package defpackage;

import ai.askquin.qa.bridge.QaResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k74 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    public static final QaResult.Ok a(ti7 ti7Var, x16 x16Var, a26 a26Var) {
        int iIntValue;
        ?? r6;
        boolean zBooleanValue;
        nh7 nh7Var = (nh7) ti7Var.get("enabled");
        Boolean boolValueOf = nh7Var != null ? Boolean.valueOf(oh7.e(oh7.i(nh7Var))) : null;
        if (boolValueOf != null) {
            zBooleanValue = boolValueOf.booleanValue();
        } else {
            iIntValue = ((Number) x16Var.invoke()).intValue();
        }
        if (boolValueOf != null) {
            r6 = iIntValue;
            r6 = zBooleanValue;
            a26Var.d(Integer.valueOf((int) r6));
        }
        r6 = iIntValue;
        r6 = zBooleanValue;
        return new QaResult.Ok(new ti7(bm8.H(new iy9("enabled", oh7.a(Boolean.valueOf(r6 == 1))), new iy9("isOverridden", oh7.a(Boolean.valueOf(r6 != -1))))));
    }
}
