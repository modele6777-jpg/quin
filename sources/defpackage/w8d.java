package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w8d implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;

    public /* synthetic */ w8d(float f, int i, jx jxVar, e89 e89Var) {
        this.a = 2;
        this.d = f;
        this.e = i;
        this.b = jxVar;
        this.c = e89Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        int i2 = this.e;
        float f = this.d;
        switch (i) {
            case 0:
                rf0 rf0Var = (rf0) obj;
                rf0Var.getClass();
                return ((y8d) obj3).a(rf0Var, (mue) obj2, f, i2);
            case 1:
                rf0 rf0Var2 = (rf0) obj;
                rf0Var2.getClass();
                return ((y8d) obj3).a(rf0Var2, (mue) obj2, f, i2);
            default:
                hxc hxcVar = (hxc) obj;
                hxcVar.getClass();
                hl9 hl9Var = (hl9) ((e89) obj2).getValue();
                long j = hl9Var.a;
                gxc gxcVar = q02.b;
                wn7[] wn7VarArr = q02.a;
                wn7 wn7Var = wn7VarArr[0];
                gxcVar.getClass();
                hxcVar.c(gxcVar, hl9Var);
                gxc gxcVar2 = q02.c;
                wn7 wn7Var2 = wn7VarArr[1];
                Float fValueOf = Float.valueOf(f);
                gxcVar2.getClass();
                hxcVar.c(gxcVar2, fValueOf);
                gxc gxcVar3 = q02.d;
                wn7 wn7Var3 = wn7VarArr[2];
                Float fValueOf2 = Float.valueOf((f * 2.0f) + i2);
                gxcVar3.getClass();
                hxcVar.c(gxcVar3, fValueOf2);
                float fFloatValue = ((Number) ((jx) obj3).e()).floatValue();
                gxc gxcVar4 = q02.e;
                wn7 wn7Var4 = wn7VarArr[3];
                Float fValueOf3 = Float.valueOf(fFloatValue);
                gxcVar4.getClass();
                hxcVar.c(gxcVar4, fValueOf3);
                return wef.a;
        }
    }

    public /* synthetic */ w8d(y8d y8dVar, mue mueVar, float f, int i, int i2) {
        this.a = i2;
        this.b = y8dVar;
        this.c = mueVar;
        this.d = f;
        this.e = i;
    }
}
