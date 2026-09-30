package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y6c implements x4d, i97 {
    public final gv2 a;
    public final gv2 b;
    public final gv2 c;
    public final gv2 d;

    public y6c(gv2 gv2Var, gv2 gv2Var2, gv2 gv2Var3, gv2 gv2Var4) {
        this.a = gv2Var;
        this.b = gv2Var2;
        this.c = gv2Var3;
        this.d = gv2Var4;
    }

    public static y6c c(y6c y6cVar, gv2 gv2Var, gv2 gv2Var2, gv2 gv2Var3, gv2 gv2Var4, int i) {
        if ((i & 1) != 0) {
            gv2Var = y6cVar.a;
        }
        if ((i & 2) != 0) {
            gv2Var2 = y6cVar.b;
        }
        if ((i & 4) != 0) {
            gv2Var3 = y6cVar.c;
        }
        if ((i & 8) != 0) {
            gv2Var4 = y6cVar.d;
        }
        y6cVar.getClass();
        return new y6c(gv2Var, gv2Var2, gv2Var3, gv2Var4);
    }

    @Override // defpackage.x4d
    public final vs9 a(long j, cv7 cv7Var, sw3 sw3Var) {
        float fA = this.a.a(j, sw3Var);
        float fA2 = this.b.a(j, sw3Var);
        float fA3 = this.c.a(j, sw3Var);
        float fA4 = this.d.a(j, sw3Var);
        float fC = ald.c(j);
        float f = fA + fA4;
        if (f > fC) {
            float f2 = fC / f;
            fA *= f2;
            fA4 *= f2;
        }
        float f3 = fA2 + fA3;
        if (f3 > fC) {
            float f4 = fC / f3;
            fA2 *= f4;
            fA3 *= f4;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            StringBuilder sbO = tec.o("Corner size in Px can't be negative(topStart = ", fA, ", topEnd = ", fA2, ", bottomEnd = ");
            sbO.append(fA3);
            sbO.append(", bottomStart = ");
            sbO.append(fA4);
            sbO.append(")!");
            l37.a(sbO.toString());
        }
        if (fA + fA2 + fA3 + fA4 == 0.0f) {
            return new ts9(z5c.g(0L, j));
        }
        hkb hkbVarG = z5c.g(0L, j);
        cv7 cv7Var2 = cv7.a;
        float f5 = cv7Var == cv7Var2 ? fA : fA2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) & 4294967295L) | (((long) Float.floatToRawIntBits(f5)) << 32);
        if (cv7Var == cv7Var2) {
            fA = fA2;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fA)) & 4294967295L) | (((long) Float.floatToRawIntBits(fA)) << 32);
        float f6 = cv7Var == cv7Var2 ? fA3 : fA4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        if (cv7Var != cv7Var2) {
            fA4 = fA3;
        }
        return new us9(w6c.b(hkbVarG, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fA4)) << 32) | (((long) Float.floatToRawIntBits(fA4)) & 4294967295L)));
    }

    @Override // defpackage.i97
    public final Object b(float f, Object obj) {
        if (pa7.t(obj, g21.f) || obj == null) {
            y6c y6cVar = a7c.a;
            v2b v2bVar = new v2b();
            obj = new y6c(v2bVar, v2bVar, v2bVar, v2bVar);
        }
        if (!(obj instanceof y6c)) {
            return null;
        }
        y6c y6cVar2 = (y6c) obj;
        y6c y6cVar3 = a7c.a;
        return new y6c(new z6c(this.a, y6cVar2.a, f), new z6c(this.b, y6cVar2.b, f), new z6c(this.c, y6cVar2.c, f), new z6c(this.d, y6cVar2.d, f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6c)) {
            return false;
        }
        y6c y6cVar = (y6c) obj;
        return pa7.t(this.a, y6cVar.a) && pa7.t(this.b, y6cVar.b) && pa7.t(this.c, y6cVar.c) && pa7.t(this.d, y6cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ")";
    }
}
