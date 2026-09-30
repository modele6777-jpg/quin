package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class m1d {
    public final d4d a;
    public final d4d b;

    public m1d(d4d d4dVar, d4d d4dVar2) {
        d4dVar.getClass();
        d4dVar2.getClass();
        this.a = d4dVar;
        this.b = d4dVar2;
    }

    public final double a() {
        Double d = this.a.d();
        if (d != null) {
            double dDoubleValue = d.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        Double d2 = this.b.d();
        if (d2 != null) {
            double dDoubleValue2 = d2.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r5.b.b(r0) == r4) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.zn2 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.l1d
            if (r0 == 0) goto L13
            r0 = r6
            l1d r0 = (defpackage.l1d) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            l1d r0 = new l1d
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            bw2 r4 = defpackage.bw2.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.jzb.q(r6)
            goto L4e
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r5)
            r5 = 0
            return r5
        L31:
            defpackage.jzb.q(r6)
            goto L43
        L35:
            defpackage.jzb.q(r6)
            r0.label = r3
            d4d r6 = r5.a
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r4) goto L43
            goto L4d
        L43:
            r0.label = r2
            d4d r5 = r5.b
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r4) goto L4e
        L4d:
            return r4
        L4e:
            wef r5 = defpackage.wef.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m1d.b(zn2):java.lang.Object");
    }
}
