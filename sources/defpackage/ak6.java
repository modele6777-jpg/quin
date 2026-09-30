package defpackage;

import java.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ak6 extends gbe implements l26 {
    final /* synthetic */ r91 $monthState;
    final /* synthetic */ LocalDate $selectedDate;
    final /* synthetic */ t91 $viewMode;
    final /* synthetic */ t2g $weekState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak6(t91 t91Var, t2g t2gVar, LocalDate localDate, r91 r91Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$viewMode = t91Var;
        this.$weekState = t2gVar;
        this.$selectedDate = localDate;
        this.$monthState = r91Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ak6(this.$viewMode, this.$weekState, this.$selectedDate, this.$monthState, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r6 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        if (r6 == r0) goto L32;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.label
            r1 = 0
            r2 = 2
            wef r3 = defpackage.wef.a
            r4 = 1
            if (r0 == 0) goto L1b
            if (r0 == r4) goto L17
            if (r0 != r2) goto L11
            defpackage.jzb.q(r6)
            goto L4e
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r5)
            return r1
        L17:
            defpackage.jzb.q(r6)
            goto L75
        L1b:
            defpackage.jzb.q(r6)
            t91 r6 = r5.$viewMode
            int r6 = r6.ordinal()
            bw2 r0 = defpackage.bw2.a
            if (r6 == 0) goto L55
            if (r6 != r4) goto L51
            r91 r6 = r5.$monthState
            java.time.LocalDate r1 = r5.$selectedDate
            java.time.YearMonth r1 = defpackage.tq.B(r1)
            r5.label = r2
            j18 r2 = r6.f
            java.lang.Integer r6 = r6.f(r1)
            if (r6 == 0) goto L4a
            int r6 = r6.intValue()
            vea r1 = defpackage.j18.y
            java.lang.Object r5 = r2.f(r6, r5)
            if (r5 != r0) goto L4a
            r6 = r5
            goto L4b
        L4a:
            r6 = r3
        L4b:
            if (r6 != r0) goto L4e
            goto L74
        L4e:
            wef r6 = (defpackage.wef) r6
            return r3
        L51:
            defpackage.ap.c()
            return r1
        L55:
            t2g r6 = r5.$weekState
            java.time.LocalDate r1 = r5.$selectedDate
            r5.label = r4
            j18 r2 = r6.j
            java.lang.Integer r6 = r6.f(r1)
            if (r6 == 0) goto L71
            int r6 = r6.intValue()
            vea r1 = defpackage.j18.y
            java.lang.Object r5 = r2.f(r6, r5)
            if (r5 != r0) goto L71
            r6 = r5
            goto L72
        L71:
            r6 = r3
        L72:
            if (r6 != r0) goto L75
        L74:
            return r0
        L75:
            wef r6 = (defpackage.wef) r6
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak6.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ak6) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
