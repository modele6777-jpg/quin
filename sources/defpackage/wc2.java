package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wc2 extends gbe implements l26 {
    final /* synthetic */ Context $context;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc2(Context context, xn2 xn2Var) {
        super(2, xn2Var);
        this.$context = context;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        wc2 wc2Var = new wc2(this.$context, xn2Var);
        wc2Var.L$0 = obj;
        return wc2Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0042 A[Catch: Exception -> 0x0065, TryCatch #0 {Exception -> 0x0065, blocks: (B:18:0x003e, B:20:0x0042, B:22:0x0050, B:23:0x0053, B:25:0x0057, B:27:0x005d, B:29:0x0061), top: B:32:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0050 A[Catch: Exception -> 0x0065, TryCatch #0 {Exception -> 0x0065, blocks: (B:18:0x003e, B:20:0x0042, B:22:0x0050, B:23:0x0053, B:25:0x0057, B:27:0x005d, B:29:0x0061), top: B:32:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0057 A[Catch: Exception -> 0x0065, TryCatch #0 {Exception -> 0x0065, blocks: (B:18:0x003e, B:20:0x0042, B:22:0x0050, B:23:0x0053, B:25:0x0057, B:27:0x005d, B:29:0x0061), top: B:32:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0061 A[Catch: Exception -> 0x0065, TRY_LEAVE, TryCatch #0 {Exception -> 0x0065, blocks: (B:18:0x003e, B:20:0x0042, B:22:0x0050, B:23:0x0053, B:25:0x0057, B:27:0x005d, B:29:0x0061), top: B:32:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:32:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:12:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.L$0
            xva r0 = (defpackage.xva) r0
            int r1 = r6.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 != r3) goto L10
            defpackage.jzb.q(r7)
            goto L28
        L10:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            return r2
        L16:
            defpackage.jzb.q(r7)
        L19:
            r6.L$0 = r0
            r6.label = r3
            r4 = 16
            java.lang.Object r7 = defpackage.vfh.q(r4, r6)
            bw2 r1 = defpackage.bw2.a
            if (r7 != r1) goto L28
            return r1
        L28:
            android.content.Context r7 = r6.$context
            r7.getClass()
            java.lang.String r1 = "input_method"
            java.lang.Object r7 = r7.getSystemService(r1)
            boolean r1 = r7 instanceof android.view.inputmethod.InputMethodManager
            if (r1 == 0) goto L3a
            android.view.inputmethod.InputMethodManager r7 = (android.view.inputmethod.InputMethodManager) r7
            goto L3b
        L3a:
            r7 = r2
        L3b:
            r1 = 0
            if (r7 == 0) goto L65
            java.lang.reflect.Method r4 = defpackage.tq.k     // Catch: java.lang.Exception -> L65
            if (r4 != 0) goto L53
            java.lang.Class r4 = r7.getClass()     // Catch: java.lang.Exception -> L65
            java.lang.String r5 = "getInputMethodWindowVisibleHeight"
            java.lang.reflect.Method r4 = r4.getMethod(r5, r2)     // Catch: java.lang.Exception -> L65
            defpackage.tq.k = r4     // Catch: java.lang.Exception -> L65
            if (r4 == 0) goto L53
            r4.setAccessible(r3)     // Catch: java.lang.Exception -> L65
        L53:
            java.lang.reflect.Method r4 = defpackage.tq.k     // Catch: java.lang.Exception -> L65
            if (r4 == 0) goto L5c
            java.lang.Object r7 = r4.invoke(r7, r2)     // Catch: java.lang.Exception -> L65
            goto L5d
        L5c:
            r7 = r2
        L5d:
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Exception -> L65
            if (r7 == 0) goto L65
            int r1 = r7.intValue()     // Catch: java.lang.Exception -> L65
        L65:
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r1)
            yva r0 = (defpackage.yva) r0
            r0.setValue(r7)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wc2.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((wc2) k((xn2) obj2, (xva) obj)).r(wef.a);
        return bw2.a;
    }
}
