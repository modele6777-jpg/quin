package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xcf extends gbe implements l26 {
    final /* synthetic */ s69 $expandedIndex$delegate;
    final /* synthetic */ s69 $expandedOffset$delegate;
    final /* synthetic */ j18 $listState;
    final /* synthetic */ List<d6d> $strips;
    final /* synthetic */ boolean $zoomedOut;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xcf(boolean z, j18 j18Var, List list, s69 s69Var, s69 s69Var2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$zoomedOut = z;
        this.$listState = j18Var;
        this.$strips = list;
        this.$expandedIndex$delegate = s69Var;
        this.$expandedOffset$delegate = s69Var2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new xcf(this.$zoomedOut, this.$listState, this.$strips, this.$expandedIndex$delegate, this.$expandedOffset$delegate, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r0.j(0, 0, r4) == r3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r0.j(r5, r2, r4) == r3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        return r3;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.label
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L16
            if (r0 == r2) goto L12
            if (r0 != r1) goto Lb
            goto L12
        Lb:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r4)
            r4 = 0
            return r4
        L12:
            defpackage.jzb.q(r5)
            goto L4f
        L16:
            defpackage.jzb.q(r5)
            boolean r5 = r4.$zoomedOut
            j18 r0 = r4.$listState
            bw2 r3 = defpackage.bw2.a
            if (r5 == 0) goto L2d
            r4.label = r2
            vea r5 = defpackage.j18.y
            r5 = 0
            java.lang.Object r4 = r0.j(r5, r5, r4)
            if (r4 != r3) goto L4f
            goto L4e
        L2d:
            s69 r5 = r4.$expandedIndex$delegate
            sz9 r5 = (defpackage.sz9) r5
            int r5 = r5.j()
            java.util.List<d6d> r2 = r4.$strips
            int r2 = defpackage.t72.E(r2)
            if (r5 <= r2) goto L3e
            r5 = r2
        L3e:
            s69 r2 = r4.$expandedOffset$delegate
            sz9 r2 = (defpackage.sz9) r2
            int r2 = r2.j()
            r4.label = r1
            java.lang.Object r4 = r0.j(r5, r2, r4)
            if (r4 != r3) goto L4f
        L4e:
            return r3
        L4f:
            wef r4 = defpackage.wef.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xcf.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((xcf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
