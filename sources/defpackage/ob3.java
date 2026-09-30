package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ob3 extends gbe implements l26 {
    final /* synthetic */ List<a26> $cleanUps;
    final /* synthetic */ List<kb3> $migrations;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob3(List list, List list2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$migrations = list;
        this.$cleanUps = list2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ob3 ob3Var = new ob3(this.$migrations, this.$cleanUps, xn2Var);
        ob3Var.L$0 = obj;
        return ob3Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0047  */
    /* JADX WARN: Code duplicated, block: B:16:0x0060  */
    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0099  */
    /* JADX WARN: Code duplicated, block: B:23:0x009b  */
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
            r1 = 2
            r2 = 1
            r3 = 0
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L34
            if (r0 == r2) goto L1f
            if (r0 != r1) goto L19
            java.lang.Object r0 = r11.L$1
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r5 = r11.L$0
            java.util.List r5 = (java.util.List) r5
            defpackage.jzb.q(r12)
            goto L41
        L19:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r11)
            return r3
        L1f:
            java.lang.Object r0 = r11.L$3
            java.lang.Object r5 = r11.L$2
            kb3 r5 = (defpackage.kb3) r5
            java.lang.Object r6 = r11.L$1
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r11.L$0
            java.util.List r7 = (java.util.List) r7
            defpackage.jzb.q(r12)
            r10 = r7
            r7 = r5
            r5 = r10
            goto L65
        L34:
            defpackage.jzb.q(r12)
            java.lang.Object r12 = r11.L$0
            java.util.List<kb3> r0 = r11.$migrations
            java.util.List<a26> r5 = r11.$cleanUps
            java.util.Iterator r0 = r0.iterator()
        L41:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L9d
            java.lang.Object r6 = r0.next()
            kb3 r6 = (defpackage.kb3) r6
            r11.L$0 = r5
            r11.L$1 = r0
            r11.L$2 = r6
            r11.L$3 = r12
            r11.label = r2
            xcd r6 = (defpackage.xcd) r6
            java.lang.Object r7 = r6.a(r12, r11)
            if (r7 != r4) goto L60
            goto L98
        L60:
            r10 = r0
            r0 = r12
            r12 = r7
            r7 = r6
            r6 = r10
        L65:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L9b
            nb3 r12 = new nb3
            r12.<init>(r7, r3)
            r5.add(r12)
            r11.L$0 = r5
            r11.L$1 = r6
            r11.L$2 = r3
            r11.L$3 = r3
            r11.label = r1
            xcd r7 = (defpackage.xcd) r7
            ycd r12 = r7.b
            cdd r8 = new cdd
            ace r9 = r7.e
            java.lang.Object r9 = r9.getValue()
            android.content.SharedPreferences r9 = (android.content.SharedPreferences) r9
            java.util.Set r7 = r7.f
            r8.<init>(r9, r7)
            java.lang.Object r12 = r12.m(r8, r0, r11)
            if (r12 != r4) goto L99
        L98:
            return r4
        L99:
            r0 = r6
            goto L41
        L9b:
            r12 = r0
            goto L99
        L9d:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ob3.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ob3) k((xn2) obj2, obj)).r(wef.a);
    }
}
