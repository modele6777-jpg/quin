package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y4f implements xj5 {
    public final /* synthetic */ mmb a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ xj5 c;
    public final /* synthetic */ String[] d;
    public final /* synthetic */ int[] e;

    public y4f(mmb mmbVar, boolean z, xj5 xj5Var, String[] strArr, int[] iArr) {
        this.a = mmbVar;
        this.b = z;
        this.c = xj5Var;
        this.d = strArr;
        this.e = iArr;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r9.a(r0, r3) == r10) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009f, code lost:
    
        if (r9.a(r0, r3) == r10) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a1, code lost:
    
        return r10;
     */
    @Override // defpackage.xj5
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int[] r17, defpackage.xn2 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r2 instanceof defpackage.x4f
            if (r3 == 0) goto L19
            r3 = r2
            x4f r3 = (defpackage.x4f) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.label = r4
            goto L1e
        L19:
            x4f r3 = new x4f
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.result
            int r4 = r3.label
            r5 = 0
            mmb r6 = r0.a
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L3c
            if (r4 == r8) goto L34
            if (r4 != r7) goto L2e
            goto L34
        L2e:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r0)
            return r5
        L34:
            java.lang.Object r0 = r3.L$0
            int[] r0 = (int[]) r0
            defpackage.jzb.q(r2)
            goto La3
        L3c:
            defpackage.jzb.q(r2)
            java.lang.Object r2 = r6.element
            java.lang.String[] r4 = r0.d
            xj5 r9 = r0.c
            bw2 r10 = defpackage.bw2.a
            if (r2 != 0) goto L5c
            boolean r0 = r0.b
            if (r0 == 0) goto La2
            java.util.Set r0 = defpackage.qd0.I0(r4)
            r3.L$0 = r1
            r3.label = r8
            java.lang.Object r0 = r9.a(r0, r3)
            if (r0 != r10) goto La2
            goto La1
        L5c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r8 = r4.length
            r11 = 0
            r12 = r11
        L64:
            if (r11 >= r8) goto L8d
            r13 = r4[r11]
            int r14 = r12 + 1
            java.lang.Object r15 = r6.element
            if (r15 == 0) goto L85
            int[] r15 = (int[]) r15
            r18 = r5
            int[] r5 = r0.e
            r5 = r5[r12]
            r12 = r15[r5]
            r5 = r1[r5]
            if (r12 == r5) goto L7f
            r2.add(r13)
        L7f:
            int r11 = r11 + 1
            r5 = r18
            r12 = r14
            goto L64
        L85:
            r18 = r5
            java.lang.String r0 = "Required value was null."
            defpackage.qc0.p(r0)
            return r18
        L8d:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto La2
            java.util.Set r0 = defpackage.s72.o1(r2)
            r3.L$0 = r1
            r3.label = r7
            java.lang.Object r0 = r9.a(r0, r3)
            if (r0 != r10) goto La2
        La1:
            return r10
        La2:
            r0 = r1
        La3:
            r6.element = r0
            wef r0 = defpackage.wef.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y4f.a(int[], xn2):java.lang.Object");
    }
}
