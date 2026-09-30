package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class it3 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ it3(lj6 lj6Var, String str, String str2, isa isaVar) {
        this.a = 12;
        this.b = str;
        this.c = str2;
        this.d = isaVar;
    }

    private final Object a(Object obj) {
        zf3 zf3Var = (zf3) this.b;
        xw9 xw9Var = (xw9) this.c;
        xi xiVar = (xi) this.d;
        im2 im2Var = (im2) obj;
        long j = ((ald) zf3Var.get()).a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat > 0.0f) {
            vv7 vv7Var = (vv7) im2Var;
            float fP0 = vv7Var.p0(4.0f);
            xl1 xl1Var = vv7Var.a;
            float fP1 = vv7Var.p0(xw9Var.b(vv7Var.getLayoutDirection()));
            float fA = xiVar.a(ym8.L(fIntBitsToFloat), ym8.L((Float.intBitsToFloat((int) (xl1Var.f() >> 32)) - fP1) - vv7Var.p0(xw9Var.c(vv7Var.getLayoutDirection()))), vv7Var.getLayoutDirection()) + fP1;
            float f = fIntBitsToFloat / 2.0f;
            float f2 = fA + f;
            float f3 = (f2 - f) - fP0;
            float f4 = f3 < 0.0f ? 0.0f : f3;
            float f5 = f2 + f + fP0;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (xl1Var.f() >> 32));
            float f6 = f5 > fIntBitsToFloat2 ? fIntBitsToFloat2 : f5;
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (4294967295L & j));
            float f7 = (-fIntBitsToFloat3) / 2.0f;
            float f8 = fIntBitsToFloat3 / 2.0f;
            ta0 ta0Var = xl1Var.b;
            long jZ = ta0Var.z();
            ta0Var.p().g();
            try {
                ((vd9) ta0Var.c).l(f4, f7, f6, f8, 0);
                vv7Var.a();
            } finally {
                ks0.t(ta0Var, jZ);
            }
        } else {
            ((vv7) im2Var).a();
        }
        return wef.a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:193:0x0654  */
    /* JADX WARN: Code duplicated, block: B:208:0x071b  */
    /* JADX WARN: Code duplicated, block: B:210:0x0721  */
    /* JADX WARN: Code duplicated, block: B:212:0x0749  */
    /* JADX WARN: Code duplicated, block: B:214:0x0758  */
    /* JADX WARN: Code duplicated, block: B:217:0x0760  */
    /* JADX WARN: Code duplicated, block: B:225:0x077c  */
    /* JADX WARN: Code duplicated, block: B:228:0x07c1  */
    /* JADX WARN: Code duplicated, block: B:230:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:268:0x08a7  */
    /* JADX WARN: Code duplicated, block: B:270:0x08c6  */
    /* JADX WARN: Code duplicated, block: B:272:0x08c9  */
    /* JADX WARN: Code duplicated, block: B:274:0x08d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:275:0x08d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:276:0x08d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:277:0x08d9  */
    /* JADX WARN: Code duplicated, block: B:279:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:280:0x08de  */
    /* JADX WARN: Code duplicated, block: B:281:0x08e1  */
    /* JADX WARN: Code duplicated, block: B:282:0x08e4  */
    /* JADX WARN: Code duplicated, block: B:283:0x08e7  */
    /* JADX WARN: Code duplicated, block: B:284:0x08ea  */
    /* JADX WARN: Code duplicated, block: B:285:0x08ed  */
    /* JADX WARN: Code duplicated, block: B:286:0x08f2  */
    /* JADX WARN: Code duplicated, block: B:288:0x08fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:289:0x08ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:291:0x0902  */
    /* JADX WARN: Code duplicated, block: B:292:0x0905  */
    /* JADX WARN: Code duplicated, block: B:293:0x0908  */
    /* JADX WARN: Code duplicated, block: B:296:0x090d  */
    /* JADX WARN: Code duplicated, block: B:299:0x0923  */
    /* JADX WARN: Code duplicated, block: B:300:0x0926  */
    /* JADX WARN: Code duplicated, block: B:427:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:439:0x07bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:441:0x07c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:442:0x07c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0147 A[LOOP:0: B:33:0x0104->B:46:0x0147, LOOP_END] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v12 java.lang.Object, still in use, count: 2, list:
          (r9v12 java.lang.Object) from 0x08a3: PHI (r9 I:??) = (r9v7 java.lang.Object), (r9v12 java.lang.Object) binds: [B:265:0x08a2, B:472:0x08a3] A[DONT_GENERATE, DONT_INLINE]
          (r9v12 java.lang.Object) from 0x0895: CHECK_CAST (tech.chatmind.api.giftcard.GiftCardItem) (r9v12 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // defpackage.a26
    public final java.lang.Object d(java.lang.Object r41) {
        /*
            Method dump skipped, instruction units count: 3112
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.it3.d(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ it3(Object obj, Object obj2, Context context, int i) {
        this.a = i;
        this.b = obj;
        this.d = obj2;
        this.c = context;
    }

    public /* synthetic */ it3(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
