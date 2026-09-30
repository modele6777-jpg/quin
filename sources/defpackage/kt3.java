package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kt3 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kt3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                long j = ((y72) obj).a;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= l46Var.f(j) ? 4 : 2;
                }
                if (l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                    lt3.b(((bne) obj4).c, (iIntValue << 3) & 112, j, l46Var);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 1:
                l46 l46Var2 = ((nod) obj).a;
                l46 l46Var3 = (l46) obj2;
                ((Number) obj3).intValue();
                int iHashCode = Long.hashCode(l46Var3.T);
                j09 j09VarJ = m93.J(l46Var3, (j09) obj4);
                l46Var2.g0(509942095);
                lf2.q.getClass();
                dec.l(hj6.x, l46Var2, j09VarJ);
                dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                l46Var2.r(false);
                return wefVar;
            case 2:
                ((Number) obj3).intValue();
                ((dd2) obj4).z((l46) obj2, 0);
                return wefVar;
            case 3:
                l46 l46Var4 = (l46) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if (l46Var4.W(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                    ((l26) obj4).z(l46Var4, 0);
                } else {
                    l46Var4.Z();
                }
                return wefVar;
            case 4:
                l46 l46Var5 = (l46) obj2;
                ((Number) obj3).intValue();
                l46Var5.f0(-1541271084);
                yce yceVar = (yce) obj4;
                float f = yceVar.b;
                t39 t39Var = t39.a;
                h0e h0eVarA = vx.a(f, vpf.Z(t39Var, l46Var5), null, l46Var5, 0, 12);
                h0e h0eVarA2 = vx.a(yceVar.a, vpf.Z(t39Var, l46Var5), null, l46Var5, 0, 12);
                j09 j09VarS = b.s(b.c((j09) obj, 1.0f), ndb.v, 2);
                boolean zG = l46Var5.g(h0eVarA2);
                Object objR = l46Var5.R();
                if (zG || objR == sf2.a) {
                    objR = new wh1(12, h0eVarA2);
                    l46Var5.p0(objR);
                }
                j09 j09VarP = b.p(tm7.L(j09VarS, (a26) objR), ((yi4) h0eVarA.getValue()).a);
                l46Var5.r(false);
                return j09VarP;
            default:
                j09 j09Var = (j09) obj;
                l46 l46Var6 = (l46) obj2;
                ((Number) obj3).intValue();
                l46Var6.f0(-1498516085);
                fxd fxdVarZ = vpf.Z(t39.b, l46Var6);
                fxd fxdVarZ2 = vpf.Z(t39.d, l46Var6);
                n3f n3fVar = (n3f) obj4;
                y6f y6fVar = xo1.g;
                s3f s3fVar = n3fVar.a;
                vz9 vz9Var = n3fVar.d;
                boolean zBooleanValue = ((Boolean) s3fVar.a()).booleanValue();
                l46Var6.f0(-1553362193);
                float f2 = zBooleanValue ? 1.0f : 0.8f;
                l46Var6.r(false);
                Float fValueOf = Float.valueOf(f2);
                boolean zBooleanValue2 = ((Boolean) vz9Var.getValue()).booleanValue();
                l46Var6.f0(-1553362193);
                float f3 = zBooleanValue2 ? 1.0f : 0.8f;
                l46Var6.r(false);
                Float fValueOf2 = Float.valueOf(f3);
                n3fVar.f();
                l46Var6.f0(386845748);
                l46Var6.r(false);
                k3f k3fVarH = g21.H(n3fVar, fValueOf, fValueOf2, fxdVarZ, y6fVar, l46Var6, 196608);
                boolean zBooleanValue3 = ((Boolean) n3fVar.a.a()).booleanValue();
                l46Var6.f0(2073045083);
                float f4 = zBooleanValue3 ? 1.0f : 0.0f;
                l46Var6.r(false);
                Float fValueOf3 = Float.valueOf(f4);
                boolean zBooleanValue4 = ((Boolean) vz9Var.getValue()).booleanValue();
                l46Var6.f0(2073045083);
                float f5 = zBooleanValue4 ? 1.0f : 0.0f;
                l46Var6.r(false);
                Float fValueOf4 = Float.valueOf(f5);
                n3fVar.f();
                l46Var6.f0(-281714272);
                l46Var6.r(false);
                j09 j09VarZ = bzd.z(j09Var, ((Number) k3fVarH.x.getValue()).floatValue(), ((Number) k3fVarH.x.getValue()).floatValue(), ((Number) g21.H(n3fVar, fValueOf3, fValueOf4, fxdVarZ2, y6fVar, l46Var6, 196608).x.getValue()).floatValue(), 0.0f, null, 131064);
                l46Var6.r(false);
                return j09VarZ;
        }
    }
}
