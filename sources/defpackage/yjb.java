package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yjb extends gbe implements l26 {
    final /* synthetic */ int $count;
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    int label;
    final /* synthetic */ akb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yjb(int i, akb akbVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$count = i;
        this.this$0 = akbVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new yjb(this.$count, this.this$0, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0039 -> B:13:0x003c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.label
            r1 = 1
            if (r0 == 0) goto L1a
            if (r0 != r1) goto L13
            int r0 = r5.I$1
            int r2 = r5.I$0
            java.lang.Object r3 = r5.L$0
            akb r3 = (defpackage.akb) r3
            defpackage.jzb.q(r6)
            goto L3c
        L13:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r5)
            r5 = 0
            return r5
        L1a:
            defpackage.jzb.q(r6)
            int r6 = r5.$count
            akb r0 = r5.this$0
            r2 = 0
            r3 = r0
            r0 = r2
            r2 = r6
        L25:
            if (r0 >= r2) goto L3e
            gd8 r6 = r3.a
            r5.L$0 = r3
            r5.I$0 = r2
            r5.I$1 = r0
            r5.I$2 = r0
            r5.label = r1
            java.lang.Object r6 = r6.l(r5)
            bw2 r4 = defpackage.bw2.a
            if (r6 != r4) goto L3c
            return r4
        L3c:
            int r0 = r0 + r1
            goto L25
        L3e:
            wef r5 = defpackage.wef.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yjb.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((yjb) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
