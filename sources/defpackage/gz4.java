package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gz4 extends gbe implements l26 {
    final /* synthetic */ List<wm6> $events;
    final /* synthetic */ e89 $index$delegate;
    final /* synthetic */ int $showMillis;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz4(int i, List list, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$showMillis = i;
        this.$events = list;
        this.$index$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new gz4(this.$showMillis, this.$events, this.$index$delegate, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:12:0x0023). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L12
            if (r0 != r1) goto Lb
            defpackage.jzb.q(r5)
            goto L23
        Lb:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r4)
            r4 = 0
            return r4
        L12:
            defpackage.jzb.q(r5)
        L15:
            int r5 = r4.$showMillis
            long r2 = (long) r5
            r4.label = r1
            java.lang.Object r5 = defpackage.vfh.q(r2, r4)
            bw2 r0 = defpackage.bw2.a
            if (r5 != r0) goto L23
            return r0
        L23:
            e89 r5 = r4.$index$delegate
            java.lang.Object r0 = r5.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r0 = r0 + r1
            java.util.List<wm6> r2 = r4.$events
            int r2 = r2.size()
            int r0 = r0 % r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.setValue(r0)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gz4.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((gz4) k((xn2) obj2, (aw2) obj)).r(wef.a);
        return bw2.a;
    }
}
