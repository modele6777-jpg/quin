package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h5f extends gbe implements l26 {
    final /* synthetic */ l2f $connection;
    final /* synthetic */ vk9[] $tablesToSync;
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ j5f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5f(vk9[] vk9VarArr, j5f j5fVar, l2f l2fVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$tablesToSync = vk9VarArr;
        this.this$0 = j5fVar;
        this.$connection = l2fVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new h5f(this.$tablesToSync, this.this$0, this.$connection, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX WARN: Code duplicated, block: B:13:0x0043  */
    /* JADX WARN: Code duplicated, block: B:15:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    /* JADX WARN: Code duplicated, block: B:19:0x005e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007c -> B:27:0x007d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.label
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L27
            if (r0 == r3) goto Lb
            if (r0 != r2) goto L21
        Lb:
            int r0 = r11.I$2
            int r4 = r11.I$1
            int r5 = r11.I$0
            java.lang.Object r6 = r11.L$2
            l2f r6 = (defpackage.l2f) r6
            java.lang.Object r7 = r11.L$1
            j5f r7 = (defpackage.j5f) r7
            java.lang.Object r8 = r11.L$0
            vk9[] r8 = (defpackage.vk9[]) r8
            defpackage.jzb.q(r12)
            goto L60
        L21:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r11)
            return r1
        L27:
            defpackage.jzb.q(r12)
            vk9[] r12 = r11.$tablesToSync
            j5f r0 = r11.this$0
            l2f r4 = r11.$connection
            int r5 = r12.length
            r6 = 0
            r8 = r12
            r7 = r0
            r12 = r4
            r0 = r5
            r4 = r6
        L37:
            if (r4 >= r0) goto L7f
            r5 = r8[r4]
            int r9 = r6 + 1
            int r5 = r5.ordinal()
            if (r5 == 0) goto L7c
            bw2 r10 = defpackage.bw2.a
            if (r5 == r3) goto L67
            if (r5 != r2) goto L63
            r11.L$0 = r8
            r11.L$1 = r7
            r11.L$2 = r12
            r11.I$0 = r9
            r11.I$1 = r4
            r11.I$2 = r0
            r11.label = r2
            java.lang.Object r5 = r7.e(r12, r6, r11)
            if (r5 != r10) goto L5e
            goto L7b
        L5e:
            r6 = r12
            r5 = r9
        L60:
            r12 = r6
            r6 = r5
            goto L7d
        L63:
            defpackage.ap.c()
            return r1
        L67:
            r11.L$0 = r8
            r11.L$1 = r7
            r11.L$2 = r12
            r11.I$0 = r9
            r11.I$1 = r4
            r11.I$2 = r0
            r11.label = r3
            java.lang.Object r5 = r7.d(r12, r6, r11)
            if (r5 != r10) goto L5e
        L7b:
            return r10
        L7c:
            r6 = r9
        L7d:
            int r4 = r4 + r3
            goto L37
        L7f:
            wef r11 = defpackage.wef.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h5f.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((h5f) k((xn2) obj2, (v0a) obj)).r(wef.a);
    }
}
