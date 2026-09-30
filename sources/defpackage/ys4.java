package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ys4 {
    public static final x6f a;
    public static final x6f b;
    public static final x6f c;

    static {
        q03 q03Var = new q03(0.4f, 0.0f, 0.6f, 1.0f);
        a = new x6f(120, 0, hs4.a);
        b = new x6f(150, 0, q03Var);
        c = new x6f(120, 0, q03Var);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0009 A[PHI: r1
  0x0009: PHI (r1v3 x6f) = (r1v0 x6f), (r1v0 x6f), (r1v0 x6f), (r1v4 x6f), (r1v4 x6f), (r1v4 x6f), (r1v4 x6f) binds: [B:19:0x0022, B:22:0x0027, B:28:0x0033, B:5:0x0007, B:8:0x000d, B:11:0x0012, B:14:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    public static final Object a(jx jxVar, float f, l77 l77Var, l77 l77Var2, zn2 zn2Var) {
        x6f x6fVar;
        x6f x6fVar2 = null;
        if (l77Var2 != null) {
            boolean z = l77Var2 instanceof pta;
            x6fVar = a;
            if (z || (l77Var2 instanceof al4) || (l77Var2 instanceof yq6) || (l77Var2 instanceof rn5)) {
                x6fVar2 = x6fVar;
            }
        } else if (l77Var != null) {
            boolean z2 = l77Var instanceof pta;
            x6fVar = b;
            if (z2 || (l77Var instanceof al4)) {
                x6fVar2 = x6fVar;
            } else if (l77Var instanceof yq6) {
                x6fVar2 = c;
            } else if (l77Var instanceof rn5) {
                x6fVar2 = x6fVar;
            }
        }
        x6f x6fVar3 = x6fVar2;
        bw2 bw2Var = bw2.a;
        if (x6fVar3 != null) {
            Object objB = jx.b(jxVar, new yi4(f), x6fVar3, null, null, zn2Var, 12);
            if (objB == bw2Var) {
                return objB;
            }
        } else {
            Object objG = jxVar.g(zn2Var, new yi4(f));
            if (objG == bw2Var) {
                return objG;
            }
        }
        return wef.a;
    }
}
