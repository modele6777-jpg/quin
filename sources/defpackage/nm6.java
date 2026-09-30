package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nm6 implements pc9 {
    public final /* synthetic */ j18 a;
    public final /* synthetic */ kq6 b;
    public final /* synthetic */ jx c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ aw2 f;
    public final /* synthetic */ float g;
    public final /* synthetic */ eh6 v;
    public final /* synthetic */ e89 w;
    public final /* synthetic */ e89 x;

    public nm6(j18 j18Var, kq6 kq6Var, jx jxVar, float f, float f2, aw2 aw2Var, float f3, eh6 eh6Var, e89 e89Var, e89 e89Var2) {
        this.a = j18Var;
        this.b = kq6Var;
        this.c = jxVar;
        this.d = f;
        this.e = f2;
        this.f = aw2Var;
        this.g = f3;
        this.v = eh6Var;
        this.w = e89Var;
        this.x = e89Var2;
    }

    @Override // defpackage.pc9
    public final long G(long j, int i, long j2) {
        return um6.c(this.c, this.d, this.e, this.f, this.g, this.v, this.w, Float.intBitsToFloat((int) (4294967295L & j2)), false);
    }

    @Override // defpackage.pc9
    public final Object G0(long j, xn2 xn2Var) {
        if (((Number) this.c.e()).floatValue() <= 0.0f) {
            j = 0;
        }
        return new zsf(j);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.pc9
    public final Object H(long j, long j2, xn2 xn2Var) {
        mm6 mm6Var;
        if (xn2Var instanceof mm6) {
            mm6Var = (mm6) xn2Var;
            int i = mm6Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mm6Var.label = i - Integer.MIN_VALUE;
            } else {
                mm6Var = new mm6(this, (zn2) xn2Var);
            }
        } else {
            mm6Var = new mm6(this, (zn2) xn2Var);
        }
        mm6 mm6Var2 = mm6Var;
        Object obj = mm6Var2.result;
        int i2 = mm6Var2.label;
        if (i2 == 0) {
            jzb.q(obj);
            jx jxVar = this.c;
            float f = 0.0f;
            if (((Number) jxVar.e()).floatValue() > 0.0f) {
                float fFloatValue = ((Number) jxVar.e()).floatValue();
                float f2 = this.g;
                e89 e89Var = this.x;
                if (fFloatValue >= f2) {
                    e89Var.setValue(eo4.b);
                    f = this.e;
                } else {
                    this.w.setValue(Boolean.FALSE);
                    e89Var.setValue(eo4.a);
                }
                Float f3 = new Float(f);
                Float f4 = new Float(zsf.c(j2));
                mm6Var2.J$0 = j;
                mm6Var2.J$1 = j2;
                mm6Var2.F$0 = f;
                mm6Var2.label = 1;
                Object objB = jx.b(this.c, f3, null, f4, null, mm6Var2, 10);
                bw2 bw2Var = bw2.a;
                if (objB == bw2Var) {
                    return bw2Var;
                }
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return new zsf(0L);
    }

    @Override // defpackage.pc9
    public final long U(int i, long j) {
        boolean zC = this.a.c();
        boolean z = !zC;
        if (i == 1 && Float.intBitsToFloat((int) (j & 4294967295L)) > 0.0f && !zC) {
            kq6 kq6Var = this.b;
            ynb.V(hwf.a(kq6Var), null, null, new uo6(kq6Var, null), 3);
        }
        return um6.c(this.c, this.d, this.e, this.f, this.g, this.v, this.w, Float.intBitsToFloat((int) (j & 4294967295L)), z);
    }
}
