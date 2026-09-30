package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n31 implements k31 {
    public final p89 a = new p89(0, new o31[16]);

    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    /* JADX WARN: Code duplicated, block: B:18:0x0066 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0064 -> B:19:0x0067). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(defpackage.hkb r8, defpackage.zn2 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.m31
            if (r0 == 0) goto L13
            r0 = r9
            m31 r0 = (defpackage.m31) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            m31 r0 = new m31
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L32
            int r7 = r0.I$1
            int r8 = r0.I$0
            java.lang.Object r1 = r0.L$1
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            java.lang.Object r3 = r0.L$0
            hkb r3 = (defpackage.hkb) r3
            defpackage.jzb.q(r9)
            r9 = r3
            goto L67
        L32:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            r7 = 0
            return r7
        L39:
            defpackage.jzb.q(r9)
            p89 r7 = r7.a
            java.lang.Object[] r9 = r7.a
            int r7 = r7.c
            r1 = 0
            r6 = r9
            r9 = r8
            r8 = r1
            r1 = r6
        L47:
            if (r8 >= r7) goto L69
            r3 = r1[r8]
            o31 r3 = (defpackage.o31) r3
            p r4 = new p
            r5 = 14
            r4.<init>(r5, r9)
            r0.L$0 = r9
            r0.L$1 = r1
            r0.I$0 = r8
            r0.I$1 = r7
            r0.label = r2
            java.lang.Object r3 = defpackage.ym8.o(r3, r4, r0)
            bw2 r4 = defpackage.bw2.a
            if (r3 != r4) goto L67
            return r4
        L67:
            int r8 = r8 + r2
            goto L47
        L69:
            wef r7 = defpackage.wef.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n31.a(hkb, zn2):java.lang.Object");
    }
}
