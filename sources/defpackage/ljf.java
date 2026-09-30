package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ljf extends gbe implements l26 {
    final /* synthetic */ ph2 $optionPriority;
    final /* synthetic */ zif $type;
    final /* synthetic */ Map<CaptureRequest.Key<?>, Object> $values;
    int label;
    final /* synthetic */ pjf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ljf(pjf pjfVar, zif zifVar, Map map, ph2 ph2Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = pjfVar;
        this.$type = zifVar;
        this.$values = map;
        this.$optionPriority = ph2Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ljf(this.this$0, this.$type, this.$values, this.$optionPriority, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (((defpackage.nu3) r7).H0(r6) == r3) goto L15;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            r1 = 2
            r2 = 1
            bw2 r3 = defpackage.bw2.a
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            defpackage.jzb.q(r7)
            goto L3c
        L10:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            r6 = 0
            return r6
        L17:
            defpackage.jzb.q(r7)
            goto L31
        L1b:
            defpackage.jzb.q(r7)
            pjf r7 = r6.this$0
            zif r0 = r6.$type
            java.util.Map<android.hardware.camera2.CaptureRequest$Key<?>, java.lang.Object> r4 = r6.$values
            ph2 r5 = r6.$optionPriority
            r6.label = r2
            za2 r2 = defpackage.pjf.l
            java.lang.Object r7 = r7.o(r0, r4, r5, r6)
            if (r7 != r3) goto L31
            goto L3b
        L31:
            nu3 r7 = (defpackage.nu3) r7
            r6.label = r1
            java.lang.Object r6 = r7.H0(r6)
            if (r6 != r3) goto L3c
        L3b:
            return r3
        L3c:
            wef r6 = defpackage.wef.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ljf.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ljf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
