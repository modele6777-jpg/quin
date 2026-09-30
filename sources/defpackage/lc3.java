package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lc3 extends h8c {
    public List c;
    public final /* synthetic */ od3 d;

    public lc3(od3 od3Var, List list) {
        this.d = od3Var;
        this.c = s72.j1(list);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        if (r7 == r1) goto L27;
     */
    @Override // defpackage.h8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.zn2 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.hc3
            if (r0 == 0) goto L13
            r0 = r7
            hc3 r0 = (defpackage.hc3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            hc3 r0 = new hc3
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            od3 r5 = r6.d
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.jzb.q(r7)
            goto L57
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            return r2
        L31:
            defpackage.jzb.q(r7)
            goto L64
        L35:
            defpackage.jzb.q(r7)
            java.util.List r7 = r6.c
            bw2 r1 = defpackage.bw2.a
            if (r7 == 0) goto L5a
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L45
            goto L5a
        L45:
            k77 r7 = r5.c()
            kc3 r4 = new kc3
            r4.<init>(r5, r6, r2)
            r0.label = r3
            java.lang.Object r7 = r7.c(r4, r0)
            if (r7 != r1) goto L57
            goto L63
        L57:
            cb3 r7 = (defpackage.cb3) r7
            goto L66
        L5a:
            r0.label = r4
            r6 = 0
            java.lang.Object r7 = r5.h(r6, r0)
            if (r7 != r1) goto L64
        L63:
            return r1
        L64:
            cb3 r7 = (defpackage.cb3) r7
        L66:
            kd9 r6 = r5.h
            r6.M(r7)
            wef r6 = defpackage.wef.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lc3.a(zn2):java.lang.Object");
    }
}
