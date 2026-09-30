package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q02 {
    public static final /* synthetic */ wn7[] a = {new q79(q02.class, "circleCardCenter", "getCircleCardCenter(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1), new q79(q02.class, "circleCardRadius", "getCircleCardRadius(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1), new q79(q02.class, "circleCardOuterDiameter", "getCircleCardOuterDiameter(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1), new q79(q02.class, "circleCardSpreadProgress", "getCircleCardSpreadProgress(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1)};
    public static final gxc b = new gxc("CircleCardCenter");
    public static final gxc c = new gxc("CircleCardRadius");
    public static final gxc d = new gxc("CircleCardOuterDiameter");
    public static final gxc e = new gxc("CircleCardSpreadProgress");
    public static final float f = 12.0f;
    public static final double g = Math.atan2(-1.0d, -1.0d);

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 37101. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static final void a(defpackage.sdd r106, java.util.List r107, java.util.List r108, defpackage.j09 r109, java.lang.Integer r110, float r111, float r112, defpackage.a26 r113, defpackage.a26 r114, defpackage.ft1 r115, boolean r116, boolean r117, defpackage.fy9 r118, defpackage.x16 r119, defpackage.v02 r120, float r121, defpackage.l46 r122, int r123) {
        /*
            Method dump skipped, instruction units count: 3710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q02.a(sdd, java.util.List, java.util.List, j09, java.lang.Integer, float, float, a26, a26, ft1, boolean, boolean, fy9, x16, v02, float, l46, int):void");
    }

    public static final float b(n69 n69Var) {
        return ((qz9) n69Var).j();
    }

    public static final float c(long j, long j2) {
        long jF = hl9.f(j2, j);
        return (float) Math.toDegrees((float) Math.atan2(Float.intBitsToFloat((int) (4294967295L & jF)), Float.intBitsToFloat((int) (jF >> 32))));
    }

    public static final float d(float f2) {
        float f3 = f2 % 360.0f;
        return (f3 == 0.0f || Math.signum(f3) == Math.signum(360.0f)) ? f3 : f3 + 360.0f;
    }

    public static final float e(float f2) {
        float f3 = (f2 + 180.0f) % 360.0f;
        if (f3 != 0.0f && Math.signum(f3) != Math.signum(360.0f)) {
            f3 += 360.0f;
        }
        return f3 - 180.0f;
    }
}
