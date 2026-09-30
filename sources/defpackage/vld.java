package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vld extends gbe implements l26 {
    final /* synthetic */ yx9 $pagerState;
    final /* synthetic */ List<old> $skinDetailBanners;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vld(List list, yx9 yx9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$skinDetailBanners = list;
        this.$pagerState = yx9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new vld(this.$skinDetailBanners, this.$pagerState, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    /* JADX WARN: Code duplicated, block: B:16:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004c -> B:11:0x001b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            r1 = 2
            r2 = 1
            bw2 r3 = defpackage.bw2.a
            if (r0 == 0) goto L18
            if (r0 == r2) goto L14
            if (r0 != r1) goto Ld
            goto L18
        Ld:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            r6 = 0
            return r6
        L14:
            defpackage.jzb.q(r7)
            goto L2e
        L18:
            defpackage.jzb.q(r7)
        L1b:
            java.util.List<old> r7 = r6.$skinDetailBanners
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L4f
            r6.label = r2
            r4 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r7 = defpackage.vfh.q(r4, r6)
            if (r7 != r3) goto L2e
            goto L4e
        L2e:
            yx9 r7 = r6.$pagerState
            hzc r7 = r7.d
            java.lang.Object r7 = r7.c
            sz9 r7 = (defpackage.sz9) r7
            int r7 = r7.j()
            int r7 = r7 + r2
            java.util.List<old> r0 = r6.$skinDetailBanners
            int r0 = r0.size()
            int r7 = r7 % r0
            yx9 r0 = r6.$pagerState
            r6.I$0 = r7
            r6.label = r1
            java.lang.Object r7 = defpackage.yx9.g(r0, r7, r6)
            if (r7 != r3) goto L1b
        L4e:
            return r3
        L4f:
            wef r6 = defpackage.wef.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vld.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((vld) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
